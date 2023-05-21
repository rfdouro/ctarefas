package br.org.exemplo.ctarefas;

import br.org.exemplo.ctarefas.view.FrmMain;

public class Ctarefas {

 public static void main(String[] args) {
  /* Create and display the form */
  java.awt.EventQueue.invokeLater(new Runnable() {
   public void run() {
    new FrmMain().setVisible(true);
   }
  });
 }
}
