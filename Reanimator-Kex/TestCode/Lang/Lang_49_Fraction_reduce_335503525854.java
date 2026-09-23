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

public class Fraction_reduce_335503525854 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term242172;
     Object term242911;
     Object term242908;

    public Fraction_reduce_335503525854() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term242172 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term242172, term242172.getClass(), "numerator", -214);
        setIntField(term242172, term242172.getClass(), "denominator", 103);
        term242911 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term242911, term242911.getClass(), "numerator", -214);
        setIntField(term242911, term242911.getClass(), "denominator", 103);
        setField(term242911, term242911.getClass(), "toString", null);
        setField(term242911, term242911.getClass(), "toProperString", null);
        term242908 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term242908, term242908.getClass(), "numerator", -214);
        setIntField(term242908, term242908.getClass(), "denominator", 103);
        setField(term242908, term242908.getClass(), "toString", null);
        setField(term242908, term242908.getClass(), "toProperString", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang.math.Fraction");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "reduce", argTypes, term242172, args);
        assertTrue(recursiveEquals(term242172, term242911));
        assertTrue(recursiveEquals(retValue, term242908));
    }

};


