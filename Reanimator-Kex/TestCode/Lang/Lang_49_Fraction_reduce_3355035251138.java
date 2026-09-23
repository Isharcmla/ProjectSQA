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

public class Fraction_reduce_3355035251138 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term329809;
     Object term330128;
     Object term330125;

    public Fraction_reduce_3355035251138() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term329809 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term329809, term329809.getClass(), "numerator", 271486474);
        setIntField(term329809, term329809.getClass(), "denominator", 1593848813);
        term330128 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term330128, term330128.getClass(), "numerator", 271486474);
        setIntField(term330128, term330128.getClass(), "denominator", 1593848813);
        setField(term330128, term330128.getClass(), "toString", null);
        setField(term330128, term330128.getClass(), "toProperString", null);
        term330125 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term330125, term330125.getClass(), "numerator", 271486474);
        setIntField(term330125, term330125.getClass(), "denominator", 1593848813);
        setField(term330125, term330125.getClass(), "toString", null);
        setField(term330125, term330125.getClass(), "toProperString", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang.math.Fraction");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "reduce", argTypes, term329809, args);
        assertTrue(recursiveEquals(term329809, term330128));
        assertTrue(recursiveEquals(retValue, term330125));
    }

};


