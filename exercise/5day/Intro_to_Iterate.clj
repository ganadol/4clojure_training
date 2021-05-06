;; 5일차
;; iterate 소개(Intro to Iterate)
;; url https://www.4clojure.com/problem/45
;; 원문

;; 한글
;; iterate함수는 무한 지연 시퀀스를 만드는 함수다.
;; 무한 시퀀스는 조심해서 사용해야 하며 take함수와 함께 사용해야 한다는 점을 기억하자.
;; iterate함수는 초기값에 함수를 적용한다.
;; 그 후, 그 결과에 다시 같은 함수를 적용한다. 이과정을 무한히 반복된다.
;; (take 5 (iterate inc 1))
;; iterate함수는 지연 시퀀스를 만드는데 사용될 수 있다.
;; (= __ (take 5 (iterate #(+ 3 %) 1)))
