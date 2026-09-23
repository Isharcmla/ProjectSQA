package org.apache.commons.math.linear;

import java.lang.Throwable;
import java.lang.IllegalStateException;
import org.junit.Test;
import org.junit.Rule;
import org.junit.rules.Timeout;
import java.util.concurrent.TimeUnit;
import org.junit.Before;
import java.lang.Class;
import java.lang.reflect.Method;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.stream.Stream;
import java.util.stream.Collectors;
import static org.apache.commons.math.linear.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class ArrayRealVector_subtract_193163669322 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term135;
     Object term137;

    public ArrayRealVector_subtract_193163669322() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term135 = newInstance(Class.forName("org.apache.commons.math.linear.ArrayRealVector"));
        double[] term136 = (double[]) newDoubleArray(0);
        setField(term135, term135.getClass(), "data", term136);
        term137 = (double[]) newDoubleArray(6);
        setDoubleElement(term137, 0, 0.0668892744806211);
        setDoubleElement(term137, 1, 0.3587267442738795);
        setDoubleElement(term137, 2, 0.07802449704920456);
        setDoubleElement(term137, 3, 0.5279279537140873);
        setDoubleElement(term137, 4, 0.3202192021706908);
        setDoubleElement(term137, 5, 0.22651340641904605);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.linear.ArrayRealVector");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Array.newInstance(double.class, 0).getClass();
        Object[] args = new Object[1];
        args[0] = term137;
        callMethod(klass, "subtract", argTypes, term135, args);
    }

};


