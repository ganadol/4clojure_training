;; 1 일차
;; 집합 소개 (Intro to Set)
;; url https://www.4clojure.com/problem/8
;; 원문

;; 한글
;; 집합은 유일한 값들의 컬렉션이다.
;; (= __ (set '(:a :a :b :c :c :c :c :d :d)))
;; (= __ (clojure.set/union #{:a :b :c} #{:b :c :d}))

(ns .....................Volumes.HDD.night1700.Documents.project.myProject.clojure.4clojure-traning.1day-exercise.Intro-to-Set)

;; answer
;; case 1
(= #{:a :b :c :d} (set '(:a :a :b :c :c :c :c :d :d)))
(= #{:a :b :c :d} (clojure.set/union #{:a :b :c} #{:b :c :d}))
;; case 2
(= (set '(:a :b :c :d)) (set '(:a :a :b :c :c :c :c :d :d)))
(= (set '(:a :b :c :d)) (clojure.set/union #{:a :b :c} #{:b :c :d}))
;; case 3
(= (set '[:a :b :c :d]) (set '(:a :a :b :c :c :c :c :d :d)))
(= (set '[:a :b :c :d]) (clojure.set/union #{:a :b :c} #{:b :c :d}))
