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

public class Fraction_reduce_535859131695 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term220010;
     Object term220527;
     Object term220521;

    public Fraction_reduce_535859131695() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term220010 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term220010, term220010.getClass(), "numerator", -1089272310);
        setIntField(term220010, term220010.getClass(), "denominator", 1348049507);
        term220527 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term220527, term220527.getClass(), "numerator", -1089272310);
        setIntField(term220527, term220527.getClass(), "denominator", 1348049507);
        setField(term220527, term220527.getClass(), "toString", null);
        setField(term220527, term220527.getClass(), "toProperString", null);
        term220521 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term220521, term220521.getClass(), "numerator", -155610330);
        setIntField(term220521, term220521.getClass(), "denominator", 192578501);
        setField(term220521, term220521.getClass(), "toString", null);
        setField(term220521, term220521.getClass(), "toProperString", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang3.math.Fraction");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "reduce", argTypes, term220010, args);
        assertTrue(recursiveEquals(term220010, term220527));
        assertTrue(recursiveEquals(retValue, term220521));
    }

};


