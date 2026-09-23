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

public class Fraction_subtract_14436274402247 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term664831;
     Object term664911;
     Object term665756;
     Object term665757;
     Object term665753;

    public Fraction_subtract_14436274402247() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term664831 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term664831, term664831.getClass(), "numerator", 4);
        setIntField(term664831, term664831.getClass(), "denominator", -284393895);
        term664911 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term664911, term664911.getClass(), "numerator", 4);
        setIntField(term664911, term664911.getClass(), "denominator", 2719744);
        term665756 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term665756, term665756.getClass(), "numerator", 4);
        setIntField(term665756, term665756.getClass(), "denominator", -284393895);
        setField(term665756, term665756.getClass(), "toString", null);
        setField(term665756, term665756.getClass(), "toProperString", null);
        term665757 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term665757, term665757.getClass(), "numerator", 4);
        setIntField(term665757, term665757.getClass(), "denominator", 2719744);
        setField(term665757, term665757.getClass(), "toString", null);
        setField(term665757, term665757.getClass(), "toProperString", null);
        term665753 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term665753, term665753.getClass(), "numerator", 1148454556);
        setIntField(term665753, term665753.getClass(), "denominator", 2070773760);
        setField(term665753, term665753.getClass(), "toString", null);
        setField(term665753, term665753.getClass(), "toProperString", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang.math.Fraction");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.apache.commons.lang.math.Fraction");
        Object[] args = new Object[1];
        args[0] = term664911;
        Object retValue = callMethod(klass, "subtract", argTypes, term664831, args);
        assertTrue(recursiveEquals(term664831, term665756));
        assertTrue(recursiveEquals(term664911, term665757));
        assertTrue(recursiveEquals(retValue, term665753));
    }

};


