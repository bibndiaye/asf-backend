package com.asf.demo.model;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;
import java.io.Serializable;
import java.math.BigDecimal;
import java.time.Instant;

@Getter
@Setter
@RequiredArgsConstructor
@ToString
@Entity(name = "Tracabilite")
    @Table(name = "tracabilite")
public class Tracabilite implements Serializable {
    private static final long serialVersionUID = -7855846240789123808L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID", nullable = false)
    private Integer id;

    private Integer rOperationid;

    private Integer rVoieid;

    private Integer rTracabiliteErreurid;

    private Integer rTransactionEtatid;

    private Integer rTransactionModificationTypeid;

    private Integer fichierid;

    private String idtTranPea;

    private BigDecimal montantTransaction;

    private Instant dateOperation;

    private Instant dateCreation;

    private Integer anomalie;

    private String messageErreur;

    private String transactionUtilisateur;

    private String commentaire;

    private Integer rModeReglementid;

    private Integer rPartenaireid;

    private Instant dateTransaction;

    @Column(name = "DATE_TRANSACTION")
    public Instant getDateTransaction() {
        return dateTransaction;
    }

    public Integer getRPartenaireid() {
        return rPartenaireid;
    }

    public Integer getRModeReglementid() {
        return rModeReglementid;
    }

    @Column(name = "COMMENTAIRE", length = 45)
    public String getCommentaire() {
        return commentaire;
    }

    @Column(name = "TRANSACTION_UTILISATEUR", length = 45)
    public String getTransactionUtilisateur() {
        return transactionUtilisateur;
    }

    @Lob
    @Column(name = "MESSAGE_ERREUR")
    public String getMessageErreur() {
        return messageErreur;
    }

    @Column(name = "ANOMALIE")
    public Integer getAnomalie() {
        return anomalie;
    }

    @Column(name = "DATE_CREATION", nullable = false)
    public Instant getDateCreation() {
        return dateCreation;
    }

    @Column(name = "DATE_OPERATION")
    public Instant getDateOperation() {
        return dateOperation;
    }

    @Column(name = "MONTANT_TRANSACTION", precision = 10, scale = 2)
    public BigDecimal getMontantTransaction() {
        return montantTransaction;
    }

    @Lob
    @Column(name = "IDT_TRAN_PEA", nullable = false)
    public String getIdtTranPea() {
        return idtTranPea;
    }

    @Column(name = "FICHIERID")
    public Integer getFichierid() {
        return fichierid;
    }

    public Integer getRTransactionModificationTypeid() {
        return rTransactionModificationTypeid;
    }

    public Integer getRTransactionEtatid() {
        return rTransactionEtatid;
    }

    public Integer getRTracabiliteErreurid() {
        return rTracabiliteErreurid;
    }

    public Integer getRVoieid() {
        return rVoieid;
    }

    public Integer getROperationid() {
        return rOperationid;
    }

    public Integer getId() {
        return id;
    }
}