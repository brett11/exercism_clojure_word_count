(ns word-count
  (:require [clojure.string :as str]))

(defn words-only [s]
  (re-seq #"\w+" s))

(defn to-lower [word-seq]
  (map str/lower-case word-seq))

(defn word-count [s]
  (-> s words-only to-lower frequencies))



