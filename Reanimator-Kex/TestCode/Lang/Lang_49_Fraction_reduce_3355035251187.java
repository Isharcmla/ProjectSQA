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

public class Fraction_reduce_3355035251187 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term346198;
     Object term346366;
     Object term346360;

    public Fraction_reduce_3355035251187() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term346198 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term346198, term346198.getClass(), "numerator", 99330);
        setIntField(term346198, term346198.getClass(), "denominator", 2147257849);
        term346366 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term346366, term346366.getClass(), "numerator", 99330);
        setIntField(term346366, term346366.getClass(), "denominator", 2147257849);
        setField(term346366, term346366.getClass(), "toString", null);
        setField(term346366, term346366.getClass(), "toProperString", null);
        term346360 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term346360, term346360.getClass(), "numerator", 9030);
        setIntField(term346360, term346360.getClass(), "denominator", 195205259);
        setField(term346360, term346360.getClass(), "toString", null);
        setField(term346360, term346360.getClass(), "toProperString", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang.math.Fraction");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "reduce", argTypes, term346198, args);
        assertTrue(recursiveEquals(term346198, term346366));
        assertTrue(recursiveEquals(retValue, term346360));
    }

};


