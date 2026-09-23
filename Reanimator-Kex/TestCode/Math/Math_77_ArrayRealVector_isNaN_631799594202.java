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

public class ArrayRealVector_isNaN_631799594202 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term434;
     Object term20829;

    public ArrayRealVector_isNaN_631799594202() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term434 = newInstance(Class.forName("org.apache.commons.math.linear.ArrayRealVector"));
        double[] term435 = (double[]) newDoubleArray(0);
        setField(term434, term434.getClass(), "data", term435);
        term20829 = newInstance(Class.forName("org.apache.commons.math.linear.ArrayRealVector"));
        double[] term20830 = (double[]) newDoubleArray(0);
        setField(term20829, term20829.getClass(), "data", term20830);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.linear.ArrayRealVector");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "isNaN", argTypes, term434, args);
        assertTrue(recursiveEquals(term434, term20829));
        assertTrue(recursiveEquals(retValue, false));
    }

};


