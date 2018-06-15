(ns palindrome.core-test
  (:require [clojure.test :refer :all]
            [palindrome.core :refer :all]))

(deftest find-palindromes
  (testing "finds palindromes correctly"
    (is (= true  (is-palindrome "racecar")))
    (is (= true  (is-palindrome "tacocat")))
    (is (= false (is-palindrome "something")))))
