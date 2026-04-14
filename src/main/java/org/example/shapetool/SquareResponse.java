package org.example.shapetool;

import jakarta.xml.bind.annotation.*;

@XmlRootElement(name = "squareAreaResponse", namespace = "http://example.org/shapetool")
@XmlAccessorType(XmlAccessType.FIELD)
public class SquareResponse {

    @XmlElement(namespace = "http://example.org/shapetool")
    private Double area;

    public SquareResponse() {}

    public Double getArea() {
        return area;
    }

    public void setArea(Double area) {
        this.area = area;
    }
}