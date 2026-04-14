package org.example.shapetool;

import jakarta.xml.bind.annotation.*;

@XmlRootElement(name = "parallelogramAreaResponse", namespace = "http://example.org/shapetool")
@XmlAccessorType(XmlAccessType.FIELD)
public class ParallelogramResponse {

    @XmlElement(namespace = "http://example.org/shapetool")
    private Double area;

    public ParallelogramResponse() {}

    public Double getArea() {
        return area;
    }

    public void setArea(Double area) {
        this.area = area;
    }
}