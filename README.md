# Why you should use Emacs / Cider for Clojure development

## The beginning

### Requirements:

* Emacs 24+
* git
* leiningen
* java

## Getting started

Clone the project:

    git clone git@github.com:danmidwood/why-emacs.git

Cd into the directory

    cd why-emacs

Start emacs:

    emacs -q -l init.el

This will start a new emacs instance, ignoring any user config (`-q`) and
loading the bundled init.el (`-l`) in it's place.

The config contains a few sensible defaults aswell as the following emacs
libs

* Solarized Theme (my own standard theme)
* magit (A git client)

* Paredit
* Rainbow Delimiters
* Clojure mode
* Cider

* Company (provides company-mode for better auto-complete)

Open the `user` namespace file. `C-x C-f` is the load file command, type
it and then navigate to `dev/user.clj` and hit enter.

Run `C-c M-j` to start a repl, then `C-c C-z` to switch between the a clj file
and the repl
