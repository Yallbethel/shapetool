package org.example.shapetool;

import jakarta.xml.bind.annotation.*;

@XmlRootElement(name = "rectangleAreaRequest", namespace = "http://example.org/shapetool")
@XmlAccessorType(XmlAccessType.FIELD)
public class RectangleRequest {

    @XmlElement(namespace = "http://example.org/shapetool")
    private Double length;

    @XmlElement(namespace = "http://example.org/shapetool")
    private Double width;

    public RectangleRequest() {}

    public Double getLength() {
        return length;
    }

    public void setLength(Double length) {
        this.length = length;
    }

    public Double getWidth() {
        return width;
    }

    public void setWidth(Double width) {
        this.width = width;
    }
}