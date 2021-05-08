;; 6일차
;; 팩토리얼 놀이 (Factorial Fun)
;; url https://www.4clojure.com/problem/42
;; 원문

;; 한글
;; 팩토리얼은 n 이하의 모든 양의 정수의 곱이다. 예를 들어보면 다음과 같다.
;; 6! = 6 * 5 * 4 * 3 * 2 * 1 = 720
;; 팩토리얼을 계산하는 함수를 작성하라.
;; (= (__ 1) 1)
;; (= (__ 3) 6)
;; (= (__ 5) 120)
;; (= (__ 8) 40320)
;; answer
(fn [x]
  (loop [n x result 1]
    (if (= n 1)
      result
      (recur (dec n) (* n result)))))

;; answer other #(reduce * (range 1 (inc %)))
;; answer other #(->> (iterate inc 1) (take %) (reduce *)) => (reduce * (take % (iterate inc 1)))

(= ((fn [x]
  (loop [n x result 1]
    (if (= n 1)
      result
      (recur (dec n) (* n result))))) 1) 1)

(= ((fn [x]
  (loop [n x result 1]
    (if (= n 1)
      result
      (recur (dec n) (* n result))))) 3) 6)

(= ((fn [x]
  (loop [n x result 1]
    (if (= n 1)
      result
      (recur (dec n) (* n result))))) 5) 120)

(= ((fn [x]
  (loop [n x result 1]
    (if (= n 1)
      result
      (recur (dec n) (* n result))))) 8) 40320)
