(ns fizzbuzz.core
  (:gen-class)
  (:require [clojure.core.match :refer [match]]))

(defn -main [count-to]
  (if (nil? count-to)
    (System/exit 1)
    (dotimes [n (Integer/parseInt count-to)]
      (match [(mod n 3) (mod n 5)]
        [0 0] (println "fizzbuzz")
        [0 _] (println "fizz")
        [_ 0] (println "buzz")
        :else (println n)))))

