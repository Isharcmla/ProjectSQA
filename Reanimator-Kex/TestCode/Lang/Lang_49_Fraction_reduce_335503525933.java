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

public class Fraction_reduce_335503525933 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term266327;
     Object term267310;
     Object term267307;

    public Fraction_reduce_335503525933() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term266327 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term266327, term266327.getClass(), "numerator", 336679898);
        setIntField(term266327, term266327.getClass(), "denominator", 1085978613);
        term267310 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term267310, term267310.getClass(), "numerator", 336679898);
        setIntField(term267310, term267310.getClass(), "denominator", 1085978613);
        setField(term267310, term267310.getClass(), "toString", null);
        setField(term267310, term267310.getClass(), "toProperString", null);
        term267307 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term267307, term267307.getClass(), "numerator", 336679898);
        setIntField(term267307, term267307.getClass(), "denominator", 1085978613);
        setField(term267307, term267307.getClass(), "toString", null);
        setField(term267307, term267307.getClass(), "toProperString", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang.math.Fraction");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "reduce", argTypes, term266327, args);
        assertTrue(recursiveEquals(term266327, term267310));
        assertTrue(recursiveEquals(retValue, term267307));
    }

};


