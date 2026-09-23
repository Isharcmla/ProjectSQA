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

public class Fraction_reduce_3355035252040 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term599323;
     Object term599771;
     Object term599768;

    public Fraction_reduce_3355035252040() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term599323 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term599323, term599323.getClass(), "numerator", -350708246);
        setIntField(term599323, term599323.getClass(), "denominator", 2084429187);
        term599771 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term599771, term599771.getClass(), "numerator", -350708246);
        setIntField(term599771, term599771.getClass(), "denominator", 2084429187);
        setField(term599771, term599771.getClass(), "toString", null);
        setField(term599771, term599771.getClass(), "toProperString", null);
        term599768 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term599768, term599768.getClass(), "numerator", -350708246);
        setIntField(term599768, term599768.getClass(), "denominator", 2084429187);
        setField(term599768, term599768.getClass(), "toString", null);
        setField(term599768, term599768.getClass(), "toProperString", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang.math.Fraction");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "reduce", argTypes, term599323, args);
        assertTrue(recursiveEquals(term599323, term599771));
        assertTrue(recursiveEquals(retValue, term599768));
    }

};


