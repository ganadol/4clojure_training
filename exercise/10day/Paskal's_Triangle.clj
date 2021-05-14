;; 10일차
;; 파스칼의 삼각형 (Paskal's Triangle)
;; url https://www.4clojure.com/problem/97
;; 원문

;; 한글
;; 파스칼의 삼각형은 다음 규칙으로 계산되는 수들의 삼각형이다.
;; 첫번째 행은 1이다.
;; 다음행은 바로 위의 행의 인접한 두 수를 더해 계산한 다음 행의 처음과 마지막에 1을 추가한다.
;; 파스칼의 삼각형의 n번째 행을 반환하는 함수를 작성하라.
(= (__ 1) [1])
(= (map __ (range 1 6))
   [    [1]
       [1 1]
      [1 2 1]
     [1 3 3 1]
    [1 4 6 4 1]])
(= (__ 11)
   [1 10 45 120 210 252 210 120 45 10 1])

;; answer
(fn [x]
  (let [lst (range 1 (inc x))
        paskal (fn [l]
                 (loop [x l result []]
                   (if (empty? x)
                     (cons 1 result)
                     (if (= (count x) 1)
                       (recur (rest x) (conj result (first x)))
                       (recur (rest x) (conj result (+ (first x) (second x))))))))]
    (loop [a lst result []]
      (if (empty? a)
        (vec result)
        (recur (rest a) (paskal result))))))


;; answer other
(defn pascal-triangle-row [n]
  (letfn [(step [xs]
            (-> (into [(first xs)] (map #(reduce +' %1N) (partition 2 1 xs)))
                (conj (last xs))))]
    (last (take n (iterate step [1])))))


;; answer other
(fn [n]
  (loop [n n res [1]]
    (if (= n 1) res
        (recur (dec n) (map + (concat [0] res) (concat res [0]))))))

      
(= ((fn [x]
  (let [lst (range 1 (inc x))
        paskal (fn [l]
                 (loop [x l result []]
                   (if (empty? x)
                     (cons 1 result)
                     (if (= (count x) 1)
                       (recur (rest x) (conj result (first x)))
                       (recur (rest x) (conj result (+ (first x) (second x))))))))]
    (loop [a lst result []]
      (if (empty? a)
        (vec result)
        (recur (rest a) (paskal result)))))) 1) [1])
(= (map (fn [x]
  (let [lst (range 1 (inc x))
        paskal (fn [l]
                 (loop [x l result []]
                   (if (empty? x)
                     (cons 1 result)
                     (if (= (count x) 1)
                       (recur (rest x) (conj result (first x)))
                       (recur (rest x) (conj result (+ (first x) (second x))))))))]
    (loop [a lst result []]
      (if (empty? a)
        (vec result)
        (recur (rest a) (paskal result)))))) (range 1 6))
   [    [1]
    [1 1]
    [1 2 1]
    [1 3 3 1]
    [1 4 6 4 1]])
(= ((fn [x]
  (let [lst (range 1 (inc x))
        paskal (fn [l]
                 (loop [x l result []]
                   (if (empty? x)
                     (cons 1 result)
                     (if (= (count x) 1)
                       (recur (rest x) (conj result (first x)))
                       (recur (rest x) (conj result (+ (first x) (second x))))))))]
    (loop [a lst result []]
      (if (empty? a)
        (vec result)
        (recur (rest a) (paskal result)))))) 11)
   [1 10 45 120 210 252 210 120 45 10 1])

1 2 1
  1 2 1
