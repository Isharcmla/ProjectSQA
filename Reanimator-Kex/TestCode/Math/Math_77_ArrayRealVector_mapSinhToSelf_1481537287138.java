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

public class ArrayRealVector_mapSinhToSelf_1481537287138 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term186;
     Object term7013;
     Object term7011;

    public ArrayRealVector_mapSinhToSelf_1481537287138() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term186 = newInstance(Class.forName("org.apache.commons.math.linear.ArrayRealVector"));
        double[] term187 = (double[]) newDoubleArray(0);
        setField(term186, term186.getClass(), "data", term187);
        term7013 = newInstance(Class.forName("org.apache.commons.math.linear.ArrayRealVector"));
        double[] term7014 = (double[]) newDoubleArray(0);
        setField(term7013, term7013.getClass(), "data", term7014);
        term7011 = newInstance(Class.forName("org.apache.commons.math.linear.ArrayRealVector"));
        double[] term7012 = (double[]) newDoubleArray(0);
        setField(term7011, term7011.getClass(), "data", term7012);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.linear.ArrayRealVector");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "mapSinhToSelf", argTypes, term186, args);
        assertTrue(recursiveEquals(term186, term7013));
        assertTrue(recursiveEquals(retValue, term7011));
    }

};


