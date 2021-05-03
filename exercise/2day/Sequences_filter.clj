;; 2 일차
;; 시퀀스: filter(Sequences: filter)
;; url https://www.4clojure.com/problem/18
;; 원문

;; 한글
;; filter함수는 두개의 인수를 받는데 진위함수(f)와 시퀀스(s)이다.
;; filter는 시퀀스의 각 요소가 진위함수의 인수로 들어가는데,
;; 이때 진위 함수가 참을 반환하는 요소만으로 이루어진 새로운 시퀀스를 반환한다.
;; (= __ (filter #(> % 5) '(3 4 5 6 7)))

;; answer '(6 7)
(= '(6 7) (filter #(> % 5) '(3 4 5 6 7)))
