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

public class ArrayRealVector_equals_2046494349204 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term438;
     Object term440;
     Object term20849;
     Object term20851;

    public ArrayRealVector_equals_2046494349204() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term438 = newInstance(Class.forName("org.apache.commons.math.linear.ArrayRealVector"));
        double[] term439 = (double[]) newDoubleArray(0);
        setField(term438, term438.getClass(), "data", term439);
        term440 = newInstance(Class.forName("java.lang.Object"));
        term20849 = newInstance(Class.forName("org.apache.commons.math.linear.ArrayRealVector"));
        double[] term20850 = (double[]) newDoubleArray(0);
        setField(term20849, term20849.getClass(), "data", term20850);
        term20851 = newInstance(Class.forName("java.lang.Object"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.linear.ArrayRealVector");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term440;
        Object retValue = callMethod(klass, "equals", argTypes, term438, args);
        assertTrue(recursiveEquals(term438, term20849));
        assertTrue(recursiveEquals(term440, term20851));
        assertTrue(recursiveEquals(retValue, false));
    }

};


