(ns palindrome.core
  (:gen-class))

(defn is-palindrome [word]
  (let [rev (clojure.string/reverse word)]
    (= word rev)))

(defn -main [& args]
  (println "welcome to zantho's palindrome house. find out if a word is a palindrome!")
  (println)

  (doseq [ln (line-seq (java.io.BufferedReader. *in*))]
    (if (is-palindrome (clojure.string/trimr ln))
      (println (format "%s \033[32mis \033[0ma palindrome!" ln))
      (println (format "%s \033[31mis not \033[0ma palindrome!" ln)))
      (println)))
