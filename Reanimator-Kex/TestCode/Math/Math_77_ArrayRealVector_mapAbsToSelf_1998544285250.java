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

public class ArrayRealVector_mapAbsToSelf_1998544285250 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term47776;
     Object term47897;
     Object term47894;

    public ArrayRealVector_mapAbsToSelf_1998544285250() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term47776 = newInstance(Class.forName("org.apache.commons.math.linear.ArrayRealVector"));
        double[] term47665 = (double[]) newDoubleArray(1);
        setField(term47776, term47776.getClass(), "data", term47665);
        term47897 = newInstance(Class.forName("org.apache.commons.math.linear.ArrayRealVector"));
        double[] term47898 = (double[]) newDoubleArray(1);
        setField(term47897, term47897.getClass(), "data", term47898);
        term47894 = newInstance(Class.forName("org.apache.commons.math.linear.ArrayRealVector"));
        double[] term47895 = (double[]) newDoubleArray(1);
        setField(term47894, term47894.getClass(), "data", term47895);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.linear.ArrayRealVector");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "mapAbsToSelf", argTypes, term47776, args);
        assertTrue(recursiveEquals(term47776, term47897));
        assertTrue(recursiveEquals(retValue, term47894));
    }

};


