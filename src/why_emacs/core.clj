(ns why-emacs.core)

(defn foo
  "I don't do a whole lot."
  [x]
  (println x
           "Hello, World!"))

(defn something-maybe-pretty
  "Receive a number and return an n sized map"
  [n]
  (->> (for [x (range n)]
         [(keyword (str x)) (range x)])
       (into {})))
