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

public class Fraction_reduce_3355035251769 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term518480;
     Object term518579;
     Object term518576;

    public Fraction_reduce_3355035251769() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term518480 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term518480, term518480.getClass(), "numerator", 61869970);
        setIntField(term518480, term518480.getClass(), "denominator", 2013770177);
        term518579 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term518579, term518579.getClass(), "numerator", 61869970);
        setIntField(term518579, term518579.getClass(), "denominator", 2013770177);
        setField(term518579, term518579.getClass(), "toString", null);
        setField(term518579, term518579.getClass(), "toProperString", null);
        term518576 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term518576, term518576.getClass(), "numerator", 61869970);
        setIntField(term518576, term518576.getClass(), "denominator", 2013770177);
        setField(term518576, term518576.getClass(), "toString", null);
        setField(term518576, term518576.getClass(), "toProperString", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang.math.Fraction");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "reduce", argTypes, term518480, args);
        assertTrue(recursiveEquals(term518480, term518579));
        assertTrue(recursiveEquals(retValue, term518576));
    }

};


