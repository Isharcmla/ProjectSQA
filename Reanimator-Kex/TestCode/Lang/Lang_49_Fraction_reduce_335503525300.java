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

public class Fraction_reduce_335503525300 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term78005;
     Object term78690;
     Object term78684;

    public Fraction_reduce_335503525300() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term78005 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term78005, term78005.getClass(), "numerator", 1654612758);
        setIntField(term78005, term78005.getClass(), "denominator", 447352663);
        term78690 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term78690, term78690.getClass(), "numerator", 1654612758);
        setIntField(term78690, term78690.getClass(), "denominator", 447352663);
        setField(term78690, term78690.getClass(), "toString", null);
        setField(term78690, term78690.getClass(), "toProperString", null);
        term78684 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term78684, term78684.getClass(), "numerator", 87084882);
        setIntField(term78684, term78684.getClass(), "denominator", 23544877);
        setField(term78684, term78684.getClass(), "toString", null);
        setField(term78684, term78684.getClass(), "toProperString", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang.math.Fraction");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "reduce", argTypes, term78005, args);
        assertTrue(recursiveEquals(term78005, term78690));
        assertTrue(recursiveEquals(retValue, term78684));
    }

};


