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

public class Fraction_reduce_3355035252839 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term849694;
     Object term849910;
     Object term849904;

    public Fraction_reduce_3355035252839() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term849694 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term849694, term849694.getClass(), "numerator", -1418824090);
        setIntField(term849694, term849694.getClass(), "denominator", 1073741824);
        term849910 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term849910, term849910.getClass(), "numerator", -1418824090);
        setIntField(term849910, term849910.getClass(), "denominator", 1073741824);
        setField(term849910, term849910.getClass(), "toString", null);
        setField(term849910, term849910.getClass(), "toProperString", null);
        term849904 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term849904, term849904.getClass(), "numerator", -709412045);
        setIntField(term849904, term849904.getClass(), "denominator", 536870912);
        setField(term849904, term849904.getClass(), "toString", null);
        setField(term849904, term849904.getClass(), "toProperString", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang.math.Fraction");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "reduce", argTypes, term849694, args);
        assertTrue(recursiveEquals(term849694, term849910));
        assertTrue(recursiveEquals(retValue, term849904));
    }

};


