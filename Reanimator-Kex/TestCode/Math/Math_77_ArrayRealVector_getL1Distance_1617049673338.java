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

public class ArrayRealVector_getL1Distance_1617049673338 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term80629;
     Object term80518;
     Object term102239;
     Object term102241;

    public ArrayRealVector_getL1Distance_1617049673338() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term80629 = newInstance(Class.forName("org.apache.commons.math.linear.ArrayRealVector"));
        term80518 = (double[]) newDoubleArray(0);
        setField(term80629, term80629.getClass(), "data", term80518);
        term102239 = newInstance(Class.forName("org.apache.commons.math.linear.ArrayRealVector"));
        double[] term102240 = (double[]) newDoubleArray(0);
        setField(term102239, term102239.getClass(), "data", term102240);
        term102241 = (double[]) newDoubleArray(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.linear.ArrayRealVector");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Array.newInstance(double.class, 0).getClass();
        Object[] args = new Object[1];
        args[0] = term80518;
        Object retValue = callMethod(klass, "getL1Distance", argTypes, term80629, args);
        assertTrue(recursiveEquals(term80629, term102239));
        assertTrue(recursiveEquals(term80518, term102241));
        assertTrue(recursiveEquals(retValue, 0.0));
    }

};


