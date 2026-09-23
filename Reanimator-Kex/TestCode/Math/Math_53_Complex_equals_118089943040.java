package org.apache.commons.math.complex;

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
import static org.apache.commons.math.complex.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import static org.apache.commons.math.complex.EqualityUtils.*;

public class Complex_equals_118089943040 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term35;
     Object term40;
     Object term363;
     Object term364;

    public Complex_equals_118089943040() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term35 = newInstance(Class.forName("org.apache.commons.math.complex.Complex"));
        setDoubleField(term35, term35.getClass(), "imaginary", 0.7031006357544823);
        setDoubleField(term35, term35.getClass(), "real", 0.9527281779865117);
        setBooleanField(term35, term35.getClass(), "isNaN", false);
        setBooleanField(term35, term35.getClass(), "isInfinite", true);
        term40 = newInstance(Class.forName("java.lang.Object"));
        term363 = newInstance(Class.forName("org.apache.commons.math.complex.Complex"));
        setDoubleField(term363, term363.getClass(), "imaginary", 0.7031006357544823);
        setDoubleField(term363, term363.getClass(), "real", 0.9527281779865117);
        setBooleanField(term363, term363.getClass(), "isNaN", false);
        setBooleanField(term363, term363.getClass(), "isInfinite", true);
        term364 = newInstance(Class.forName("java.lang.Object"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.complex.Complex");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term40;
        Object retValue = callMethod(klass, "equals", argTypes, term35, args);
        assertTrue(recursiveEquals(term35, term363));
        assertTrue(recursiveEquals(term40, term364));
        assertTrue(recursiveEquals(retValue, false));
    }

};


