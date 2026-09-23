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

public class Fraction_reduce_3355035252578 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term768493;
     Object term769456;
     Object term769453;

    public Fraction_reduce_3355035252578() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term768493 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term768493, term768493.getClass(), "numerator", -1730610670);
        setIntField(term768493, term768493.getClass(), "denominator", 294650543);
        term769456 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term769456, term769456.getClass(), "numerator", -1730610670);
        setIntField(term769456, term769456.getClass(), "denominator", 294650543);
        setField(term769456, term769456.getClass(), "toString", null);
        setField(term769456, term769456.getClass(), "toProperString", null);
        term769453 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term769453, term769453.getClass(), "numerator", -1730610670);
        setIntField(term769453, term769453.getClass(), "denominator", 294650543);
        setField(term769453, term769453.getClass(), "toString", null);
        setField(term769453, term769453.getClass(), "toProperString", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang.math.Fraction");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "reduce", argTypes, term768493, args);
        assertTrue(recursiveEquals(term768493, term769456));
        assertTrue(recursiveEquals(retValue, term769453));
    }

};


