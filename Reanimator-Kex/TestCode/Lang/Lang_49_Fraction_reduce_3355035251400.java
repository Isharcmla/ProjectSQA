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

public class Fraction_reduce_3355035251400 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term408947;
     Object term409708;
     Object term409702;

    public Fraction_reduce_3355035251400() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term408947 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term408947, term408947.getClass(), "numerator", 1556227186);
        setIntField(term408947, term408947.getClass(), "denominator", 1865302257);
        term409708 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term409708, term409708.getClass(), "numerator", 1556227186);
        setIntField(term409708, term409708.getClass(), "denominator", 1865302257);
        setField(term409708, term409708.getClass(), "toString", null);
        setField(term409708, term409708.getClass(), "toProperString", null);
        term409702 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term409702, term409702.getClass(), "numerator", 81906694);
        setIntField(term409702, term409702.getClass(), "denominator", 98173803);
        setField(term409702, term409702.getClass(), "toString", null);
        setField(term409702, term409702.getClass(), "toProperString", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang.math.Fraction");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "reduce", argTypes, term408947, args);
        assertTrue(recursiveEquals(term408947, term409708));
        assertTrue(recursiveEquals(retValue, term409702));
    }

};


