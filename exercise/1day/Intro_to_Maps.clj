;; 1 일차
;; 집합 소개 (Intro to Maps)
;; url https://www.4clojure.com/problem/10
;; 원문

;; 한글
;; 맵은 키-값 쌍을 저장한다. 맵과 키워드는 둘다 요소를 찾는 함수로 사용될 수 있다.
;; 쉼표를 사용해 맵을 읽기 쉽게 할 수는 있지만 필수적인 것은 아니다.
;; (= __ ((hash-map :a 10, :b 20, :c 30) :b))
;; (= __ (:b {:a 10, :b 20, :c 30}))
(ns ........................Volumes.HDD.night1700.Documents.project.myProject.clojure.4clojure-traning.exercise.1day.Intro-to-Maps)
;; answer
(= 20 ((hash-map :a 10, :b 20, :c 30) :b))
(= 20 (:b {:a 10, :b 20, :c 30}))
