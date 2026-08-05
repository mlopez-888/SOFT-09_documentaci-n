function main() {
    console.log("¡Hola, mundo desde JavaScript!");
    saludar("MaryPaz");
    sumar(5, 3);
}

function saludar(nombre) {
    console.log("Hola, " + nombre + ". ¡Bienvenida al ejercicio de Git y GitHub!");
}

function sumar(a, b) {
    const resultado = a + b;
    console.log("La suma de " + a + " + " + b + " es: " + resultado);
}

main();
