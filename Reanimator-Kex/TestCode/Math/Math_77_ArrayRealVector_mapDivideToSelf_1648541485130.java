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
import java.lang.Double;

public class ArrayRealVector_mapDivideToSelf_1648541485130 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term166;
     Object term168;
     Object term6972;
     Object term6969;

    public ArrayRealVector_mapDivideToSelf_1648541485130() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term166 = newInstance(Class.forName("org.apache.commons.math.linear.ArrayRealVector"));
        double[] term167 = (double[]) newDoubleArray(0);
        setField(term166, term166.getClass(), "data", term167);
        term168 = new Double(0.25937345430928016);
        term6972 = newInstance(Class.forName("org.apache.commons.math.linear.ArrayRealVector"));
        double[] term6973 = (double[]) newDoubleArray(0);
        setField(term6972, term6972.getClass(), "data", term6973);
        term6969 = newInstance(Class.forName("org.apache.commons.math.linear.ArrayRealVector"));
        double[] term6970 = (double[]) newDoubleArray(0);
        setField(term6969, term6969.getClass(), "data", term6970);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.linear.ArrayRealVector");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = double.class;
        Object[] args = new Object[1];
        args[0] = term168;
        Object retValue = callMethod(klass, "mapDivideToSelf", argTypes, term166, args);
        assertTrue(recursiveEquals(term166, term6972));
        assertTrue(recursiveEquals(term168, 0.25937345430928016));
        assertTrue(recursiveEquals(retValue, term6969));
    }

};


