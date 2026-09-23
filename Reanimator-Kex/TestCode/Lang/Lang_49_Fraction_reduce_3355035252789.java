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

public class Fraction_reduce_3355035252789 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term832622;
     Object term833939;
     Object term833936;

    public Fraction_reduce_3355035252789() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term832622 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term832622, term832622.getClass(), "numerator", 526078978);
        setIntField(term832622, term832622.getClass(), "denominator", 1346611705);
        term833939 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term833939, term833939.getClass(), "numerator", 526078978);
        setIntField(term833939, term833939.getClass(), "denominator", 1346611705);
        setField(term833939, term833939.getClass(), "toString", null);
        setField(term833939, term833939.getClass(), "toProperString", null);
        term833936 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term833936, term833936.getClass(), "numerator", 526078978);
        setIntField(term833936, term833936.getClass(), "denominator", 1346611705);
        setField(term833936, term833936.getClass(), "toString", null);
        setField(term833936, term833936.getClass(), "toProperString", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang.math.Fraction");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "reduce", argTypes, term832622, args);
        assertTrue(recursiveEquals(term832622, term833939));
        assertTrue(recursiveEquals(retValue, term833936));
    }

};


