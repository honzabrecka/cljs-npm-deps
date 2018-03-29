(ns bug-free-memory.core
  (:require [verbose-meme.core :refer [hi]]))

(enable-console-print!)

(println ">>>" (hi "foo"))

(defn on-js-reload []
  ;; optionally touch your app-state to force rerendering depending on
  ;; your application
  ;; (swap! app-state update-in [:__figwheel_counter] inc)
)
