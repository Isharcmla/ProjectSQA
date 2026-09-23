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

public class ArrayRealVector_dotProduct_369867644165 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term271;
     Object term273;
     Object term10802;
     Object term10804;

    public ArrayRealVector_dotProduct_369867644165() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term271 = newInstance(Class.forName("org.apache.commons.math.linear.ArrayRealVector"));
        double[] term272 = (double[]) newDoubleArray(0);
        setField(term271, term271.getClass(), "data", term272);
        term273 = newInstance(Class.forName("org.apache.commons.math.linear.ArrayRealVector"));
        double[] term274 = (double[]) newDoubleArray(0);
        setField(term273, term273.getClass(), "data", term274);
        term10802 = newInstance(Class.forName("org.apache.commons.math.linear.ArrayRealVector"));
        double[] term10803 = (double[]) newDoubleArray(0);
        setField(term10802, term10802.getClass(), "data", term10803);
        term10804 = newInstance(Class.forName("org.apache.commons.math.linear.ArrayRealVector"));
        double[] term10805 = (double[]) newDoubleArray(0);
        setField(term10804, term10804.getClass(), "data", term10805);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.linear.ArrayRealVector");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.apache.commons.math.linear.ArrayRealVector");
        Object[] args = new Object[1];
        args[0] = term273;
        Object retValue = callMethod(klass, "dotProduct", argTypes, term271, args);
        assertTrue(recursiveEquals(term271, term10802));
        assertTrue(recursiveEquals(term273, term10804));
        assertTrue(recursiveEquals(retValue, 0.0));
    }

};


