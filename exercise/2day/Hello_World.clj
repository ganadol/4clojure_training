;; 2 일차
;; Hello World
;; url https://www.4clojure.com/problem/16
;; 원문

;; 한글
;; 이름이 들어간 인사말을 반환하는 함수를 작성하라.
;; (= (__ "Dave") "Hello, Dave!")
;; (= (__ "Jenn") "Hello, Jenn!")
;; (= (__ "Rhea") "Hello, Rhea!")

;; answer (fn [name] (str "Hello, " name "!"))
(= ((fn [name] (str "Hello, " name "!")) "Dave") "Hello, Dave!")
(= ((fn [name] (str "Hello, " name "!")) "Jenn") "Hello, Jenn!")
(= ((fn [name] (str "Hello, " name "!")) "Rhea") "Hello, Rhea!")
