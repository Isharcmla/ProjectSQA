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

public class ArrayRealVector_outerProduct_151497739982 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term339;
     Object term341;

    public ArrayRealVector_outerProduct_151497739982() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term339 = newInstance(Class.forName("org.apache.commons.math.linear.ArrayRealVector"));
        double[] term340 = (double[]) newDoubleArray(0);
        setField(term339, term339.getClass(), "data", term340);
        term341 = (double[]) newDoubleArray(8);
        setDoubleElement(term341, 0, 0.11179067076100713);
        setDoubleElement(term341, 1, 0.5306473989087822);
        setDoubleElement(term341, 2, 0.022483645678509023);
        setDoubleElement(term341, 3, 0.025133051616627267);
        setDoubleElement(term341, 4, 0.016575281023182953);
        setDoubleElement(term341, 5, 0.5308350402051779);
        setDoubleElement(term341, 6, 0.7154795600170818);
        setDoubleElement(term341, 7, 0.6355029654528058);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.linear.ArrayRealVector");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Array.newInstance(double.class, 0).getClass();
        Object[] args = new Object[1];
        args[0] = term341;
        callMethod(klass, "outerProduct", argTypes, term339, args);
    }

};


