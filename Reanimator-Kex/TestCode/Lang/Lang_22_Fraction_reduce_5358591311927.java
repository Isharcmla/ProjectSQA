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

public class Fraction_reduce_5358591311927 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term628276;
     Object term629185;
     Object term629179;

    public Fraction_reduce_5358591311927() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term628276 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term628276, term628276.getClass(), "numerator", -2014297586);
        setIntField(term628276, term628276.getClass(), "denominator", 1007150865);
        term629185 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term629185, term629185.getClass(), "numerator", -2014297586);
        setIntField(term629185, term629185.getClass(), "denominator", 1007150865);
        setField(term629185, term629185.getClass(), "toString", null);
        setField(term629185, term629185.getClass(), "toProperString", null);
        term629179 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term629179, term629179.getClass(), "numerator", -287756798);
        setIntField(term629179, term629179.getClass(), "denominator", 143878695);
        setField(term629179, term629179.getClass(), "toString", null);
        setField(term629179, term629179.getClass(), "toProperString", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang3.math.Fraction");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "reduce", argTypes, term628276, args);
        assertTrue(recursiveEquals(term628276, term629185));
        assertTrue(recursiveEquals(retValue, term629179));
    }

};


