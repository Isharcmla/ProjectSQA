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

public class Fraction_reduce_335503525690 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term191042;
     Object term191555;
     Object term191552;

    public Fraction_reduce_335503525690() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term191042 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term191042, term191042.getClass(), "numerator", -134217734);
        setIntField(term191042, term191042.getClass(), "denominator", 67108863);
        term191555 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term191555, term191555.getClass(), "numerator", -134217734);
        setIntField(term191555, term191555.getClass(), "denominator", 67108863);
        setField(term191555, term191555.getClass(), "toString", null);
        setField(term191555, term191555.getClass(), "toProperString", null);
        term191552 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term191552, term191552.getClass(), "numerator", -134217734);
        setIntField(term191552, term191552.getClass(), "denominator", 67108863);
        setField(term191552, term191552.getClass(), "toString", null);
        setField(term191552, term191552.getClass(), "toProperString", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang.math.Fraction");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "reduce", argTypes, term191042, args);
        assertTrue(recursiveEquals(term191042, term191555));
        assertTrue(recursiveEquals(retValue, term191552));
    }

};


