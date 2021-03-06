package gui;

import javax.swing.ImageIcon;
import javax.swing.SwingConstants;

import controlador.Controller;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author jmdia
 */
public class MainWindow extends javax.swing.JFrame {

	/**
	 * 
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private static Controller c;
	
	public MainWindow() {
		inicializarIcono();
		initComponents();
	}
	private void inicializarIcono() {
		ImageIcon icono = new ImageIcon("resources/ico.png");
		this.setIconImage(icono.getImage());
	}

	/**
	 * This method is called from within the constructor to initialize the form.
	 * WARNING: Do NOT modify this code. The content of this method is always
	 * regenerated by the Form Editor.
	 */
	
	// <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
	private void initComponents() {

		jLabelTitle = new javax.swing.JLabel();
		jLabelColorBar = new javax.swing.JLabel();
		jLabelText1 = new javax.swing.JLabel();
		jLabelText2 = new javax.swing.JLabel();
		jButtonSearch = new javax.swing.JButton();

		setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
		setLocation(new java.awt.Point(600, 300));
		setPreferredSize(new java.awt.Dimension(500, 400));

		jLabelTitle.setFont(new java.awt.Font("Arial", 0, 48)); // NOI18N
		jLabelTitle.setText("MadridAccidents App");

		jLabelColorBar.setBackground(new java.awt.Color(0, 0, 0));
		jLabelColorBar.setOpaque(true);

		jLabelText1.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
		jLabelText1.setText("Welcome to the Madrid Accident search engine. ");

		jLabelText2.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
		jLabelText2.setText("<html>The objective of this application is to be able to obtain all the possible data on accidents that have occurred in Madrid<p> in order to perform an analysis of these data.<html>");

		jButtonSearch.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
		jButtonSearch.setText("START");
		jButtonSearch.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jButtonSearchActionPerformed(evt);
			}
		});

		javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
		getContentPane().setLayout(layout);
		layout.setHorizontalGroup(
				layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addComponent(jLabelColorBar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
				.addGroup(layout.createSequentialGroup()
						.addGap(51, 51, 51)
						.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
								.addComponent(jLabelText1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
								.addComponent(jLabelText2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
						.addContainerGap())
				.addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
						.addGap(0, 0, Short.MAX_VALUE)
						.addComponent(jButtonSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
						.addGap(171, 171, 200))
				.addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
						.addContainerGap()
						.addComponent(jLabelTitle, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
						.addContainerGap())
				);
		layout.setVerticalGroup(
				layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(layout.createSequentialGroup()
						.addGap(7, 7, 7)
						.addComponent(jLabelTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
						.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
						.addComponent(jLabelColorBar, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
						.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
						.addComponent(jLabelText1, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
						.addGap(13, 13, 13)
						.addComponent(jLabelText2, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
						.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
						.addComponent(jButtonSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
						.addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
				);

		jLabelTitle.setHorizontalAlignment(SwingConstants.CENTER);
		jLabelText2.setHorizontalAlignment(SwingConstants.CENTER);

		pack();
	}// </editor-fold>//GEN-END:initComponents

	private void jButtonSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSearchActionPerformed
		new Searcher().setVisible(true);
		this.setVisible(false);

	}//GEN-LAST:event_jButtonSearchActionPerformed

	/**
	 * @param args the command line arguments
	 */
	public static void main(String args[]) {
		c = new Controller();
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
			java.util.logging.Logger.getLogger(MainWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		} catch (InstantiationException ex) {
			java.util.logging.Logger.getLogger(MainWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		} catch (IllegalAccessException ex) {
			java.util.logging.Logger.getLogger(MainWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		} catch (javax.swing.UnsupportedLookAndFeelException ex) {
			java.util.logging.Logger.getLogger(MainWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		}
		//</editor-fold>
		//</editor-fold>
		/* Create and display the form */
		java.awt.EventQueue.invokeLater(() -> {
			new MainWindow().setVisible(true);
		});
	}
	
	public static Controller getC() {
		return c;
	}
	public static void setC(Controller c) {
		MainWindow.c = c;
	}

	// Variables declaration - do not modify//GEN-BEGIN:variables
	private javax.swing.JButton jButtonSearch;
	private javax.swing.JLabel jLabelColorBar;
	private javax.swing.JLabel jLabelText1;
	private javax.swing.JLabel jLabelText2;
	private javax.swing.JLabel jLabelTitle;
	// End of variables declaration//GEN-END:variables
}

