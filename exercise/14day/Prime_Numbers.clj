;; 14일차
;; 소수 (Prime Numbers)
;; url https://www.4clojure.com/problem/67
;; 원문

;; 한글
;; 처음 x개의 소수를 반환하는 함수를 작성하라.
(= (__ 2) [2 3])

(= (__ 5) [2 3 5 7 11])

(= (last (__ 100)) 541)

;; answer
(fn [n]
  (let [mod-prime-list
        (fn [l n]
          (if (empty? l)
            n
            (if (zero? (mod n (first l)))
              0
              (recur (rest l) n))))
        is-prime?
        (fn [n l]
          (cond (= n 2) true
                :else (if (zero? (mod-prime-list l n))
                        false
                        true)))]
    (loop [cnt n result [] num 2]
      (if (= (count result) cnt)
        result
        (if (is-prime? num result)
          (recur cnt (conj result num) (inc num))
          (recur cnt result (inc num)))))))

;; answer other
(fn [x] (take x (filter #(= (inc (mod (apply * (range 1N %)) %)) %) (iterate inc 2))))

;; answer other
(fn [n]
  (->> (range)
       (drop 2)
       (filter (fn [x] (not-any? #(zero? (mod x %)) (range 2 x))))
       (take n)))

;; answer other
#(take % ((fn sieve [s]
            (cons (first s)
                  (lazy-seq (sieve (filter (fn [xx] (not= 0 (mod xx (first s))))
                                           (rest s)))))) (iterate inc 2)))

(= ((fn [n]
  (let [mod-prime-list
        (fn [l n]
          (if (empty? l)
            n
            (if (zero? (mod n (first l)))
              0
              (recur (rest l) n))))
        is-prime?
        (fn [n l]
          (cond (= n 2) true
                :else (if (zero? (mod-prime-list l n))
                        false
                        true)))]
    (loop [cnt n result [] num 2]
      (if (= (count result) cnt)
        result
        (if (is-prime? num result)
          (recur cnt (conj result num) (inc num))
          (recur cnt result (inc num))))))) 2) [2 3])

(= ((fn [n]
  (let [mod-prime-list
        (fn [l n]
          (if (empty? l)
            n
            (if (zero? (mod n (first l)))
              0
              (recur (rest l) n))))
        is-prime?
        (fn [n l]
          (cond (= n 2) true
                :else (if (zero? (mod-prime-list l n))
                        false
                        true)))]
    (loop [cnt n result [] num 2]
      (if (= (count result) cnt)
        result
        (if (is-prime? num result)
          (recur cnt (conj result num) (inc num))
          (recur cnt result (inc num))))))) 5) [2 3 5 7 11])

(= (last ((fn [n]
  (let [mod-prime-list
        (fn [l n]
          (if (empty? l)
            n
            (if (zero? (mod n (first l)))
              0
              (recur (rest l) n))))
        is-prime?
        (fn [n l]
          (cond (= n 2) true
                :else (if (zero? (mod-prime-list l n))
                        false
                        true)))]
    (loop [cnt n result [] num 2]
      (if (= (count result) cnt)
        result
        (if (is-prime? num result)
          (recur cnt (conj result num) (inc num))
          (recur cnt result (inc num))))))) 100)) 541)

