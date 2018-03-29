(defproject verbose-meme "0.0.1-SNAPSHOT"
  :description "FIXME: write this!"
  :url "http://example.com/FIXME"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}

  :min-lein-version "2.7.1"

  :dependencies [[org.clojure/clojure "1.9.0"]
                 [org.clojure/clojurescript "1.10.238"]]

  :plugins [[lein-cljsbuild "1.1.7" :exclusions [[org.clojure/clojure]]]]

  :source-paths ["src"]

  :cljsbuild {:builds
              [{:id "min"
                :source-paths ["src"]
                :compiler {:output-to "resources/public/js/compiled/verbose_meme.js"
                           :main verbose-meme.core
                           :optimizations :advanced
                           :pretty-print false}}]})
