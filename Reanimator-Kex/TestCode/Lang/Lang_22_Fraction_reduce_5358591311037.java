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

public class Fraction_reduce_5358591311037 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term333295;
     Object term334188;
     Object term334185;

    public Fraction_reduce_5358591311037() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term333295 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term333295, term333295.getClass(), "numerator", 587173042);
        setIntField(term333295, term333295.getClass(), "denominator", 309724033);
        term334188 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term334188, term334188.getClass(), "numerator", 587173042);
        setIntField(term334188, term334188.getClass(), "denominator", 309724033);
        setField(term334188, term334188.getClass(), "toString", null);
        setField(term334188, term334188.getClass(), "toProperString", null);
        term334185 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term334185, term334185.getClass(), "numerator", 587173042);
        setIntField(term334185, term334185.getClass(), "denominator", 309724033);
        setField(term334185, term334185.getClass(), "toString", null);
        setField(term334185, term334185.getClass(), "toProperString", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang3.math.Fraction");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "reduce", argTypes, term333295, args);
        assertTrue(recursiveEquals(term333295, term334188));
        assertTrue(recursiveEquals(retValue, term334185));
    }

};


