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
import java.lang.Double;

public class Complex_sin_10197090358 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term143;
     Object term2307;
     Object term2297;

    public Complex_sin_10197090358() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term143 = newInstance(Class.forName("org.apache.commons.math.complex.Complex"));
        setDoubleField(term143, term143.getClass(), "imaginary", 0.20737514139742264);
        setDoubleField(term143, term143.getClass(), "real", 0.7919370314903882);
        setBooleanField(term143, term143.getClass(), "isNaN", true);
        setBooleanField(term143, term143.getClass(), "isInfinite", false);
        term2307 = newInstance(Class.forName("org.apache.commons.math.complex.Complex"));
        setDoubleField(term2307, term2307.getClass(), "imaginary", 0.20737514139742264);
        setDoubleField(term2307, term2307.getClass(), "real", 0.7919370314903882);
        setBooleanField(term2307, term2307.getClass(), "isNaN", true);
        setBooleanField(term2307, term2307.getClass(), "isInfinite", false);
        term2297 = newInstance(Class.forName("org.apache.commons.math.complex.Complex"));
        setDoubleField(term2297, term2297.getClass(), "imaginary", Double.NaN);
        setDoubleField(term2297, term2297.getClass(), "real", Double.NaN);
        setBooleanField(term2297, term2297.getClass(), "isNaN", true);
        setBooleanField(term2297, term2297.getClass(), "isInfinite", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.complex.Complex");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "sin", argTypes, term143, args);
        assertTrue(recursiveEquals(term143, term2307));
        assertTrue(recursiveEquals(retValue, term2297));
    }

};


