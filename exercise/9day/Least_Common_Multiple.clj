;; 9일차
;; 최소 공배수 (Least Common Multiple)
;; url https://www.4clojure.com/problem/100
;; 원문

;; 한글
;; 최소 공배수를 계산하는 함수를 작성하라. 이 함수는 여러개의 양의 정수 또는 분수를 인수로 받는다.
;; 최대공약수 GCD(Greatest Common Divisor)
;; 최대공약수는 두 자연수의 공통된 약수 중 가장 큰 수를 의미한다.
;; ex) 72 와 30의 최대공약수는 6이다.
;; 최소공배수 LCM(Least Common Multiple)
;; 최소공배수는 두 자연수의 공통된 배수 중 가장 작은 수를 의미한다.
;; 최소공배수 = 두 자연수의 곱 / 최대공약수
;; ex) 72 와 30의 최소공배수는 360이다.
;; (== (__ 2 3) 6)
;; (== (__ 5 3 7) 105)
;; (== (__ 1/3 2/5) 2)
;; (== (__ 3/4 1/6) 3/2)
;; (== (__ 7 5/7 2 3/5) 210)

;; answer (fn [& x] (reduce (fn [x y] (/ (* x y) ((fn [x y] (if (zero? y) x (recur y (mod x y)))) x y))) x))
;; answer other
;; (fn lcm [& x]
;;   (let [gcd (fn [x y] (if (zero? y) x (recur y (mod x y))))]
;;     (reduce #(/ (* % %2) (gcd % %2)) x)))

(== ((fn [& x] (reduce (fn [x y] (/ (* x y) ((fn [x y] (if (zero? y) x (recur y (mod x y)))) x y))) x)) 2 3) 6)
(== ((fn [& x] (reduce (fn [x y] (/ (* x y) ((fn [x y] (if (zero? y) x (recur y (mod x y)))) x y))) x)) 5 3 7) 105)
(== ((fn [& x] (reduce (fn [x y] (/ (* x y) ((fn [x y] (if (zero? y) x (recur y (mod x y)))) x y))) x)) 1/3 2/5) 2)
(== ((fn [& x] (reduce (fn [x y] (/ (* x y) ((fn [x y] (if (zero? y) x (recur y (mod x y)))) x y))) x)) 3/4 1/6) 3/2)
(== ((fn [& x] (reduce (fn [x y] (/ (* x y) ((fn [x y] (if (zero? y) x (recur y (mod x y)))) x y))) x)) 7 5/7 2 3/5) 210)


