;; 3 일차
;; 단순재귀 (Simple Recursions)
;; url https://www.4clojure.com/problem/57
;; 원문

;; 한글
;; 재귀함수는 자기자신을 호출하는 함수로,
;; 함수형 프로그래밍에서 사용하는 기본적인 기법의 하나다.
;; (= __ ((fn foo [x] (when (> x 0) (conj (foo (dec x)) x))) 5))

;; answer
