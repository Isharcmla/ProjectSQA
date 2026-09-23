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

public class ArrayRealVector_mapCoshToSelf_1868732714332 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term77689;
     Object term98267;
     Object term98264;

    public ArrayRealVector_mapCoshToSelf_1868732714332() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term77689 = newInstance(Class.forName("org.apache.commons.math.linear.ArrayRealVector"));
        double[] term77578 = (double[]) newDoubleArray(1);
        setField(term77689, term77689.getClass(), "data", term77578);
        term98267 = newInstance(Class.forName("org.apache.commons.math.linear.ArrayRealVector"));
        double[] term98268 = (double[]) newDoubleArray(1);
        setDoubleElement(term98268, 0, 1.0);
        setField(term98267, term98267.getClass(), "data", term98268);
        term98264 = newInstance(Class.forName("org.apache.commons.math.linear.ArrayRealVector"));
        double[] term98265 = (double[]) newDoubleArray(1);
        setDoubleElement(term98265, 0, 1.0);
        setField(term98264, term98264.getClass(), "data", term98265);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.linear.ArrayRealVector");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "mapCoshToSelf", argTypes, term77689, args);
        assertTrue(recursiveEquals(term77689, term98267));
        assertTrue(recursiveEquals(retValue, term98264));
    }

};


