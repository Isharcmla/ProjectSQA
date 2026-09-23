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

public class Fraction_reduce_3355035252819 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term842817;
     Object term843056;
     Object term843050;

    public Fraction_reduce_3355035252819() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term842817 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term842817, term842817.getClass(), "numerator", -1874523566);
        setIntField(term842817, term842817.getClass(), "denominator", 1073741824);
        term843056 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term843056, term843056.getClass(), "numerator", -1874523566);
        setIntField(term843056, term843056.getClass(), "denominator", 1073741824);
        setField(term843056, term843056.getClass(), "toString", null);
        setField(term843056, term843056.getClass(), "toProperString", null);
        term843050 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term843050, term843050.getClass(), "numerator", -937261783);
        setIntField(term843050, term843050.getClass(), "denominator", 536870912);
        setField(term843050, term843050.getClass(), "toString", null);
        setField(term843050, term843050.getClass(), "toProperString", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang.math.Fraction");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "reduce", argTypes, term842817, args);
        assertTrue(recursiveEquals(term842817, term843056));
        assertTrue(recursiveEquals(retValue, term843050));
    }

};


