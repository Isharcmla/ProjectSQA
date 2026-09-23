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

public class Fraction_reduce_335503525928 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term264628;
     Object term265643;
     Object term265640;

    public Fraction_reduce_335503525928() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term264628 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term264628, term264628.getClass(), "numerator", -2049805302);
        setIntField(term264628, term264628.getClass(), "denominator", 1659555619);
        term265643 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term265643, term265643.getClass(), "numerator", -2049805302);
        setIntField(term265643, term265643.getClass(), "denominator", 1659555619);
        setField(term265643, term265643.getClass(), "toString", null);
        setField(term265643, term265643.getClass(), "toProperString", null);
        term265640 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term265640, term265640.getClass(), "numerator", -2049805302);
        setIntField(term265640, term265640.getClass(), "denominator", 1659555619);
        setField(term265640, term265640.getClass(), "toString", null);
        setField(term265640, term265640.getClass(), "toProperString", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang.math.Fraction");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "reduce", argTypes, term264628, args);
        assertTrue(recursiveEquals(term264628, term265643));
        assertTrue(recursiveEquals(retValue, term265640));
    }

};


