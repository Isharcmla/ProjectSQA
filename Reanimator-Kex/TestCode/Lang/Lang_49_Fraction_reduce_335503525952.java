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

public class Fraction_reduce_335503525952 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term273302;
     Object term274154;
     Object term274151;

    public Fraction_reduce_335503525952() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term273302 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term273302, term273302.getClass(), "numerator", 1419566890);
        setIntField(term273302, term273302.getClass(), "denominator", 19270553);
        term274154 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term274154, term274154.getClass(), "numerator", 1419566890);
        setIntField(term274154, term274154.getClass(), "denominator", 19270553);
        setField(term274154, term274154.getClass(), "toString", null);
        setField(term274154, term274154.getClass(), "toProperString", null);
        term274151 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term274151, term274151.getClass(), "numerator", 1419566890);
        setIntField(term274151, term274151.getClass(), "denominator", 19270553);
        setField(term274151, term274151.getClass(), "toString", null);
        setField(term274151, term274151.getClass(), "toProperString", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang.math.Fraction");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "reduce", argTypes, term273302, args);
        assertTrue(recursiveEquals(term273302, term274154));
        assertTrue(recursiveEquals(retValue, term274151));
    }

};


