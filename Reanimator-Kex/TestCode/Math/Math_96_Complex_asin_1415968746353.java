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

public class Complex_asin_1415968746353 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term80826;
     Object term81034;
     Object term81031;

    public Complex_asin_1415968746353() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term80826 = newInstance(Class.forName("org.apache.commons.math.complex.Complex"));
        setDoubleField(term80826, term80826.getClass(), "real", 7.2057594037929574E17);
        setDoubleField(term80826, term80826.getClass(), "imaginary", 1.44119586122366976E17);
        term81034 = newInstance(Class.forName("org.apache.commons.math.complex.Complex"));
        setDoubleField(term81034, term81034.getClass(), "imaginary", 1.44119586122366976E17);
        setDoubleField(term81034, term81034.getClass(), "real", 7.2057594037929574E17);
        term81031 = newInstance(Class.forName("org.apache.commons.math.complex.Complex"));
        setDoubleField(term81031, term81031.getClass(), "imaginary", Double.POSITIVE_INFINITY);
        setDoubleField(term81031, term81031.getClass(), "real", Double.POSITIVE_INFINITY);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.complex.Complex");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "asin", argTypes, term80826, args);
        assertTrue(recursiveEquals(term80826, term81034));
        assertTrue(recursiveEquals(retValue, term81031));
    }

};


