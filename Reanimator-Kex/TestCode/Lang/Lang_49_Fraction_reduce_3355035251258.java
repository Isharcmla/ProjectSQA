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

public class Fraction_reduce_3355035251258 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term368280;
     Object term368963;
     Object term368957;

    public Fraction_reduce_3355035251258() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term368280 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term368280, term368280.getClass(), "numerator", -2147375142);
        setIntField(term368280, term368280.getClass(), "denominator", 33561615);
        term368963 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term368963, term368963.getClass(), "numerator", -2147375142);
        setIntField(term368963, term368963.getClass(), "denominator", 33561615);
        setField(term368963, term368963.getClass(), "toString", null);
        setField(term368963, term368963.getClass(), "toProperString", null);
        term368957 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term368957, term368957.getClass(), "numerator", -715791714);
        setIntField(term368957, term368957.getClass(), "denominator", 11187205);
        setField(term368957, term368957.getClass(), "toString", null);
        setField(term368957, term368957.getClass(), "toProperString", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang.math.Fraction");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "reduce", argTypes, term368280, args);
        assertTrue(recursiveEquals(term368280, term368963));
        assertTrue(recursiveEquals(retValue, term368957));
    }

};


