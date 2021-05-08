;; 6일차
;; 구조분해 소개 (Intro to Destructuring)
;; url https://www.4clojure.com/problem/52
;; 원문

;; 한글
;; let바인딩과 함수의 인수에는 구조분해가 지원된다.
;; (= [2 4] (let [[a b c d e] [0 1 2 3 4]] __))
;; answer (vector c e)
;; answer [c e]
(= [2 4] (let [[a b c d e] [0 1 2 3 4]] (vector c e)))
