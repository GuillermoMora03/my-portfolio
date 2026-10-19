(function () {
    'use strict';

    var doc = document.documentElement;
    doc.classList.add('js');

    var reduceMotion = window.matchMedia('(prefers-reduced-motion: reduce)').matches;

    /* Menú móvil */
    document.querySelectorAll('.nav-toggle').forEach(function (btn) {
        var nav = document.getElementById(btn.getAttribute('aria-controls'));
        if (!nav) return;
        function setOpen(open) {
            btn.setAttribute('aria-expanded', String(open));
            nav.classList.toggle('is-open', open);
        }
        btn.addEventListener('click', function () {
            setOpen(btn.getAttribute('aria-expanded') !== 'true');
        });
        nav.addEventListener('click', function (e) {
            if (e.target.closest('a')) setOpen(false);
        });
        document.addEventListener('keydown', function (e) {
            if (e.key === 'Escape' && btn.getAttribute('aria-expanded') === 'true') {
                setOpen(false);
                btn.focus();
            }
        });
    });

    /* Admin: marcar la página actual */
    var adminNav = document.querySelector('#admin-nav');
    if (adminNav) {
        var path = location.pathname.replace(/\/$/, '') || '/';
        adminNav.querySelectorAll('a').forEach(function (a) {
            var href = new URL(a.href).pathname.replace(/\/$/, '') || '/';
            if (href !== '/' && (path === href || path.indexOf(href + '/') === 0)) {
                a.setAttribute('aria-current', 'page');
            }
        });
    }

    /* Formularios: estado de carga al enviar (el envío no se altera) */
    document.querySelectorAll('.admin-form, .contact-form').forEach(function (form) {
        form.addEventListener('submit', function () {
            var btn = form.querySelector('button[type="submit"]');
            if (btn && form.checkValidity()) {
                window.setTimeout(function () { btn.classList.add('is-loading'); }, 0);
            }
        });
    });

    window.addEventListener('pageshow', function () {
        document.querySelectorAll('.is-loading').forEach(function (b) { b.classList.remove('is-loading'); });
    });

    /* Portafolio: scroll-spy y revelado */
    var sections = Array.prototype.slice.call(document.querySelectorAll('main section[id]'));
    var navLinks = document.querySelectorAll('.site-header .site-nav a[href*="#"]');
    if (!sections.length || !('IntersectionObserver' in window)) return;

    var spy = new IntersectionObserver(function (entries) {
        entries.forEach(function (entry) {
            if (!entry.isIntersecting) return;
            navLinks.forEach(function (a) {
                var hash = a.getAttribute('href').split('#')[1];
                if (hash === entry.target.id) a.setAttribute('aria-current', 'true');
                else a.removeAttribute('aria-current');
            });
        });
    }, { rootMargin: '-45% 0px -50% 0px' });
    sections.forEach(function (s) { spy.observe(s); });

    if (reduceMotion) return;
    var targets = document.querySelectorAll('.section__head, .skills-grid, .timeline__item, .project-card, .contact-form');
    var reveal = new IntersectionObserver(function (entries, obs) {
        entries.forEach(function (entry) {
            if (entry.isIntersecting) {
                entry.target.classList.add('is-visible');
                obs.unobserve(entry.target);
            }
        });
    }, { threshold: 0.12 });
    targets.forEach(function (el) { el.classList.add('reveal'); reveal.observe(el); });
})();
