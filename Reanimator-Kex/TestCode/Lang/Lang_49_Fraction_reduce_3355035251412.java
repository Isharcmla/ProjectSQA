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

public class Fraction_reduce_3355035251412 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term412214;
     Object term412488;
     Object term412485;

    public Fraction_reduce_3355035251412() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term412214 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term412214, term412214.getClass(), "numerator", 78);
        setIntField(term412214, term412214.getClass(), "denominator", 2038431743);
        term412488 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term412488, term412488.getClass(), "numerator", 78);
        setIntField(term412488, term412488.getClass(), "denominator", 2038431743);
        setField(term412488, term412488.getClass(), "toString", null);
        setField(term412488, term412488.getClass(), "toProperString", null);
        term412485 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term412485, term412485.getClass(), "numerator", 78);
        setIntField(term412485, term412485.getClass(), "denominator", 2038431743);
        setField(term412485, term412485.getClass(), "toString", null);
        setField(term412485, term412485.getClass(), "toProperString", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang.math.Fraction");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "reduce", argTypes, term412214, args);
        assertTrue(recursiveEquals(term412214, term412488));
        assertTrue(recursiveEquals(retValue, term412485));
    }

};


