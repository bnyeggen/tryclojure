(defproject tryclojure "0.1.0-SNAPSHOT"
  :description "A simple web-based Clojure REPL for trying out Clojure without having to install it."
  :dependencies [[org.clojure/clojure "1.7.0"]
                 [lib-noir "0.9.9"]
                 [compojure "1.3.4"]
                 [ring-server "0.4.0"]
                 [clojail "1.0.6"]]
  :jvm-opts ["-Djava.security.policy=example.policy" "-Xmx80M"] ;"-Djava.awt.headless=true" prevents window, but causes exception
  :min-lein-version "2.0.0"
  :uberjar-name "tryclojure-standalone.jar"
  :plugins [[lein-ring "0.9.6"]]
  :ring {:handler tryclojure.server/app :port 8801})
