package org.apache.commons.math3.complex;

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
import static org.apache.commons.math3.complex.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import static org.apache.commons.math3.complex.EqualityUtils.*;

public class Complex_toString_181281942489 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term252;
     Object term10750;

    public Complex_toString_181281942489() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term252 = newInstance(Class.forName("org.apache.commons.math3.complex.Complex"));
        setDoubleField(term252, term252.getClass(), "imaginary", 0.9006361024877096);
        setDoubleField(term252, term252.getClass(), "real", 0.5644914462415626);
        setBooleanField(term252, term252.getClass(), "isNaN", false);
        setBooleanField(term252, term252.getClass(), "isInfinite", true);
        term10750 = newInstance(Class.forName("org.apache.commons.math3.complex.Complex"));
        setDoubleField(term10750, term10750.getClass(), "imaginary", 0.9006361024877096);
        setDoubleField(term10750, term10750.getClass(), "real", 0.5644914462415626);
        setBooleanField(term10750, term10750.getClass(), "isNaN", false);
        setBooleanField(term10750, term10750.getClass(), "isInfinite", true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math3.complex.Complex");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "toString", argTypes, term252, args);
        assertTrue(recursiveEquals(term252, term10750));
        assertTrue(recursiveEquals(retValue, "(0.5644914462415626, 0.9006361024877096)"));
    }

};


