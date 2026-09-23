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

public class Fraction_subtract_1443627440708 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term195799;
     Object term195879;
     Object term196341;
     Object term196342;
     Object term196338;

    public Fraction_subtract_1443627440708() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term195799 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term195799, term195799.getClass(), "numerator", 8192);
        setIntField(term195799, term195799.getClass(), "denominator", -212840);
        term195879 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term195879, term195879.getClass(), "numerator", 128);
        setIntField(term195879, term195879.getClass(), "denominator", 177324);
        term196341 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term196341, term196341.getClass(), "numerator", 8192);
        setIntField(term196341, term196341.getClass(), "denominator", -212840);
        setField(term196341, term196341.getClass(), "toString", null);
        setField(term196341, term196341.getClass(), "toProperString", null);
        term196342 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term196342, term196342.getClass(), "numerator", 128);
        setIntField(term196342, term196342.getClass(), "denominator", 177324);
        setField(term196342, term196342.getClass(), "toString", null);
        setField(term196342, term196342.getClass(), "toProperString", null);
        term196338 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term196338, term196338.getClass(), "numerator", 92492608);
        setIntField(term196338, term196338.getClass(), "denominator", 1936114786);
        setField(term196338, term196338.getClass(), "toString", null);
        setField(term196338, term196338.getClass(), "toProperString", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang.math.Fraction");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.apache.commons.lang.math.Fraction");
        Object[] args = new Object[1];
        args[0] = term195879;
        Object retValue = callMethod(klass, "subtract", argTypes, term195799, args);
        assertTrue(recursiveEquals(term195799, term196341));
        assertTrue(recursiveEquals(term195879, term196342));
        assertTrue(recursiveEquals(retValue, term196338));
    }

};


