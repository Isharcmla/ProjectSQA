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

public class Fraction_reduce_3355035252254 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term667128;
     Object term667715;
     Object term667712;

    public Fraction_reduce_3355035252254() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term667128 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term667128, term667128.getClass(), "numerator", -1322252194);
        setIntField(term667128, term667128.getClass(), "denominator", 1502086681);
        term667715 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term667715, term667715.getClass(), "numerator", -1322252194);
        setIntField(term667715, term667715.getClass(), "denominator", 1502086681);
        setField(term667715, term667715.getClass(), "toString", null);
        setField(term667715, term667715.getClass(), "toProperString", null);
        term667712 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term667712, term667712.getClass(), "numerator", -1322252194);
        setIntField(term667712, term667712.getClass(), "denominator", 1502086681);
        setField(term667712, term667712.getClass(), "toString", null);
        setField(term667712, term667712.getClass(), "toProperString", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang.math.Fraction");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "reduce", argTypes, term667128, args);
        assertTrue(recursiveEquals(term667128, term667715));
        assertTrue(recursiveEquals(retValue, term667712));
    }

};


