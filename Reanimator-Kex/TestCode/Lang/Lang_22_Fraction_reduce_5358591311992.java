package org.apache.commons.lang3.math;

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
import static org.apache.commons.lang3.math.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import static org.apache.commons.lang3.math.EqualityUtils.*;

public class Fraction_reduce_5358591311992 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term649590;
     Object term650232;
     Object term650226;

    public Fraction_reduce_5358591311992() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term649590 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term649590, term649590.getClass(), "numerator", -1580728062);
        setIntField(term649590, term649590.getClass(), "denominator", 2027823255);
        term650232 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term650232, term650232.getClass(), "numerator", -1580728062);
        setIntField(term650232, term650232.getClass(), "denominator", 2027823255);
        setField(term650232, term650232.getClass(), "toString", null);
        setField(term650232, term650232.getClass(), "toProperString", null);
        term650226 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term650226, term650226.getClass(), "numerator", -526909354);
        setIntField(term650226, term650226.getClass(), "denominator", 675941085);
        setField(term650226, term650226.getClass(), "toString", null);
        setField(term650226, term650226.getClass(), "toProperString", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang3.math.Fraction");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "reduce", argTypes, term649590, args);
        assertTrue(recursiveEquals(term649590, term650232));
        assertTrue(recursiveEquals(retValue, term650226));
    }

};


