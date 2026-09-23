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

public class Fraction_reduce_335503525730 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term204536;
     Object term204991;
     Object term204988;

    public Fraction_reduce_335503525730() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term204536 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term204536, term204536.getClass(), "numerator", 1342148686);
        setIntField(term204536, term204536.getClass(), "denominator", 1963467055);
        term204991 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term204991, term204991.getClass(), "numerator", 1342148686);
        setIntField(term204991, term204991.getClass(), "denominator", 1963467055);
        setField(term204991, term204991.getClass(), "toString", null);
        setField(term204991, term204991.getClass(), "toProperString", null);
        term204988 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term204988, term204988.getClass(), "numerator", 1342148686);
        setIntField(term204988, term204988.getClass(), "denominator", 1963467055);
        setField(term204988, term204988.getClass(), "toString", null);
        setField(term204988, term204988.getClass(), "toProperString", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang.math.Fraction");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "reduce", argTypes, term204536, args);
        assertTrue(recursiveEquals(term204536, term204991));
        assertTrue(recursiveEquals(retValue, term204988));
    }

};


