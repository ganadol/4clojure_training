;; 4 일차
;; 시퀀스 중복하기 (Duplicate a Sequence)
;; url https://www.4clojure.com/problem/32
;; 원문

;; 한글
;; 시퀀스의 각 요소를 중복시키는 함수를 작성하라.
(= (__ [1 2 3]) '(1 1 2 2 3 3))
(= (__ [:a :a :b :b]) '(:a :a :a :a :b :b :b :b))
(= (__ [[1 2] [3 4]]) '([1 2] [1 2] [3 4] [3 4]))

;; answer

