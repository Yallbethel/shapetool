package org.example.shapetool;

import jakarta.xml.bind.annotation.*;

@XmlRootElement(name = "rectangleAreaResponse", namespace = "http://example.org/shapetool")
@XmlAccessorType(XmlAccessType.FIELD)
public class RectangleResponse {

    @XmlElement(namespace = "http://example.org/shapetool")
    private Double area;

    public RectangleResponse() {}

    public Double getArea() {
        return area;
    }

    public void setArea(Double area) {
        this.area = area;
    }
}