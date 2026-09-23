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

public class ArrayRealVector_mapDivideToSelf_1648541485231 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term29447;
     Object term35547;
     Object term35543;

    public ArrayRealVector_mapDivideToSelf_1648541485231() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term29447 = newInstance(Class.forName("org.apache.commons.math.linear.ArrayRealVector"));
        double[] term29336 = (double[]) newDoubleArray(1);
        setField(term29447, term29447.getClass(), "data", term29336);
        term35547 = newInstance(Class.forName("org.apache.commons.math.linear.ArrayRealVector"));
        double[] term35548 = (double[]) newDoubleArray(1);
        setDoubleElement(term35548, 0, Double.NaN);
        setField(term35547, term35547.getClass(), "data", term35548);
        term35543 = newInstance(Class.forName("org.apache.commons.math.linear.ArrayRealVector"));
        double[] term35544 = (double[]) newDoubleArray(1);
        setDoubleElement(term35544, 0, Double.NaN);
        setField(term35543, term35543.getClass(), "data", term35544);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.linear.ArrayRealVector");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = double.class;
        Object[] args = new Object[1];
        args[0] = 0.0;
        Object retValue = callMethod(klass, "mapDivideToSelf", argTypes, term29447, args);
        assertTrue(recursiveEquals(term29447, term35547));
        assertTrue(recursiveEquals(retValue, term35543));
    }

};


