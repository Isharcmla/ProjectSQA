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

public class Fraction_subtract_1443627440161 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term36476;
     Object term36963;
     Object term36964;
     Object term36960;

    public Fraction_subtract_1443627440161() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term36476 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term36476, term36476.getClass(), "numerator", -2147483648);
        setIntField(term36476, term36476.getClass(), "denominator", -2147352574);
        term36963 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term36963, term36963.getClass(), "numerator", -2147483648);
        setIntField(term36963, term36963.getClass(), "denominator", -2147352574);
        setField(term36963, term36963.getClass(), "toString", null);
        setField(term36963, term36963.getClass(), "toProperString", null);
        term36964 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term36964, term36964.getClass(), "numerator", -2147483648);
        setIntField(term36964, term36964.getClass(), "denominator", -2147352574);
        setField(term36964, term36964.getClass(), "toString", null);
        setField(term36964, term36964.getClass(), "toProperString", null);
        term36960 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term36960, term36960.getClass(), "numerator", 0);
        setIntField(term36960, term36960.getClass(), "denominator", 1);
        setField(term36960, term36960.getClass(), "toString", null);
        setField(term36960, term36960.getClass(), "toProperString", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang.math.Fraction");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.apache.commons.lang.math.Fraction");
        Object[] args = new Object[1];
        args[0] = term36476;
        Object retValue = callMethod(klass, "subtract", argTypes, term36476, args);
        assertTrue(recursiveEquals(term36476, term36963));
        assertTrue(recursiveEquals(term36476, term36964));
        assertTrue(recursiveEquals(retValue, term36960));
    }

};


