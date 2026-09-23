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

public class Fraction_getProperNumerator_92468080342 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term137;
     Object term2641;

    public Fraction_getProperNumerator_92468080342() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term137 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term137, term137.getClass(), "numerator", 597278769);
        setIntField(term137, term137.getClass(), "denominator", -1685132342);
        setField(term137, term137.getClass(), "toString", "EGtDIRbSSb");
        setField(term137, term137.getClass(), "toProperString", "SzjVpOQTyS");
        term2641 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term2641, term2641.getClass(), "numerator", 597278769);
        setIntField(term2641, term2641.getClass(), "denominator", -1685132342);
        setField(term2641, term2641.getClass(), "toString", "EGtDIRbSSb");
        setField(term2641, term2641.getClass(), "toProperString", "SzjVpOQTyS");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang.math.Fraction");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "getProperNumerator", argTypes, term137, args);
        assertTrue(recursiveEquals(term137, term2641));
        assertTrue(recursiveEquals(retValue, 597278769));
    }

};


