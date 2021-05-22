;; 13일차
;; 타입에 따라 나누기 (Split by Type)
;; url https://www.4clojure.com/problem/50
;; 원문

;; 한글
;; 여러 타입의 아이템으로 된 시퀀스를 받아서 같은 타입의 아이템으로 된 서브 시퀀스 집합으로 나누는 함수를 작성하라.
;; 각 서브 시퀀스의 내부순서는 유지되어야 하지만 서브 시퀀스들 자체는 어떤 순서로 반환되어도 좋다
;; (이런 이유로 테스트 케이스에서 집합을 사용했다.)
(= (set (__ [1 :a 2 :b 3 :c])) #{[1 2 3] [:a :b :c]})

(= (set (__ [:a "foo" "bar" :b])) #{[:a :b] ["foo" "bar"]})

(= (set (__ [[1 2] :a [3 4] 5 6 :b])) #{[[1 2] [3 4]][:a :b] [5 6]})

;; answer
(fn [l]
  (let [type-add
        (fn [a l]
          (loop [a a b l result l]
            (if (empty? b)
              result
              (if (= (type a) (type (first (first b))))
                (recur a (rest b) (conj (remove #(= (first b) %) result) (conj (first b) a)))
                (recur a (rest b) result)))))
        type-checker
        (fn [a l]
          (if (empty? l)
            false
            (if (= (type a) (type (first (first l))))
              true
              (recur a (rest l)))))]
    (loop [l l res []]
      (if (empty? l)
        res
        (if (true? (type-checker (first l) res))
          (recur (rest l) (type-add (first l) res))
          (recur (rest l) (conj res (vector (first l)))))))))

;; answer other
#(->> % (group-by type) (vals))

;; answer other
#(vals (group-by type %))

;; answer other
#(map last (group-by type %))
               
          
(= (set ((fn [l]
  (let [type-add
        (fn [a l]
          (loop [a a b l result l]
            (if (empty? b)
              result
              (if (= (type a) (type (first (first b))))
                (recur a (rest b) (conj (remove #(= (first b) %) result) (conj (first b) a)))
                (recur a (rest b) result)))))
        type-checker
        (fn [a l]
          (if (empty? l)
            false
            (if (= (type a) (type (first (first l))))
              true
              (recur a (rest l)))))]
    (loop [l l res []]
      (if (empty? l)
        res
        (if (true? (type-checker (first l) res))
          (recur (rest l) (type-add (first l) res))
          (recur (rest l) (conj res (vector (first l))))))))) [1 :a 2 :b 3 :c])) #{[1 2 3] [:a :b :c]})

(= (set ((fn [l]
  (let [type-add
        (fn [a l]
          (loop [a a b l result l]
            (if (empty? b)
              result
              (if (= (type a) (type (first (first b))))
                (recur a (rest b) (conj (remove #(= (first b) %) result) (conj (first b) a)))
                (recur a (rest b) result)))))
        type-checker
        (fn [a l]
          (if (empty? l)
            false
            (if (= (type a) (type (first (first l))))
              true
              (recur a (rest l)))))]
    (loop [l l res []]
      (if (empty? l)
        res
        (if (true? (type-checker (first l) res))
          (recur (rest l) (type-add (first l) res))
          (recur (rest l) (conj res (vector (first l))))))))) [:a "foo" "bar" :b])) #{[:a :b] ["foo" "bar"]})

(= (set ((fn [l]
  (let [type-add
        (fn [a l]
          (loop [a a b l result l]
            (if (empty? b)
              result
              (if (= (type a) (type (first (first b))))
                (recur a (rest b) (conj (remove #(= (first b) %) result) (conj (first b) a)))
                (recur a (rest b) result)))))
        type-checker
        (fn [a l]
          (if (empty? l)
            false
            (if (= (type a) (type (first (first l))))
              true
              (recur a (rest l)))))]
    (loop [l l res []]
      (if (empty? l)
        res
        (if (true? (type-checker (first l) res))
          (recur (rest l) (type-add (first l) res))
          (recur (rest l) (conj res (vector (first l))))))))) [[1 2] :a [3 4] 5 6 :b])) #{[[1 2] [3 4]][:a :b] [5 6]})
