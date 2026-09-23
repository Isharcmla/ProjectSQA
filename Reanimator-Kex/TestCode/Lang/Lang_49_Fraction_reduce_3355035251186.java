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

public class Fraction_reduce_3355035251186 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term345773;
     Object term346264;
     Object term346258;

    public Fraction_reduce_3355035251186() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term345773 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term345773, term345773.getClass(), "numerator", -456655694);
        setIntField(term345773, term345773.getClass(), "denominator", 228065255);
        term346264 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term346264, term346264.getClass(), "numerator", -456655694);
        setIntField(term346264, term346264.getClass(), "denominator", 228065255);
        setField(term346264, term346264.getClass(), "toString", null);
        setField(term346264, term346264.getClass(), "toProperString", null);
        term346258 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term346258, term346258.getClass(), "numerator", -111298);
        setIntField(term346258, term346258.getClass(), "denominator", 55585);
        setField(term346258, term346258.getClass(), "toString", null);
        setField(term346258, term346258.getClass(), "toProperString", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang.math.Fraction");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "reduce", argTypes, term345773, args);
        assertTrue(recursiveEquals(term345773, term346264));
        assertTrue(recursiveEquals(retValue, term346258));
    }

};


