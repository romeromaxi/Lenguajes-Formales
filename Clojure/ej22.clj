; 22. Definir una función para obtener la diagonal principal de una matriz cuadrada que está representada como una lista de listas.

(defn es-dimension [dim fila]
  (= dim (count fila)))

(defn es-matriz-cuadrada [m]
  (every? (partial es-dimension (count m)) m) ;#(= (count m) (count %))
  )

(defn componente-principal [fila p]
  (nth fila p))

(defn diagonal-principal [m]
  (if 
   (es-matriz-cuadrada m)
    (map componente-principal m (range (count m)))
    (println "Error. La matriz no es cuadrada"))
  )

(defn diagonal-principal-recursivo [m]
  (cond
    (empty? m) m
    (es-matriz-cuadrada m) (cons (ffirst m) (diagonal-principal-recursivo (map rest (rest m))))
    :else (println "Error. Matriz no cuadrada"))
)


(diagonal-principal '((1 2 3) (4 5 6) (7 8 9)))
(diagonal-principal '((1 2 3 4 5) (6 7 8 9 10) (11 12 13 14 15) (16 17 18 19 20) (21 22 23 24 25)))

(diagonal-principal-recursivo '((1 2 3) (4 5 6) (7 8 9)))
(diagonal-principal-recursivo '((1 2 3 4 5) (6 7 8 9 10) (11 12 13 14 15) (16 17 18 19 20) (21 22 23 24 25)))
