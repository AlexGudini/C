var unaryOrBinaryComplexFormula = new RegExp('([(][!]([A-Z]|[0-1])[)])|([(]([A-Z]|[0-1])((&)|(\\|)|(->)|(~))([A-Z]|[0-1])[)])','g');
var unaryOrBinaryComplexFormula1 = new RegExp('([(][!]([A-Z]|[0-1])[)])|([(]([A-Z]|[0-1])((&)|(\\|)|(->)|(~))([A-Z]|[0-1])[)])');
var atomOrConstant = new RegExp('([A-Z]|[0-1])', 'g');
var replaceFormula = "R";
var tempFormula;

function verificationFormula(formula) { //проверка является ли строка формулой
    while (formula != tempFormula) {
        tempFormula = formula;
        formula = formula.replace(unaryOrBinaryComplexFormula, replaceFormula);
    }
    tempFormula = 0;
    if ((formula.length == 1)) {
        return true;
    } else {
        return false;
    }
}

function searchSubformuls(formula) {
	debugger;
 result=null; // инициализация переменных
 var oldFormule=""; //
 var leftFormule=""; // 
   result = formula.match(atomOrConstant, 'g'); // получение атомарных символов		
    while (formula !=="R") { // основной цикл получение всех подформул
		var medium=null;
      tempFormula = formula;
		
      result.push(formula.match(unaryOrBinaryComplexFormula)); // поулчение первого совпадения
		var length=result.length-1; // -
		if(Array.isArray(result[length]))  // -
			if(result[length].length>1) // -
				result[length].splice(1,result[length].length-1); // -
		medium=result[length][0].match(new RegExp('([R])','g')) // кол-во символов R
	
		if(medium != null && medium.length == 1) // случай с одним R
		{
			result[length][0]=result[length][0].replace("R",oldFormule);
			oldFormule=result[length][0];
		}
		else if (medium != null && medium.length == 2)  //случай с двумя R
		{
			result[length][0]=result[length][0].replace("R",leftFormule);
	
			result[length][0]=result[length][0].replace("R",oldFormule);
			oldFormule=result[length][0]; 
		}
		else if (medium == null ) // случай с тремя R
		{
			leftFormule=oldFormule;
			oldFormule=result[length][0];
		}
				
      formula = formula.replace(unaryOrBinaryComplexFormula1, replaceFormula);//замена формулы на R
    }
	result = result.join(','); //структуризация массива
    result = result.split(',');
    for (var i = 0; i < result.length; i++) //удаление одинаковых подформул
		for (var j = i+1; j < result.length; j++)
         if (result[i] == result[j]) {result.splice(j, 1);j--;}
	
    return result.length;
}