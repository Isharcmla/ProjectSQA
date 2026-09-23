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

public class Complex_asin_141596874644 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term60;
     Object term1111;
     Object term1108;

    public Complex_asin_141596874644() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term60 = newInstance(Class.forName("org.apache.commons.math.complex.Complex"));
        setDoubleField(term60, term60.getClass(), "imaginary", 0.5279279537140873);
        setDoubleField(term60, term60.getClass(), "real", 0.3202192021706908);
        term1111 = newInstance(Class.forName("org.apache.commons.math.complex.Complex"));
        setDoubleField(term1111, term1111.getClass(), "imaginary", 0.5279279537140873);
        setDoubleField(term1111, term1111.getClass(), "real", 0.3202192021706908);
        term1108 = newInstance(Class.forName("org.apache.commons.math.complex.Complex"));
        setDoubleField(term1108, term1108.getClass(), "imaginary", 0.5254995017345234);
        setDoubleField(term1108, term1108.getClass(), "real", 0.2843968526224523);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.complex.Complex");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "asin", argTypes, term60, args);
        assertTrue(recursiveEquals(term60, term1111));
        assertTrue(recursiveEquals(retValue, term1108));
    }

};


