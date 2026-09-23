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

public class Fraction_reduce_5358591311986 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term648448;
     Object term648899;
     Object term648896;

    public Fraction_reduce_5358591311986() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term648448 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term648448, term648448.getClass(), "numerator", -1540783854);
        setIntField(term648448, term648448.getClass(), "denominator", 1928071343);
        term648899 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term648899, term648899.getClass(), "numerator", -1540783854);
        setIntField(term648899, term648899.getClass(), "denominator", 1928071343);
        setField(term648899, term648899.getClass(), "toString", null);
        setField(term648899, term648899.getClass(), "toProperString", null);
        term648896 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term648896, term648896.getClass(), "numerator", -1540783854);
        setIntField(term648896, term648896.getClass(), "denominator", 1928071343);
        setField(term648896, term648896.getClass(), "toString", null);
        setField(term648896, term648896.getClass(), "toProperString", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang3.math.Fraction");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "reduce", argTypes, term648448, args);
        assertTrue(recursiveEquals(term648448, term648899));
        assertTrue(recursiveEquals(retValue, term648896));
    }

};


