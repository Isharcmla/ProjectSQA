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

public class Fraction_reduce_3355035251506 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term443551;
     Object term444059;
     Object term444056;

    public Fraction_reduce_3355035251506() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term443551 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term443551, term443551.getClass(), "numerator", 239202322);
        setIntField(term443551, term443551.getClass(), "denominator", 192745153);
        term444059 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term444059, term444059.getClass(), "numerator", 239202322);
        setIntField(term444059, term444059.getClass(), "denominator", 192745153);
        setField(term444059, term444059.getClass(), "toString", null);
        setField(term444059, term444059.getClass(), "toProperString", null);
        term444056 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term444056, term444056.getClass(), "numerator", 239202322);
        setIntField(term444056, term444056.getClass(), "denominator", 192745153);
        setField(term444056, term444056.getClass(), "toString", null);
        setField(term444056, term444056.getClass(), "toProperString", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang.math.Fraction");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "reduce", argTypes, term443551, args);
        assertTrue(recursiveEquals(term443551, term444059));
        assertTrue(recursiveEquals(retValue, term444056));
    }

};


