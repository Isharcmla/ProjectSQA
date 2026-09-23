package org.apache.commons.lang3.math;

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
import static org.apache.commons.lang3.math.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import static org.apache.commons.lang3.math.EqualityUtils.*;

public class Fraction_reduce_5358591312002 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term652854;
     Object term653231;
     Object term653228;

    public Fraction_reduce_5358591312002() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term652854 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term652854, term652854.getClass(), "numerator", -399489918);
        setIntField(term652854, term652854.getClass(), "denominator", 2021660599);
        term653231 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term653231, term653231.getClass(), "numerator", -399489918);
        setIntField(term653231, term653231.getClass(), "denominator", 2021660599);
        setField(term653231, term653231.getClass(), "toString", null);
        setField(term653231, term653231.getClass(), "toProperString", null);
        term653228 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term653228, term653228.getClass(), "numerator", -399489918);
        setIntField(term653228, term653228.getClass(), "denominator", 2021660599);
        setField(term653228, term653228.getClass(), "toString", null);
        setField(term653228, term653228.getClass(), "toProperString", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang3.math.Fraction");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "reduce", argTypes, term652854, args);
        assertTrue(recursiveEquals(term652854, term653231));
        assertTrue(recursiveEquals(retValue, term653228));
    }

};


