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

public class ArrayRealVector_getLInfDistance_1311291390177 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term312;
     Object term314;
     Object term12823;
     Object term12825;

    public ArrayRealVector_getLInfDistance_1311291390177() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term312 = newInstance(Class.forName("org.apache.commons.math.linear.ArrayRealVector"));
        double[] term313 = (double[]) newDoubleArray(0);
        setField(term312, term312.getClass(), "data", term313);
        term314 = newInstance(Class.forName("org.apache.commons.math.linear.ArrayRealVector"));
        double[] term315 = (double[]) newDoubleArray(0);
        setField(term314, term314.getClass(), "data", term315);
        term12823 = newInstance(Class.forName("org.apache.commons.math.linear.ArrayRealVector"));
        double[] term12824 = (double[]) newDoubleArray(0);
        setField(term12823, term12823.getClass(), "data", term12824);
        term12825 = newInstance(Class.forName("org.apache.commons.math.linear.ArrayRealVector"));
        double[] term12826 = (double[]) newDoubleArray(0);
        setField(term12825, term12825.getClass(), "data", term12826);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.linear.ArrayRealVector");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.apache.commons.math.linear.ArrayRealVector");
        Object[] args = new Object[1];
        args[0] = term314;
        Object retValue = callMethod(klass, "getLInfDistance", argTypes, term312, args);
        assertTrue(recursiveEquals(term312, term12823));
        assertTrue(recursiveEquals(term314, term12825));
        assertTrue(recursiveEquals(retValue, 0.0));
    }

};


