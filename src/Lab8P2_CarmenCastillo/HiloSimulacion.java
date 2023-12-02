/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Lab8P2_CarmenCastillo;

import java.util.Random;
import javax.swing.JProgressBar;

/**
 *
 * @author casti
 */
public class HiloSimulacion extends Thread{
    
    private JProgressBar progBar_t;
    private JProgressBar progBar_d;
    private Random ran = new Random();
    private double Tiempo2;
    private double HPower;
    private double VelocidadM;
    private boolean avanzar;
    private boolean vive;


    public HiloSimulacion(JProgressBar progBar_t, JProgressBar progBar_d, double Tiempo2) {
        this.progBar_t = progBar_t;
        this.progBar_d = progBar_d;
        this.Tiempo2 = Tiempo2;
    }


    public void setAvanzar(boolean avanzar) {
        this.avanzar = avanzar;
    }

    public void setVive(boolean vive) {
        this.vive = vive;
    }
    
    @Override
    public void run() {
        while (vive) {
            if (avanzar) {
//                progBar_d.setValue(Math.round(Integer.parseInt(sp_velocidad.getValue().toString()) * (progBar_t.getValue() / 60)));
                progBar_d.setString(Integer.toString(progBar_d.getValue()) + " Kilometros/s");
            }
            try {
                Thread.sleep(500);
            } catch (InterruptedException ex) {

            }
        }

    }
    
}
