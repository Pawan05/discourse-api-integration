(defproject discourse-api-integration "0.1.0-SNAPSHOT"
  :description "FIXME: write description"
  :url "http://example.com/FIXME"
  :license {:name "EPL-2.0 OR GPL-2.0-or-later WITH Classpath-exception-2.0"
            :url "https://www.eclipse.org/legal/epl-2.0/"}
  :main ^:skip-aot discourse-api-integration.core
  :plugins [[lein-ring "0.8.7"]]
  :dependencies [[org.clojure/clojure "1.10.1"]
                 [ring/ring "1.2.0"]
                 [ring/ring-json "0.2.0"]
                 [clj-http "3.12.0"]]
  :repl-options {:init-ns discourse-api-integration.core})
