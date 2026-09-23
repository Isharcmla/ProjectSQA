package org.apache.commons.lang3.math;

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
import static org.apache.commons.lang3.math.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import static org.apache.commons.lang3.math.EqualityUtils.*;

public class Fraction_reduce_5358591311934 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term630464;
     Object term631451;
     Object term631448;

    public Fraction_reduce_5358591311934() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term630464 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term630464, term630464.getClass(), "numerator", 1818383794);
        setIntField(term630464, term630464.getClass(), "denominator", 1160485857);
        term631451 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term631451, term631451.getClass(), "numerator", 1818383794);
        setIntField(term631451, term631451.getClass(), "denominator", 1160485857);
        setField(term631451, term631451.getClass(), "toString", null);
        setField(term631451, term631451.getClass(), "toProperString", null);
        term631448 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term631448, term631448.getClass(), "numerator", 1818383794);
        setIntField(term631448, term631448.getClass(), "denominator", 1160485857);
        setField(term631448, term631448.getClass(), "toString", null);
        setField(term631448, term631448.getClass(), "toProperString", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang3.math.Fraction");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "reduce", argTypes, term630464, args);
        assertTrue(recursiveEquals(term630464, term631451));
        assertTrue(recursiveEquals(retValue, term631448));
    }

};


