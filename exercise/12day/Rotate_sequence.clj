;; 12일차
;; 시퀀스 회전시키기  (Rotate sequence)
;; url https://www.4clojure.com/problem/44
;; 원문

;; 한글
;; 시퀀스를 어느 한쪽 방향으로 회전시키는 함수를 작성하라.
(= (__ 2 '(1 2 3 4 5)) '(3 4 5 1 2))

(= (__ -2 '(1 2 3 4 5)) '(4 5 1 2 3))

(= (__ 6 '(1 2 3 4 5)) '(2 3 4 5 1))

(= (__ 1 '(:a :b :c)) '(:b :c :a))

(= (__ -4 '(:a :b :c)) '(:c :a :b))

;; answer
(fn [a b]
  (if (zero? a)
    b
    (if (> a 0)
      (recur (dec a) (concat (rest b) (list (first b))))
      (recur (inc a) (concat (list (last b)) (reverse (rest (reverse b))))))))

;; answer 2
(fn [a b]
  (loop [a a b b]
    (if (zero? a)
      b
      (if (> a 0)
        (recur (dec a) (concat (rest b) (list (first b))))
        (recur (inc a) (concat (list (last b)) (reverse (rest (reverse b)))))))))

;; answer other
(fn [z xs]
  (let [m (mod z (count xs))]
    (concat (drop m xs) (take m xs))))

;; answer other
(fn [n xs]
  (let [size (count xs)]
    (->> (cycle xs)
         (drop (mod n size))
         (take size))))


(= ((fn [a b]
  (loop [a a b b]
    (if (zero? a)
      b
      (if (> a 0)
        (recur (dec a) (concat (rest b) (list (first b))))
        (recur (inc a) (concat (list (last b)) (reverse (rest (reverse b))))))))) 2 '(1 2 3 4 5)) '(3 4 5 1 2))

(= ((fn [a b]
  (loop [a a b b]
    (if (zero? a)
      b
      (if (> a 0)
        (recur (dec a) (concat (rest b) (list (first b))))
        (recur (inc a) (concat (list (last b)) (reverse (rest (reverse b))))))))) -2 '(1 2 3 4 5)) '(4 5 1 2 3))

(= ((fn [a b]
  (loop [a a b b]
    (if (zero? a)
      b
      (if (> a 0)
        (recur (dec a) (concat (rest b) (list (first b))))
        (recur (inc a) (concat (list (last b)) (reverse (rest (reverse b))))))))) 6 '(1 2 3 4 5)) '(2 3 4 5 1))

(= ((fn [a b]
  (loop [a a b b]
    (if (zero? a)
      b
      (if (> a 0)
        (recur (dec a) (concat (rest b) (list (first b))))
        (recur (inc a) (concat (list (last b)) (reverse (rest (reverse b))))))))) 1 '(:a :b :c)) '(:b :c :a))

(= ((fn [a b]
  (loop [a a b b]
    (if (zero? a)
      b
      (if (> a 0)
        (recur (dec a) (concat (rest b) (list (first b))))
        (recur (inc a) (concat (list (last b)) (reverse (rest (reverse b))))))))) -4 '(:a :b :c)) '(:c :a :b))



(= ((fn [a b]
      (if (zero? a)
        b
        (if (> a 0)
          (recur (dec a) (concat (rest b) (list (first b))))
          (recur (inc a) (concat (list (last b)) (reverse (rest (reverse b)))))))) 2 '(1 2 3 4 5)) '(3 4 5 1 2))
