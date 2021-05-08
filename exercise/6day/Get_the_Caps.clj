;; 6일차
;; 대문자 구하기 (Get the Caps)
;; url https://www.4clojure.com/problem/29
;; 원문

;; 한글
;; 문자열을 받아서 대문자만 있는 새로운 문자을 반환하는 함수를 작성하라.
;; (= (__ "HeLlO, WorRlD!") "HLOWRD")
;; (empty? (__ "nothing"))
;; (= (__ "$#A(*&987Zf") "AZ")
;; 힌트 #(Character/isUpperCase %)
;; answer (fn [x] (apply str (filter #(Character/isUpperCase %) x)))
;; answer other #(apply str (re-seq #"[A-Z]" %))
(= ((fn [x] (apply str (filter #(Character/isUpperCase %) x))) "HeLlO, WorRlD!") "HLOWRD")
(empty? ((fn [x] (apply str (filter #(Character/isUpperCase %) x))) "nothing"))
(= ((fn [x] (apply str (filter #(Character/isUpperCase %) x))) "$#A(*&987Zf") "AZ")
