;; 4 일차
;; 홀수 찾기 (Find the odd numbers)
;; url https://www.4clojure.com/problem/25
;; 원문

;; 한글
;; 시퀀스에서 홀수만 반환하는 함수를 작성하라.
;; (= (__ #{1 2 3 4 5}) '(1 3 5))
;; (= (__ [4 2 1 6]) (1))
;; (= (__ [2 2 4 6]) '())
;; (= (__ [1 1 1 3]) '(1 1 1 3))

;; answer (fn get-odd-numbers [lst] (for [x lst :when (= true (odd? x))] x))
