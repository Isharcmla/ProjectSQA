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

public class Fraction_reduce_535859131245 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term64959;
     Object term65051;
     Object term65048;

    public Fraction_reduce_535859131245() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term64959 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term64959, term64959.getClass(), "numerator", 3164802);
        setIntField(term64959, term64959.getClass(), "denominator", 2048414729);
        term65051 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term65051, term65051.getClass(), "numerator", 3164802);
        setIntField(term65051, term65051.getClass(), "denominator", 2048414729);
        setField(term65051, term65051.getClass(), "toString", null);
        setField(term65051, term65051.getClass(), "toProperString", null);
        term65048 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term65048, term65048.getClass(), "numerator", 3164802);
        setIntField(term65048, term65048.getClass(), "denominator", 2048414729);
        setField(term65048, term65048.getClass(), "toString", null);
        setField(term65048, term65048.getClass(), "toProperString", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang3.math.Fraction");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "reduce", argTypes, term64959, args);
        assertTrue(recursiveEquals(term64959, term65051));
        assertTrue(recursiveEquals(retValue, term65048));
    }

};


