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

public class ArrayRealVector_getDimension_916418677187 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term362;
     Object term16519;

    public ArrayRealVector_getDimension_916418677187() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term362 = newInstance(Class.forName("org.apache.commons.math.linear.ArrayRealVector"));
        double[] term363 = (double[]) newDoubleArray(0);
        setField(term362, term362.getClass(), "data", term363);
        term16519 = newInstance(Class.forName("org.apache.commons.math.linear.ArrayRealVector"));
        double[] term16520 = (double[]) newDoubleArray(0);
        setField(term16519, term16519.getClass(), "data", term16520);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.linear.ArrayRealVector");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "getDimension", argTypes, term362, args);
        assertTrue(recursiveEquals(term362, term16519));
        assertTrue(recursiveEquals(retValue, 0));
    }

};


