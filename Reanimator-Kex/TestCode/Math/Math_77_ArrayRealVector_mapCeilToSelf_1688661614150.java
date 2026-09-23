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

public class ArrayRealVector_mapCeilToSelf_1688661614150 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term210;
     Object term7073;
     Object term7071;

    public ArrayRealVector_mapCeilToSelf_1688661614150() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term210 = newInstance(Class.forName("org.apache.commons.math.linear.ArrayRealVector"));
        double[] term211 = (double[]) newDoubleArray(0);
        setField(term210, term210.getClass(), "data", term211);
        term7073 = newInstance(Class.forName("org.apache.commons.math.linear.ArrayRealVector"));
        double[] term7074 = (double[]) newDoubleArray(0);
        setField(term7073, term7073.getClass(), "data", term7074);
        term7071 = newInstance(Class.forName("org.apache.commons.math.linear.ArrayRealVector"));
        double[] term7072 = (double[]) newDoubleArray(0);
        setField(term7071, term7071.getClass(), "data", term7072);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.linear.ArrayRealVector");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "mapCeilToSelf", argTypes, term210, args);
        assertTrue(recursiveEquals(term210, term7073));
        assertTrue(recursiveEquals(retValue, term7071));
    }

};


