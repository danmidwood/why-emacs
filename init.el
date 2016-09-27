;;; Make things prettier
(menu-bar-mode -1)
(column-number-mode)
(add-hook 'find-file-hook
          (lambda ()
            (linum-mode 1)))

;;; Install dependencies
(let* ((packages '(solarized-theme
                   company
                   magit
                   paredit
                   rainbow-delimiters
                   clojure-mode
                   cider)))
  (require 'package)
  (package-initialize)
  (dolist (p packages)
    (when (not (package-installed-p p))
      (package-install p))))

;;; Theme
(load-theme 'solarized-dark t)

;;; MACOS Stuff

(progn
  (setq mac-option-key-is-meta t)
  (setq mac-right-option-modifier nil)

  (when (memq window-system '(mac ns))
    (exec-path-from-shell-initialize)))

;;; Define maggit status key binding
(global-set-key (kbd "C-x g") 'magit-status)

;;; Lisp
(progn
  (defun lisp-stuff ()
    (enable-paredit-mode)
    (rainbow-delimiters-mode 1)
    (show-paren-mode 1))

  (add-hook 'lisp-mode-hook       #'lisp-stuff)
  (add-hook 'emacs-lisp-mode-hook #'lisp-stuff))


;;; Whitespace / Indentation
(progn
  (setq-default indent-tabs-mode nil)
  (require 'whitespace)
  (add-hook 'before-save-hook 'delete-trailing-whitespace)
  (setq whitespace-style (quote (face tabs trailing tab-mark lines-tail)))
  (global-whitespace-mode 1))


;;; Clojure
(let ((clojure-goodies (lambda ()
                         (lisp-stuff)
                         (company-mode 1)
                         (define-key company-mode-map
                           (kbd "M-TAB")
                           'company-complete))))
  (add-hook 'clojure-mode-hook clojure-goodies)
  (add-hook 'cider-repl-mode-hook clojure-goodies))
