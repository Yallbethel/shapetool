package org.example.shapetool;

import org.springframework.ws.server.endpoint.annotation.*;

@Endpoint
public class ShapeEndpoint {

    private static final String NAMESPACE_URI = "http://example.org/shapetool";

    // ===================== CIRCLE =====================
    @PayloadRoot(namespace = NAMESPACE_URI, localPart = "circleAreaRequest")
    @ResponsePayload
    public CircleResponse circleArea(@RequestPayload CircleRequest request) {

        Double r = request.getRadius();

        if (r == null) {
            throw new ShapeValidationException("Circle error: radius is required");
        }

        if (r <= 0) {
            throw new ShapeValidationException("Circle error: radius must be greater than 0");
        }

        CircleResponse response = new CircleResponse();
        response.setArea(Math.PI * r * r);

        return response;
    }

    // ===================== RECTANGLE =====================
    @PayloadRoot(namespace = NAMESPACE_URI, localPart = "rectangleAreaRequest")
    @ResponsePayload
    public RectangleResponse rectangleArea(@RequestPayload RectangleRequest request) {

        Double l = request.getLength();
        Double w = request.getWidth();

        if (l == null) {
            throw new ShapeValidationException("Rectangle error: length is required");
        }

        if (w == null) {
            throw new ShapeValidationException("Rectangle error: width is required");
        }

        if (l <= 0) {
            throw new ShapeValidationException("Rectangle error: length must be greater than 0");
        }

        if (w <= 0) {
            throw new ShapeValidationException("Rectangle error: width must be greater than 0");
        }

        RectangleResponse response = new RectangleResponse();
        response.setArea(l * w);

        return response;
    }

    // ===================== SQUARE =====================
    @PayloadRoot(namespace = NAMESPACE_URI, localPart = "squareAreaRequest")
    @ResponsePayload
    public SquareResponse squareArea(@RequestPayload SquareRequest request) {

        Double s = request.getSide();

        if (s == null) {
            throw new ShapeValidationException("Square error: side is required");
        }

        if (s <= 0) {
            throw new ShapeValidationException("Square error: side must be greater than 0");
        }

        SquareResponse response = new SquareResponse();
        response.setArea(s * s);

        return response;
    }

    // ===================== TRIANGLE =====================
    @PayloadRoot(namespace = NAMESPACE_URI, localPart = "triangleAreaRequest")
    @ResponsePayload
    public TriangleResponse triangleArea(@RequestPayload TriangleRequest request) {

        Double b = request.getBase();
        Double h = request.getHeight();

        if (b == null) {
            throw new ShapeValidationException("Triangle error: base is required");
        }

        if (h == null) {
            throw new ShapeValidationException("Triangle error: height is required");
        }

        if (b <= 0) {
            throw new ShapeValidationException("Triangle error: base must be greater than 0");
        }

        if (h <= 0) {
            throw new ShapeValidationException("Triangle error: height must be greater than 0");
        }

        TriangleResponse response = new TriangleResponse();
        response.setArea(0.5 * b * h);

        return response;
    }

    // ===================== PARALLELOGRAM =====================
    @PayloadRoot(namespace = NAMESPACE_URI, localPart = "parallelogramAreaRequest")
    @ResponsePayload
    public ParallelogramResponse parallelogramArea(@RequestPayload ParallelogramRequest request) {

        Double b = request.getBase();
        Double h = request.getHeight();

        if (b == null) {
            throw new ShapeValidationException("Parallelogram error: base is required");
        }

        if (h == null) {
            throw new ShapeValidationException("Parallelogram error: height is required");
        }

        if (b <= 0) {
            throw new ShapeValidationException("Parallelogram error: base must be greater than 0");
        }

        if (h <= 0) {
            throw new ShapeValidationException("Parallelogram error: height must be greater than 0");
        }

        ParallelogramResponse response = new ParallelogramResponse();
        response.setArea(b * h);

        return response;
    }
}