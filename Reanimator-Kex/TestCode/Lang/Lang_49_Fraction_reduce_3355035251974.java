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

public class Fraction_reduce_3355035251974 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term579828;
     Object term580444;
     Object term580441;

    public Fraction_reduce_3355035251974() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term579828 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term579828, term579828.getClass(), "numerator", -1792432442);
        setIntField(term579828, term579828.getClass(), "denominator", 1824032981);
        term580444 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term580444, term580444.getClass(), "numerator", -1792432442);
        setIntField(term580444, term580444.getClass(), "denominator", 1824032981);
        setField(term580444, term580444.getClass(), "toString", null);
        setField(term580444, term580444.getClass(), "toProperString", null);
        term580441 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term580441, term580441.getClass(), "numerator", -1792432442);
        setIntField(term580441, term580441.getClass(), "denominator", 1824032981);
        setField(term580441, term580441.getClass(), "toString", null);
        setField(term580441, term580441.getClass(), "toProperString", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang.math.Fraction");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "reduce", argTypes, term579828, args);
        assertTrue(recursiveEquals(term579828, term580444));
        assertTrue(recursiveEquals(retValue, term580441));
    }

};


