# rand-word-generator

A Clojure library designed to generates and capitalizes a pseudo-random word from syllables array.

## Usage
### Functions
- ***random-int-range*:** Generates pseudo-random integer between a range.
  ```
    (random-int-range 0 10) => 5
  ```
- ***get_random_syllable*:** Get pseudo-random syllable from syllables array.
  ```
    (get_random_syllable) => "va"
  ```
- ***generate_random_word*:** Loops through an empty string appending pseudo-random syllables.
  ```
    (generate_random_word) => "bairus"
  ```
- ***get_capitalized_random_word*:** Generates and capitalizes a pseudo-random word.
  ```
    (get_capitalized_random_word) => "Naiva"
  ```

## License

Copyright © 2018
