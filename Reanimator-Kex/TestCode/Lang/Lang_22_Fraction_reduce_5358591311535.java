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

public class Fraction_reduce_5358591311535 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term499147;
     Object term500149;
     Object term500146;

    public Fraction_reduce_5358591311535() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term499147 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term499147, term499147.getClass(), "numerator", 631402834);
        setIntField(term499147, term499147.getClass(), "denominator", 1831043233);
        term500149 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term500149, term500149.getClass(), "numerator", 631402834);
        setIntField(term500149, term500149.getClass(), "denominator", 1831043233);
        setField(term500149, term500149.getClass(), "toString", null);
        setField(term500149, term500149.getClass(), "toProperString", null);
        term500146 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term500146, term500146.getClass(), "numerator", 631402834);
        setIntField(term500146, term500146.getClass(), "denominator", 1831043233);
        setField(term500146, term500146.getClass(), "toString", null);
        setField(term500146, term500146.getClass(), "toProperString", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang3.math.Fraction");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "reduce", argTypes, term499147, args);
        assertTrue(recursiveEquals(term499147, term500149));
        assertTrue(recursiveEquals(retValue, term500146));
    }

};


