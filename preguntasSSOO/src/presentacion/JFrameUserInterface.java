package presentacion;

import dominio.Pregunta;

import java.awt.EventQueue;

import javax.swing.*;
import javax.swing.border.EmptyBorder;


import java.awt.Color;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class JFrameUserInterface extends JFrame {

    private JPanel contentPane;
    private JTextArea jLabel_pregunta;
    private JTextPane textPaneEstado;
    private JToggleButton jToggleButton_resp1, jToggleButton_resp2, jToggleButton_resp3,
                            jToggleButton_resp4, jToggleButton_resp5;
    private Pregunta pregunta = null;

    /**
     * Launch the application.
     */
    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    JFrameUserInterface frame = new JFrameUserInterface();
                    frame.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }

    /**
     * Create the frame.
     */
    public JFrameUserInterface() {
        setTitle("PREGUNTAS SISTEMAS OPERATIVOS");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 60, 1200, 680);
        contentPane = new JPanel();
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        setContentPane(contentPane);
        contentPane.setLayout(null);

        this.pregunta= generarPreguntaRandom();
        jLabel_pregunta = new JTextArea(pregunta.getTitulo());
        jLabel_pregunta.setOpaque(false);
        jLabel_pregunta.setForeground(Color.BLUE);
        jLabel_pregunta.setBounds(30, 30, 1100, 32);
        contentPane.add(jLabel_pregunta);

        jToggleButton_resp1 = new JToggleButton();
        jToggleButton_resp1.setForeground(Color.BLACK);
        jToggleButton_resp1.setBounds(30, 90, 1100, 32);
        contentPane.add(jToggleButton_resp1);

        jToggleButton_resp2 = new JToggleButton();
        jToggleButton_resp2.setForeground(Color.BLACK);
        jToggleButton_resp2.setBounds(30, 170, 1100, 32);
        contentPane.add(jToggleButton_resp2);

        jToggleButton_resp3 = new JToggleButton();
        jToggleButton_resp3.setForeground(Color.BLACK);
        jToggleButton_resp3.setBounds(30, 250, 1100, 32);
        contentPane.add(jToggleButton_resp3);

        jToggleButton_resp4 = new JToggleButton();
        jToggleButton_resp4.setForeground(Color.BLACK);
        jToggleButton_resp4.setBounds(30, 330, 1100, 32);
        contentPane.add(jToggleButton_resp4);

        jToggleButton_resp5 = new JToggleButton();
        jToggleButton_resp5.setForeground(Color.BLACK);
        jToggleButton_resp5.setBounds(30, 410, 1100, 32);
        contentPane.add(jToggleButton_resp5);

        asignacionRandom();
        JButton buttonAceptar = new JButton("Aceptar");
        buttonAceptar.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent arg0) {
                if (jToggleButton_resp1.isSelected()){
                    if (comprobarRespuesta(jToggleButton_resp1.getText()))
                        textPaneEstado.setText("CORRECTO. La respuesta es: "+jToggleButton_resp1.getText());
                    else
                        textPaneEstado.setText("NO ES CORRECTO. La respuesta es: "+pregunta.getResp1());
                }else if (jToggleButton_resp2.isSelected()){
                    if (comprobarRespuesta(jToggleButton_resp2.getText()))
                        textPaneEstado.setText("CORRECTO. La respuesta es: "+jToggleButton_resp2.getText());
                    else
                        textPaneEstado.setText("NO ES CORRECTO. La respuesta es: "+pregunta.getResp1());
                }else if (jToggleButton_resp3.isSelected()){
                    if (comprobarRespuesta(jToggleButton_resp3.getText()))
                        textPaneEstado.setText("CORRECTO. La respuesta es: "+jToggleButton_resp3.getText());
                    else
                        textPaneEstado.setText("NO ES CORRECTO. La respuesta es: "+pregunta.getResp1());
                }else if (jToggleButton_resp4.isSelected()){
                    if (comprobarRespuesta(jToggleButton_resp4.getText()))
                        textPaneEstado.setText("CORRECTO. La respuesta es: "+jToggleButton_resp4.getText());
                    else
                        textPaneEstado.setText("NO ES CORRECTO. La respuesta es: "+pregunta.getResp1());
                }else if (jToggleButton_resp5.isSelected()){
                    if (comprobarRespuesta(jToggleButton_resp5.getText()))
                        textPaneEstado.setText("CORRECTO. La respuesta es: "+jToggleButton_resp5.getText());
                    else
                        textPaneEstado.setText("NO ES CORRECTO. La respuesta es: "+pregunta.getResp1());
                }
            }
        });

        buttonAceptar.setBounds(750, 575, 117, 29);
        contentPane.add(buttonAceptar);

        JLabel lblEstado = new JLabel("¿Acierto?");
        lblEstado.setForeground(Color.RED);
        lblEstado.setBounds(150, 505, 300, 16);
        contentPane.add(lblEstado);

        textPaneEstado = new JTextPane();
        textPaneEstado.setToolTipText("Se muestra si se ha acertado o no");
        textPaneEstado.setEditable(false);
        textPaneEstado.setBounds(6, 530, 600, 200);

        contentPane.add(textPaneEstado);

        JButton buttonSiguiente = new JButton("SIGUIENTE");
        buttonSiguiente.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent arg0) {
                pregunta = generarPreguntaRandom();
                jLabel_pregunta.setText(pregunta.getTitulo());
                asignacionRandom();
                jToggleButton_resp1.setSelected(false);
                jToggleButton_resp2.setSelected(false);
                jToggleButton_resp3.setSelected(false);
                jToggleButton_resp4.setSelected(false);
                jToggleButton_resp5.setSelected(false);
                textPaneEstado.setText("");
            }
        });
        buttonSiguiente.setBounds(750, 625, 117, 29);
        contentPane.add(buttonSiguiente);
    }
    private int generarRandom(int limite){
        int numeroAleatorio = (int) (Math.random()*limite+1);
        return numeroAleatorio;
    }

    private boolean comprobarRespuesta(String respuesta){
        boolean comprobacion=false;
        if (respuesta.equals(pregunta.getResp1()))
            comprobacion = true;
        return comprobacion;
    }

    private void asignacionRandom (){
        int rnd = (int) (Math.random()*5+1);
        switch (rnd){
            case 1:
                jToggleButton_resp2.setText(pregunta.getResp1());
                jToggleButton_resp3.setText(pregunta.getResp2());
                jToggleButton_resp4.setText(pregunta.getResp3());
                jToggleButton_resp5.setText(pregunta.getResp4());
                jToggleButton_resp1.setText(pregunta.getResp5());
                break;
            case 2:
                jToggleButton_resp3.setText(pregunta.getResp1());
                jToggleButton_resp4.setText(pregunta.getResp2());
                jToggleButton_resp5.setText(pregunta.getResp3());
                jToggleButton_resp1.setText(pregunta.getResp4());
                jToggleButton_resp2.setText(pregunta.getResp5());
                break;
            case 3:
                jToggleButton_resp4.setText(pregunta.getResp1());
                jToggleButton_resp5.setText(pregunta.getResp2());
                jToggleButton_resp1.setText(pregunta.getResp3());
                jToggleButton_resp2.setText(pregunta.getResp4());
                jToggleButton_resp3.setText(pregunta.getResp5());
                break;
            case 4:
                jToggleButton_resp5.setText(pregunta.getResp1());
                jToggleButton_resp1.setText(pregunta.getResp2());
                jToggleButton_resp2.setText(pregunta.getResp3());
                jToggleButton_resp3.setText(pregunta.getResp4());
                jToggleButton_resp4.setText(pregunta.getResp5());
                break;
            default:
                jToggleButton_resp1.setText(pregunta.getResp5());
                jToggleButton_resp2.setText(pregunta.getResp4());
                jToggleButton_resp4.setText(pregunta.getResp2());
                jToggleButton_resp5.setText(pregunta.getResp1());
                jToggleButton_resp3.setText(pregunta.getResp3());
                break;
        }
    }
    public Pregunta generarPreguntaRandom(){
        int id = generarRandom(100);
        Pregunta p = null;
        try{
            if ((p=pregunta.read2(id))!=null) ;

        }catch (Exception ex){
            System.out.println("Error random");
        }
        return p;
    }
}