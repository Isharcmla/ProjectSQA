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
import static org.apache.commons.math.linear.EqualityUtils.*;

public class ArrayRealVector_getLInfDistance_1559050439352 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term84199;
     Object term82615;
     Object term106294;
     Object term106296;

    public ArrayRealVector_getLInfDistance_1559050439352() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term84199 = newInstance(Class.forName("org.apache.commons.math.linear.ArrayRealVector"));
        term82615 = (double[]) newDoubleArray(489);
        setField(term84199, term84199.getClass(), "data", term82615);
        term106294 = newInstance(Class.forName("org.apache.commons.math.linear.ArrayRealVector"));
        double[] term106295 = (double[]) newDoubleArray(489);
        setField(term106294, term106294.getClass(), "data", term106295);
        term106296 = (double[]) newDoubleArray(489);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.linear.ArrayRealVector");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Array.newInstance(double.class, 0).getClass();
        Object[] args = new Object[1];
        args[0] = term82615;
        callMethod(klass, "getLInfDistance", argTypes, term84199, args);
        assertTrue(recursiveEquals(term84199, term106294));
        assertTrue(recursiveEquals(term82615, term106296));
    }

};


