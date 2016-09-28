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

  (c/something-maybe-pretty 25)

  (Thread/sleep (* 1000 60 60))

  (-> 10 (+ 20) (* 30) (/ 100))

  (->> 10 (+ 20) (* 30) (-> (/ 100)))

  (def mutable-thing (atom []))

  (swap! mutable-thing conj 10)


  )
