;; 4 일차
;; 뒤에서 두 번째 요소 (Penultimate Element)
;; url https://www.4clojure.com/problem/20
;; 원문

;; 한글
;; 시퀀스의 뒤에서 두번째 요소를 반환하는 함수를 작성하여라.
;; (= (__ (list 1 2 3 4 5)) 4)
;; (= (__ ["a" "b" "c"]) "b")
;; (= (__ ([[1 2] [3 4]])) [1 2])

;; answer (fn get-reverse-second [lst] (second (reverse lst)))
