(ns randWordGen
	(require [clojure.string :refer [capitalize]]))

(def syllables_array ["a" "i" "u" "e" "o" "al" "ma" "ba" "ca" "ve" "ne" "no" "na" "bo" "co" "rus" "ca" "nt" "ka" "mi" "mus"
					  "ta" "far" "ta" "to" "th" "da" "go" "bah" "dor" "dir" "gard" "heim" "jo" "tum" "gi" "ku" "ga" "ki" "va"])

(defn random-int-range [min max]
	"Generates pseudo-random integer between a range"
	(+ (rand-int (- max min)) min))

(defn random_word_syl_count []
	"Generates pseudo-random number of syllables, between 2 and 5"
	(random-int-range 2 5))

(defn get_random_syllable []
	"Get pseudo-random syllable from syllables array"
	(get syllables_array (rand-int (+ (count syllables_array) 1))))

(defn generate_random_word []
	"Loops through an empty string appending pseudo-random syllables"
	(loop [word "" syls_count 0 max_syls (random-int-range 2 5)]
		(if (> syls_count max_syls)
			word
			(recur (str word (get_random_syllable)) (+ syls_count 1) max_syls))))

(defn get_capitalized_random_word []
	"Generates and capitalizes a pseudo-random word"
	(capitalize (generate_random_word)))