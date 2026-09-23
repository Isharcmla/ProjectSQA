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

public class Complex_asin_1415968746396 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term95911;
     Object term96628;
     Object term96625;

    public Complex_asin_1415968746396() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term95911 = newInstance(Class.forName("org.apache.commons.math.complex.Complex"));
        setDoubleField(term95911, term95911.getClass(), "real", 7.2057594037936128E16);
        setDoubleField(term95911, term95911.getClass(), "imaginary", 2.8823037615223603E17);
        term96628 = newInstance(Class.forName("org.apache.commons.math.complex.Complex"));
        setDoubleField(term96628, term96628.getClass(), "imaginary", 2.8823037615223603E17);
        setDoubleField(term96628, term96628.getClass(), "real", 7.2057594037936128E16);
        term96625 = newInstance(Class.forName("org.apache.commons.math.complex.Complex"));
        setDoubleField(term96625, term96625.getClass(), "imaginary", Double.POSITIVE_INFINITY);
        setDoubleField(term96625, term96625.getClass(), "real", Double.POSITIVE_INFINITY);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.complex.Complex");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "asin", argTypes, term95911, args);
        assertTrue(recursiveEquals(term95911, term96628));
        assertTrue(recursiveEquals(retValue, term96625));
    }

};


