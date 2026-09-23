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
import java.lang.Integer;

public class Fraction_getReducedFraction_211553376937 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term15;
     Object term17;
     Object term1843;

    public Fraction_getReducedFraction_211553376937() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term15 = new Integer(-2038273078);
        term17 = new Integer(1227103734);
        term1843 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term1843, term1843.getClass(), "numerator", -1019136539);
        setIntField(term1843, term1843.getClass(), "denominator", 613551867);
        setField(term1843, term1843.getClass(), "toString", null);
        setField(term1843, term1843.getClass(), "toProperString", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang3.math.Fraction");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = int.class;
        argTypes[1] = int.class;
        Object[] args = new Object[2];
        args[0] = term15;
        args[1] = term17;
        Object retValue = callMethod(klass, "getReducedFraction", argTypes, null, args);
        assertTrue(recursiveEquals(term15, -2038273078));
        assertTrue(recursiveEquals(term17, 1227103734));
        assertTrue(recursiveEquals(retValue, term1843));
    }

};


