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

public class Fraction_reduce_535859131807 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term255708;
     Object term255815;
     Object term255812;

    public Fraction_reduce_535859131807() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term255708 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term255708, term255708.getClass(), "numerator", -1039597538);
        setIntField(term255708, term255708.getClass(), "denominator", 1505528713);
        term255815 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term255815, term255815.getClass(), "numerator", -1039597538);
        setIntField(term255815, term255815.getClass(), "denominator", 1505528713);
        setField(term255815, term255815.getClass(), "toString", null);
        setField(term255815, term255815.getClass(), "toProperString", null);
        term255812 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term255812, term255812.getClass(), "numerator", -1039597538);
        setIntField(term255812, term255812.getClass(), "denominator", 1505528713);
        setField(term255812, term255812.getClass(), "toString", null);
        setField(term255812, term255812.getClass(), "toProperString", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang3.math.Fraction");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "reduce", argTypes, term255708, args);
        assertTrue(recursiveEquals(term255708, term255815));
        assertTrue(recursiveEquals(retValue, term255812));
    }

};


