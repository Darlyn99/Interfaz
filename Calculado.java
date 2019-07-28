
package interfaz;

public class Calculado extends javax.swing.JFrame
{
    Calcu cal = new Calcu();
    
    public Calculado()
    {
      
    }
    
    @SuppressWarnings("unchecked")
    
    private void jBUnoMouseClicked(java.awt.event.MouseEvent evt)
    {
        jTFDisplay.setText(cal.espacio("1"));
    }
    private void jBDosMouseClicked(java.awt.event.MouseEvent evt)
    {
        jTFDisplay.setText(cal.espacio("2"));
    }
    private void jBTresMouseClicked(java.awt.event.MouseEvent evt)
    {
        jTFDisplay.setText(cal.espacio("3"));
    }
    private void jBCuatroMouseClicked(java.awt.event.MouseEvent evt)
    {
        jTFDisplay.setText(cal.espacio("4"));
    }
    private void jBCincoMouseClicked(java.awt.event.MouseEvent evt)
    {
        jTFDisplay.setText(cal.espacio("5"));
    }
    private void jBSeisMouseClicked(java.awt.event.MouseEvent evt)
    {
        jTFDisplay.setText(cal.espacio("6"));
    }
    private void jBSieteMouseClicked(java.awt.event.MouseEvent evt)
    {
        jTFDisplay.setText(cal.espacio("7"));
    }
    private void jBOchoMouseClicked(java.awt.event.MouseEvent evt)
    {
        jTFDisplay.setText(cal.espacio("8"));
    }
    private void jBNueveMouseClicked(java.awt.event.MouseEvent evt)
    {
        jTFDisplay.setText(cal.espacio("9"));
    }
    private void jBCeroMouseClicked(java.awt.event.MouseEvent evt)
    {
        jTFDisplay.setText(cal.espacio("0"));
    }
    private void jBPuntoMouseClicked(java.awt.event.MouseEvent evt)
    {
        jTFDisplay.setText(cal.espacio("."));
    }
    private void jBSumaMouseClicked(java.awt.event.MouseEvent evt)
    {
        cal.suma(jTFDisplay.getText());
    }
    private void jBRestaMouseClicked(java.awt.event.MouseEvent evt)
    {
        cal.resta(jTFDisplay.getText());
    }
    private void jBDivMouseClicked(java.awt.event.MouseEvent evt)
    {
        cal.div(jTFDisplay.getText());
    }
    private void jBMultMouseClicked(java.awt.event.MouseEvent evt)
    {
        cal.mult(jTFDisplay.getText());
    }
    private void jBIgualMouseClicked(java.awt.event.MouseEvent evt)
    {
        jTFDisplay.setText(" " + cal.total(jTFDisplay.getText()));
    }
    
    private javax.swing.JButton jBCero;
    private javax.swing.JButton jBUno;
    private javax.swing.JButton jBDos;
    private javax.swing.JButton jBTres;
    private javax.swing.JButton jCuatro;
    private javax.swing.JButton jBCinco;
    private javax.swing.JButton jBSeis;
    private javax.swing.JButton jBSiete;
    private javax.swing.JButton jBOcho;
    private javax.swing.JButton jBNueve;
    private javax.swing.JButton jBSuma;
    private javax.swing.JButton jBResta;
    private javax.swing.JButton jBDiv;
    private javax.swing.JButton jBMult;
    private javax.swing.JLabel jLabel;
    private javax.swing.JButton jBIgual;
    private javax.swing.JTextField jTFDisplay;
}

    
