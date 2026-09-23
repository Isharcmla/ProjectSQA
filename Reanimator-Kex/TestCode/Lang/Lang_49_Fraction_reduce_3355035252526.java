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

public class Fraction_reduce_3355035252526 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term752686;
     Object term753818;
     Object term753815;

    public Fraction_reduce_3355035252526() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term752686 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term752686, term752686.getClass(), "numerator", -534630094);
        setIntField(term752686, term752686.getClass(), "denominator", 1879967263);
        term753818 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term753818, term753818.getClass(), "numerator", -534630094);
        setIntField(term753818, term753818.getClass(), "denominator", 1879967263);
        setField(term753818, term753818.getClass(), "toString", null);
        setField(term753818, term753818.getClass(), "toProperString", null);
        term753815 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term753815, term753815.getClass(), "numerator", -534630094);
        setIntField(term753815, term753815.getClass(), "denominator", 1879967263);
        setField(term753815, term753815.getClass(), "toString", null);
        setField(term753815, term753815.getClass(), "toProperString", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang.math.Fraction");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "reduce", argTypes, term752686, args);
        assertTrue(recursiveEquals(term752686, term753818));
        assertTrue(recursiveEquals(retValue, term753815));
    }

};


