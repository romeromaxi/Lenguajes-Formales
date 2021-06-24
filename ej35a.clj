; 35. Definir las funciones filas-max-V y mas-V-o-F que, aplicadas a una matriz de V y F (una lista de listas con los valores V y F),
; devuelvan, respectivamente:
;  a) El/los número/s de la/s fila/s en la/s que la cantidad de V es máxima, 
;     por ejemplo: (filas-max-V '((V F V V F)(V V F V V)(F F F V F)(V V V F V))) → (2 4)

(defn cant-V [mapFila]
  (if 
   (contains? mapFila 'V)
    ('V mapFila)
    '0))

(defn cant-max-V [m]
  (reduce max (map cant-V (map frequencies m))))

(defn buscar-ind [fila valor index]
  (if
   (= (#('V %) (frequencies fila)) valor)
   (+ index '1)
   '0   
    ))

(defn filas-max-V [m]
  (filter pos? (map buscar-ind m (repeat (count m) (cant-max-V m)) (range (count m))))
  )

(filas-max-V '((V F V V F)(V V F V V)(V V V V V)(F F F V F)(V V V F V)))

