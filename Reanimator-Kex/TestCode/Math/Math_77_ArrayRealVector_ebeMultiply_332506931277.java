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

public class ArrayRealVector_ebeMultiply_332506931277 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term69354;
     Object term69452;
     Object term69783;
     Object term69785;
     Object term69763;

    public ArrayRealVector_ebeMultiply_332506931277() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term69354 = newInstance(Class.forName("org.apache.commons.math.linear.ArrayRealVector"));
        double[] term69174 = (double[]) newDoubleArray(8);
        setField(term69354, term69354.getClass(), "data", term69174);
        term69452 = newInstance(Class.forName("org.apache.commons.math.linear.ArrayRealVector"));
        setField(term69452, term69452.getClass(), "data", term69174);
        term69783 = newInstance(Class.forName("org.apache.commons.math.linear.ArrayRealVector"));
        double[] term69784 = (double[]) newDoubleArray(8);
        setField(term69783, term69783.getClass(), "data", term69784);
        term69785 = newInstance(Class.forName("org.apache.commons.math.linear.ArrayRealVector"));
        double[] term69786 = (double[]) newDoubleArray(8);
        setField(term69785, term69785.getClass(), "data", term69786);
        term69763 = newInstance(Class.forName("org.apache.commons.math.linear.ArrayRealVector"));
        double[] term69764 = (double[]) newDoubleArray(8);
        setField(term69763, term69763.getClass(), "data", term69764);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.linear.ArrayRealVector");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.apache.commons.math.linear.ArrayRealVector");
        Object[] args = new Object[1];
        args[0] = term69452;
        Object retValue = callMethod(klass, "ebeMultiply", argTypes, term69354, args);
        assertTrue(recursiveEquals(term69354, term69783));
        assertTrue(recursiveEquals(term69452, term69785));
        assertTrue(recursiveEquals(retValue, term69763));
    }

};


