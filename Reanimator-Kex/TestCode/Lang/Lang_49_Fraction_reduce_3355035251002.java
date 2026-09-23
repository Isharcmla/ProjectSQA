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

public class Fraction_reduce_3355035251002 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term288441;
     Object term288975;
     Object term288972;

    public Fraction_reduce_3355035251002() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term288441 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term288441, term288441.getClass(), "numerator", -844043358);
        setIntField(term288441, term288441.getClass(), "denominator", 1842594215);
        term288975 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term288975, term288975.getClass(), "numerator", -844043358);
        setIntField(term288975, term288975.getClass(), "denominator", 1842594215);
        setField(term288975, term288975.getClass(), "toString", null);
        setField(term288975, term288975.getClass(), "toProperString", null);
        term288972 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term288972, term288972.getClass(), "numerator", -844043358);
        setIntField(term288972, term288972.getClass(), "denominator", 1842594215);
        setField(term288972, term288972.getClass(), "toString", null);
        setField(term288972, term288972.getClass(), "toProperString", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang.math.Fraction");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "reduce", argTypes, term288441, args);
        assertTrue(recursiveEquals(term288441, term288975));
        assertTrue(recursiveEquals(retValue, term288972));
    }

};


