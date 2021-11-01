/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tutoria.Modelo;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.io.Serializable;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 * Control de Fincas
 * @author Luis Eduardo Niño Pérez
 */
@Entity
@Table(name = "farm")
public class Finca implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    /**
    * Identificador de la Finca
     */
    private Integer id;
    /**
    * Nombre de la Finca
     */
    private String name; 
    /**
    * Dirección de la Finca
     */
    private String address;
    /**
    * Extensión de la Finca
     */
    private Integer  extension;
    /**
    * Descripción de la Finca
     */
    private String description;
    
    @ManyToOne
    @JoinColumn(name="categoryid")
    @JsonIgnoreProperties("farms")
    /**
    * Categoría de la Finca
     */
    private Categoria category;
    
    @OneToMany(cascade = {CascadeType.PERSIST}, mappedBy = "farm")
    @JsonIgnoreProperties({"farm","client"})
    /**
    * Mensaje de la Finca
     */
    private List<Mensaje> messages;

    @OneToMany(cascade = {CascadeType.PERSIST}, mappedBy = "farm")
    @JsonIgnoreProperties({"farm","message"})
    /**
    * Reservación de la Finca
     */
    public List<Reservacion> reservations;

    /**
    * Get del Id
     */
    public Integer getId() {
        return id;
    }

    /**
    * Set del Id
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
    * Get del Name
     */
    public String getName() {
        return name;
    }

    /**
    * Set del Name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
    * Get del Adress
     */
    public String getAddress() {
        return address;
    }

    /**
    * Set del Adress
     */
    public void setAddress(String address) {
        this.address = address;
    }

    /**
    * Get del Extension
     */
    public Integer getExtension() {
        return extension;
    }

    /**
    * Set del Extension
     */
    public void setExtension(Integer extension) {
        this.extension = extension;
    }

    /**
    * Get del Description
     */
    public String getDescription() {
        return description;
    }

    /**
    * Set del Description
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
    * Get del Category
     */
    public Categoria getCategory() {
        return category;
    }

    /**
    * Set del Category
     */
    public void setCategory(Categoria category) {
        this.category = category;
    }

    /**
    * Get del Messages
     */
    public List<Mensaje> getMessages() {
        return messages;
    }

    /**
    * Set del Messages
     */
    public void setMessages(List<Mensaje> messages) {
        this.messages = messages;
    }

    /**
    * Get del Reservations
     */
    public List<Reservacion> getReservations() {
        return reservations;
    }

    /**
    * Set del reservations
     */
    public void setReservations(List<Reservacion> reservations) {
        this.reservations = reservations;
    }

        
    
}
