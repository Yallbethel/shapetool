package org.example.shapetool;

import jakarta.xml.bind.annotation.*;
@XmlRootElement(name = "circleAreaRequest", namespace = "http://example.org/shapetool")
@XmlAccessorType(XmlAccessType.FIELD)
public class CircleRequest {

    @XmlElement(name = "radius", namespace = "http://example.org/shapetool")
    private Double radius;

    public CircleRequest() {}

    public Double getRadius() {
        return radius;
    }

    public void setRadius(Double radius) {
        this.radius = radius;
    }
}