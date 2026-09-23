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

public class Fraction_reduce_3355035251320 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term386200;
     Object term386539;
     Object term386536;

    public Fraction_reduce_3355035251320() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term386200 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term386200, term386200.getClass(), "numerator", -1669271006);
        setIntField(term386200, term386200.getClass(), "denominator", 2051085159);
        term386539 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term386539, term386539.getClass(), "numerator", -1669271006);
        setIntField(term386539, term386539.getClass(), "denominator", 2051085159);
        setField(term386539, term386539.getClass(), "toString", null);
        setField(term386539, term386539.getClass(), "toProperString", null);
        term386536 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term386536, term386536.getClass(), "numerator", -1669271006);
        setIntField(term386536, term386536.getClass(), "denominator", 2051085159);
        setField(term386536, term386536.getClass(), "toString", null);
        setField(term386536, term386536.getClass(), "toProperString", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang.math.Fraction");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "reduce", argTypes, term386200, args);
        assertTrue(recursiveEquals(term386200, term386539));
        assertTrue(recursiveEquals(retValue, term386536));
    }

};


