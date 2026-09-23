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

public class Fraction_reduce_335503525855 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term242874;
     Object term242996;
     Object term242993;

    public Fraction_reduce_335503525855() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term242874 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term242874, term242874.getClass(), "numerator", 995759106);
        setIntField(term242874, term242874.getClass(), "denominator", 497879549);
        term242996 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term242996, term242996.getClass(), "numerator", 995759106);
        setIntField(term242996, term242996.getClass(), "denominator", 497879549);
        setField(term242996, term242996.getClass(), "toString", null);
        setField(term242996, term242996.getClass(), "toProperString", null);
        term242993 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term242993, term242993.getClass(), "numerator", 995759106);
        setIntField(term242993, term242993.getClass(), "denominator", 497879549);
        setField(term242993, term242993.getClass(), "toString", null);
        setField(term242993, term242993.getClass(), "toProperString", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang.math.Fraction");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "reduce", argTypes, term242874, args);
        assertTrue(recursiveEquals(term242874, term242996));
        assertTrue(recursiveEquals(retValue, term242993));
    }

};


