package guru.springframework.spring6webapp.domain;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import java.util.Objects;

@Entity
public class Publisher {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String publisherName;
    private String adress;
    private String city;
    private String state;
    private String zip;

    public Long getId() {
        return id;
    }

    public Publisher setId(Long id) {
        this.id = id;
        return this;
    }

    public String getPublisherName() {
        return publisherName;
    }

    public Publisher setPublisherName(String publisherName) {
        this.publisherName = publisherName;
        return this;
    }

    public String getAdress() {
        return adress;
    }

    public Publisher setAdress(String adress) {
        this.adress = adress;
        return this;
    }

    public String getCity() {
        return city;
    }

    public Publisher setCity(String city) {
        this.city = city;
        return this;
    }

    public String getState() {
        return state;
    }

    public Publisher setState(String state) {
        this.state = state;
        return this;
    }

    public String getZip() {
        return zip;
    }

    public Publisher setZip(String zip) {
        this.zip = zip;
        return this;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Publisher publisher)) return false;

        return Objects.equals(id, publisher.id);
    }

    @Override
    public int hashCode() {
        return id != null ? id.hashCode() : 0;
    }

    @Override
    public String toString() {
        return "Publisher{" +
                "id=" + id +
                ", publisherName='" + publisherName + '\'' +
                ", adress='" + adress + '\'' +
                ", city='" + city + '\'' +
                ", state='" + state + '\'' +
                ", zip='" + zip + '\'' +
                '}';
    }
}
