;; 4 일차
;; 홀수 찾기 (Palindrome Detector)
;; url https://www.4clojure.com/problem/27
;; 원문

;; 한글
;; 주어진 시퀀스가 회문이면 참을 반환하는 함수를 작성하라.
;; 힌트: "race-car"는 (\r \a \c \e \c \a \r)와 같지 않다.
;; (false? (__ '(1 2 3 4 5)))
;; (true? (__ "racecar"))
;; (true? (__ [:foo :bar :foo]))
;; (true? (__ '(1 1 3 3 1 1)))
;; (false? (__ '(:a :b :c)))

;; answer (fn Palindrome? [x] (if (string? x) (= (str (reverse (seq x)) x)) (= (reverse x) x)))
;; answer #(= (reverse %) (reverse (reverse %)))
(false? ((fn Palindrome? [x] (if (string? x) (= (str (reverse (seq x)) x)) (= (reverse x) x))) '(1 2 3 4 5)))
(true? ((fn Palindrome? [x] (if (string? x) (= (str (reverse (seq x)) x)) (= (reverse x) x))) "racecar"))
(true? ((fn Palindrome? [x] (if (string? x) (= (str (reverse (seq x)) x)) (= (reverse x) x))) [:foo :bar :foo]))
(true? ((fn Palindrome? [x] (if (string? x) (= (str (reverse (seq x)) x)) (= (reverse x) x))) '(1 1 3 3 1 1)))
(false? ((fn Palindrome? [x] (if (string? x) (= (str (reverse (seq x)) x)) (= (reverse x) x))) '(:a :b :c)))
