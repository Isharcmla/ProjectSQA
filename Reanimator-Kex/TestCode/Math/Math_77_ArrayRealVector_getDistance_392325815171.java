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

public class ArrayRealVector_getDistance_392325815171 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term292;
     Object term294;
     Object term11686;
     Object term11688;

    public ArrayRealVector_getDistance_392325815171() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term292 = newInstance(Class.forName("org.apache.commons.math.linear.ArrayRealVector"));
        double[] term293 = (double[]) newDoubleArray(0);
        setField(term292, term292.getClass(), "data", term293);
        term294 = newInstance(Class.forName("org.apache.commons.math.linear.ArrayRealVector"));
        double[] term295 = (double[]) newDoubleArray(0);
        setField(term294, term294.getClass(), "data", term295);
        term11686 = newInstance(Class.forName("org.apache.commons.math.linear.ArrayRealVector"));
        double[] term11687 = (double[]) newDoubleArray(0);
        setField(term11686, term11686.getClass(), "data", term11687);
        term11688 = newInstance(Class.forName("org.apache.commons.math.linear.ArrayRealVector"));
        double[] term11689 = (double[]) newDoubleArray(0);
        setField(term11688, term11688.getClass(), "data", term11689);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.linear.ArrayRealVector");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.apache.commons.math.linear.ArrayRealVector");
        Object[] args = new Object[1];
        args[0] = term294;
        Object retValue = callMethod(klass, "getDistance", argTypes, term292, args);
        assertTrue(recursiveEquals(term292, term11686));
        assertTrue(recursiveEquals(term294, term11688));
        assertTrue(recursiveEquals(retValue, 0.0));
    }

};


