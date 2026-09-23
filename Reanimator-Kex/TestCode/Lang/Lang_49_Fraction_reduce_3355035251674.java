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

public class Fraction_reduce_3355035251674 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term491983;
     Object term492729;
     Object term492723;

    public Fraction_reduce_3355035251674() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term491983 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term491983, term491983.getClass(), "numerator", -128624762);
        setIntField(term491983, term491983.getClass(), "denominator", 1867725573);
        term492729 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term492729, term492729.getClass(), "numerator", -128624762);
        setIntField(term492729, term492729.getClass(), "denominator", 1867725573);
        setField(term492729, term492729.getClass(), "toString", null);
        setField(term492729, term492729.getClass(), "toProperString", null);
        term492723 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term492723, term492723.getClass(), "numerator", -18374966);
        setIntField(term492723, term492723.getClass(), "denominator", 266817939);
        setField(term492723, term492723.getClass(), "toString", null);
        setField(term492723, term492723.getClass(), "toProperString", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang.math.Fraction");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "reduce", argTypes, term491983, args);
        assertTrue(recursiveEquals(term491983, term492729));
        assertTrue(recursiveEquals(retValue, term492723));
    }

};


