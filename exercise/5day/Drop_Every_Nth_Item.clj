;; 5일차
;; 매 n번 요소 제거하기 (Drop Every Nth Item)
;; url https://www.4clojure.com/problem/41
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
;; 시퀀스에서 매 n번째 요소를 제거하는 함수를 작성하라.
;; (= (__ [1 2 3 4 5 6 7 8] 3) [1 2 4 5 6 7 8])
;; (= (__ [:a :b :c :d :e :f] 2) [:a :c :e])
;; (= (__ [1 2 3 4 5 6] 4) [1 2 3 5 6])




