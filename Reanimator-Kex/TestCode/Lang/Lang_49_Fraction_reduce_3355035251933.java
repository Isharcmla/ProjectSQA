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

public class Fraction_reduce_3355035251933 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term567549;
     Object term568426;
     Object term568423;

    public Fraction_reduce_3355035251933() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term567549 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term567549, term567549.getClass(), "numerator", 1082427602);
        setIntField(term567549, term567549.getClass(), "denominator", 1663168785);
        term568426 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term568426, term568426.getClass(), "numerator", 1082427602);
        setIntField(term568426, term568426.getClass(), "denominator", 1663168785);
        setField(term568426, term568426.getClass(), "toString", null);
        setField(term568426, term568426.getClass(), "toProperString", null);
        term568423 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term568423, term568423.getClass(), "numerator", 1082427602);
        setIntField(term568423, term568423.getClass(), "denominator", 1663168785);
        setField(term568423, term568423.getClass(), "toString", null);
        setField(term568423, term568423.getClass(), "toProperString", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang.math.Fraction");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "reduce", argTypes, term567549, args);
        assertTrue(recursiveEquals(term567549, term568426));
        assertTrue(recursiveEquals(retValue, term568423));
    }

};


