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

public class Fraction_reduce_3355035251623 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term476563;
     Object term476746;
     Object term476743;

    public Fraction_reduce_3355035251623() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term476563 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term476563, term476563.getClass(), "numerator", -470168766);
        setIntField(term476563, term476563.getClass(), "denominator", 235084247);
        term476746 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term476746, term476746.getClass(), "numerator", -470168766);
        setIntField(term476746, term476746.getClass(), "denominator", 235084247);
        setField(term476746, term476746.getClass(), "toString", null);
        setField(term476746, term476746.getClass(), "toProperString", null);
        term476743 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term476743, term476743.getClass(), "numerator", -470168766);
        setIntField(term476743, term476743.getClass(), "denominator", 235084247);
        setField(term476743, term476743.getClass(), "toString", null);
        setField(term476743, term476743.getClass(), "toProperString", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang.math.Fraction");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "reduce", argTypes, term476563, args);
        assertTrue(recursiveEquals(term476563, term476746));
        assertTrue(recursiveEquals(retValue, term476743));
    }

};


