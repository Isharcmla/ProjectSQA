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

public class Fraction_reduce_3355035251404 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term410142;
     Object term410471;
     Object term410468;

    public Fraction_reduce_3355035251404() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term410142 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term410142, term410142.getClass(), "numerator", 14);
        setIntField(term410142, term410142.getClass(), "denominator", 2097932287);
        term410471 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term410471, term410471.getClass(), "numerator", 14);
        setIntField(term410471, term410471.getClass(), "denominator", 2097932287);
        setField(term410471, term410471.getClass(), "toString", null);
        setField(term410471, term410471.getClass(), "toProperString", null);
        term410468 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term410468, term410468.getClass(), "numerator", 14);
        setIntField(term410468, term410468.getClass(), "denominator", 2097932287);
        setField(term410468, term410468.getClass(), "toString", null);
        setField(term410468, term410468.getClass(), "toProperString", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang.math.Fraction");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "reduce", argTypes, term410142, args);
        assertTrue(recursiveEquals(term410142, term410471));
        assertTrue(recursiveEquals(retValue, term410468));
    }

};


