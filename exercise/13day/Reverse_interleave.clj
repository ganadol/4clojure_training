;; 13일차
;; 역방향 Interleave (Reverse Interleave)
;; url https://www.4clojure.com/problem/43
;; 원문

;; 한글
;; interleave 과정을 역방향으로 해서 x개의 서브 시퀀들로 분해하는 함수를 작성하라

(= (__ [1 2 3 4 5 6] 2) '((1 3 5) (2 4 6)))

(= (__ (range 9) 3) '((0 3 6) (1 4 7) (2 5 8)))

(= (__ (range 10) 5) '((0 5) (1 6) (2 7) (3 8) (4 9)))


;; answer
(fn [l c]
  (loop [l l c c result () cnt 0]
    (if (= c cnt)
      (sort-by first result)
      (recur l c (conj result (for [a l :when (= cnt (rem a c))] a)) (inc cnt)))))

;; answer other
(fn [col n]
  (->> (partition n col)
       (apply map #(apply list %&))))

;; answer other
#(apply map list (partition %2 %))

;; answer other
#(for [i (range %2)]
   (take-nth %2 (drop i %1)))


(= ((fn [l c]
  (loop [l l c c result () cnt 0]
    (if (= c cnt)
      (sort-by first result)
      (recur l c (conj result (for [a l :when (= cnt (rem a c))] a)) (inc cnt))))) [1 2 3 4 5 6] 2) '((1 3 5) (2 4 6)))

(= ((fn [l c]
  (loop [l l c c result () cnt 0]
    (if (= c cnt)
      (sort-by first result)
      (recur l c (conj result (for [a l :when (= cnt (rem a c))] a)) (inc cnt))))) (range 9) 3) '((0 3 6) (1 4 7) (2 5 8)))

(= ((fn [l c]
  (loop [l l c c result () cnt 0]
    (if (= c cnt)
      (sort-by first result)
      (recur l c (conj result (for [a l :when (= cnt (rem a c))] a)) (inc cnt))))) (range 10) 5) '((0 5) (1 6) (2 7) (3 8) (4 9)))
