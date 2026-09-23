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

public class Fraction_reduce_3355035252521 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term751069;
     Object term752016;
     Object term752013;

    public Fraction_reduce_3355035252521() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term751069 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term751069, term751069.getClass(), "numerator", 72525042);
        setIntField(term751069, term751069.getClass(), "denominator", 1773439489);
        term752016 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term752016, term752016.getClass(), "numerator", 72525042);
        setIntField(term752016, term752016.getClass(), "denominator", 1773439489);
        setField(term752016, term752016.getClass(), "toString", null);
        setField(term752016, term752016.getClass(), "toProperString", null);
        term752013 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term752013, term752013.getClass(), "numerator", 72525042);
        setIntField(term752013, term752013.getClass(), "denominator", 1773439489);
        setField(term752013, term752013.getClass(), "toString", null);
        setField(term752013, term752013.getClass(), "toProperString", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang.math.Fraction");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "reduce", argTypes, term751069, args);
        assertTrue(recursiveEquals(term751069, term752016));
        assertTrue(recursiveEquals(retValue, term752013));
    }

};


