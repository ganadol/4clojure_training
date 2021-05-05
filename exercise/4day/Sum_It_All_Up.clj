;; 4 일차
;; 모두 더하기 (Sum It All Up)
;; url https://www.4clojure.com/problem/24
;; 원문

;; 한글
;; 시퀀스로 주어진 숫자들의 합을 구하는 함수를 작성하라.
;; (= (__ [1 2 3]) 6)
;; (= (__ (list 0 -2 5 5)) 8)
;; (= (__ #{4 2 1}) 7)
;; (= (__ '(0 0 -1)) -1)
;; (= (__ '(1 10 3)) 14)

;; answer (fn all-sum [lst] (reduce + lst))
(= ((fn all-sum [lst] (reduce + lst)) [1 2 3]) 6)
(= ((fn all-sum [lst] (reduce + lst)) (list 0 -2 5 5)) 8)
(= ((fn all-sum [lst] (reduce + lst)) #{4 2 1}) 7)
(= ((fn all-sum [lst] (reduce + lst)) '(0 0 -1)) -1)
(= ((fn all-sum [lst] (reduce + lst)) '(1 10 3)) 14)
