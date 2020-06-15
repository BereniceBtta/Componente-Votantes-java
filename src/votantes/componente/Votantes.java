/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package votantes.componente;

/**
 *
 * @author 1056374147
 */
public class Votantes {

    private String Numcontrol;
    private String Semestre;
    private boolean voto = false;

    public Votantes(String Numcontrol, String Semestre, Boolean votos) {
        this.Numcontrol = Numcontrol;
        this.Semestre = Semestre;
        this.voto = votos;
    }

    public String getNumcontrol() {
        return Numcontrol;
    }

    public void setNumcontrol(String Numcontrol) {
        this.Numcontrol = Numcontrol;
    }

    public String getSemestre() {
        return Semestre;
    }

    public void setSemestre(String Semestre) {
        this.Semestre = Semestre;
    }

    public boolean getVoto() {
        return voto;
    }

    public void setVoto(boolean voto) {
        this.voto = voto;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("\nNumero control: ");
        sb.append(Numcontrol);
        sb.append("\nSemestre: ");
        sb.append(Semestre);
        sb.append("\nVoto: ");
        sb.append(voto);

        return sb.toString();
    }
}
