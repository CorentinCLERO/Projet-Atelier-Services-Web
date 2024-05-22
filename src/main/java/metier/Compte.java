package metier;

import java.io.Serializable;
import java.util.Date;

public class Compte implements Serializable {
    private Long code; 
    private double solde;
    private Date datecreation;
    public Long getCode() {
        return code;
    }
    public void setCode(Long code) {
        this.code = code;
    }
    public double getSolde() {
        return solde;
    }
    public void setSolde(double solde) {
        this.solde = solde;
    }
    public Date getDatecreation() {
        return datecreation;
    }
    public void setDatecreation(Date datecreation) {
        this.datecreation = datecreation;
    }
    public Compte() {
        super();
        // TODO Auto-generated constructor stub
    }
    public Compte(Long code, double solde, Date datecreation) {
        super();
        this.code = code;
        this.solde = solde;
        this.datecreation = datecreation;
    }

}