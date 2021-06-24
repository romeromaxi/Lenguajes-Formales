; 29. Definir una función que devuelva el tipo de triángulo que constituyen tres números que representan longitudes.
(defn tipo-triangulo [lado1 lado2 lado3]
  (cond
    (= lado1 lado2 lado3) (println "Triangulo Equilatero")
    (or (= lado1 lado2) (= lado1 lado3) (= lado3 lado2)) (println "Triangulo Isosceles")
    :else (println "Triangulo Escaleno")))

(tipo-triangulo 12 13 13)
(tipo-triangulo 13 13 13)
(tipo-triangulo 12 13 14)
(tipo-triangulo 120 120 14)
(tipo-triangulo 1 7 1)