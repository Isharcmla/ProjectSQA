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

public class Fraction_reduce_335503525510 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term139784;
     Object term140365;
     Object term140362;

    public Fraction_reduce_335503525510() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term139784 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term139784, term139784.getClass(), "numerator", -2147483647);
        setIntField(term139784, term139784.getClass(), "denominator", 1073741824);
        term140365 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term140365, term140365.getClass(), "numerator", -2147483647);
        setIntField(term140365, term140365.getClass(), "denominator", 1073741824);
        setField(term140365, term140365.getClass(), "toString", null);
        setField(term140365, term140365.getClass(), "toProperString", null);
        term140362 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term140362, term140362.getClass(), "numerator", -2147483647);
        setIntField(term140362, term140362.getClass(), "denominator", 1073741824);
        setField(term140362, term140362.getClass(), "toString", null);
        setField(term140362, term140362.getClass(), "toProperString", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang.math.Fraction");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "reduce", argTypes, term139784, args);
        assertTrue(recursiveEquals(term139784, term140365));
        assertTrue(recursiveEquals(retValue, term140362));
    }

};


