package compiladorlenguajejacs.clases;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.StringTokenizer;
public class LexicoSemantico {
	

	    private LinkedList<String> codigoAnalizado;
	    private LinkedList<Objeto> semantico;
	    private HashMap <String, Integer> errores;
	    
	    private HashMap <String,Integer[]> palabrasReservadas;
	    private HashMap <String,Integer[]> operadoresAritmeticos;
	    private HashMap <String,Integer[]> operadoresRelacionales;
	    private HashMap <String,Integer[]> operadoresLogicos;
	    private HashMap <String,Integer[]> delimitadores;
	    
	    private LinkedList <String> comentarios;
	    private HashMap <String, Integer> cadenas;
	    private HashMap <String, Integer> caracteres;
	    private HashMap <String, Integer> identificador;
	    private HashMap <String, Integer> numerosEnteros;
	    private HashMap <String, Integer> numerosReales;
	    
	    public void Analizar(String codigoAAnalizar){
	        codigoAnalizado=new LinkedList<>();
	        semantico=new LinkedList<>();
	        errores=new HashMap<>();
	        
	        palabrasReservadas = new HashMap<>();
	        operadoresAritmeticos = new HashMap<>();
	        operadoresRelacionales = new HashMap<>();
	        operadoresLogicos = new HashMap<>();
	        delimitadores = new HashMap<>();
	        
	        comentarios = new LinkedList<>();
	        cadenas = new HashMap<>();
	        caracteres = new HashMap<>();
	        identificador=new HashMap<>();
	        numerosEnteros=new HashMap<>();
	        numerosReales=new HashMap<>();
	        
	        
	        RellenarSimbolosPalabrasReservadas(palabrasReservadas);
	        RellenarSimbolosOperadoresAritmeticos(operadoresAritmeticos);
	        RellenarSimbolosOperadoresRelacionales(operadoresRelacionales);
	        RellenarSimbolosOperadoresLogicos(operadoresLogicos);
	        RellenarSimbolosDelimitadores(delimitadores);
	        
	        StringTokenizer codigoALeer = new StringTokenizer(codigoAAnalizar,"{}().;,!=+[]-*'/><|&¬# \"\n\t",true);
	        String token="";
	        int numeroToken=0;
	        int restaDobles=0;
	        while(codigoALeer.hasMoreTokens()){
	            token=codigoALeer.nextToken();
	            numeroToken++;
	            if(!" ".equals(token) && !"\n".equals(token) && !"\t".equals(token)){
	                if(palabrasReservadas.containsKey(token)){
	                    palabrasReservadas.put(token, new Integer[]{(palabrasReservadas.get(token))[0]+1,(palabrasReservadas.get(token))[1]});
	                    if(token.equals("verdadero")){
	                        codigoAnalizado.add("DBOOLEANO");
	                        semantico.add(new Objeto(null,"booleano","valor","verdadero"));
	                    }else if(token.equals("falso")){
	                        codigoAnalizado.add("DBOOLEANO");
	                        semantico.add(new Objeto(null,"booleano","valor","falso"));
	                    }else{
	                        codigoAnalizado.add(token);
	                        semantico.add(new Objeto(token,null,"reservada",null));
	                    }
	                }else{
	                    if(operadoresAritmeticos.containsKey(token)){
	                        //operadoresAritmeticos.put(token, new Integer[]{(operadoresAritmeticos.get(token))[0]+1,(operadoresAritmeticos.get(token))[1]});
	                        StringTokenizer codigoBusqueda=new StringTokenizer(codigoAAnalizar,"{}[]().;,!=+-*¬'/><|&# \"\n\t",true);
	                        int numeroTokenRecorredor=0-restaDobles;
	                        String tokenReemplazo="";
	                        switch(token){/*
                                    jonny es una perra
                                    */
	                            case "+" :  
	                                while(codigoBusqueda.hasMoreTokens() && numeroTokenRecorredor<=numeroToken){
	                                    tokenReemplazo=codigoBusqueda.nextToken();
	                                    numeroTokenRecorredor++;
	                                }
	                                if(tokenReemplazo.equals("+")){
	                                    restaDobles++;
	                                    tokenReemplazo=codigoALeer.nextToken();
	                                    operadoresAritmeticos.put(token+tokenReemplazo,new Integer[]{(operadoresAritmeticos.get(token+tokenReemplazo))[0]+1,(operadoresAritmeticos.get(token+tokenReemplazo))[1]});
	                                    codigoAnalizado.add(token+tokenReemplazo);
	                                    semantico.add(new Objeto(token+tokenReemplazo,null,"operador","1"));
	                                }else {
	                                    operadoresAritmeticos.put(token, new Integer[]{(operadoresAritmeticos.get(token))[0]+1,(operadoresAritmeticos.get(token))[1]});
	                                    codigoAnalizado.add(token);  
	                                    semantico.add(new Objeto(token,null,"operador",null));
	                                }
	                                break;
	                            case "-" :  
	                                while(codigoBusqueda.hasMoreTokens() && numeroTokenRecorredor<=numeroToken){
	                                    tokenReemplazo=codigoBusqueda.nextToken();
	                                    numeroTokenRecorredor++;
	                                }
	                                if(tokenReemplazo.equals("-")){
	                                    restaDobles++;
	                                    tokenReemplazo=codigoALeer.nextToken();
	                                    operadoresAritmeticos.put(token+tokenReemplazo,new Integer[]{(operadoresAritmeticos.get(token+tokenReemplazo))[0]+1,(operadoresAritmeticos.get(token+tokenReemplazo))[1]});
	                                    codigoAnalizado.add(token+tokenReemplazo);
	                                    semantico.add(new Objeto(token,null,"operador","-1"));
	                                }else {
	                                    operadoresAritmeticos.put(token, new Integer[]{(operadoresAritmeticos.get(token))[0]+1,(operadoresAritmeticos.get(token))[1]});
	                                    codigoAnalizado.add(token);  
	                                    semantico.add(new Objeto(token,null,"operador",null));
	                                }
	                                break;
	                            default : 
	                                operadoresAritmeticos.put(token, new Integer[]{(operadoresAritmeticos.get(token))[0]+1,(operadoresAritmeticos.get(token))[1]});
	                                codigoAnalizado.add(token);
	                                semantico.add(new Objeto(token,null,"operador",null));
	                                break;
	                        }
	                            
	                        //codigoAnalizado.add(token);
	                    }else{
	                        if(operadoresRelacionales.containsKey(token)){
	                            StringTokenizer codigoBusqueda=new StringTokenizer(codigoAAnalizar,"{}()[].;,!=+-*'/¬><|&# \"\n\t",true);
	                            int numeroTokenRecorredor=0-restaDobles;
	                            String tokenReemplazo="";
	                            switch(token){
	                                case "<":
	                                    while(codigoBusqueda.hasMoreTokens() && numeroTokenRecorredor<=numeroToken){
	                                        tokenReemplazo=codigoBusqueda.nextToken();
	                                        numeroTokenRecorredor++;
	                                    }
	                                    switch(tokenReemplazo){
	                                        case "=":
	                                            restaDobles++;
	                                            tokenReemplazo=codigoALeer.nextToken();
	                                            operadoresRelacionales.put(token+tokenReemplazo,new Integer[]{(operadoresRelacionales.get(token+tokenReemplazo))[0]+1,(operadoresRelacionales.get(token+tokenReemplazo))[1]});
	                                            codigoAnalizado.add(token+tokenReemplazo);
	                                            semantico.add(new Objeto(null,null,"igualdad",null));
	                                            break;
	                                        case "-":
	                                            restaDobles++;
	                                            tokenReemplazo=codigoALeer.nextToken();
	                                            delimitadores.put(token+tokenReemplazo, new Integer[]{(delimitadores.get(token+tokenReemplazo))[0]+1,(delimitadores.get(token+tokenReemplazo))[1]});
	                                            codigoAnalizado.add(token+tokenReemplazo);
	                                            semantico.add(new Objeto(null,null,"asignacion",null));
	                                            break;
	                                        default:
	                                            operadoresRelacionales.put(token,new Integer[]{(operadoresRelacionales.get(token))[0]+1,(operadoresRelacionales.get(token))[1]});
	                                            codigoAnalizado.add(token);
	                                            semantico.add(new Objeto(token,null,"relacionales",null));
	                                            break;
	                                    }
	                                    break;
	                                case ">":
	                                    while(codigoBusqueda.hasMoreTokens() && numeroTokenRecorredor<=numeroToken){
	                                        tokenReemplazo=codigoBusqueda.nextToken();
	                                        numeroTokenRecorredor++;
	                                    }
	                                    switch(tokenReemplazo){
	                                        case "=":
	                                            restaDobles++;
	                                            tokenReemplazo=codigoALeer.nextToken();
	                                            operadoresRelacionales.put(token+tokenReemplazo,new Integer[]{(operadoresRelacionales.get(token+tokenReemplazo))[0]+1,(operadoresRelacionales.get(token+tokenReemplazo))[1]});
	                                            codigoAnalizado.add(token+tokenReemplazo);
	                                            semantico.add(new Objeto(token+ tokenReemplazo,null,"relacionales",null));
	                                            break;
	                                        default:
	                                            operadoresRelacionales.put(token,new Integer[]{(operadoresRelacionales.get(token))[0]+1,(operadoresRelacionales.get(token))[1]});
	                                            codigoAnalizado.add(token);
	                                            semantico.add(new Objeto(token,null,"relacionales",null));
	                                            break;
	                                    }
	                                    break;
	                                default:
	                                    operadoresRelacionales.put(token,new Integer[]{(operadoresRelacionales.get(token))[0]+1,(operadoresRelacionales.get(token))[1]});
	                                    codigoAnalizado.add(token);
	                                    semantico.add(new Objeto(token,null,"relacionales",null));
	                                    break;
	                            }
	                        }else{
	                            if("!".equals(token)){
	                                StringTokenizer codigoBusqueda=new StringTokenizer(codigoAAnalizar,"{}()[].;,!=+¬-*'/><|&# \"\n\t",true);
	                                int numeroTokenRecorredor=0-restaDobles;
	                                String tokenReemplazo="";
	                                while(codigoBusqueda.hasMoreTokens() && numeroTokenRecorredor<=numeroToken){
	                                    tokenReemplazo=codigoBusqueda.nextToken();
	                                    numeroTokenRecorredor++;
	                                }
	                                if(tokenReemplazo.equals("=")){
	                                    restaDobles++;
	                                    tokenReemplazo=codigoALeer.nextToken();
	                                    operadoresRelacionales.put(token+tokenReemplazo,new Integer[]{(operadoresRelacionales.get(token+tokenReemplazo))[0]+1,(operadoresRelacionales.get(token+tokenReemplazo))[1]});
	                                    codigoAnalizado.add(token+tokenReemplazo);
	                                    semantico.add(new Objeto(null,null,"desigualdad",null));
	                                    
	                                }else{
	                                    errores.put(token, (errores.get(token)==null)?1:errores.get(token)+1);
	                                }
	                            }else if("&".equals(token)){
	                                StringTokenizer codigoBusqueda=new StringTokenizer(codigoAAnalizar,"{}().;[],!=+-*¬'/><|&# \"\n\t",true);
	                                int numeroTokenRecorredor=0-restaDobles;
	                                String tokenReemplazo="";
	                                while(codigoBusqueda.hasMoreTokens() && numeroTokenRecorredor<=numeroToken){
	                                    tokenReemplazo=codigoBusqueda.nextToken();
	                                    numeroTokenRecorredor++;
	                                }
	                                if(tokenReemplazo.equals("&")){
	                                    restaDobles++;
	                                    tokenReemplazo=codigoALeer.nextToken();
	                                    operadoresLogicos.put(token+tokenReemplazo,new Integer[]{(operadoresLogicos.get(token+tokenReemplazo))[0]+1,(operadoresLogicos.get(token+tokenReemplazo))[1]});
	                                    codigoAnalizado.add(token+tokenReemplazo);
	                                    semantico.add(new Objeto(token,null,"logicos",null));
	                                }else{
	                                    errores.put(token, (errores.get(token)==null)?1:errores.get(token)+1);
	                                }
	                            }else if("|".equals(token)){
	                                StringTokenizer codigoBusqueda=new StringTokenizer(codigoAAnalizar,"{}().;[],!=+-*'/¬><|&# \"\n\t",true);
	                                int numeroTokenRecorredor=0-restaDobles;
	                                String tokenReemplazo="";
	                                while(codigoBusqueda.hasMoreTokens() && numeroTokenRecorredor<=numeroToken){
	                                    tokenReemplazo=codigoBusqueda.nextToken();
	                                    numeroTokenRecorredor++;
	                                }
	                                if(tokenReemplazo.equals("|")){
	                                    restaDobles++;
	                                    tokenReemplazo=codigoALeer.nextToken();
	                                    operadoresLogicos.put(token+tokenReemplazo,new Integer[]{(operadoresLogicos.get(token+tokenReemplazo))[0]+1,(operadoresLogicos.get(token+tokenReemplazo))[1]});
	                                    codigoAnalizado.add(token+tokenReemplazo);
	                                    semantico.add(new Objeto(token,null,"logicos",null));
	                                }else{
	                                    errores.put(token, (errores.get(token)==null)?1:errores.get(token)+1);
	                                }
	                            }else if(operadoresLogicos.containsKey(token)){
	                                operadoresLogicos.put(token,new Integer[]{(operadoresLogicos.get(token))[0]+1,(operadoresLogicos.get(token))[1]});
	                                codigoAnalizado.add(token);
	                                semantico.add(new Objeto(token,null,"logicos",null));
	                            }else{
	                                if(delimitadores.containsKey(token)){
	                                    delimitadores.put(token, new Integer[]{(delimitadores.get(token))[0]+1,(delimitadores.get(token))[1]});
	                                    if("#".equals(token)){
	                                        String comentario="";
	                                        String tokenAEvaluar="";
	                                        while(codigoALeer.hasMoreTokens()&& !tokenAEvaluar.equals("#")){
	                                            tokenAEvaluar=codigoALeer.nextToken();
	                                            comentario+=tokenAEvaluar;
	                                            restaDobles++;
	                                        }
	                                        if(tokenAEvaluar.equals("#")){
	                                            comentarios.add(comentario);
	                                            delimitadores.put(token, new Integer[]{(delimitadores.get(token))[0]+1,(delimitadores.get(token))[1]});
	                                        }else{
	                                            errores.put(token, (errores.get(token)==null)?1:errores.get(token)+1);
	                                        }
	                                    }else if("\"".equals(token)){
	                                        String cadena="";
	                                        String tokenAEvaluar="";
	                                        while(codigoALeer.hasMoreTokens()&& !tokenAEvaluar.equals("\"")){
	                                            tokenAEvaluar=codigoALeer.nextToken();
	                                            if(!tokenAEvaluar.equals("\"")) {
	                                            	cadena+=tokenAEvaluar;
	                                            }
	                                            restaDobles++;
	                                        }
	                                        if(tokenAEvaluar.equals("\"")){
	                                        	cadenas.put(cadena, (cadenas.get(token)==null)?1:cadenas.get(token)+1);
	                                            codigoAnalizado.add("DCADENA");
	                                            semantico.add(new Objeto(null,"cadena","valor",token));
	                                            delimitadores.put(token, new Integer[]{(delimitadores.get(token))[0]+1,(delimitadores.get(token))[1]});
	                                        }else{
	                                            errores.put(token, (errores.get(token)==null)?1:errores.get(token)+1);
	                                        }
	                                    }else if("'".equals(token)){
	                                        String caracter="";
	                                        String tokenAEvaluar="";
	                                        if(codigoALeer.hasMoreTokens()){
	                                            caracter=codigoALeer.nextToken();
	                                            if(codigoALeer.hasMoreTokens()){
	                                                if(codigoALeer.nextToken().equals("'")){
	                                                	caracteres.put(caracter, (caracteres.get(token)==null)?1:caracteres.get(token)+1);
	                                                    //caracteres.add(caracter);
	                                                    codigoAnalizado.add("DCARACTER");
	                                                    semantico.add(new Objeto(null,"caracter","valor",token));
	                                                    delimitadores.put(token, new Integer[]{(delimitadores.get(token))[0]+1,(delimitadores.get(token))[1]});
	                                                }else{
	                                                    errores.put(token, (errores.get(token)==null)?1:errores.get(token)+1);
	                                                }
	                                            }else{
	                                                errores.put(token, (errores.get(token)==null)?1:errores.get(token)+1);
	                                            }
	                                        }else{
	                                            errores.put(token, (errores.get(token)==null)?1:errores.get(token)+1);
	                                        }
	                                    }else{
	                                        codigoAnalizado.add(token);
	                                        semantico.add(new Objeto(token,null,"strange",null));
	                                        
	                                    }
	                                    /*else{
	                                        errores.put(token, (errores.get(token)==null)?1:errores.get(token)+1);
	                                    }*/
	                                }else{
	                                    if(token.matches("([A-Z a-z]|[_])+([0-9]|[A-Z a-z]|[_])*")){
	                                        identificador.put(token, (identificador.get(token)==null)?1:identificador.get(token)+1);
	                                        codigoAnalizado.add("id");
	                                        semantico.add(new Objeto(token,null,"identificador",null));
	                                    }else{
	                                        if(token.matches("[0-9]+")){
	                                            numerosEnteros.put(token, (numerosEnteros.get(token)==null)?1:numerosEnteros.get(token)+1);
	                                            codigoAnalizado.add("DNUMERICO");
	                                            semantico.add(new Objeto(null,"entero","valor",token));
	                                        }else{
	                                            if(token.matches("[0-9]*.[0-9]+")){
	                                                numerosReales.put(token, (numerosReales.get(token)==null)?1:numerosReales.get(token)+1);
	                                                codigoAnalizado.add("DREAL");
	                                                semantico.add(new Objeto(null,"real","valor",token));
	                                            }else{
	                                                errores.put(token, (errores.get(token)==null)?1:errores.get(token)+1);
	                                            }
	                                        }
	                                    }
	                                }
	                            }
	                        }
	                    }
	                }
	            }
	        }
	    }
	    public boolean TieneErrores(){
	        return !errores.isEmpty();
	    }
	    public LinkedList<String> ObtenerCodigoAnalizado(){
	        return codigoAnalizado;
	    }
	    public LinkedList<Objeto> ObtenerCodigoSemantico(){
	        return semantico;
	    }
	    public HashMap<String, Integer> ObtenerErrores(){
	        return errores;
	    }

