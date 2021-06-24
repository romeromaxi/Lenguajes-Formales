; 5. Definir la función capicua? que reciba un número entero no negativo de hasta 5 dígitos 
; y devuelva true si el número es capicúa; si no, false.
(defn capicua? [x] 
   (cond 
    (neg? x) (println "Error. El numero no puede ser negativo") 
    (> (count (str x)) 5) (println "Error. El numero no puede superar los 5 digitos")
    :else (= (reverse (str x)) (map char (str x)))
     )
)
