;; 7일차
;; 최대 공약수 (Greatest Common Divisor)
;; url https://www.4clojure.com/problem/66
;; 원문

;; 한글
;; 최대 공약수 (GCD)는 나머지 없이 두 수를 나누는 가장 큰 양의 정수이다.
;; 두개의 정수가 주어질 때 최대 공약수를 반환하는 함수를 작성하라.
;; (= (__ 2 4) 2)
;; (= (__ 10 5) 5)
;; (= (__ 5 7) 1)
;; (= (__ 1023 858) 33)

;; answer
(fn [a b]
  (loop [x a y b]
    (if (zero? (mod x y))
      y
      (recur y (mod x y)))))

;; answer other (fn [x y] (if (zero? y) x (recur y (mod x y))))

(= ((fn [a b]
  (loop [x a y b]
    (if (zero? (mod x y))
      y
      (recur y (mod x y))))) 2 4) 2)

(= ((fn [a b]
  (loop [x a y b]
    (if (zero? (mod x y))
      y
      (recur y (mod x y))))) 10 5) 5)

(= ((fn [a b]
  (loop [x a y b]
    (if (zero? (mod x y))
      y
      (recur y (mod x y))))) 5 7) 1)

(= ((fn [a b]
  (loop [x a y b]
    (if (zero? (mod x y))
      y
      (recur y (mod x y))))) 1023 858) 33)
