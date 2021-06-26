; 35. Definir las funciones filas-max-V y mas-V-o-F que, aplicadas a una matriz de V y F (una lista de listas con los valores V y F),
; devuelvan, respectivamente:
;  b) V si en la mayoría de las filas hay más V que F o, de lo contrario, F, 
;     por ejemplo: (mas-V-o-F '((V F V V F)(F F F V F)(V V F F V))) → V

(defn comparar-V-F [mapFila]
  (if 
   (> ('V mapFila) ('F mapFila))
    'V
    'F))

(defn mas-V-o-F [m]
  (comparar-V-F (frequencies (map comparar-V-F (map frequencies m))))
  )

; En casos de empate devuelvo F
(mas-V-o-F '((V F V V F)(F F F V F)(V V F F V)))
(mas-V-o-F '((V F V V F)(F F F V F)(V F F F V)))
(mas-V-o-F '((V F V V F)(F F F V F)(V F F F V)(V V F F V)))
