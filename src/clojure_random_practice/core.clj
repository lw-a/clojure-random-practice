(ns clojure-random-practice.core
  (:gen-class))

(defn -main
  "I don't do a whole lot ... yet."
  [& args]
  (println "Random practiec!"))

(defn add-100
  [num]
  (+ num 100))

(println (add-100 5))

(defn dec-maker
  "Create a custom decrementor"
  [dec-by]
  #(- % dec-by))

(def dec3 (dec-maker 3))

(println (dec3 7))
