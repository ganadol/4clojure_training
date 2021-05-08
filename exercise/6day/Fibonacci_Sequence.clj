;; 6일차
;; 피보나치 수열 (Fibonacci Sequence)
;; url https://www.4clojure.com/problem/26
;; 원문

;; 한글
;; 이문제는 피보나치 수열과 관련이 있다.
;; 피보나치 수열은 이전의 숫자 두개를 더해 다음의 숫자를 만드는 정수 수열이다.
;; 0 1 1 2 3 5 8 13 21 34 ...
;; 주어진 개수의 피보나치 수를 반환하는 함수를 작성하라.
;; (= (__ 3) '(1 1 2))
;; (= (__ 6) '(1 1 2 3 5 8))
;; (= (__ 8) '(1 1 2 3 5 8 13 21))
;; answer
(fn [n]
  (loop [cnt n cur 0 nxt 1 result []]
    (if (zero? cnt)
      (drop 1 (conj result cur))
      (recur (dec cnt) nxt (+ nxt cur) (conj result cur)))))

;; answer other #(take % (map first (iterate (fn [[x y]] [y (+ x y)]) [1 1])))
        

(= ((fn [n]
  (loop [cnt n cur 0 nxt 1 result []]
    (if (zero? cnt)
      (drop 1 (conj result cur))
      (recur (dec cnt) nxt (+ nxt cur) (conj result cur))))) 3) '(1 1 2))

(= ((fn [n]
  (loop [cnt n cur 0 nxt 1 result []]
    (if (zero? cnt)
      (drop 1 (conj result cur))
      (recur (dec cnt) nxt (+ nxt cur) (conj result cur))))) 6) '(1 1 2 3 5 8))

(= ((fn [n]
  (loop [cnt n cur 0 nxt 1 result []]
    (if (zero? cnt)
      (drop 1 (conj result cur))
      (recur (dec cnt) nxt (+ nxt cur) (conj result cur))))) 8) '(1 1 2 3 5 8 13 21))
