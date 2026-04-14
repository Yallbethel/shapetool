package org.example.shapetool;

import jakarta.xml.bind.annotation.*;

@XmlRootElement(name = "circleAreaResponse", namespace = "http://example.org/shapetool")
@XmlAccessorType(XmlAccessType.FIELD)
public class CircleResponse {

    @XmlElement(name = "area", namespace = "http://example.org/shapetool")
    private Double area;

    public CircleResponse() {}

    public Double getArea() {
        return area;
    }

    public void setArea(Double area) {
        this.area = area;
    }
}