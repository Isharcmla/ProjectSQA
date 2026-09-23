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

public class Fraction_reduce_335503525661 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term184199;
     Object term184299;
     Object term184293;

    public Fraction_reduce_335503525661() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term184199 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term184199, term184199.getClass(), "numerator", 30);
        setIntField(term184199, term184199.getClass(), "denominator", 2147330967);
        term184299 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term184299, term184299.getClass(), "numerator", 30);
        setIntField(term184299, term184299.getClass(), "denominator", 2147330967);
        setField(term184299, term184299.getClass(), "toString", null);
        setField(term184299, term184299.getClass(), "toProperString", null);
        term184293 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term184293, term184293.getClass(), "numerator", 10);
        setIntField(term184293, term184293.getClass(), "denominator", 715776989);
        setField(term184293, term184293.getClass(), "toString", null);
        setField(term184293, term184293.getClass(), "toProperString", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang.math.Fraction");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "reduce", argTypes, term184199, args);
        assertTrue(recursiveEquals(term184199, term184299));
        assertTrue(recursiveEquals(retValue, term184293));
    }

};


