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

public class Fraction_reduce_5358591311872 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term611689;
     Object term612237;
     Object term612234;

    public Fraction_reduce_5358591311872() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term611689 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term611689, term611689.getClass(), "numerator", -552836550);
        setIntField(term611689, term611689.getClass(), "denominator", 780390683);
        term612237 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term612237, term612237.getClass(), "numerator", -552836550);
        setIntField(term612237, term612237.getClass(), "denominator", 780390683);
        setField(term612237, term612237.getClass(), "toString", null);
        setField(term612237, term612237.getClass(), "toProperString", null);
        term612234 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term612234, term612234.getClass(), "numerator", -552836550);
        setIntField(term612234, term612234.getClass(), "denominator", 780390683);
        setField(term612234, term612234.getClass(), "toString", null);
        setField(term612234, term612234.getClass(), "toProperString", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang3.math.Fraction");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "reduce", argTypes, term611689, args);
        assertTrue(recursiveEquals(term611689, term612237));
        assertTrue(recursiveEquals(retValue, term612234));
    }

};


