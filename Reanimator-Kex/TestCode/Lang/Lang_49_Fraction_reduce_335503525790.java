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

public class Fraction_reduce_335503525790 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term220644;
     Object term221442;
     Object term221439;

    public Fraction_reduce_335503525790() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term220644 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term220644, term220644.getClass(), "numerator", 211339538);
        setIntField(term220644, term220644.getClass(), "denominator", 1178329713);
        term221442 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term221442, term221442.getClass(), "numerator", 211339538);
        setIntField(term221442, term221442.getClass(), "denominator", 1178329713);
        setField(term221442, term221442.getClass(), "toString", null);
        setField(term221442, term221442.getClass(), "toProperString", null);
        term221439 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term221439, term221439.getClass(), "numerator", 211339538);
        setIntField(term221439, term221439.getClass(), "denominator", 1178329713);
        setField(term221439, term221439.getClass(), "toString", null);
        setField(term221439, term221439.getClass(), "toProperString", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang.math.Fraction");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "reduce", argTypes, term220644, args);
        assertTrue(recursiveEquals(term220644, term221442));
        assertTrue(recursiveEquals(retValue, term221439));
    }

};


