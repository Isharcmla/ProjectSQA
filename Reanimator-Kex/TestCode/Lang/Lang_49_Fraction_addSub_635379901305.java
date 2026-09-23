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

public class Fraction_addSub_635379901305 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term79667;
     Object term79795;
     Object term79796;
     Object term79788;

    public Fraction_addSub_635379901305() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term79667 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term79667, term79667.getClass(), "numerator", -2147483648);
        setIntField(term79667, term79667.getClass(), "denominator", 1073741824);
        term79795 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term79795, term79795.getClass(), "numerator", -2147483648);
        setIntField(term79795, term79795.getClass(), "denominator", 1073741824);
        setField(term79795, term79795.getClass(), "toString", null);
        setField(term79795, term79795.getClass(), "toProperString", null);
        term79796 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term79796, term79796.getClass(), "numerator", -2147483648);
        setIntField(term79796, term79796.getClass(), "denominator", 1073741824);
        setField(term79796, term79796.getClass(), "toString", null);
        setField(term79796, term79796.getClass(), "toProperString", null);
        term79788 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term79788, term79788.getClass(), "numerator", 0);
        setIntField(term79788, term79788.getClass(), "denominator", 1);
        setField(term79788, term79788.getClass(), "toString", null);
        setField(term79788, term79788.getClass(), "toProperString", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang.math.Fraction");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("org.apache.commons.lang.math.Fraction");
        argTypes[1] = boolean.class;
        Object[] args = new Object[2];
        args[0] = term79667;
        args[1] = false;
        Object retValue = callMethod(klass, "addSub", argTypes, term79667, args);
        assertTrue(recursiveEquals(term79667, term79795));
        assertTrue(recursiveEquals(term79667, term79796));
        assertTrue(recursiveEquals(retValue, term79788));
    }

};


