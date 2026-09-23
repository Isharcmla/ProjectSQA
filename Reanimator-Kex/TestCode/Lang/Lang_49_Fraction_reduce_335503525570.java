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

public class Fraction_reduce_335503525570 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term156808;
     Object term157298;
     Object term157295;

    public Fraction_reduce_335503525570() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term156808 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term156808, term156808.getClass(), "numerator", -171310714);
        setIntField(term156808, term156808.getClass(), "denominator", 2114126117);
        term157298 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term157298, term157298.getClass(), "numerator", -171310714);
        setIntField(term157298, term157298.getClass(), "denominator", 2114126117);
        setField(term157298, term157298.getClass(), "toString", null);
        setField(term157298, term157298.getClass(), "toProperString", null);
        term157295 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term157295, term157295.getClass(), "numerator", -171310714);
        setIntField(term157295, term157295.getClass(), "denominator", 2114126117);
        setField(term157295, term157295.getClass(), "toString", null);
        setField(term157295, term157295.getClass(), "toProperString", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang.math.Fraction");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "reduce", argTypes, term156808, args);
        assertTrue(recursiveEquals(term156808, term157298));
        assertTrue(recursiveEquals(retValue, term157295));
    }

};


