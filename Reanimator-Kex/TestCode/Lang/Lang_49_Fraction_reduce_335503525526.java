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

public class Fraction_reduce_335503525526 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term144428;
     Object term145320;
     Object term145317;

    public Fraction_reduce_335503525526() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term144428 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term144428, term144428.getClass(), "numerator", -128015390);
        setIntField(term144428, term144428.getClass(), "denominator", 2135993831);
        term145320 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term145320, term145320.getClass(), "numerator", -128015390);
        setIntField(term145320, term145320.getClass(), "denominator", 2135993831);
        setField(term145320, term145320.getClass(), "toString", null);
        setField(term145320, term145320.getClass(), "toProperString", null);
        term145317 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term145317, term145317.getClass(), "numerator", -128015390);
        setIntField(term145317, term145317.getClass(), "denominator", 2135993831);
        setField(term145317, term145317.getClass(), "toString", null);
        setField(term145317, term145317.getClass(), "toProperString", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang.math.Fraction");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "reduce", argTypes, term144428, args);
        assertTrue(recursiveEquals(term144428, term145320));
        assertTrue(recursiveEquals(retValue, term145317));
    }

};


