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

public class Fraction_reduce_5358591311845 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term603194;
     Object term603719;
     Object term603716;

    public Fraction_reduce_5358591311845() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term603194 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term603194, term603194.getClass(), "numerator", -2113273846);
        setIntField(term603194, term603194.getClass(), "denominator", 2137014275);
        term603719 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term603719, term603719.getClass(), "numerator", -2113273846);
        setIntField(term603719, term603719.getClass(), "denominator", 2137014275);
        setField(term603719, term603719.getClass(), "toString", null);
        setField(term603719, term603719.getClass(), "toProperString", null);
        term603716 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term603716, term603716.getClass(), "numerator", -2113273846);
        setIntField(term603716, term603716.getClass(), "denominator", 2137014275);
        setField(term603716, term603716.getClass(), "toString", null);
        setField(term603716, term603716.getClass(), "toProperString", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang3.math.Fraction");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "reduce", argTypes, term603194, args);
        assertTrue(recursiveEquals(term603194, term603719));
        assertTrue(recursiveEquals(retValue, term603716));
    }

};


