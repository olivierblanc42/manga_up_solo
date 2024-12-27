package manga_up.manga_up.model;

import jakarta.persistence.*;

import java.time.Instant;

@Entity
@Table(name = "cart")
public class Cart {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "Id_cart", nullable = false)
    private Integer id;

    @Column(name = "date_created")
    private Instant dateCreated;

    @Column(name = "validation_date")
    private Instant validationDate;

    @Column(name = "invoice_date")
    private Instant invoiceDate;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "Id_adress", nullable = false)
    private Adress idAdress;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Instant getDateCreated() {
        return dateCreated;
    }

    public void setDateCreated(Instant dateCreated) {
        this.dateCreated = dateCreated;
    }

    public Instant getValidationDate() {
        return validationDate;
    }

    public void setValidationDate(Instant validationDate) {
        this.validationDate = validationDate;
    }

    public Instant getInvoiceDate() {
        return invoiceDate;
    }

    public void setInvoiceDate(Instant invoiceDate) {
        this.invoiceDate = invoiceDate;
    }

    public Adress getIdAdress() {
        return idAdress;
    }

    public void setIdAdress(Adress idAdress) {
        this.idAdress = idAdress;
    }

}