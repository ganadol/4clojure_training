;; 8일차
;; 데카르트 곱 (Cartesian Product)
;; url https://www.4clojure.com/problem/90
;; 원문

;; 한글
;; 두집합의 데카르트 곱(Cartesian Product)을 계산하는 함수를 작성하라.
;; 데카르트 곱 예시
;; A = {a, b}, B = {c, d, e}
;; A × B = {(a, c), (a, d), (a, e), (b, c), (b, d), (b, e)}
;; A = {1, 2, 3}
;; A × A = {(1, 1), (1, 2), (1, 3), (2, 1), (2, 2), (2, 3), (3, 1), (3, 2), (3, 3)}
;; (= (__ #{"ace" "king" "queen"} #{"spade" "heart" "diamond" "club"})
;;    #{["ace" "spade"] ["king" "diamond"] ["ace" "heart"] ["queen" "club"]
;;      ["ace" "diamond"] ["queen" "heart"] ["queen" "spade"]
;;      ["queen" "diamond"] ["king" "club"] ["king" "heart"]
;;      ["king" "spade"] ["ace" "club"]})
;; (= (__ #{1 2 3} #{4 5})
;;    #{[1 4] [2 4] [3 4] [1 5] [2 5] [3 5]})
;; (= 300 (count (__ (into #{} (range 10))
;;                   (into #{} (range 30)))))

;; answer
(fn [x y]
  (let [ycnt (count x)]
    (loop [a (seq x) b (seq y) cnt ycnt result []]
      (if (empty? b)
        (set result)
        (if (= cnt 1)
          (recur (seq x) (rest b) ycnt (conj result [(first a) (first b)]))
          (recur (rest a) b (dec cnt) (conj result [(first a) (first b)])))))))

;; answer other #(set (for [x %1 y %2] [x y]))

(= ((fn [x y]
      (let [ycnt (count x)]
        (loop [a (seq x) b (seq y) cnt ycnt result []]
          (if (empty? b)
            (set result)
            (if (= cnt 1)
              (recur (seq x) (rest b) ycnt (conj result [(first a) (first b)]))
              (recur (rest a) b (dec cnt) (conj result [(first a) (first b)]))))))) #{1 2 3} #{4 5})
   #{[1 4] [2 4] [3 4] [1 5] [2 5] [3 5]})

(= ((fn [x y]
      (let [ycnt (count x)]
        (loop [a (seq x) b (seq y) cnt ycnt result []]
          (if (empty? b)
            (set result)
            (if (= cnt 1)
              (recur (seq x) (rest b) ycnt (conj result [(first a) (first b)]))
              (recur (rest a) b (dec cnt) (conj result [(first a) (first b)])))))))
    #{"ace" "king" "queen"} #{"spade" "heart" "diamond" "club"})
   #{["ace" "spade"] ["king" "diamond"] ["ace" "heart"] ["queen" "club"]
     ["ace" "diamond"] ["queen" "heart"] ["queen" "spade"]
     ["queen" "diamond"] ["king" "club"] ["king" "heart"]
     ["king" "spade"] ["ace" "club"]})
   
(= 300 (count ((fn [x y]
                 (let [ycnt (count x)]
                   (loop [a (seq x) b (seq y) cnt ycnt result []]
                     (if (empty? b)
                       (set result)
                       (if (= cnt 1)
                         (recur (seq x) (rest b) ycnt (conj result [(first a) (first b)]))
                         (recur (rest a) b (dec cnt) (conj result [(first a) (first b)])))))))
               (into #{} (range 10))
               (into #{} (range 30)))))
