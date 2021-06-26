; 27. Definir una función que determine si una palabra tiene o no letras repetidas.
(defn tiene-letras-repetidas 
  ([palabra] (tiene-letras-repetidas (map str palabra) []))
  ([lstCharPalabra lstChar]
   (cond 
     (empty? lstCharPalabra) false
     (some (partial = (first lstCharPalabra)) lstChar) true
     :else (tiene-letras-repetidas (rest lstCharPalabra) (conj lstChar (first lstCharPalabra)))))
  )

(tiene-letras-repetidas "abcdefghijklmnñopqrstuvwxyz")
(tiene-letras-repetidas "adorno")
