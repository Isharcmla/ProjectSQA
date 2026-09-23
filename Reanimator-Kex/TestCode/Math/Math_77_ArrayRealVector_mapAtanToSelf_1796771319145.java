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

public class ArrayRealVector_mapAtanToSelf_1796771319145 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term200;
     Object term7048;
     Object term7046;

    public ArrayRealVector_mapAtanToSelf_1796771319145() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term200 = newInstance(Class.forName("org.apache.commons.math.linear.ArrayRealVector"));
        double[] term201 = (double[]) newDoubleArray(0);
        setField(term200, term200.getClass(), "data", term201);
        term7048 = newInstance(Class.forName("org.apache.commons.math.linear.ArrayRealVector"));
        double[] term7049 = (double[]) newDoubleArray(0);
        setField(term7048, term7048.getClass(), "data", term7049);
        term7046 = newInstance(Class.forName("org.apache.commons.math.linear.ArrayRealVector"));
        double[] term7047 = (double[]) newDoubleArray(0);
        setField(term7046, term7046.getClass(), "data", term7047);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.linear.ArrayRealVector");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "mapAtanToSelf", argTypes, term200, args);
        assertTrue(recursiveEquals(term200, term7048));
        assertTrue(recursiveEquals(retValue, term7046));
    }

};


