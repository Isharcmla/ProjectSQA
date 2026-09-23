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

public class Fraction_reduce_335503525736 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term205841;
     Object term206643;
     Object term206640;

    public Fraction_reduce_335503525736() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term205841 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term205841, term205841.getClass(), "numerator", -264296506);
        setIntField(term205841, term205841.getClass(), "denominator", 1769972757);
        term206643 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term206643, term206643.getClass(), "numerator", -264296506);
        setIntField(term206643, term206643.getClass(), "denominator", 1769972757);
        setField(term206643, term206643.getClass(), "toString", null);
        setField(term206643, term206643.getClass(), "toProperString", null);
        term206640 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term206640, term206640.getClass(), "numerator", -264296506);
        setIntField(term206640, term206640.getClass(), "denominator", 1769972757);
        setField(term206640, term206640.getClass(), "toString", null);
        setField(term206640, term206640.getClass(), "toProperString", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang.math.Fraction");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "reduce", argTypes, term205841, args);
        assertTrue(recursiveEquals(term205841, term206643));
        assertTrue(recursiveEquals(retValue, term206640));
    }

};


