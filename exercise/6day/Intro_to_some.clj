;; 6일차
;; Intro to some (Intro to some)
;; url https://www.4clojure.com/problem/48
;; 원문

;; 한글
;; some 함수는 진위 함수와 컬렉션을 인수로 받는다.
;; some은 컬렉션의 요소를 차례대로 진위함수에 적용하다가 그 진위함수의 반환값이 처음으로 논리적으로 참일때 그 반환값을 반환한다.
;; (= __ (some #{2 7 6} [5 6 7 8]))
;; (= __ (some #(when (even? %) %) [5 6 7 8]))
;; answer 6
(= 6 (some #{2 7 6} [5 6 7 8]))
(= 6 (some #(when (even? %) %) [5 6 7 8]))
