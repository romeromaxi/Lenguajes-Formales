; 2. Definir la función segundos que reciba los cuatro valores (días, horas, minutos y segundos) del tiempo que 
; dura un evento y devuelva el valor de ese tiempo expresado solamente en segundos.
(defn segundos [dias horas minutos segundos]
  (cond
    (neg? dias) (println "Error. Los dias no pueden ser negativos")
    (neg? horas) (println "Error. Las horas no pueden ser negativos")
    (neg? minutos) (println "Error. Los minutos no pueden ser negativos")
    (neg? segundos) (println "Error. Los segundos no pueden ser negativos")
    :else (+ (* 86400 dias) (* 3600 horas) (* 60 minutos) segundos)  
  )
)