package org.apache.commons.lang.math;

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
import static org.apache.commons.lang.math.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import static org.apache.commons.lang.math.EqualityUtils.*;

public class Fraction_reduce_335503525804 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term225846;
     Object term226374;
     Object term226371;

    public Fraction_reduce_335503525804() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term225846 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term225846, term225846.getClass(), "numerator", -1248329966);
        setIntField(term225846, term225846.getClass(), "denominator", 624160815);
        term226374 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term226374, term226374.getClass(), "numerator", -1248329966);
        setIntField(term226374, term226374.getClass(), "denominator", 624160815);
        setField(term226374, term226374.getClass(), "toString", null);
        setField(term226374, term226374.getClass(), "toProperString", null);
        term226371 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term226371, term226371.getClass(), "numerator", -1248329966);
        setIntField(term226371, term226371.getClass(), "denominator", 624160815);
        setField(term226371, term226371.getClass(), "toString", null);
        setField(term226371, term226371.getClass(), "toProperString", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang.math.Fraction");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "reduce", argTypes, term225846, args);
        assertTrue(recursiveEquals(term225846, term226374));
        assertTrue(recursiveEquals(retValue, term226371));
    }

};


