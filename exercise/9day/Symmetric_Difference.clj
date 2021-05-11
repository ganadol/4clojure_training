;; 9일차
;; 대칭 차집합 (Symmetric Difference)
;; url https://www.4clojure.com/problem/88
;; 원문

;; 한글
;; 두집합의 대칭 차집(symmetric difference)을 반환하는 함수를 작성하라.
;; 대칭 차집합은 합집합에서 교집합을 뺀것이다.
;; (= (__ #{1 2 3 4 5 6} #{1 3 5 7}) #{2 4 6 7})
;; (= (__ #{:a :b :c} #{}) #{:a :b :c})
;; (= (__ #{} #{4 5 6}) #{4 5 6})
;; (= (__ #{[1 2] [2 3]} #{[2 3] [3 4]}) #{[1 2] [3 4]})

;; answer #(clojure.set/difference (clojure.set/union %1 %2) (clojure.set/intersection %1 %2))
;; answer other #(set (concat (apply disj %1 %2) (apply disj %2 %1)))

(= (#(clojure.set/difference (clojure.set/union %1 %2) (clojure.set/intersection %1 %2)) #{1 2 3 4 5 6} #{1 3 5 7}) #{2 4 6 7})
(= (#(clojure.set/difference (clojure.set/union %1 %2) (clojure.set/intersection %1 %2)) #{:a :b :c} #{}) #{:a :b :c})
(= (#(clojure.set/difference (clojure.set/union %1 %2) (clojure.set/intersection %1 %2)) #{} #{4 5 6}) #{4 5 6})
(= (#(clojure.set/difference (clojure.set/union %1 %2) (clojure.set/intersection %1 %2)) #{[1 2] [2 3]} #{[2 3] [3 4]}) #{[1 2] [3 4]})



