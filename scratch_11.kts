import javax.swing.JOptionPane

var mayor= 0
var texto = JOptionPane.showInputDialog("Ingresa la lista de numeros correspondiente")
var listaDeNumerosTexto= texto.split(",".toRegex()).toTypedArray()
var cantidad= listaDeNumerosTexto.size


var listaDeNumeros= IntArray(cantidad)
for(i in(0 until cantidad)){
    listaDeNumeros[i]= listaDeNumerosTexto[i].toInt()
}
var temp = 0
var cont = 0
var bandera = true
for(i in (0 until cantidad-1)){
    if (bandera==false){
        break
    }
    bandera = false
    for (j in (0 until cantidad-1)){
        if (listaDeNumeros[j]>listaDeNumeros[j+1]){
            bandera = true
            temp = listaDeNumeros[j]
            listaDeNumeros[j] = listaDeNumeros[j+1]
            listaDeNumeros[j+1] = temp
        }
    }
    cont++
}

println(cont)
println("Aqui esta la lista ordenada")
for (i in (0 until cantidad)){
    println(listaDeNumeros[i])
}


println("Aqui esta la lista ordenada")
for (i in (cantidad-1 downTo  0)){
    println(listaDeNumeros[i])
}
