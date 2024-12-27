package manga_up.manga_up.model;

import jakarta.persistence.*;

@Entity
@Table(name = "means_of_payment")
public class MeansOfPayment {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "Id_means_of_payment", nullable = false)
    private Integer id;

    @Column(name = "label", length = 50)
    private String label;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }

}