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

public class Fraction_reduce_3355035252000 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term587736;
     Object term588345;
     Object term588342;

    public Fraction_reduce_3355035252000() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term587736 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term587736, term587736.getClass(), "numerator", 1073741902);
        setIntField(term587736, term587736.getClass(), "denominator", 2147473919);
        term588345 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term588345, term588345.getClass(), "numerator", 1073741902);
        setIntField(term588345, term588345.getClass(), "denominator", 2147473919);
        setField(term588345, term588345.getClass(), "toString", null);
        setField(term588345, term588345.getClass(), "toProperString", null);
        term588342 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term588342, term588342.getClass(), "numerator", 1073741902);
        setIntField(term588342, term588342.getClass(), "denominator", 2147473919);
        setField(term588342, term588342.getClass(), "toString", null);
        setField(term588342, term588342.getClass(), "toProperString", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang.math.Fraction");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "reduce", argTypes, term587736, args);
        assertTrue(recursiveEquals(term587736, term588345));
        assertTrue(recursiveEquals(retValue, term588342));
    }

};


