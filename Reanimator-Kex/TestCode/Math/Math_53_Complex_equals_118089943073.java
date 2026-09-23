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

public class Complex_equals_118089943073 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4262;
     Object term4270;
     Object term4271;

    public Complex_equals_118089943073() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term4262 = newInstance(Class.forName("org.apache.commons.math.complex.Complex"));
        term4270 = newInstance(Class.forName("org.apache.commons.math.complex.Complex"));
        setDoubleField(term4270, term4270.getClass(), "imaginary", 0.0);
        setDoubleField(term4270, term4270.getClass(), "real", 0.0);
        setBooleanField(term4270, term4270.getClass(), "isNaN", false);
        setBooleanField(term4270, term4270.getClass(), "isInfinite", false);
        term4271 = newInstance(Class.forName("org.apache.commons.math.complex.Complex"));
        setDoubleField(term4271, term4271.getClass(), "imaginary", 0.0);
        setDoubleField(term4271, term4271.getClass(), "real", 0.0);
        setBooleanField(term4271, term4271.getClass(), "isNaN", false);
        setBooleanField(term4271, term4271.getClass(), "isInfinite", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.complex.Complex");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term4262;
        Object retValue = callMethod(klass, "equals", argTypes, term4262, args);
        assertTrue(recursiveEquals(term4262, term4270));
        assertTrue(recursiveEquals(term4262, term4271));
        assertTrue(recursiveEquals(retValue, true));
    }

};


