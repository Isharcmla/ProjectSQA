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

public class Fraction_reduce_335503525144 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term30300;
     Object term30888;
     Object term30882;

    public Fraction_reduce_335503525144() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term30300 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term30300, term30300.getClass(), "numerator", -2147483646);
        setIntField(term30300, term30300.getClass(), "denominator", 1073741824);
        term30888 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term30888, term30888.getClass(), "numerator", -2147483646);
        setIntField(term30888, term30888.getClass(), "denominator", 1073741824);
        setField(term30888, term30888.getClass(), "toString", null);
        setField(term30888, term30888.getClass(), "toProperString", null);
        term30882 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term30882, term30882.getClass(), "numerator", -1073741823);
        setIntField(term30882, term30882.getClass(), "denominator", 536870912);
        setField(term30882, term30882.getClass(), "toString", null);
        setField(term30882, term30882.getClass(), "toProperString", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang.math.Fraction");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "reduce", argTypes, term30300, args);
        assertTrue(recursiveEquals(term30300, term30888));
        assertTrue(recursiveEquals(retValue, term30882));
    }

};


