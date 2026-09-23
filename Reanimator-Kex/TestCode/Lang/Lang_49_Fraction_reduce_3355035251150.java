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

public class Fraction_reduce_3355035251150 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term333660;
     Object term334072;
     Object term334069;

    public Fraction_reduce_3355035251150() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term333660 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term333660, term333660.getClass(), "numerator", 1476395058);
        setIntField(term333660, term333660.getClass(), "denominator", 1073791009);
        term334072 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term334072, term334072.getClass(), "numerator", 1476395058);
        setIntField(term334072, term334072.getClass(), "denominator", 1073791009);
        setField(term334072, term334072.getClass(), "toString", null);
        setField(term334072, term334072.getClass(), "toProperString", null);
        term334069 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term334069, term334069.getClass(), "numerator", 1476395058);
        setIntField(term334069, term334069.getClass(), "denominator", 1073791009);
        setField(term334069, term334069.getClass(), "toString", null);
        setField(term334069, term334069.getClass(), "toProperString", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang.math.Fraction");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "reduce", argTypes, term333660, args);
        assertTrue(recursiveEquals(term333660, term334072));
        assertTrue(recursiveEquals(retValue, term334069));
    }

};


