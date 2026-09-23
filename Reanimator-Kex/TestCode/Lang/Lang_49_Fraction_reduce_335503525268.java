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

public class Fraction_reduce_335503525268 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term66564;
     Object term67182;
     Object term67179;

    public Fraction_reduce_335503525268() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term66564 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term66564, term66564.getClass(), "numerator", -1873193690);
        setIntField(term66564, term66564.getClass(), "denominator", 1899145221);
        term67182 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term67182, term67182.getClass(), "numerator", -1873193690);
        setIntField(term67182, term67182.getClass(), "denominator", 1899145221);
        setField(term67182, term67182.getClass(), "toString", null);
        setField(term67182, term67182.getClass(), "toProperString", null);
        term67179 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term67179, term67179.getClass(), "numerator", -1873193690);
        setIntField(term67179, term67179.getClass(), "denominator", 1899145221);
        setField(term67179, term67179.getClass(), "toString", null);
        setField(term67179, term67179.getClass(), "toProperString", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang.math.Fraction");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "reduce", argTypes, term66564, args);
        assertTrue(recursiveEquals(term66564, term67182));
        assertTrue(recursiveEquals(retValue, term67179));
    }

};


