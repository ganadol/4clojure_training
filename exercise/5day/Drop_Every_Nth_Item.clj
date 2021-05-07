;; 5일차
;; 매 n번 요소 제거하기 (Drop Every Nth Item)
;; url https://www.4clojure.com/problem/41
;; 원문

;; 한글
;; 시퀀스에서 매 n번째 요소를 제거하는 함수를 작성하라.
;; (= (__ [1 2 3 4 5 6 7 8] 3) [1 2 4 5 7 8])
;; (= (__ [:a :b :c :d :e :f] 2) [:a :c :e])
;; (= (__ [1 2 3 4 5 6] 4) [1 2 3 5 6])

;; answer fail (fn remove-seq [seq-list n] (vec (filter #(not (= n %)) seq-list))) 
;; answer
;; (fn remove-seq [seq-list n]
;;   (loop [result [] cnt 1 lst seq-list t n]
;;     (if (empty? lst)
;;       result
;;       (if (= cnt t)
;;         (recur result 1 (rest lst) t)
;;         (recur (conj result (first lst)) (inc cnt) (rest lst) t)))))

;; answer other #(apply concat (partition-all (dec %2) %2 %1))
(= ((fn remove-seq [seq-list n]
      (loop [result [] cnt 1 lst seq-list t n]
        (if (empty? lst)
          result
          (if (= cnt t)
            (recur result 1 (rest lst) t)
            (recur (conj result (first lst)) (inc cnt) (rest lst) t)))))
    [1 2 3 4 5 6 7 8] 3) [1 2 4 5 7 8])

(= ((fn remove-seq [seq-list n]
      (loop [result [] cnt 1 lst seq-list t n]
        (if (empty? lst)
          result
          (if (= cnt t)
            (recur result 1 (rest lst) t)
            (recur (conj result (first lst)) (inc cnt) (rest lst) t)))))
    [:a :b :c :d :e :f] 2) [:a :c :e])

(= ((fn remove-seq [seq-list n]
      (loop [result [] cnt 1 lst seq-list t n]
        (if (empty? lst)
          result
          (if (= cnt t)
            (recur result 1 (rest lst) t)
            (recur (conj result (first lst)) (inc cnt) (rest lst) t)))))
    [1 2 3 4 5 6] 4) [1 2 3 5 6])
