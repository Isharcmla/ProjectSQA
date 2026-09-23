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

public class Fraction_reduce_3355035251948 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term571528;
     Object term572163;
     Object term572160;

    public Fraction_reduce_3355035251948() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term571528 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term571528, term571528.getClass(), "numerator", 1476395042);
        setIntField(term571528, term571528.getClass(), "denominator", 1073741865);
        term572163 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term572163, term572163.getClass(), "numerator", 1476395042);
        setIntField(term572163, term572163.getClass(), "denominator", 1073741865);
        setField(term572163, term572163.getClass(), "toString", null);
        setField(term572163, term572163.getClass(), "toProperString", null);
        term572160 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term572160, term572160.getClass(), "numerator", 1476395042);
        setIntField(term572160, term572160.getClass(), "denominator", 1073741865);
        setField(term572160, term572160.getClass(), "toString", null);
        setField(term572160, term572160.getClass(), "toProperString", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang.math.Fraction");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "reduce", argTypes, term571528, args);
        assertTrue(recursiveEquals(term571528, term572163));
        assertTrue(recursiveEquals(retValue, term572160));
    }

};


