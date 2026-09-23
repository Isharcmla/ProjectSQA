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

public class Fraction_reduce_335503525920 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term262390;
     Object term263108;
     Object term263105;

    public Fraction_reduce_335503525920() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term262390 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term262390, term262390.getClass(), "numerator", -1178621378);
        setIntField(term262390, term262390.getClass(), "denominator", 903853673);
        term263108 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term263108, term263108.getClass(), "numerator", -1178621378);
        setIntField(term263108, term263108.getClass(), "denominator", 903853673);
        setField(term263108, term263108.getClass(), "toString", null);
        setField(term263108, term263108.getClass(), "toProperString", null);
        term263105 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term263105, term263105.getClass(), "numerator", -1178621378);
        setIntField(term263105, term263105.getClass(), "denominator", 903853673);
        setField(term263105, term263105.getClass(), "toString", null);
        setField(term263105, term263105.getClass(), "toProperString", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang.math.Fraction");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "reduce", argTypes, term262390, args);
        assertTrue(recursiveEquals(term262390, term263108));
        assertTrue(recursiveEquals(retValue, term263105));
    }

};


