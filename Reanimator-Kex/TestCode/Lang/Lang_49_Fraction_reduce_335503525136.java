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

public class Fraction_reduce_335503525136 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term28051;
     Object term28696;
     Object term28693;

    public Fraction_reduce_335503525136() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term28051 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term28051, term28051.getClass(), "numerator", 663462214);
        setIntField(term28051, term28051.getClass(), "denominator", 838570123);
        term28696 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term28696, term28696.getClass(), "numerator", 663462214);
        setIntField(term28696, term28696.getClass(), "denominator", 838570123);
        setField(term28696, term28696.getClass(), "toString", null);
        setField(term28696, term28696.getClass(), "toProperString", null);
        term28693 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term28693, term28693.getClass(), "numerator", 663462214);
        setIntField(term28693, term28693.getClass(), "denominator", 838570123);
        setField(term28693, term28693.getClass(), "toString", null);
        setField(term28693, term28693.getClass(), "toProperString", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang.math.Fraction");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "reduce", argTypes, term28051, args);
        assertTrue(recursiveEquals(term28051, term28696));
        assertTrue(recursiveEquals(retValue, term28693));
    }

};


