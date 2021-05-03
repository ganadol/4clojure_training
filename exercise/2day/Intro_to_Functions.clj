;; 2 일차
;; 함수 소개 (Intro to Functions)
;; url https://www.4clojure.com/problem/14
;; 원문

;; 한글
;; 클로저에서 함수를 만드는 방법 여러가지가 있다.
;; (= __ ((fn add-five [x] (+ x 5)) 3))
;; (= __ ((fn [x] (+ x 5)) 3))
;; (= __ (#(+ % 5) 3))
;; (= __ ((partial + 5) 3))
(ns ........................Volumes.HDD.night1700.Documents.project.myProject.clojure.4clojure-traning.exercise.2day.Intro-to-Functions)
;; answer
(= 8 ((fn add-five [x] (+ x 5)) 3))
(= 8 ((fn [x] (+ x 5)) 3))
(= 8 (#(+ % 5) 3))
(= 8 ((partial + 5) 3))
