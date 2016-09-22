(ns user
  (:require
   ;; REPL TOOLS ;;;;
   [clojure.repl :refer [doc source]]
   [alembic.still :refer [load-project]]
   ;;; App stuff
   [why-emacs.core :as c]))


(comment
  ;; Reload project through Alembic. With this we can edit project.clj and then
  ;; load it without having to restart the repl. Very useful for adding new
  ;; dependencies
  (load-project)

  (+ 1 1)

  (doc +)

  (source +)

  (c/foo 111)

  )
