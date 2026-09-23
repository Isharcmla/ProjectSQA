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

public class Fraction_reduce_335503525228 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term56151;
     Object term56703;
     Object term56700;

    public Fraction_reduce_335503525228() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term56151 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term56151, term56151.getClass(), "numerator", 2);
        setIntField(term56151, term56151.getClass(), "denominator", 2147483385);
        term56703 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term56703, term56703.getClass(), "numerator", 2);
        setIntField(term56703, term56703.getClass(), "denominator", 2147483385);
        setField(term56703, term56703.getClass(), "toString", null);
        setField(term56703, term56703.getClass(), "toProperString", null);
        term56700 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term56700, term56700.getClass(), "numerator", 2);
        setIntField(term56700, term56700.getClass(), "denominator", 2147483385);
        setField(term56700, term56700.getClass(), "toString", null);
        setField(term56700, term56700.getClass(), "toProperString", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang.math.Fraction");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "reduce", argTypes, term56151, args);
        assertTrue(recursiveEquals(term56151, term56703));
        assertTrue(recursiveEquals(retValue, term56700));
    }

};


