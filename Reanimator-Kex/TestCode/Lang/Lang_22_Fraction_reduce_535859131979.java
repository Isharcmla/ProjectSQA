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

public class Fraction_reduce_535859131979 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term314007;
     Object term314108;
     Object term314105;

    public Fraction_reduce_535859131979() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term314007 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term314007, term314007.getClass(), "numerator", -2111384126);
        setIntField(term314007, term314007.getClass(), "denominator", 1383473351);
        term314108 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term314108, term314108.getClass(), "numerator", -2111384126);
        setIntField(term314108, term314108.getClass(), "denominator", 1383473351);
        setField(term314108, term314108.getClass(), "toString", null);
        setField(term314108, term314108.getClass(), "toProperString", null);
        term314105 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term314105, term314105.getClass(), "numerator", -2111384126);
        setIntField(term314105, term314105.getClass(), "denominator", 1383473351);
        setField(term314105, term314105.getClass(), "toString", null);
        setField(term314105, term314105.getClass(), "toProperString", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang3.math.Fraction");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "reduce", argTypes, term314007, args);
        assertTrue(recursiveEquals(term314007, term314108));
        assertTrue(recursiveEquals(retValue, term314105));
    }

};


