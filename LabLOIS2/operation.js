function clickCheckFormula() {
    var test = document.getElementById("inputFormula").value;
    var outputCheckTypeFormula = document.getElementById("outputCheckTypeFormula");
	var subFormula = document.getElementById("subFormula");
	var correctFormula= document.getElementById("correctFormula");
    if (verificationFormula(test)) {
		correctFormula.innerHTML = "Данное выражение является формулой";
        document.getElementById("hiddenForm").hidden = false;		
        var object = getTableTruth(test);
		if (getCount() == getN()) {
		   outputCheckTypeFormula.innerHTML = "Данная формула является противоречивой"; 
        } else {
            outputCheckTypeFormula.innerHTML = "Данная формула не является противоречивой";
        }
        var tbody = document.getElementById('tbody');
        tbody.innerHTML = null;
        tbody.innerHTML = objectToTable(object.table, object.sizeSymbolInFormula);

    } else {
		correctFormula.innerHTML = "Данное выражение не является формулой";
        document.getElementById("hiddenForm").hidden = true;
    }
}




