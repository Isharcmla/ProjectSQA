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

public class Fraction_reduce_3355035251917 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term563402;
     Object term563522;
     Object term563519;

    public Fraction_reduce_3355035251917() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term563402 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term563402, term563402.getClass(), "numerator", -1493153679);
        setIntField(term563402, term563402.getClass(), "denominator", 1073741824);
        term563522 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term563522, term563522.getClass(), "numerator", -1493153679);
        setIntField(term563522, term563522.getClass(), "denominator", 1073741824);
        setField(term563522, term563522.getClass(), "toString", null);
        setField(term563522, term563522.getClass(), "toProperString", null);
        term563519 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term563519, term563519.getClass(), "numerator", -1493153679);
        setIntField(term563519, term563519.getClass(), "denominator", 1073741824);
        setField(term563519, term563519.getClass(), "toString", null);
        setField(term563519, term563519.getClass(), "toProperString", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang.math.Fraction");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "reduce", argTypes, term563402, args);
        assertTrue(recursiveEquals(term563402, term563522));
        assertTrue(recursiveEquals(retValue, term563519));
    }

};


