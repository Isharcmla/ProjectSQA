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

public class Fraction_reduce_3355035252006 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term589166;
     Object term589636;
     Object term589633;

    public Fraction_reduce_3355035252006() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term589166 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term589166, term589166.getClass(), "numerator", -910680018);
        setIntField(term589166, term589166.getClass(), "denominator", 254864381);
        term589636 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term589636, term589636.getClass(), "numerator", -910680018);
        setIntField(term589636, term589636.getClass(), "denominator", 254864381);
        setField(term589636, term589636.getClass(), "toString", null);
        setField(term589636, term589636.getClass(), "toProperString", null);
        term589633 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term589633, term589633.getClass(), "numerator", -910680018);
        setIntField(term589633, term589633.getClass(), "denominator", 254864381);
        setField(term589633, term589633.getClass(), "toString", null);
        setField(term589633, term589633.getClass(), "toProperString", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang.math.Fraction");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "reduce", argTypes, term589166, args);
        assertTrue(recursiveEquals(term589166, term589636));
        assertTrue(recursiveEquals(retValue, term589633));
    }

};


