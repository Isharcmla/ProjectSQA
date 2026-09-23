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

public class Fraction_reduce_335503525407 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term111375;
     Object term111485;
     Object term111479;

    public Fraction_reduce_335503525407() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term111375 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term111375, term111375.getClass(), "numerator", -2112545958);
        setIntField(term111375, term111375.getClass(), "denominator", 1334383611);
        term111485 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term111485, term111485.getClass(), "numerator", -2112545958);
        setIntField(term111485, term111485.getClass(), "denominator", 1334383611);
        setField(term111485, term111485.getClass(), "toString", null);
        setField(term111485, term111485.getClass(), "toProperString", null);
        term111479 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term111479, term111479.getClass(), "numerator", -704181986);
        setIntField(term111479, term111479.getClass(), "denominator", 444794537);
        setField(term111479, term111479.getClass(), "toString", null);
        setField(term111479, term111479.getClass(), "toProperString", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang.math.Fraction");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "reduce", argTypes, term111375, args);
        assertTrue(recursiveEquals(term111375, term111485));
        assertTrue(recursiveEquals(retValue, term111479));
    }

};


