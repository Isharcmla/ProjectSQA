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

public class Fraction_reduce_3355035252174 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term642709;
     Object term643233;
     Object term643230;

    public Fraction_reduce_3355035252174() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term642709 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term642709, term642709.getClass(), "numerator", -1416416218);
        setIntField(term642709, term642709.getClass(), "denominator", 1981717013);
        term643233 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term643233, term643233.getClass(), "numerator", -1416416218);
        setIntField(term643233, term643233.getClass(), "denominator", 1981717013);
        setField(term643233, term643233.getClass(), "toString", null);
        setField(term643233, term643233.getClass(), "toProperString", null);
        term643230 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term643230, term643230.getClass(), "numerator", -1416416218);
        setIntField(term643230, term643230.getClass(), "denominator", 1981717013);
        setField(term643230, term643230.getClass(), "toString", null);
        setField(term643230, term643230.getClass(), "toProperString", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang.math.Fraction");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "reduce", argTypes, term642709, args);
        assertTrue(recursiveEquals(term642709, term643233));
        assertTrue(recursiveEquals(retValue, term643230));
    }

};


