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

public class Complex_multiply_178725535840 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term42;
     Object term45;
     Object term646;
     Object term647;
     Object term643;

    public Complex_multiply_178725535840() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term42 = newInstance(Class.forName("org.apache.commons.math.complex.Complex"));
        setDoubleField(term42, term42.getClass(), "imaginary", 0.5840714198152577);
        setDoubleField(term42, term42.getClass(), "real", 0.7559240768573477);
        term45 = newInstance(Class.forName("org.apache.commons.math.complex.Complex"));
        setDoubleField(term45, term45.getClass(), "imaginary", 0.10667076642995188);
        setDoubleField(term45, term45.getClass(), "real", 0.11493000848982304);
        term646 = newInstance(Class.forName("org.apache.commons.math.complex.Complex"));
        setDoubleField(term646, term646.getClass(), "imaginary", 0.5840714198152577);
        setDoubleField(term646, term646.getClass(), "real", 0.7559240768573477);
        term647 = newInstance(Class.forName("org.apache.commons.math.complex.Complex"));
        setDoubleField(term647, term647.getClass(), "imaginary", 0.10667076642995188);
        setDoubleField(term647, term647.getClass(), "real", 0.11493000848982304);
        term643 = newInstance(Class.forName("org.apache.commons.math.complex.Complex"));
        setDoubleField(term643, term643.getClass(), "imaginary", 0.1477623338792577);
        setDoubleField(term643, term643.getClass(), "real", 0.024575014569352904);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.complex.Complex");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.apache.commons.math.complex.Complex");
        Object[] args = new Object[1];
        args[0] = term45;
        Object retValue = callMethod(klass, "multiply", argTypes, term42, args);
        assertTrue(recursiveEquals(term42, term646));
        assertTrue(recursiveEquals(term45, term647));
        assertTrue(recursiveEquals(retValue, term643));
    }

};


