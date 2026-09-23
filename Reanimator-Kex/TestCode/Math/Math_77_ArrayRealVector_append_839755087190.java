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

public class ArrayRealVector_append_839755087190 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term370;
     Object term372;
     Object term16792;
     Object term16780;

    public ArrayRealVector_append_839755087190() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term370 = newInstance(Class.forName("org.apache.commons.math.linear.ArrayRealVector"));
        double[] term371 = (double[]) newDoubleArray(0);
        setField(term370, term370.getClass(), "data", term371);
        term372 = new Double(0.0022646783892913414);
        term16792 = newInstance(Class.forName("org.apache.commons.math.linear.ArrayRealVector"));
        double[] term16793 = (double[]) newDoubleArray(0);
        setField(term16792, term16792.getClass(), "data", term16793);
        term16780 = newInstance(Class.forName("org.apache.commons.math.linear.ArrayRealVector"));
        double[] term16781 = (double[]) newDoubleArray(1);
        setDoubleElement(term16781, 0, 0.0022646783892913414);
        setField(term16780, term16780.getClass(), "data", term16781);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.linear.ArrayRealVector");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = double.class;
        Object[] args = new Object[1];
        args[0] = term372;
        Object retValue = callMethod(klass, "append", argTypes, term370, args);
        assertTrue(recursiveEquals(term370, term16792));
        assertTrue(recursiveEquals(term372, 0.0022646783892913414));
        assertTrue(recursiveEquals(retValue, term16780));
    }

};


