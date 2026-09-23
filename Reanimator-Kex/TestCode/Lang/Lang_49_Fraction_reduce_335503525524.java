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

public class Fraction_reduce_335503525524 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term144049;
     Object term144531;
     Object term144528;

    public Fraction_reduce_335503525524() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term144049 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term144049, term144049.getClass(), "numerator", 385928194);
        setIntField(term144049, term144049.getClass(), "denominator", 1114677481);
        term144531 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term144531, term144531.getClass(), "numerator", 385928194);
        setIntField(term144531, term144531.getClass(), "denominator", 1114677481);
        setField(term144531, term144531.getClass(), "toString", null);
        setField(term144531, term144531.getClass(), "toProperString", null);
        term144528 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term144528, term144528.getClass(), "numerator", 385928194);
        setIntField(term144528, term144528.getClass(), "denominator", 1114677481);
        setField(term144528, term144528.getClass(), "toString", null);
        setField(term144528, term144528.getClass(), "toProperString", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang.math.Fraction");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "reduce", argTypes, term144049, args);
        assertTrue(recursiveEquals(term144049, term144531));
        assertTrue(recursiveEquals(retValue, term144528));
    }

};


