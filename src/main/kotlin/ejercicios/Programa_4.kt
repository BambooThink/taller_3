package ejercicios

fun main() {
    print("Ingrese el numero de empleados: ")
    val cantidadEmpleados = readLine()!!.toInt()
    repeat(cantidadEmpleados) {

    }
}

fun estimarPagoPorHora(horas: Double): Double {
    return if (horas <= 35) {
        15000 * horas
    } else if (horas > 35 && horas < 60) {
        (35 * 15000) + ((horas - 35) * 18000)
    } else {
        (35 * 15000) + (25 * 18000) + ((horas - 60) * 25000)
    }
}