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

public class Fraction_reduce_5358591311240 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term401088;
     Object term401907;
     Object term401904;

    public Fraction_reduce_5358591311240() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term401088 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term401088, term401088.getClass(), "numerator", 436113298);
        setIntField(term401088, term401088.getClass(), "denominator", 1509863329);
        term401907 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term401907, term401907.getClass(), "numerator", 436113298);
        setIntField(term401907, term401907.getClass(), "denominator", 1509863329);
        setField(term401907, term401907.getClass(), "toString", null);
        setField(term401907, term401907.getClass(), "toProperString", null);
        term401904 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term401904, term401904.getClass(), "numerator", 436113298);
        setIntField(term401904, term401904.getClass(), "denominator", 1509863329);
        setField(term401904, term401904.getClass(), "toString", null);
        setField(term401904, term401904.getClass(), "toProperString", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang3.math.Fraction");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "reduce", argTypes, term401088, args);
        assertTrue(recursiveEquals(term401088, term401907));
        assertTrue(recursiveEquals(retValue, term401904));
    }

};


