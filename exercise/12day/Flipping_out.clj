;; 12일차
;; 뒤집기 (Flipping out)
;; url https://www.4clojure.com/problem/46
;; 원문

;; 한글
;; 입력함수의 인수를 뒤집는 고차 함수를 작성하라
(= 3 ((__ nth) 2 [1 2 3 4 5]))

(= true ((__ >) 7 8))

(= 4 ((__ quot) 2 8))

(= [1 2 3] ((__ take) [1 2 3 4 5] 3))

;; answer
(fn [f]
  (fn [x y] (f y x)))

;; answer 2
(fn [f]
  #(f %2 %1))

;; answer other
(fn [f] #(apply f (reverse %&)))


(= 3 (((fn [f]
  (fn [x y] (f y x))) nth) 2 [1 2 3 4 5]))

(= true (((fn [f]
  (fn [x y] (f y x))) >) 7 8))

(= 4 (((fn [f]
  (fn [x y] (f y x))) quot) 2 8))

(= [1 2 3] (((fn [f]
  (fn [x y] (f y x))) take) [1 2 3 4 5] 3))

  
