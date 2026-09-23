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

public class Fraction_reduce_3355035251348 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term394107;
     Object term394620;
     Object term394617;

    public Fraction_reduce_3355035251348() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term394107 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term394107, term394107.getClass(), "numerator", -1737228738);
        setIntField(term394107, term394107.getClass(), "denominator", 80670113);
        term394620 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term394620, term394620.getClass(), "numerator", -1737228738);
        setIntField(term394620, term394620.getClass(), "denominator", 80670113);
        setField(term394620, term394620.getClass(), "toString", null);
        setField(term394620, term394620.getClass(), "toProperString", null);
        term394617 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term394617, term394617.getClass(), "numerator", -1737228738);
        setIntField(term394617, term394617.getClass(), "denominator", 80670113);
        setField(term394617, term394617.getClass(), "toString", null);
        setField(term394617, term394617.getClass(), "toProperString", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang.math.Fraction");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "reduce", argTypes, term394107, args);
        assertTrue(recursiveEquals(term394107, term394620));
        assertTrue(recursiveEquals(retValue, term394617));
    }

};


