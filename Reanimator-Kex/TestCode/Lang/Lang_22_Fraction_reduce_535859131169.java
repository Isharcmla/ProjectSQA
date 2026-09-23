package org.apache.commons.lang3.math;

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
import static org.apache.commons.lang3.math.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import static org.apache.commons.lang3.math.EqualityUtils.*;

public class Fraction_reduce_535859131169 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term39788;
     Object term39882;
     Object term39879;

    public Fraction_reduce_535859131169() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term39788 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term39788, term39788.getClass(), "numerator", -803190170);
        setIntField(term39788, term39788.getClass(), "denominator", 1030516853);
        term39882 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term39882, term39882.getClass(), "numerator", -803190170);
        setIntField(term39882, term39882.getClass(), "denominator", 1030516853);
        setField(term39882, term39882.getClass(), "toString", null);
        setField(term39882, term39882.getClass(), "toProperString", null);
        term39879 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term39879, term39879.getClass(), "numerator", -803190170);
        setIntField(term39879, term39879.getClass(), "denominator", 1030516853);
        setField(term39879, term39879.getClass(), "toString", null);
        setField(term39879, term39879.getClass(), "toProperString", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang3.math.Fraction");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "reduce", argTypes, term39788, args);
        assertTrue(recursiveEquals(term39788, term39882));
        assertTrue(recursiveEquals(retValue, term39879));
    }

};


