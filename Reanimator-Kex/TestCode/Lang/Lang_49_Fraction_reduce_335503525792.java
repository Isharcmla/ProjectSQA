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

public class Fraction_reduce_335503525792 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term221339;
     Object term221828;
     Object term221825;

    public Fraction_reduce_335503525792() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term221339 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term221339, term221339.getClass(), "numerator", 1133949974);
        setIntField(term221339, term221339.getClass(), "denominator", 531633155);
        term221828 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term221828, term221828.getClass(), "numerator", 1133949974);
        setIntField(term221828, term221828.getClass(), "denominator", 531633155);
        setField(term221828, term221828.getClass(), "toString", null);
        setField(term221828, term221828.getClass(), "toProperString", null);
        term221825 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term221825, term221825.getClass(), "numerator", 1133949974);
        setIntField(term221825, term221825.getClass(), "denominator", 531633155);
        setField(term221825, term221825.getClass(), "toString", null);
        setField(term221825, term221825.getClass(), "toProperString", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang.math.Fraction");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "reduce", argTypes, term221339, args);
        assertTrue(recursiveEquals(term221339, term221828));
        assertTrue(recursiveEquals(retValue, term221825));
    }

};


