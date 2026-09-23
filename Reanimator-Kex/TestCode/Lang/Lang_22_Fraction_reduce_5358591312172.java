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

public class Fraction_reduce_5358591312172 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term708047;
     Object term708557;
     Object term708554;

    public Fraction_reduce_5358591312172() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term708047 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term708047, term708047.getClass(), "numerator", -283640306);
        setIntField(term708047, term708047.getClass(), "denominator", 2012990353);
        term708557 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term708557, term708557.getClass(), "numerator", -283640306);
        setIntField(term708557, term708557.getClass(), "denominator", 2012990353);
        setField(term708557, term708557.getClass(), "toString", null);
        setField(term708557, term708557.getClass(), "toProperString", null);
        term708554 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term708554, term708554.getClass(), "numerator", -283640306);
        setIntField(term708554, term708554.getClass(), "denominator", 2012990353);
        setField(term708554, term708554.getClass(), "toString", null);
        setField(term708554, term708554.getClass(), "toProperString", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang3.math.Fraction");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "reduce", argTypes, term708047, args);
        assertTrue(recursiveEquals(term708047, term708557));
        assertTrue(recursiveEquals(retValue, term708554));
    }

};


