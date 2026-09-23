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

public class Fraction_reduce_3355035251721 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term504500;
     Object term504714;
     Object term504708;

    public Fraction_reduce_3355035251721() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term504500 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term504500, term504500.getClass(), "numerator", 537591890);
        setIntField(term504500, term504500.getClass(), "denominator", 1342537745);
        term504714 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term504714, term504714.getClass(), "numerator", 537591890);
        setIntField(term504714, term504714.getClass(), "denominator", 1342537745);
        setField(term504714, term504714.getClass(), "toString", null);
        setField(term504714, term504714.getClass(), "toProperString", null);
        term504708 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term504708, term504708.getClass(), "numerator", 107518378);
        setIntField(term504708, term504708.getClass(), "denominator", 268507549);
        setField(term504708, term504708.getClass(), "toString", null);
        setField(term504708, term504708.getClass(), "toProperString", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang.math.Fraction");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "reduce", argTypes, term504500, args);
        assertTrue(recursiveEquals(term504500, term504714));
        assertTrue(recursiveEquals(retValue, term504708));
    }

};


