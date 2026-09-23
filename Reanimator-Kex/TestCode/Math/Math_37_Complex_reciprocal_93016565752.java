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

public class Complex_reciprocal_93016565752 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term51;
     Object term468;
     Object term458;

    public Complex_reciprocal_93016565752() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term51 = newInstance(Class.forName("org.apache.commons.math.complex.Complex"));
        setDoubleField(term51, term51.getClass(), "imaginary", 0.8598297828918529);
        setDoubleField(term51, term51.getClass(), "real", 0.43692187681405226);
        setBooleanField(term51, term51.getClass(), "isNaN", true);
        setBooleanField(term51, term51.getClass(), "isInfinite", true);
        term468 = newInstance(Class.forName("org.apache.commons.math.complex.Complex"));
        setDoubleField(term468, term468.getClass(), "imaginary", 0.8598297828918529);
        setDoubleField(term468, term468.getClass(), "real", 0.43692187681405226);
        setBooleanField(term468, term468.getClass(), "isNaN", true);
        setBooleanField(term468, term468.getClass(), "isInfinite", true);
        term458 = newInstance(Class.forName("org.apache.commons.math.complex.Complex"));
        setDoubleField(term458, term458.getClass(), "imaginary", Double.NaN);
        setDoubleField(term458, term458.getClass(), "real", Double.NaN);
        setBooleanField(term458, term458.getClass(), "isNaN", true);
        setBooleanField(term458, term458.getClass(), "isInfinite", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.complex.Complex");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "reciprocal", argTypes, term51, args);
        assertTrue(recursiveEquals(term51, term468));
        assertTrue(recursiveEquals(retValue, term458));
    }

};


