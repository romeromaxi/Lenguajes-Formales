; 1. Definir la función tercer-angulo que reciba los valores de dos de los ángulos interiores de un triángulo y
; devuelva el valor del restante.
(defn tercer-angulo [a, b]
  (cond
    (or (neg? a) (neg? b)) (println "Error. Los angulos no pueden ser negativos")
    (> (+ a b) 180) (println "Error. Los angulos no pueden superar los 180 grados")
    :else (- 180 (+ a b)))
)

(tercer-angulo 65 60)