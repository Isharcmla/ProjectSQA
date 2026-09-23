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

public class Fraction_reduce_3355035251279 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term374302;
     Object term374473;
     Object term374470;

    public Fraction_reduce_3355035251279() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term374302 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term374302, term374302.getClass(), "numerator", -654849286);
        setIntField(term374302, term374302.getClass(), "denominator", 327424635);
        term374473 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term374473, term374473.getClass(), "numerator", -654849286);
        setIntField(term374473, term374473.getClass(), "denominator", 327424635);
        setField(term374473, term374473.getClass(), "toString", null);
        setField(term374473, term374473.getClass(), "toProperString", null);
        term374470 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term374470, term374470.getClass(), "numerator", -654849286);
        setIntField(term374470, term374470.getClass(), "denominator", 327424635);
        setField(term374470, term374470.getClass(), "toString", null);
        setField(term374470, term374470.getClass(), "toProperString", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang.math.Fraction");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "reduce", argTypes, term374302, args);
        assertTrue(recursiveEquals(term374302, term374473));
        assertTrue(recursiveEquals(retValue, term374470));
    }

};


