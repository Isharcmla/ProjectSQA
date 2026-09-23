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
import org.apache.commons.math.linear.MatrixIndexException;
import static org.apache.commons.math.linear.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Integer;

public class ArrayRealVector_setSubVector_65015031195 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term405;
     Object term407;
     Object term409;

    public ArrayRealVector_setSubVector_65015031195() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term405 = newInstance(Class.forName("org.apache.commons.math.linear.ArrayRealVector"));
        double[] term406 = (double[]) newDoubleArray(0);
        setField(term405, term405.getClass(), "data", term406);
        term407 = new Integer(-522618178);
        term409 = (double[]) newDoubleArray(2);
        setDoubleElement(term409, 0, 0.29874017652881824);
        setDoubleElement(term409, 1, 0.32554480512985284);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.linear.ArrayRealVector");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = int.class;
        argTypes[1] = Array.newInstance(double.class, 0).getClass();
        Object[] args = new Object[2];
        args[0] = term407;
        args[1] = term409;
        try {
            callMethod(klass, "setSubVector", argTypes, term405, args);
            assertTrue(false);
        }
        catch (MatrixIndexException e) {
        }

    }

};


