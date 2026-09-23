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

public class Fraction_reduce_335503525261 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term65266;
     Object term65743;
     Object term65740;

    public Fraction_reduce_335503525261() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term65266 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term65266, term65266.getClass(), "numerator", 1188022898);
        setIntField(term65266, term65266.getClass(), "denominator", 1276582561);
        term65743 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term65743, term65743.getClass(), "numerator", 1188022898);
        setIntField(term65743, term65743.getClass(), "denominator", 1276582561);
        setField(term65743, term65743.getClass(), "toString", null);
        setField(term65743, term65743.getClass(), "toProperString", null);
        term65740 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term65740, term65740.getClass(), "numerator", 1188022898);
        setIntField(term65740, term65740.getClass(), "denominator", 1276582561);
        setField(term65740, term65740.getClass(), "toString", null);
        setField(term65740, term65740.getClass(), "toProperString", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang.math.Fraction");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "reduce", argTypes, term65266, args);
        assertTrue(recursiveEquals(term65266, term65743));
        assertTrue(recursiveEquals(retValue, term65740));
    }

};


