; 45. Definir una función que reciba una lista de pares ordenados, en los cuales la primera componente indica el 
; equipo que resultó ganador de un partido y la segunda indica el perdedor (no hay empates), 
; y que devuelva una lista con los equipos invictos.

(defn eliminar-repetidos 
  ([lst] (eliminar-repetidos lst []))
  ([lst finalLst] 
   (cond
     (empty? lst) finalLst
     (some (partial = (first lst)) finalLst) (eliminar-repetidos (rest lst) finalLst)
     :else (eliminar-repetidos (rest lst) (conj finalLst (first lst))))
   )
)

(defn obtener-ganadores [m] (eliminar-repetidos (map first m)))

(defn obtener-perdedores [m] (eliminar-repetidos (map second m)))

(defn es-equipo-inv [lstPerdedores equipo]
  (not-any? #(= % equipo) lstPerdedores))

(defn equipos-invictos [m]
  (filter (partial es-equipo-inv (obtener-perdedores m)) (obtener-ganadores m))
  )

(equipos-invictos '(("RIV" "BOC") ("IND" "RAC") ("BOC" "RAC") ("RIV" "RAC") ("IND" "BOC")))
(equipos-invictos '(("RIV" "BOC") ("IND" "RAC") ("BOC" "RAC") ("RIV" "RAC") ("IND" "BOC") ("RIV" "IND")))