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

public class Fraction_reduce_535859131556 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term171204;
     Object term171734;
     Object term171731;

    public Fraction_reduce_535859131556() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term171204 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term171204, term171204.getClass(), "numerator", -913435966);
        setIntField(term171204, term171204.getClass(), "denominator", 1031956535);
        term171734 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term171734, term171734.getClass(), "numerator", -913435966);
        setIntField(term171734, term171734.getClass(), "denominator", 1031956535);
        setField(term171734, term171734.getClass(), "toString", null);
        setField(term171734, term171734.getClass(), "toProperString", null);
        term171731 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term171731, term171731.getClass(), "numerator", -913435966);
        setIntField(term171731, term171731.getClass(), "denominator", 1031956535);
        setField(term171731, term171731.getClass(), "toString", null);
        setField(term171731, term171731.getClass(), "toProperString", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang3.math.Fraction");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "reduce", argTypes, term171204, args);
        assertTrue(recursiveEquals(term171204, term171734));
        assertTrue(recursiveEquals(retValue, term171731));
    }

};


