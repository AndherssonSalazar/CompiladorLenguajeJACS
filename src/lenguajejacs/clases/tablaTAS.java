package lenguajejacs.clases;

import java.util.LinkedList;

/**
 *
 * @author Andhersson Salazar
 */
public class tablaTAS {
    int num = 60;
    private String M[][]= new String[num][num];
    private String produccion="";
    public tablaTAS(){          // se inicializa la tabla
        for(int i=0; i<num; i++)
           for(int j=0; j<num; j++){
               M[i][j]=" ";
           } 
                // primero se llena de blancos
              M[0][1]="clase";M[0][2]="id"; M[0][3]="principal";
               M[0][4]="constructor"; M[0][5]="funcion";M[0][6]="procedimiento";M[0][7]=",";M[0][8]=";";M[0][9]="{";M[0][10]="}";M[0][11]="(";
               M[0][12]=")";M[0][13]="cadena";M[0][14]="caracter";M[0][15]="real";M[0][16]="booleano";M[0][17]="entero";M[0][18]="constante";
               
               M[0][19]="si";M[0][20]="para"; M[0][21]="mientras";
               M[0][22]="<-"; M[0][23]=".";M[0][24]="[";M[0][25]="]";M[0][26]="+";M[0][27]="-";M[0][28]="*";M[0][29]="/";
               M[0][30]="^";M[0][31]="DCADENA";M[0][32]="DNUMERICO";M[0][33]="DREAL";M[0][34]="DCARACTER";M[0][35]="DBOOLEANO";M[0][36]="¬";
               M[0][37]="sino";M[0][38]="<"; M[0][39]=">";
               M[0][40]="<="; M[0][41]=">=";M[0][42]="=";M[0][43]="!=";M[0][44]="&&";M[0][45]="||";M[0][46]="++";M[0][47]="--";
               M[0][48]="programa";M[0][49]="nuevo";M[0][50]="devolver";M[0][51]=":";M[0][52]="$";M[0][53]="objeto";

               
                M[1][0]="PROGRAMA";M[1][1]="clase NORMALOPRINCIPAL";
               M[2][0]="NORMALOPRINCIPAL";M[2][2]="id { DECLARACIONONO CONSTRUCTOR FUNCIONOPROCEDIMIENTO } PROGRAMA";M[2][3]="principal { DECLARACIONONO FUNCIONOPROCEDIMIENTO programa principal ( ) { ELECCION } }";
               M[3][0]="CONSTRUCTOR";M[3][4]="constructor id ( PARAMETROS ) { CUERPOCONSTRUCTOR }";M[3][5]="&";M[3][6]="&";M[3][10]="&";
               M[4][0]="FUNCIONOPROCEDIMIENTO";M[4][5]="funcion TIPODATO id ( PARAMETROS ) { ELECCION devolver VALOR ; } FUNCIONOPROCEDIMIENTO";M[4][6]="procedimiento id ( PARAMETROS ) { ELECCION } FUNCIONOPROCEDIMIENTO";M[4][10]="&";M[4][48]="&";
               M[5][0]="DECLARACIONONO";M[5][2]="&";M[5][53]="DECLARACION";M[5][4]="&";M[5][5]="&";M[5][6]="&";M[5][13]="DECLARACION";M[5][14]="DECLARACION";M[5][15]="DECLARACION";M[5][16]="DECLARACION";M[5][17]="DECLARACION";M[5][18]="DECLARACION"; M[5][10]="&"; M[5][48]="&";
               M[6][0]="DECLARACION";M[6][13]="VAROCONST TIPODATO id ARREGLOONO ; DECLARACIONONO";M[6][14]="VAROCONST TIPODATO id ARREGLOONO ; DECLARACIONONO";M[6][15]="VAROCONST TIPODATO id ARREGLOONO ; DECLARACIONONO";M[6][16]="VAROCONST TIPODATO id ARREGLOONO ; DECLARACIONONO";M[6][17]="VAROCONST TIPODATO id ARREGLOONO ; DECLARACIONONO";M[6][18]="VAROCONST TIPODATO id ARREGLOONO ; DECLARACIONONO";M[6][53]="objeto ( id ) id ASIGNAROBJETO ; DECLARACIONONO";
               M[7][0]="ELECCION";M[7][2]="ESTRUCTURA ELECCION";M[7][10]="&";M[7][19]="ESTRUCTURA ELECCION";M[7][13]="ESTRUCTURA ELECCION";M[7][14]="ESTRUCTURA ELECCION";M[7][15]="ESTRUCTURA ELECCION";M[7][16]="ESTRUCTURA ELECCION";M[7][17]="ESTRUCTURA ELECCION";M[7][18]="ESTRUCTURA ELECCION";M[7][53]="ESTRUCTURA ELECCION";M[7][20]="ESTRUCTURA ELECCION";M[7][21]="ESTRUCTURA ELECCION";M[7][50]="&";M[7][52]="&";
               M[8][0]="ASIGNAROBJETO";M[8][8]="&";M[8][22]="<- nuevo id ( ARGUMENTOS )";
               M[9][0]="VAROCONST";M[9][13]="&";M[9][14]="&";M[9][15]="&";M[9][16]="&";M[9][17]="&";M[9][18]="constante";
               M[10][0]="TIPODATO";M[10][13]="cadena";M[10][14]="caracter";M[10][15]="real";M[10][16]="booleano";M[10][17]="entero";      
               M[11][0]="ARREGLOONO";M[11][7]="OPCION";M[11][8]="&";M[11][22]="OPCION";M[11][24]="[ DNUMERICO ] ASIGNACIONARREGLO";
               M[12][0]="OPCION";M[12][7]=", id MASIDENTIFICADORES";M[12][8]="&";M[12][22]="<- VALOR OPERAR";
               M[13][0]="OPERAR";M[13][8]="&";M[13][26]="OPERADOR VALOR OPERAR";M[13][27]="OPERADOR VALOR OPERAR";M[13][28]="OPERADOR VALOR OPERAR";M[13][29]="OPERADOR VALOR OPERAR";M[13][30]="OPERADOR VALOR OPERAR";
               M[14][0]="OPERADOR";M[14][26]="+";M[14][27]="-";M[14][28]="*";M[14][29]="/";M[14][30]="^";
               M[15][0]="MASIDENTIFICADORES";M[15][7]=", id MASIDENTIFICADORES";M[15][8]="&";
               M[16][0]="ASIGNACIONARREGLO";M[16][8]="&";M[16][22]="<- { ARGUMENTOS }";
               M[17][0]="VALOR";M[17][2]="id";M[17][31]="DCADENA";M[17][32]="DNUMERICO";M[17][33]="DREAL";M[17][34]="DCARACTER";M[17][35]="DBOOLEANO";
               M[18][0]="PARAMETROS";M[18][12]="&";M[18][13]="TIPODATO id MASDATOSDEPARAMETRO";M[18][14]="TIPODATO id MASDATOSDEPARAMETRO";M[18][15]="TIPODATO id MASDATOSDEPARAMETRO";M[18][16]="TIPODATO id MASDATOSDEPARAMETRO";M[18][17]="TIPODATO id MASDATOSDEPARAMETRO";
               M[19][0]="MASDATOSDEPARAMETRO";M[19][7]=", TIPODATO id MASDATOSDEPARAMETRO";M[19][12]="&";
               M[20][0]="CUERPOCONSTRUCTOR";M[20][2]="id ISARREGLO ; CUERPOCONSTRUCTOR";M[20][10]="&";
               M[21][0]="ISARRREGLO";M[21][22]="<- VALOR OPERAR";M[21][24]="[ DNUMERICO ] <- { ARGUMENTOS }";
               M[22][0]="ESTRUCTURA";M[22][2]="id LLAMADAOACCION ;";M[22][19]="CONDICIONAL";M[22][20]="BUCLEPARA";M[22][21]="BUCLEMIENTRAS";M[22][53]="DECLARACION";
               M[23][0]="CONDICIONAL";M[23][19]="si ( CONDICION ) { ELECCION } ELSE";M[23][15]="-";M[23][16]="*";M[23][17]="/";M[23][18]="^";
               
               M[24][0]="CONDICION";M[24][2]="NEG INITCON";M[24][11]="NEG INITCON";M[24][31]="NEG INITCON";M[24][32]="NEG INITCON";M[24][33]="NEG INITCON";M[24][34]="NEG INITCON";M[24][35]="NEG INITCON";M[24][36]="NEG INITCON";
               M[25][0]="ELSE";M[25][2]="&";M[25][10]="&";M[25][12]="&";M[25][19]="&";M[25][20]="&";M[25][21]="&"; M[25][37]="sino { ELECCION }";M[25][50]="&";             
               M[26][0]="NEG";M[26][2]="&";M[26][11]="&";M[26][31]="&";M[26][32]="&";M[26][33]="&";M[26][34]="&";M[26][35]="&";M[26][36]="¬";
               M[27][0]="INITCON";M[27][2]="VALOR CON";M[27][11]="( NEG VALOR COMPARACION NEG VALOR ) AGREGAR";M[27][31]="VALOR CON";M[27][32]="VALOR CON";M[27][33]="VALOR CON";M[27][34]="VALOR CON";M[27][35]="VALOR CON";
               M[28][0]="CON";M[28][12]="&";M[28][38]="COMPARACION NEG VALOR";M[28][39]="COMPARACION NEG VALOR";M[28][40]="COMPARACION NEG VALOR";M[28][41]="COMPARACION NEG VALOR";M[28][42]="COMPARACION NEG VALOR";M[28][43]="COMPARACION NEG VALOR";M[28][51]="&";
               M[29][0]="COMPARACION";M[29][38]="<";M[29][39]=">";M[29][40]="<=";M[29][41]=">=";M[29][42]="=";M[29][43]="!=";
               M[30][0]="AGREGAR";M[30][12]="&";M[30][44]="SIMBOLOSLOGICOS NEG MASPARENT";M[30][45]="SIMBOLOSLOGICOS NEG MASPARENT";M[30][51]="&";
               M[31][0]="MASPARENT";M[31][14]="VALOR AGREGAR";M[31][11]="( NEG VALOR COMPARACION NEG VALOR ) AGREGAR";M[31][31]="VALOR AGREGAR";M[31][32]="VALOR AGREGAR";M[31][33]="VALOR AGREGAR";M[31][34]="VALOR AGREGAR";M[31][35]="VALOR  AGREGAR";
               M[32][0]="BUCLEPARA";M[32][20]="para ESCOGER id ASIGNARONO : CONDICION : id INCREMENTODECREMENTO { ELECCION }";
               M[33][0]= "ESCOGER";M[33][2]="&";M[33][13]="TIPODATO";M[33][14]="TIPODATO";M[33][15]="TIPODATO";M[33][16]="TIPODATO";M[33][17]="TIPODATO";
               M[34][0]="ASIGNARONO";M[34][22]="<- VALOR";M[34][51]="&";
               M[35][0]="BUCLEMIENTRAS";M[35][21]="mientras ( CONDICION  ) { ELECCION }";
               M[36][0]="SIMBOLOSLOGICOS";M[36][44]="&&";M[36][45]="||";
               M[37][0]="LLAMADAOACCION";M[37][23]="LLAMADAFUNCION";M[37][22]="OPERACIONES";M[37][46]="OPERACIONES";M[37][47]="OPERACIONES";M[37][24]="[ DNUMERICO ] ASIGNACIONARREGLO";
               M[38][0]="LLAMADAFUNCION";M[38][23]=". id ( ARGUMENTOS )";
               M[39][0]="OPERACIONES";M[39][22]="<- VALOR OPERAR";M[39][46]="INCREMENTODECREMENTO";M[39][47]="INCREMENTODECREMENTO";
               M[40][0]="INCREMENTODECREMENTO";M[40][46]="++";M[40][47]="--";
               M[41][0]="ARGUMENTOS";M[41][2]="VALOR MASARGUMENTOS";M[41][10]="&";M[41][12]="&";M[41][31]="VALOR MASARGUMENTOS";M[41][32]="VALOR MASARGUMENTOS";M[41][33]="VALOR MASARGUMENTOS";M[41][34]="VALOR MASARGUMENTOS";M[41][35]="VALOR MASARGUMENTOS";
               M[42][0]= "MASARGUMENTOS";M[42][7]=", VALOR MASARGUMENTOS";M[42][10]="&";M[42][12]="&";
               
        
    }
    public boolean Terminal(String car){
        for(int i=1; i< num; i++)
            if(M[0][i].equals(car)) return true;
        return false; 
    }
    public String RetProduccion(){ return produccion; }
    public LinkedList<String> ExisteInterseccion(String XX,String ae){
        LinkedList<String> produccion=new LinkedList<>();
        int i,x=0,y=0;
        for(i=1; i< num; i++)
            if(M[0][i].equals(ae)) x=i;

        for(i=1; i< num; i++)
            if(M[i][0].equals(XX)) y=i;
        if(x ==0 || y == 0 )  return produccion;
        else  if( M[y][x].equals(" "))  return produccion;
        else{ 
           String[] temp= M[y][x].toString().split(" ");
               for(String a: temp){
                   produccion.add(a);
               }
               return produccion;
        }
    }

}