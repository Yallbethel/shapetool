package org.example.shapetool;

import jakarta.xml.bind.annotation.*;

@XmlRootElement(name = "squareAreaRequest", namespace = "http://example.org/shapetool")
@XmlAccessorType(XmlAccessType.FIELD)
public class SquareRequest {

    @XmlElement(namespace = "http://example.org/shapetool")
    private Double side;

    public SquareRequest() {}

    public Double getSide() {
        return side;
    }

    public void setSide(Double side) {
        this.side = side;
    }
}