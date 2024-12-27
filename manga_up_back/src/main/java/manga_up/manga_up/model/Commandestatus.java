package manga_up.manga_up.model;

import jakarta.persistence.*;

@Entity
@Table(name = "commandestatus")
public class Commandestatus {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "Id_commandeStatus", nullable = false)
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