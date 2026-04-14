package org.example.shapetool;

import jakarta.xml.bind.annotation.*;

@XmlRootElement(name = "triangleAreaResponse", namespace = "http://example.org/shapetool")
@XmlAccessorType(XmlAccessType.FIELD)
public class TriangleResponse {

    @XmlElement(namespace = "http://example.org/shapetool")
    private Double area;

    public TriangleResponse() {}

    public Double getArea() {
        return area;
    }

    public void setArea(Double area) {
        this.area = area;
    }
}