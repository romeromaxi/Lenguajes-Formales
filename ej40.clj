; 40. Definir la función dif-sumas que devuelva la sumatoria de los números de las filas impares menos la sumatoria
; de los números de las filas pares de una matriz representada mediante listas.
; Por ejemplo: (dif-sumas '((1 5 7)(2 4 8)(3 6 7))) → (1+5+7+3+6+7)-(2+4+8) → 15

(defn fila-impar [fila pos]
  (if (odd? pos) fila))

(defn fila-par [fila pos]
  (if (even? pos) fila))

(defn obtener-list-ind [m] (map (partial + 1) (range (count m))))

(defn filtar-vacio [lst]
  (if (empty? lst) false true))

(defn col-par-fil-imp [m]
  (filter filtar-vacio (map obtener-elem-col-par ))
  )

(defn obtener-filas-pares [m] (filter filtar-vacio (map fila-par m (obtener-list-ind m))))

(defn obtener-filas-impares [m] (filter filtar-vacio (map fila-impar m (obtener-list-ind m))))

(defn obtener-suma-total-matriz [m] (apply + (flatten m)))

(defn dif-sumas [m]
  (- (obtener-suma-total-matriz (obtener-filas-impares m)) (obtener-suma-total-matriz (obtener-filas-pares m)))
)

(dif-sumas '((1 5 7)(2 4 8)(3 6 7)))
(dif-sumas '((1 3 5 7)(2 4 6 8)(5 5 5 5)))

