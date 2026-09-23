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

public class Fraction_reduce_3355035252196 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term647675;
     Object term648610;
     Object term648607;

    public Fraction_reduce_3355035252196() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term647675 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term647675, term647675.getClass(), "numerator", -868695646);
        setIntField(term647675, term647675.getClass(), "denominator", 2021318567);
        term648610 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term648610, term648610.getClass(), "numerator", -868695646);
        setIntField(term648610, term648610.getClass(), "denominator", 2021318567);
        setField(term648610, term648610.getClass(), "toString", null);
        setField(term648610, term648610.getClass(), "toProperString", null);
        term648607 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term648607, term648607.getClass(), "numerator", -868695646);
        setIntField(term648607, term648607.getClass(), "denominator", 2021318567);
        setField(term648607, term648607.getClass(), "toString", null);
        setField(term648607, term648607.getClass(), "toProperString", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang.math.Fraction");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "reduce", argTypes, term647675, args);
        assertTrue(recursiveEquals(term647675, term648610));
        assertTrue(recursiveEquals(retValue, term648607));
    }

};


