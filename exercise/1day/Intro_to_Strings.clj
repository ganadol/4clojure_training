;; 1 일차
;; 문자열 소개 (Intro to Strings)
;; url https://www.4clojure.com/problem/3
;; 원문

;; 한글
;; 클로저 문자열은 자바의 문자열이다. 그래서 클로저 문자열을 다룰 때 자바의 문자열 메소를 그대로 사용할 수 있다.
;; (= __ (.toUpperCase "Hello World"))
(ns ..................Volumes.HDD.night1700.Documents.project.myProject.clojure.4clojure-traning.1day-exercise)

;; answer
;; case 1
(= "HELLO WORLD" (.toUpperCase "Hello World"))
;; case 2
(= (.toUpperCase (.toLowerCase "HELLO WORLD")) (.toUpperCase "Hello World"))
;; case 3
(= (.toUpperCase "hello world") (.toUpperCase "Hello World"))
