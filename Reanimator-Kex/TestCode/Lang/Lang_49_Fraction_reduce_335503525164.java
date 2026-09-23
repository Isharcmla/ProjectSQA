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

public class Fraction_reduce_335503525164 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term37299;
     Object term37899;
     Object term37896;

    public Fraction_reduce_335503525164() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term37299 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term37299, term37299.getClass(), "numerator", 624274726);
        setIntField(term37299, term37299.getClass(), "denominator", 1539972043);
        term37899 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term37899, term37899.getClass(), "numerator", 624274726);
        setIntField(term37899, term37899.getClass(), "denominator", 1539972043);
        setField(term37899, term37899.getClass(), "toString", null);
        setField(term37899, term37899.getClass(), "toProperString", null);
        term37896 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term37896, term37896.getClass(), "numerator", 624274726);
        setIntField(term37896, term37896.getClass(), "denominator", 1539972043);
        setField(term37896, term37896.getClass(), "toString", null);
        setField(term37896, term37896.getClass(), "toProperString", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang.math.Fraction");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "reduce", argTypes, term37299, args);
        assertTrue(recursiveEquals(term37299, term37899));
        assertTrue(recursiveEquals(retValue, term37896));
    }

};


