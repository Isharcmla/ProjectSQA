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

public class Fraction_reduce_3355035251459 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term426765;
     Object term427248;
     Object term427245;

    public Fraction_reduce_3355035251459() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term426765 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term426765, term426765.getClass(), "numerator", 845829522);
        setIntField(term426765, term426765.getClass(), "denominator", 2033527489);
        term427248 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term427248, term427248.getClass(), "numerator", 845829522);
        setIntField(term427248, term427248.getClass(), "denominator", 2033527489);
        setField(term427248, term427248.getClass(), "toString", null);
        setField(term427248, term427248.getClass(), "toProperString", null);
        term427245 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term427245, term427245.getClass(), "numerator", 845829522);
        setIntField(term427245, term427245.getClass(), "denominator", 2033527489);
        setField(term427245, term427245.getClass(), "toString", null);
        setField(term427245, term427245.getClass(), "toProperString", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang.math.Fraction");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "reduce", argTypes, term426765, args);
        assertTrue(recursiveEquals(term426765, term427248));
        assertTrue(recursiveEquals(retValue, term427245));
    }

};


