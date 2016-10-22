/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication18;

/**
 *
 * @author andy
 */
import java.awt.*;
import java.awt.Graphics2D;
import javax.swing.JOptionPane;
public class Arbol<T> extends javax.swing.JFrame {

    /**
     * Creates new form Arbol
     */
    
    
    public Arbol() {
        initComponents();
        panel.setVisible(true);
        //textArea.setEditable(false);
        
    }
    NodoArbol<T> raiz;
    public NodoArbol<T> getRaiz() {
		return raiz;
	}

	public void setRaiz(NodoArbol<T> raiz) {
		this.raiz = raiz;
	}
        
        public void recorreR(NodoArbol<String> raiz){
            
            String au=raiz.getDato();
	  System.out.println(raiz.getDato());
	  Nodo<NodoArbol<String>> aux = raiz.getHijos().getInicio() ;
          
	  while(aux != null){
		  recorreR(aux.getDato());
		  aux = aux.getSiguiente();
	  }
          
	}
        
        
       
    
    
    public void paint(Graphics g,boolean a){
        super.paint(g);
        if(false) return;
        pintar(panel.getGraphics());  
          
         // g.drawLine(x, y, x, y);
    }
    public void pintar(Graphics g){
        
        
        Graphics2D a= (Graphics2D) g;
         a.setStroke(new BasicStroke(3));
          g.setColor(Color.WHITE);
          g.fillRect(465, 59, 110, 40); //rectangulo principal
         
          g.setColor(Color.RED);
          
          g.drawString("Director", 499, 80); 
          g.setColor(Color.BLACK);
          
          
          g.drawLine(350, 130, 700, 130); //linea horizontal
          g.drawLine(520, 130, 520, 100);
          
          g.setColor(Color.WHITE);
          g.fillRect(297, 163, 110, 40); //rectangulo
          
          g.setColor(Color.RED);
          g.drawString("SubDirector 01", 315, 184); //izquierdo
          
          g.setColor(Color.BLACK);
          g.drawLine(350, 130, 350, 160);// lineas verticales secundarias
          g.drawLine(700, 130, 700, 160);
          
          g.setColor(Color.WHITE);
          g.fillRect(650, 163, 110, 40); 
          
          g.setColor(Color.RED);
          g.drawString("SubDirector 02", 665, 184);//derecho
          
          g.setColor(Color.BLACK);
          g.drawLine(220, 235, 470, 235);// linea horizontal de sub1
          g.drawLine(590, 235, 840, 235);//linea horizontal de sub2
          
          g.drawLine(350, 205, 350, 235);// lineas vertical sub2
          g.drawLine(700, 205, 700, 235);
          
          g.drawLine(840, 235, 840, 265);
          g.drawLine(590, 235, 590, 265);
          
          g.drawLine(220, 235, 220, 265);
          g.drawLine(470, 235, 470, 265);
          
          g.setColor(Color.WHITE);
          g.fillRect(165, 265, 110, 40); //rectangulos sub sub1
          g.fillRect(409, 265, 110, 40); 
          
          g.fillRect(535, 265, 110, 40); //rectangulo sub sub 2
          g.fillRect(785, 265, 110, 40); 
          
          g.setColor(Color.RED);
          g.drawString("Sub SubDirector 01", 168, 287);// sub sub1 string
          g.drawString("Sub SubDirector 02", 410, 287);
          
          g.drawString("Sub SubDirector 02", 537, 287);// sub sub2 String
          g.drawString("Sub SubDirector 02", 787, 287);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panel = new javax.swing.JPanel();
        boton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Organigrama");

        javax.swing.GroupLayout panelLayout = new javax.swing.GroupLayout(panel);
        panel.setLayout(panelLayout);
        panelLayout.setHorizontalGroup(
            panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1095, Short.MAX_VALUE)
        );
        panelLayout.setVerticalGroup(
            panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 411, Short.MAX_VALUE)
        );

        boton1.setText("Dibujar Arbol");
        boton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(boton1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(83, 83, 83)
                .addComponent(boton1, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(20, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
 
    private void boton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton1ActionPerformed
        paint(panel.getGraphics(),true);
    }//GEN-LAST:event_boton1ActionPerformed
  
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        Arbol ar=new Arbol();
        NodoArbol<String> raiz = new NodoArbol<String>("Director");
		raiz.getHijos().InsertaInicio(new NodoArbol<String>("Subdirector 01"));
		raiz.getHijos().InsertaFinal(new NodoArbol<String>("Subdirector 02"));
		//raiz.getHijos().InsertaFinal(new NodoArbol<String>("Subdirector 03"));
		//raiz.getHijos().InsertaFinal(new NodoArbol<String>("Subdirector 04"));
	        raiz.getHijos().getInicio().getDato().getHijos().InsertaInicio(new NodoArbol<String>("Sub SubDirector 01"));
                raiz.getHijos().getInicio().getDato().getHijos().InsertaFinal(new NodoArbol<String>("Sub SubDirector 02"));
                raiz.getHijos().obten_ultimo().getDato().getHijos().InsertaInicio(new NodoArbol<String>("Sub SubDirector 03"));
                raiz.getHijos().obten_ultimo().getDato().getHijos().InsertaFinal(new NodoArbol<String>("Sub Subdirector 04"));
        ar.recorreR(raiz);
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Arbol.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Arbol.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Arbol.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Arbol.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Arbol().setVisible(true);
                
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton boton1;
    private javax.swing.JPanel panel;
    // End of variables declaration//GEN-END:variables
}
