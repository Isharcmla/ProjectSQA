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

public class Fraction_reduce_3355035251778 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term520410;
     Object term520818;
     Object term520812;

    public Fraction_reduce_3355035251778() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term520410 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term520410, term520410.getClass(), "numerator", 33874386);
        setIntField(term520410, term520410.getClass(), "denominator", 2060813825);
        term520818 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term520818, term520818.getClass(), "numerator", 33874386);
        setIntField(term520818, term520818.getClass(), "denominator", 2060813825);
        setField(term520818, term520818.getClass(), "toString", null);
        setField(term520818, term520818.getClass(), "toProperString", null);
        term520812 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term520812, term520812.getClass(), "numerator", 691314);
        setIntField(term520812, term520812.getClass(), "denominator", 42057425);
        setField(term520812, term520812.getClass(), "toString", null);
        setField(term520812, term520812.getClass(), "toProperString", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang.math.Fraction");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "reduce", argTypes, term520410, args);
        assertTrue(recursiveEquals(term520410, term520818));
        assertTrue(recursiveEquals(retValue, term520812));
    }

};


