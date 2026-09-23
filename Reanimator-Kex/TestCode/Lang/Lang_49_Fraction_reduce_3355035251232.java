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

public class Fraction_reduce_3355035251232 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term359726;
     Object term360586;
     Object term360583;

    public Fraction_reduce_3355035251232() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term359726 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term359726, term359726.getClass(), "numerator", -1107260927);
        setIntField(term359726, term359726.getClass(), "denominator", 1073741824);
        term360586 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term360586, term360586.getClass(), "numerator", -1107260927);
        setIntField(term360586, term360586.getClass(), "denominator", 1073741824);
        setField(term360586, term360586.getClass(), "toString", null);
        setField(term360586, term360586.getClass(), "toProperString", null);
        term360583 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term360583, term360583.getClass(), "numerator", -1107260927);
        setIntField(term360583, term360583.getClass(), "denominator", 1073741824);
        setField(term360583, term360583.getClass(), "toString", null);
        setField(term360583, term360583.getClass(), "toProperString", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang.math.Fraction");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "reduce", argTypes, term359726, args);
        assertTrue(recursiveEquals(term359726, term360586));
        assertTrue(recursiveEquals(retValue, term360583));
    }

};


