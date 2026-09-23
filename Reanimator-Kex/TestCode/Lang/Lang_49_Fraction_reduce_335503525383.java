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

public class Fraction_reduce_335503525383 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term103012;
     Object term103112;
     Object term103109;

    public Fraction_reduce_335503525383() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term103012 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term103012, term103012.getClass(), "numerator", -1315315198);
        setIntField(term103012, term103012.getClass(), "denominator", 395069191);
        term103112 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term103112, term103112.getClass(), "numerator", -1315315198);
        setIntField(term103112, term103112.getClass(), "denominator", 395069191);
        setField(term103112, term103112.getClass(), "toString", null);
        setField(term103112, term103112.getClass(), "toProperString", null);
        term103109 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term103109, term103109.getClass(), "numerator", -1315315198);
        setIntField(term103109, term103109.getClass(), "denominator", 395069191);
        setField(term103109, term103109.getClass(), "toString", null);
        setField(term103109, term103109.getClass(), "toProperString", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang.math.Fraction");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "reduce", argTypes, term103012, args);
        assertTrue(recursiveEquals(term103012, term103112));
        assertTrue(recursiveEquals(retValue, term103109));
    }

};


