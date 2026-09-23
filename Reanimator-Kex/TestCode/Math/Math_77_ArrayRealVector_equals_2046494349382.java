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

public class ArrayRealVector_equals_2046494349382 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term126524;
     Object term126694;
     Object term126695;

    public ArrayRealVector_equals_2046494349382() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term126524 = newInstance(Class.forName("org.apache.commons.math.linear.ArrayRealVector"));
        term126694 = newInstance(Class.forName("org.apache.commons.math.linear.ArrayRealVector"));
        setField(term126694, term126694.getClass(), "data", null);
        term126695 = newInstance(Class.forName("org.apache.commons.math.linear.ArrayRealVector"));
        setField(term126695, term126695.getClass(), "data", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.linear.ArrayRealVector");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term126524;
        Object retValue = callMethod(klass, "equals", argTypes, term126524, args);
        assertTrue(recursiveEquals(term126524, term126694));
        assertTrue(recursiveEquals(term126524, term126695));
        assertTrue(recursiveEquals(retValue, true));
    }

};


