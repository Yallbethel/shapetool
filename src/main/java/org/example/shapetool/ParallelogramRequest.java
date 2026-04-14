package org.example.shapetool;

import jakarta.xml.bind.annotation.*;

@XmlRootElement(name = "parallelogramAreaRequest", namespace = "http://example.org/shapetool")
@XmlAccessorType(XmlAccessType.FIELD)
public class ParallelogramRequest {

    @XmlElement(namespace = "http://example.org/shapetool")
    private Double base;

    @XmlElement(namespace = "http://example.org/shapetool")
    private Double height;

    public ParallelogramRequest() {}

    public Double getBase() {
        return base;
    }

    public void setBase(Double base) {
        this.base = base;
    }

    public Double getHeight() {
        return height;
    }

    public void setHeight(Double height) {
        this.height = height;
    }
}