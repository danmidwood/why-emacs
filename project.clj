(defproject why-emacs "0.1.0-SNAPSHOT"
  :description "Reasons to use emacs talk"
  :dependencies [[org.clojure/clojure "1.8.0"]]
  :profiles {:dev {:dependencies [[org.clojure/tools.nrepl "0.2.12"]
                                  [org.clojure/tools.namespace "0.2.11"]
                                  [alembic "0.3.2"]]
                   :source-paths ["dev"]}
             :repl {:plugins [[cider/cider-nrepl "0.12.0"
                               :exclusions [org.clojure/tools.nrepl]]]}})
