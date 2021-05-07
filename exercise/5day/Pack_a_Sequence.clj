;; 5일차
;; 시퀀스 묶기 (Pack a Sequence)
;; url https://www.4clojure.com/problem/31
;; 원문

;; 한글
;; 연속된 중복을 하위 리스트로 묶는 함수를 작성하라.
;; (= (__ [1 1 2 1 1 1 3 3]) '((1 1) (2) (1 1 1) (3 3)))
;; (= (__ [:a :a :b :b :c]) '((:a :a) (:b :b) (:c)))
;; (= (__ [[1 2] [1 2] [3 4]]) '(([1 2] [1 2]) ([3 4])))

;; answer
;; (fn [lst]
;;   (loop [result '() temp '() seq-list (seq lst)]
;;     (if (empty? seq-list)
;;       (drop 1(reverse (conj result temp)))
;;       (if (= (last temp) (first seq-list))
;;         (recur result (cons (first seq-list) temp) (rest seq-list))
;;         (recur (conj result temp) (cons (first seq-list) '()) (rest seq-list))))))

;; answer other
;; partition-by identity
(= ((fn [lst]
      (loop [result '() temp '() seq-list (seq lst)]
        (if (empty? seq-list)
          (drop 1(reverse (conj result temp)))
          (if (= (last temp) (first seq-list))
            (recur result (cons (first seq-list) temp) (rest seq-list))
            (recur (conj result temp) (cons (first seq-list) '()) (rest seq-list))))))
    [1 1 2 1 1 1 3 3]) '((1 1) (2) (1 1 1) (3 3)))

(= ((fn [lst]
      (loop [result '() temp '() seq-list (seq lst)]
        (if (empty? seq-list)
          (drop 1(reverse (conj result temp)))
          (if (= (last temp) (first seq-list))
            (recur result (cons (first seq-list) temp) (rest seq-list))
            (recur (conj result temp) (cons (first seq-list) '()) (rest seq-list))))))
    [:a :a :b :b :c]) '((:a :a) (:b :b) (:c)))

(= ((fn [lst]
      (loop [result '() temp '() seq-list (seq lst)]
        (if (empty? seq-list)
          (drop 1(reverse (conj result temp)))
          (if (= (last temp) (first seq-list))
            (recur result (cons (first seq-list) temp) (rest seq-list))
            (recur (conj result temp) (cons (first seq-list) '()) (rest seq-list))))))
    [[1 2] [1 2] [3 4]]) '(([1 2] [1 2]) ([3 4])))
