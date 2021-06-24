; 39. Definir la función col-par-fil-imp que devuelva la matriz resultante de tomar de una matriz las columnas pares 
; y, de estas, las filas impares. 
; Por ejemplo: (col-par-fil-imp '((1 5 7 9)(2 4 8 4)(3 6 7 8)(6 8 7 3))) → ((5 9)(6 8))

(defn fila-impar [fila pos]
  (if (odd? pos) fila))

(defn obtener-list-ind [m] (map (partial + 1) (range (count m))))

(defn obtener-elem-col-par [fila] (concat (map second (partition 2 fila))))

(defn filtar-vacio [lst]
  (if (empty? lst) false true))

(defn col-par-fil-imp [m]
  (filter filtar-vacio (map obtener-elem-col-par (map fila-impar m (obtener-list-ind m))))
  )

(col-par-fil-imp '((1 5 7 9)(2 4 8 4)(3 6 7 8)(6 8 7 3)))
