# Diferencias entre switch case nuevo y switch case viejo en Java (Desde Java 14)
A partir de Java 14, el switch fue mejorado con una nueva sintaxis más concisa y expresiva. Estas son las principales diferencias entre el switch viejo y el nuevo:

## Switch Case Nuevo (Java 14+)
Se puede usar como expresión (switch expression), permitiendo asignar valores directamente.
No requiere break, ya que no hay ejecución en cascada.
Permite agrupar múltiples casos de manera más limpia (case 1, 2 ->).
Puede devolver valores con yield en bloques más largos.

## Switch Case Viejo (Antes de Java 14)
Solo funciona como una declaración (switch statement), no puede devolver valores directamente.
Requiere break en cada case, o de lo contrario sigue ejecutando los siguientes casos (fall-through).
No permite agrupar múltiples valores en una sola línea de manera sencilla.
