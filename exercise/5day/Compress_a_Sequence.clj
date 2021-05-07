;; 5일차
;; 시퀀스 압축하기 (Compress a Sequence)
;; url https://www.4clojure.com/problem/30
;; 원문

;; 한글
;; (fn filter-duplicate [lst] 
;;   (loop [vecs lst result []]
;;     (if (empty? vecs) 
;;       result
;;       (let [x (first vecs) y (second vecs)]
;;         (if (= x y)
;;           (recur (rest vecs) result)
;;           (recur (rest vecs) (conj result x)))))))
;; 시퀀스에서 연속된 중복을 제거하는 함수를 작성하라.
;; (= (apply str (__ "Leeeeeerrroyyy")) "Leroy")
;; (= (__ [1 1 2 3 3 2 2 3]) '(1 2 3 2 3))
;; (= (__ [[1 2] [1 2] [3 4] [1 2]]) '([1 2] [3 4] [1 2]))
;; answer
;; (fn [lst]
;;   (loop [result [] seq-list lst]
;;     (if (empty? seq-list)
;;       result
;;       (if (= (first seq-list) (second seq-list))
;;         (recur result (rest seq-list))
;;         (recur (conj result (first seq-list)) (rest seq-list))))))

;;answer other  #(reduce (fn [a b] (if (= (last a) b) a (conj a b))) [] %)

(= (apply str
          ((fn [lst]
             (loop [result [] seq-list lst]
               (if (empty? seq-list)
                 result
                 (if (= (first seq-list) (second seq-list))
                   (recur result (rest seq-list))
                   (recur (conj result (first seq-list))
                          (rest seq-list)))))) "Leeeeeerrroyyy")) "Leroy")

(= ((fn [lst]
      (loop [result [] seq-list lst]
        (if (empty? seq-list)
          result
          (if (= (first seq-list) (second seq-list))
            (recur result (rest seq-list))
            (recur (conj result (first seq-list))
                   (rest seq-list)))))) [1 1 2 3 3 2 2 3]) '(1 2 3 2 3))

(= ((fn [lst]
      (loop [result [] seq-list lst]
        (if (empty? seq-list)
          result
          (if (= (first seq-list) (second seq-list))
            (recur result (rest seq-list))
            (recur (conj result (first seq-list))
                   (rest seq-list)))))) [[1 2] [1 2] [3 4] [1 2]]) '([1 2] [3 4] [1 2]))
