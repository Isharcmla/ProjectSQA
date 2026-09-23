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

public class Complex_negate_913636225128 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term22444;
     Object term22468;
     Object term22463;

    public Complex_negate_913636225128() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term22444 = newInstance(Class.forName("org.apache.commons.math.complex.Complex"));
        setBooleanField(term22444, term22444.getClass(), "isNaN", false);
        term22468 = newInstance(Class.forName("org.apache.commons.math.complex.Complex"));
        setDoubleField(term22468, term22468.getClass(), "imaginary", 0.0);
        setDoubleField(term22468, term22468.getClass(), "real", 0.0);
        setBooleanField(term22468, term22468.getClass(), "isNaN", false);
        setBooleanField(term22468, term22468.getClass(), "isInfinite", false);
        term22463 = newInstance(Class.forName("org.apache.commons.math.complex.Complex"));
        setDoubleField(term22463, term22463.getClass(), "imaginary", -0.0);
        setDoubleField(term22463, term22463.getClass(), "real", -0.0);
        setBooleanField(term22463, term22463.getClass(), "isNaN", false);
        setBooleanField(term22463, term22463.getClass(), "isInfinite", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.complex.Complex");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "negate", argTypes, term22444, args);
        assertTrue(recursiveEquals(term22444, term22468));
        assertTrue(recursiveEquals(retValue, term22463));
    }

};


