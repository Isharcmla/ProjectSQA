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

public class Fraction_reduce_335503525648 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term180519;
     Object term180921;
     Object term180918;

    public Fraction_reduce_335503525648() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term180519 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term180519, term180519.getClass(), "numerator", 478806018);
        setIntField(term180519, term180519.getClass(), "denominator", 1840570345);
        term180921 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term180921, term180921.getClass(), "numerator", 478806018);
        setIntField(term180921, term180921.getClass(), "denominator", 1840570345);
        setField(term180921, term180921.getClass(), "toString", null);
        setField(term180921, term180921.getClass(), "toProperString", null);
        term180918 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term180918, term180918.getClass(), "numerator", 478806018);
        setIntField(term180918, term180918.getClass(), "denominator", 1840570345);
        setField(term180918, term180918.getClass(), "toString", null);
        setField(term180918, term180918.getClass(), "toProperString", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang.math.Fraction");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "reduce", argTypes, term180519, args);
        assertTrue(recursiveEquals(term180519, term180921));
        assertTrue(recursiveEquals(retValue, term180918));
    }

};


