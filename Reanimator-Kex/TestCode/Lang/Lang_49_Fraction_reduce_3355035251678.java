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

public class Fraction_reduce_3355035251678 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term493396;
     Object term493879;
     Object term493876;

    public Fraction_reduce_3355035251678() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term493396 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term493396, term493396.getClass(), "numerator", -777783214);
        setIntField(term493396, term493396.getClass(), "denominator", 1907595791);
        term493879 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term493879, term493879.getClass(), "numerator", -777783214);
        setIntField(term493879, term493879.getClass(), "denominator", 1907595791);
        setField(term493879, term493879.getClass(), "toString", null);
        setField(term493879, term493879.getClass(), "toProperString", null);
        term493876 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term493876, term493876.getClass(), "numerator", -777783214);
        setIntField(term493876, term493876.getClass(), "denominator", 1907595791);
        setField(term493876, term493876.getClass(), "toString", null);
        setField(term493876, term493876.getClass(), "toProperString", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang.math.Fraction");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "reduce", argTypes, term493396, args);
        assertTrue(recursiveEquals(term493396, term493879));
        assertTrue(recursiveEquals(retValue, term493876));
    }

};