	    public HashMap<String, Integer[]> getPalabrasReservadas() {
	        return palabrasReservadas;
	    }

	    public HashMap<String, Integer[]> getOperadoresAritmeticos() {
	        return operadoresAritmeticos;
	    }

	    public HashMap<String, Integer[]> getOperadoresRelacionales() {
	        return operadoresRelacionales;
	    }

	    public HashMap<String, Integer[]> getOperadoresLogicos() {
	        return operadoresLogicos;
	    }

	    public HashMap<String, Integer[]> getDelimitadores() {
	        return delimitadores;
	    }

	    public LinkedList<String> getComentarios() {
	        return comentarios;
	    }

	    public HashMap<String, Integer> getCadenas() {
	        return cadenas;
	    }

	    public HashMap<String, Integer> getCaracteres() {
	        return caracteres;
	    }

	    public HashMap<String, Integer> getIdentificador() {
	        return identificador;
	    }

	    public HashMap<String, Integer> getNumerosEnteros() {
	        return numerosEnteros;
	    }

	    public HashMap<String, Integer> getNumerosReales() {
	        return numerosReales;
	    }
	    
	    
	    
	    private void RellenarSimbolosOperadoresAritmeticos(HashMap<String, Integer[]> operadores){
	        operadores.put("+", new Integer[]{0,200});
	        operadores.put("-", new Integer[]{0,201});
	        operadores.put("*", new Integer[]{0,202});
	        operadores.put("/", new Integer[]{0,203});
	        operadores.put("%", new Integer[]{0,204});
	        operadores.put("^", new Integer[]{0,205});
	        operadores.put("++", new Integer[]{0,206});
	        operadores.put("--", new Integer[]{0,207});
	    }
	    private void RellenarSimbolosOperadoresRelacionales(HashMap<String, Integer[]> operadores){
	        operadores.put("=",  new Integer[]{0,206});
	        operadores.put("!=", new Integer[]{0,207});
	        operadores.put(">",  new Integer[]{0,208});
	        operadores.put("<",  new Integer[]{0,209});
	        operadores.put(">=", new Integer[]{0,210});
	        operadores.put("<=", new Integer[]{0,211});
	    }
	    private void RellenarSimbolosOperadoresLogicos(HashMap<String, Integer[]> operadores){
	        operadores.put("&&", new Integer[]{0,212});
	        operadores.put("||", new Integer[]{0,213});
	        operadores.put("¬", new Integer[]{0,214});
	    }
	    private void RellenarSimbolosDelimitadores(HashMap<String, Integer[]> delimitadores){
	        delimitadores.put("(", new Integer[]{0,215});
	        delimitadores.put(")", new Integer[]{0,216});
	        delimitadores.put("{", new Integer[]{0,217});
	        delimitadores.put("}", new Integer[]{0,218});
	        delimitadores.put("<-", new Integer[]{0,219});
	        delimitadores.put(",", new Integer[]{0,220});
	        delimitadores.put("\n", new Integer[]{0,221});
	        delimitadores.put(";", new Integer[]{0,221});
	        delimitadores.put(".", new Integer[]{0,221});
	        delimitadores.put(":", new Integer[]{0,222});
	        delimitadores.put("#", new Integer[]{0,223});
	        delimitadores.put("\"",new Integer[]{0,224});
	        delimitadores.put("'",new Integer[]{0,225});
	        delimitadores.put("[",new Integer[]{0,226});
	        delimitadores.put("]",new Integer[]{0,227});
	    }
	    private void RellenarSimbolosPalabrasReservadas(HashMap<String, Integer[]> palabrasReservadas){
	        palabrasReservadas.put("entero", new Integer[]{0,400});
	        palabrasReservadas.put("real", new Integer[]{0,401});
	        palabrasReservadas.put("cadena", new Integer[]{0,402});
	        palabrasReservadas.put("caracter", new Integer[]{0,403});
	        palabrasReservadas.put("booleano", new Integer[]{0,404});
	        palabrasReservadas.put("clase", new Integer[]{0,405});
	        palabrasReservadas.put("nuevo", new Integer[]{0,406});
	        palabrasReservadas.put("devolver", new Integer[]{0,407});
	        palabrasReservadas.put("si", new Integer[]{0,408});
	        palabrasReservadas.put("sino", new Integer[]{0,409});
	        palabrasReservadas.put("mientras", new Integer[]{0,410});
	        palabrasReservadas.put("para", new Integer[]{0,411});
	        palabrasReservadas.put("constante", new Integer[]{0,414});
	        palabrasReservadas.put("procedimiento", new Integer[]{0,415});
	        palabrasReservadas.put("principal", new Integer[]{0,416});
	        palabrasReservadas.put("funcion", new Integer[]{0,417});
	        palabrasReservadas.put("programa", new Integer[]{0,418});
	        palabrasReservadas.put("verdadero", new Integer[]{0,419});
	        palabrasReservadas.put("falso", new Integer[]{0,420});
	        palabrasReservadas.put("objeto", new Integer[]{0,421});
	        palabrasReservadas.put("constructor", new Integer[]{0,422});
	    }

}
