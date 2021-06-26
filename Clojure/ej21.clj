; 21. Definir una función para obtener la matriz triangular superior (incluyendo la diagonal principal) de una matriz cuadrada
; que está representada como una lista de listas.

(defn es-dimension [dim fila]
  (= dim (count fila)))

(defn es-matriz-cuadrada [m]
  (every? (partial es-dimension (count m)) m) ;#(= (count m) (count %))
  )

(defn fila-triangular-superior [fila p]
  (concat (repeat p 0) (nthrest fila p)))

(defn matriz-triangular-superior [m]
  (if 
   (es-matriz-cuadrada m)
    (map fila-triangular-superior m (range (count m)))
    (println "Error. La matriz no es cuadrada"))
  )

(defn matriz-triangular-superior-recursivo
    ([m]
     (if
      (es-matriz-cuadrada m)
       (matriz-triangular-superior-recursivo m 0)
       (println "Error. Matriz no cuadrada")))
    ([m i]
     (if
      (empty? m) m
      (cons (concat (repeat i 0) (first m)) (matriz-triangular-superior-recursivo (map rest (rest m)) (inc i))))
     )
  )

(matriz-triangular-superior '((1 2 3) (4 5 6) (7 8 9)))
(matriz-triangular-superior '((1 2 3 4 5) (6 7 8 9 10) (11 12 13 14 15) (16 17 18 19 20) (21 22 23 24 25)))

(matriz-triangular-superior-recursivo '((1 2 3) (4 5 6) (7 8 9)))
(matriz-triangular-superior-recursivo '((1 2 3 4 5) (6 7 8 9 10) (11 12 13 14 15) (16 17 18 19 20) (21 22 23 24 25)))

