package Evaluador;

import java.awt.Component;
import java.awt.event.ActionEvent;
import java.util.ArrayList;
import java.util.StringTokenizer;
import javax.swing.GroupLayout;
import javax.swing.JFrame;
import pilaenlazada.Nodo;
import pilaenlazada.Pila;
import Graficadora.diseño;
import java.awt.Color;

public class Evaluador extends javax.swing.JFrame {
    
    /*
     MiPila representa la pila con los valores
     */
    private Pila pilaprueba = new Pila();
    
    public Evaluador() {
        initComponents();
        
    }
    
    
    private void initComponents() {
        
    /*
    Metodo donde se inicializa la interfaz grafica
    */
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        campoInfija = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        campoPosfija = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        areaTexto = new javax.swing.JTextArea();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        campoParentesis = new javax.swing.JLabel();
        campoInicia = new javax.swing.JLabel();
        campoTermina = new javax.swing.JLabel();
        campoAlternada = new javax.swing.JLabel();
        campoResultado = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        
        graficadora = new javax.swing.JButton("Graficadora");
        
        
        graficadora.setText("Graficadora");
        graficadora.setFont(new java.awt.Font("Courier New", 0, 14));
        graficadora.setBackground(Color.CYAN);
        graficadora.addActionListener(new java.awt.event.ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                diseño graf = new diseño();
                graf.setVisible(true);                  
            }
        });
        
        setResizable(false);
        
        
        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Calculadora");
        
        
        jPanel1.setBackground(new java.awt.Color(110, 141, 151));
        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        
        jPanel2.setBackground(Color.LIGHT_GRAY);
        
        //Establecemos el lugar donde ira la imagen de la cabezera
        jLabel1.setFont(new java.awt.Font("Courier New", 0, 30));
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Evaluador/imagenes/pdmX.png")));
        jLabel1.setText(" Calculadora");
        jLabel1.setFocusable(false);
        

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 696, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                
        );

        jLabel2.setText("Calculadora: Escriba la expresion Infija para convertirla en Posfija.");
        
        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Evaluador/imagenes/cd.gif")));
        
        
        
        jLabel4.setFont(new java.awt.Font("Courier New", 0, 12));
        jLabel4.setText("Expresion infija:");

        campoInfija.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campoInfijaActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Courier New", 0, 12));
        jLabel5.setText("Expresión posfija:");

        campoPosfija.setEditable(false);
        campoPosfija.setFocusable(false);
        campoPosfija.setFont(new java.awt.Font("Courier New", 0, 12));
        
        areaTexto.setColumns(20);
        areaTexto.setEditable(false);
        areaTexto.setRows(5);
        
        areaTexto.setText("Pasos para convertir la expresion infija a postfija");
        areaTexto.setFocusable(false);
        areaTexto.setFont(new java.awt.Font("Courier New", 0, 12));
        jScrollPane1.setViewportView(areaTexto);

        jLabel14.setText("Salida");
        jLabel14.setFont(new java.awt.Font("Courier New", 0, 12));
        jLabel14.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jLabel14.setFocusable(false);

        jLabel15.setText("Evaluaciones");
        jLabel15.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jLabel15.setFocusable(false);
        jLabel15.setFont(new java.awt.Font("Courier New", 0, 12));

        jPanel2.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        campoParentesis.setText("Parentesis correctos");
        campoParentesis.setToolTipText("Valida que tenga los parentesis correctamente anidados");
        campoParentesis.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        campoParentesis.setFont(new java.awt.Font("Courier New", 0, 12));
        
        campoInicia.setText("Inicia con operandos");
        campoInicia.setToolTipText("Valida que no inicie con un operador");
        campoInicia.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        campoInicia.setFont(new java.awt.Font("Courier New", 0, 12));
        
        campoTermina.setText("Termina con operandos");
        campoTermina.setToolTipText("Valida que no termine con un operador");
        campoTermina.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        campoTermina.setFont(new java.awt.Font("Courier New", 0, 12));
        
        campoAlternada.setText("Expresion alternada");
        campoAlternada.setToolTipText("Valida que los operadores y los operandos esten alternados");
        campoAlternada.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        campoAlternada.setFont(new java.awt.Font("Courier New", 0, 12));
        
        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(campoAlternada, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 143, Short.MAX_VALUE)
                    .addComponent(campoParentesis, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 143, Short.MAX_VALUE)
                    .addComponent(campoInicia, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 143, Short.MAX_VALUE)
                    .addComponent(campoTermina, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 143, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(campoParentesis, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(campoInicia, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(campoTermina, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(campoAlternada, javax.swing.GroupLayout.DEFAULT_SIZE, 23, Short.MAX_VALUE)
                .addContainerGap())
        );

        campoResultado.setEditable(false);
        campoResultado.setFocusable(false);

        jLabel6.setFont(new java.awt.Font("Courier New", 0, 12));
        jLabel6.setText("Resultado:");

        
        jButton1.setText("Reset");
        jButton1.setFont(new java.awt.Font("Courier New", 0, 15)); 
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 724, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 637, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 52, Short.MAX_VALUE)
                .addComponent(jLabel3)
                .addContainerGap())
            .addComponent(jSeparator1, javax.swing.GroupLayout.DEFAULT_SIZE, 724, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(campoResultado, javax.swing.GroupLayout.DEFAULT_SIZE, 561, Short.MAX_VALUE)
                    .addComponent(campoPosfija, javax.swing.GroupLayout.PREFERRED_SIZE, 561, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(campoInfija, javax.swing.GroupLayout.PREFERRED_SIZE, 480, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, 75, Short.MAX_VALUE))
                        .addComponent(graficadora, javax.swing.GroupLayout.DEFAULT_SIZE, 75, Short.MAX_VALUE))
                        
                        
                    
                    
                .addGap(20, 20, 20))
            .addGroup(layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel15, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 509, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                    .addComponent(jLabel14, javax.swing.GroupLayout.DEFAULT_SIZE, 509, Short.MAX_VALUE))
                .addContainerGap(20, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    
            .addGroup(layout.createSequentialGroup()
                
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(graficadora, javax.swing.GroupLayout.PREFERRED_SIZE,  28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(campoInfija, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
     
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(campoPosfija, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(campoResultado, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel15)
                    .addComponent(jLabel14))
                    
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(8, 8, 8)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                )
        );
        java.awt.Dimension screenSize = java.awt.Toolkit.getDefaultToolkit().getScreenSize();
        setBounds((screenSize.width-722)/2, (screenSize.height-469)/2, 732, 479);
    }
                                                  //Termina la construccion de la interfaz//
            //-------------------------------------------------------------------------------------------------------------------------//
            //-------------------------------------------------------------------------------------------------------------------------//
            //-------------------------------------------------------------------------------------------------------------------------//
            //-------------------------------------------------------------------------------------------------------------------------//
    
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {
        
        campoInfija.setText("");
        limpiarCampos();
    }
    
    
    private void campoInfijaActionPerformed(java.awt.event.ActionEvent evt) {
        
        evaluar();
    }
    
    private void limpiarCampos(){
    /*
     Metodo encargado de restablecer la pantalla, limpiando todos los campos
    */
        campoParentesis.setIcon(null);
        campoInicia.setIcon(null);
        campoTermina.setIcon(null);
        campoAlternada.setIcon(null);
        campoPosfija.setText("");
        areaTexto.setText("");
        campoResultado.setText("");
    }
    
    
    private void evaluar(){
    /*
     Metodo que se encarga de llamar a los demas metodos en forma ordenada para generar el resultado 
     de evaluar la expresion
    */
        limpiarCampos();
        String infija = campoInfija.getText();   
        
        //Validamos que la expresion tecleada no este en blanco.
        if(infija.equals("")){
            return;
        }
        //establecemos imagenes
        final String acreditado="/Evaluador/imagenes/ok24.png";
        final String noAcreditado="/Evaluador/imagenes/danger24.png";
        
        //Validamos que los parentesis esten correctamente anidados
        if(validarParentesis(infija)){
            campoParentesis.setIcon(new javax.swing.ImageIcon(getClass().getResource(acreditado)));
        }
        else{
            campoParentesis.setIcon(new javax.swing.ImageIcon(getClass().getResource(noAcreditado)));
            return;
        }
        
        //Validamos que la emprecion no inicie con un operador
        if(empiezaConOperador(infija)){
            campoInicia.setIcon(new javax.swing.ImageIcon(getClass().getResource(noAcreditado)));
            return;
        }
        else{
            campoInicia.setIcon(new javax.swing.ImageIcon(getClass().getResource(acreditado)));
        }
        
        //Validamos que la empresion no termine con un operador
        if(terminaConOperador(infija)){
            campoTermina.setIcon(new javax.swing.ImageIcon(getClass().getResource(noAcreditado)));
            return;
        }
        else{
            campoTermina.setIcon(new javax.swing.ImageIcon(getClass().getResource(acreditado)));
        }
        
        //Evaluamos que la expresion este correctamente alternada
        if(evaluarAlternaciones(infija)){
            campoAlternada.setIcon(new javax.swing.ImageIcon(getClass().getResource(acreditado)));
        }
        else{
            campoAlternada.setIcon(new javax.swing.ImageIcon(getClass().getResource(noAcreditado)));
            return;
        }
                  //-----------------------------------------------------------------------//
                  //-----------------------------------------------------------------------//
                  //-----------------------------------------------------------------------//
                  //-----------------------------------------------------------------------//
                  //-----------------------------------------------------------------------//
                         //Evaluamos transformamos la expresion de infija a posfijo//
        String posfija = toPosfijo(infija);
        if(posfija==null){
            return;
        }
        else{
            campoPosfija.setText(posfija);
        }
        
        int operacion = evaluarPosfijo(posfija);
        campoResultado.setText(operacion+"");
        
    }
    
    /*
     Metodo que evalua la expresion posfija y devuelve el valor real de la evaluacion
     @param posfijo es la expresion en posfijo
     @return  devuleve la evaluacion de la exprecion
     */
    public int evaluarPosfijo(String posfijo){              
        ArrayList<String> token = new ArrayList<String>();
        
        StringTokenizer st = new StringTokenizer(posfijo," ");
        while(st.hasMoreTokens()){
            token.add(st.nextToken());
        }
        if(token.size()==1){
            return Integer.parseInt(token.get(0));                
        }
        int c=0;
        areaTexto.append(token.toString()+"\n");
        while(token.size()!=1){
            
            String operador = token.get(c);
            if(operador.equals("+")||operador.equals("-")||operador.equals("*")||operador.equals("/")||operador.equals("^")){
                String operando1=token.get(c-1);
                String operando2 =token.get(c-2);
                
                token.remove(c);
                token.remove(c-1);
                token.remove(c-2);
                if(operador.equals("+")){
                    try {
                        String suma = (Integer.parseInt(operando2)+Integer.parseInt(operando1))+"";
                        token.add(c-2,suma);
                        c=0;
                    } catch (Exception e) {
                        areaTexto.setText("Error al comvertir un operando\n"+e);
                        return 0;
                    }                    
                }
                else if(operador.equals("-")){
                    try {
                        String resta = (Integer.parseInt(operando2)-Integer.parseInt(operando1))+"";
                        token.add(c-2,resta);
                        c=0;
                    } catch (Exception e) {
                        areaTexto.setText("Error al comvertir un operando\n"+e);
                        return 0;
                    }    
                }
                else if(operador.equals("*")){
                    try {
                        String multiplicacion = (Integer.parseInt(operando2)*Integer.parseInt(operando1))+"";
                        token.add(c-2,multiplicacion);
                        c=0;
                    } catch (Exception e) {
                        areaTexto.setText("Error al comvertir un operando\n"+e);
                        return 0;
                    }    
                }
                else if(operador.equals("/")){
                    try {
                        String divicion = (Integer.parseInt(operando2)/Integer.parseInt(operando1))+"";
                        token.add(c-2,divicion);
                        c=0;
                    } catch (Exception e) {
                        areaTexto.setText("Error al comvertir un operando\n"+e);
                        return 0;
                    }    
                }
                else{
                    try {
                        String potencia = (Integer.parseInt(operando2)^Integer.parseInt(operando1))+"";
                        token.add(c-2,potencia);
                        c=0;
                    } catch (Exception e) {
                        areaTexto.setText("Error al comvertir un operando\n"+e);
                        return 0;
                    }   
                }
                areaTexto.append(token.toString()+"\n");
            }
            else{
                c++;
            }
        }       
        try {            
            return Integer.parseInt(token.get(0));            
        } catch (Exception e) {
            areaTexto.setText("Error al parsear el resultado\n"+e);
            return 0;
        }        
    }

    /*
     Metodo que se asegura que este correctamente planteda la exprecion
     @param infijo es la exprecion matematica a evaluar
     @return devuleve un true si la exprecion esta alternada correctamente, false de lo contrario
     */
    public boolean evaluarAlternaciones(String infijo){
        char[] cadena = infijo.toCharArray();
        char ultimoElemento=cadena[0];
        
        //Se da por entendido que todas las expresiones son correctas hasta que se encuentre un error
        boolean validacion=true;
    
        for(int c =1;c<cadena.length;c++){
            char caracter = cadena[c];
            if(Character.isDigit(caracter)){
                if(ultimoElemento==')'){
                    String salida = generarError(infijo,c);
                    salida+="No se puede poner un numero despues de un ')'\n";
                    areaTexto.append(salida);
                    validacion=false;                    
                }                                       
                else{
                    ultimoElemento=caracter;
                }
            }
            else if(caracter=='('){
                if(ultimoElemento=='('){
                    ultimoElemento=caracter;
                }
                else if(ultimoElemento=='+' || ultimoElemento=='-' || ultimoElemento=='*' || ultimoElemento=='/' || ultimoElemento=='^'){
                    ultimoElemento=caracter;
                }
                else{
                    String salida = generarError(infijo,c);
                    salida+="Despues de un '"+ultimoElemento+"' no puede venir un '('\n";
                    areaTexto.append(salida);
                    validacion=false;                         
                }                                    
            }
            else if(caracter==')'){
                if(ultimoElemento==')'){
                    ultimoElemento=caracter;
                }
                else if(Character.isDigit(ultimoElemento)){
                    ultimoElemento=caracter;
                }
                else{
                    String salida = generarError(infijo,c);
                    salida+="Despues de un '"+ultimoElemento+"' no puede venir un ')'\n";
                    areaTexto.append(salida);
                    validacion=false;                     
                }                                   
            }
            else if(caracter=='+' || caracter =='-' || caracter=='*' || caracter=='/' || caracter=='^'){
                if(ultimoElemento==')'){
                    ultimoElemento=caracter;
                }
                else if(Character.isDigit(ultimoElemento)){
                    ultimoElemento=caracter;
                }
                else{
                    String salida = generarError(infijo,c);
                    salida+="Despues de un '"+ultimoElemento+"' no puede venir un Operador '"+caracter+"'\n";
                    areaTexto.append(salida);
                    validacion=false;                   
                }                                       
            }            
        }       
        
        return validacion;
    }
    

    /*
     Metodo que nos indica si la exprecion termina con un operador
     @param infijo es la exprecion matematica
     @return retorna true si empiesa con un operador, false de lo contrario
     */
    public boolean terminaConOperador(String infijo){
        char[] cadena = infijo.toCharArray();
        for(int c=cadena.length-1;c>0;c--){
            char caracter = cadena[c];
            if(Character.isDigit(caracter)){
                return false;
            }
            if(Character.isLetter(caracter)){
                return false;
            }
            else if(caracter=='+' || caracter =='-' || caracter=='*' || caracter=='/' || caracter=='^'){
                String salida = generarError(infijo,c);
                salida+="La exprecion nu puede terminar con operador";
                areaTexto.setText(salida);
                return true;
            }
        }
        return false;
    }
    /*
     Metodo que nos sirve para saber si la exprecion empiesa con un operador
     @param infijo exprecion matematica
     @return retorna true se empiesa con un Operador,false de lo contrario
     */
    public boolean empiezaConOperador(String infijo){
        char[] cadena = infijo.toCharArray();
        for(int c=0;c<cadena.length;c++){
            char caracter = cadena[c];
            if(Character.isDigit(caracter)){
                return false;
            }
            if(Character.isLetter(caracter)){
                return false;
            }
            else if(caracter=='+' || caracter =='-' || caracter=='*' || caracter=='/' || caracter=='^'){
                String salida = generarError(infijo,c);
                salida+="La expresion nu puede empezar con operador";
                areaTexto.setText(salida);
                return true;
            }
        }
        return false;
    }
    
    /*
     Metodo utilizado para saber si el caracter es de mayor presedencia que el que se
     encuentra en la ultima posicion de la pila
     @param caracter caracter que se evaluara para meterse a la pila
     @return devuelve true si el caracter es de mayor presedencia, false de lo contrario
     */
    private boolean esDeMayorPresedencia(char caracter){
        if(pilaprueba.empty()){
            return true;
        }
        if(caracter== (char)pilaprueba.peek()){
            return false;
        }
        if(caracter=='^'){
            return true;
        }
        if( (caracter=='*'&& (char)pilaprueba.peek()=='/')||(caracter=='/'&& (char)pilaprueba.peek()=='*')){
            return false;
        }
        if( (caracter=='+'&&(char)pilaprueba.peek()=='-')||(caracter=='-'&&(char)pilaprueba.peek()=='+')){
            return false;
        }        
        else if(caracter=='-'||caracter=='+'){
            char temp =(char) pilaprueba.peek();
            if(temp=='*'||temp=='/'){
                return false;
            }
        }
        return true;        
    }
    
    
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Evaluador().setVisible(true);    
                
            }
        });
    }
    
    
    
    /*
     Metodo utilizado para validar que los parentesis estan correctamente
     @param operacion esta variable deve de contener la operacion matematica a efectuar
     Ejemplo: a+((b-c)/d)
     @return Devuelve true si la operacion tiene correctamente los parentesis
     */
    public boolean validarParentesis(String operacion){
        
        Pila pilaprueba = new Pila();
        
        char[] ecuacion = operacion.toCharArray();        
        for(int c=0;c<ecuacion.length;c++){
            char caracter = ecuacion[c];
            if(caracter=='('){
                pilaprueba.push(caracter);
            }
            else if(caracter==')'){
                if(pilaprueba.empty()){
                    String salida = generarError(operacion,c);
                    salida+="Numero de parentesis impares";
                    areaTexto.setText(salida);
                    return false;
                }
                else{
                    pilaprueba.pop();
                }
            }
        }
        if(!pilaprueba.empty()){    
            String salida = generarError(operacion,ecuacion.length-1);
            salida+="Numero de parentesis impares,Se esperaba que se cerrara los parentesis";
            areaTexto.setText(salida);
            return false;
            
        }        
        return true;
    }
    
    
    
    
                            //------------------------------------------------------------------------//
                            //------------------------------------------------------------------------//
                            //------------------------------------------------------------------------//
                            //------------------------------------------------------------------------//
                            //-------------------------Pasa de Infija a Postfija----------------------//
    
    /*
     Metodo que transforma una exprecion de infijo a posfijo
     @param operacion es la exprecion matematica
     @return devuelve un String con la exprecion en postfijo o devuelve un null si la exprecion no se
     evaluo correctamente
     */
    public String toPosfijo(String infijo){             
        String salida="";
        char[] cadena = infijo.toCharArray();
        
        for(int c=0;c<cadena.length;c++){
            char caracter = cadena[c];
            if(caracter=='('){
                //pilaprueba
                pilaprueba.push(caracter);
            } 
            else if(caracter==')'){                
                while(true){
                    if(pilaprueba.empty()){
                        String retorno = generarError(infijo,c);
                        retorno+="Operacion invalida numero de parentesis impares";
                        areaTexto.setText(retorno);
                        return null;
                    }
                    char temp = (char) pilaprueba.pop();
                    if(temp=='('){
                        break;
                    }
                    else{
                        salida+=" "+temp;
                    }
                }//fin del wile
            }
            else if(Character.isDigit(caracter)){
                salida+=" "+caracter;                
                c++;
     busqueda : for( ; c<cadena.length;c++){
                    if(Character.isDigit(cadena[c])){
                        salida+=cadena[c];
                    }
                    else{
                        c--;
                        break busqueda;
                    }                    
                }                
            }
            else if(caracter=='+'||caracter=='-'||caracter=='/'||caracter=='*'||caracter=='^'){   
                if(pilaprueba.empty()){
                    pilaprueba.push(caracter);
                }
                else{
                    while(true){                    
                        if(esDeMayorPresedencia(caracter)){                            
                            pilaprueba.push(caracter);
                            break;
                        }else{
                            salida+=" "+pilaprueba.pop();
                        }  
                    }                                 
                }               
            }
            else{
                String retorno = generarError(infijo,c);
                retorno+="caracter no valido para la exprecion : '"+caracter+"'";
                areaTexto.setText(retorno);
                return null;
            }
        }//fin del for
        if(!pilaprueba.empty()){
            do{
                char temp = (char) pilaprueba.pop();
                salida+=" "+temp;                
            }while(!pilaprueba.empty());
        }
        
        return salida.trim();
    }
    
    /*
     Metodo que genera la posicion en la que se genero el error en tienpo de evaluar la expreción
     @param infijo es la exprecion en infijo que se esta evaluando
     @param indice es la pacion en que se encontro el error
     @return devuelve el String indicando la posicion exacta del error
     */
    private String generarError(String infijo,int indice){
        String error[] = new String[infijo.length()];
        for(int c=0;c<error.length;c++){
            error[c]="  ";
        }
        error[indice]="^";
        
        String error2="";
        for(int c=0;c<error.length;c++){
            error2+=error[c];
        }
        return infijo+"\n"+error2+"\n";
    }
    
    
    
    
    // Variables declaradas
    private javax.swing.JTextArea areaTexto;
    private javax.swing.JLabel campoAlternada;
    private javax.swing.JTextField campoInfija;
    private javax.swing.JLabel campoInicia;
    private javax.swing.JLabel campoParentesis;
    private javax.swing.JTextField campoPosfija;
    private javax.swing.JTextField campoResultado;
    private javax.swing.JLabel campoTermina;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    
    private javax.swing.JButton graficadora;
    
}
