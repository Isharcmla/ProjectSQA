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

public class Fraction_reduce_335503525636 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term176984;
     Object term177640;
     Object term177637;

    public Fraction_reduce_335503525636() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term176984 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term176984, term176984.getClass(), "numerator", 30);
        setIntField(term176984, term176984.getClass(), "denominator", 1073741831);
        term177640 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term177640, term177640.getClass(), "numerator", 30);
        setIntField(term177640, term177640.getClass(), "denominator", 1073741831);
        setField(term177640, term177640.getClass(), "toString", null);
        setField(term177640, term177640.getClass(), "toProperString", null);
        term177637 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term177637, term177637.getClass(), "numerator", 30);
        setIntField(term177637, term177637.getClass(), "denominator", 1073741831);
        setField(term177637, term177637.getClass(), "toString", null);
        setField(term177637, term177637.getClass(), "toProperString", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang.math.Fraction");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "reduce", argTypes, term176984, args);
        assertTrue(recursiveEquals(term176984, term177640));
        assertTrue(recursiveEquals(retValue, term177637));
    }

};


