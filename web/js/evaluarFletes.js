function cotizarFlete(){
    let x1 = parseFloat(document.getElementById("txtx1").value);
    let y1 = parseFloat(document.getElementById("txty1").value);
    let x2 = parseFloat(document.getElementById("txtx2").value);
    let y2 = parseFloat(document.getElementById("txty2").value);
    
    let datos = {
        x1 : x1,
        y1 : y1,
        x2 : x2,
        y2 : y2
    };
    let parametros = new URLSearchParams(datos);
    let url="api/fle/resolver?" + parametros;
    
    fetch(url)
            .then(response => {return response.json();}) 
            .then(data =>{
                alert(JSON.stringify(data));
            
            let contenido='';
            let contenido2='';
            let contenido3='';
            
            contenido = 'Distancia = ' +data.distancia+ ' unidades';
            contenido2 = 'Costo = ' +data.costoTotal;
            contenido3 = 'El flete es ' +data.tipoFlete;
            
            console.log(contenido3);
            
            document.getElementById('spnDistancia').innerHTML = contenido; 
            document.getElementById('spnCostoTotal').innerHTML = contenido2; 
            document.getElementById('spnTipoFlete').innerHTML = contenido3; 
    });
}