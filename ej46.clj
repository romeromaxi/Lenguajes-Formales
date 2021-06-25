;46. Definir una función que reciba una lista de pares ordenados, en los cuales la primera componente indica el equipo que
; resultó ganador de un partido y la segunda indica el perdedor (no hay empates), y devuelva una lista con los equipos 
; que solo perdieron.

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

(defn no-gano [lstGanadores equipo]
  (not-any? #(= % equipo) lstGanadores))

(defn equipos-solo-perdieron [m]
  (filter (partial no-gano (obtener-ganadores m)) (obtener-perdedores m))
  )

(equipos-solo-perdieron '(("RIV" "BOC") ("IND" "RAC") ("BOC" "RAC") ("RIV" "RAC") ("IND" "BOC")))
(equipos-solo-perdieron '(("RIV" "BOC") ("IND" "RAC") ("OLI" "RAC") ("RIV" "RAC") ("IND" "BOC")))