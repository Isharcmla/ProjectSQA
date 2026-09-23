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

public class Fraction_reduce_5358591311100 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term352719;
     Object term353185;
     Object term353182;

    public Fraction_reduce_5358591311100() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term352719 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term352719, term352719.getClass(), "numerator", 34894834);
        setIntField(term352719, term352719.getClass(), "denominator", 2138292225);
        term353185 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term353185, term353185.getClass(), "numerator", 34894834);
        setIntField(term353185, term353185.getClass(), "denominator", 2138292225);
        setField(term353185, term353185.getClass(), "toString", null);
        setField(term353185, term353185.getClass(), "toProperString", null);
        term353182 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term353182, term353182.getClass(), "numerator", 34894834);
        setIntField(term353182, term353182.getClass(), "denominator", 2138292225);
        setField(term353182, term353182.getClass(), "toString", null);
        setField(term353182, term353182.getClass(), "toProperString", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang3.math.Fraction");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "reduce", argTypes, term352719, args);
        assertTrue(recursiveEquals(term352719, term353185));
        assertTrue(recursiveEquals(retValue, term353182));
    }

};


