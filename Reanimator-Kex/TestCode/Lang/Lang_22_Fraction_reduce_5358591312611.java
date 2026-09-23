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

public class Fraction_reduce_5358591312611 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term855851;
     Object term856058;
     Object term856055;

    public Fraction_reduce_5358591312611() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term855851 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term855851, term855851.getClass(), "numerator", 1577078786);
        setIntField(term855851, term855851.getClass(), "denominator", 791674489);
        term856058 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term856058, term856058.getClass(), "numerator", 1577078786);
        setIntField(term856058, term856058.getClass(), "denominator", 791674489);
        setField(term856058, term856058.getClass(), "toString", null);
        setField(term856058, term856058.getClass(), "toProperString", null);
        term856055 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term856055, term856055.getClass(), "numerator", 1577078786);
        setIntField(term856055, term856055.getClass(), "denominator", 791674489);
        setField(term856055, term856055.getClass(), "toString", null);
        setField(term856055, term856055.getClass(), "toProperString", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang3.math.Fraction");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "reduce", argTypes, term855851, args);
        assertTrue(recursiveEquals(term855851, term856058));
        assertTrue(recursiveEquals(retValue, term856055));
    }

};


