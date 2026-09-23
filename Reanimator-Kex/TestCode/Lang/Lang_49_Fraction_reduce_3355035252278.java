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

public class Fraction_reduce_3355035252278 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term673813;
     Object term674614;
     Object term674611;

    public Fraction_reduce_3355035252278() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term673813 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term673813, term673813.getClass(), "numerator", 42400818);
        setIntField(term673813, term673813.getClass(), "denominator", 826277905);
        term674614 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term674614, term674614.getClass(), "numerator", 42400818);
        setIntField(term674614, term674614.getClass(), "denominator", 826277905);
        setField(term674614, term674614.getClass(), "toString", null);
        setField(term674614, term674614.getClass(), "toProperString", null);
        term674611 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term674611, term674611.getClass(), "numerator", 42400818);
        setIntField(term674611, term674611.getClass(), "denominator", 826277905);
        setField(term674611, term674611.getClass(), "toString", null);
        setField(term674611, term674611.getClass(), "toProperString", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang.math.Fraction");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "reduce", argTypes, term673813, args);
        assertTrue(recursiveEquals(term673813, term674614));
        assertTrue(recursiveEquals(retValue, term674611));
    }

};


