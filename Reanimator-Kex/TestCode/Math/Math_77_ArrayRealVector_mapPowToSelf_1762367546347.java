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

public class ArrayRealVector_mapPowToSelf_1762367546347 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term82115;
     Object term104536;
     Object term104532;

    public ArrayRealVector_mapPowToSelf_1762367546347() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term82115 = newInstance(Class.forName("org.apache.commons.math.linear.ArrayRealVector"));
        double[] term82004 = (double[]) newDoubleArray(1);
        setField(term82115, term82115.getClass(), "data", term82004);
        term104536 = newInstance(Class.forName("org.apache.commons.math.linear.ArrayRealVector"));
        double[] term104537 = (double[]) newDoubleArray(1);
        setDoubleElement(term104537, 0, 1.0);
        setField(term104536, term104536.getClass(), "data", term104537);
        term104532 = newInstance(Class.forName("org.apache.commons.math.linear.ArrayRealVector"));
        double[] term104533 = (double[]) newDoubleArray(1);
        setDoubleElement(term104533, 0, 1.0);
        setField(term104532, term104532.getClass(), "data", term104533);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.linear.ArrayRealVector");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = double.class;
        Object[] args = new Object[1];
        args[0] = 0.0;
        Object retValue = callMethod(klass, "mapPowToSelf", argTypes, term82115, args);
        assertTrue(recursiveEquals(term82115, term104536));
        assertTrue(recursiveEquals(retValue, term104532));
    }

};


