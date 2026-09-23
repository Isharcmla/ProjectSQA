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

public class Fraction_add_276352704156 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term36176;
     Object term36258;
     Object term36776;
     Object term36777;
     Object term36773;

    public Fraction_add_276352704156() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term36176 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term36176, term36176.getClass(), "numerator", 1024);
        setIntField(term36176, term36176.getClass(), "denominator", 174764);
        term36258 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term36258, term36258.getClass(), "numerator", 8);
        setIntField(term36258, term36258.getClass(), "denominator", -262146);
        term36776 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term36776, term36776.getClass(), "numerator", 1024);
        setIntField(term36776, term36776.getClass(), "denominator", 174764);
        setField(term36776, term36776.getClass(), "toString", null);
        setField(term36776, term36776.getClass(), "toProperString", null);
        term36777 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term36777, term36777.getClass(), "numerator", 8);
        setIntField(term36777, term36777.getClass(), "denominator", -262146);
        setField(term36777, term36777.getClass(), "toString", null);
        setField(term36777, term36777.getClass(), "toProperString", null);
        term36773 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term36773, term36773.getClass(), "numerator", -1528);
        setIntField(term36773, term36773.getClass(), "denominator", -262146);
        setField(term36773, term36773.getClass(), "toString", null);
        setField(term36773, term36773.getClass(), "toProperString", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang3.math.Fraction");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.apache.commons.lang3.math.Fraction");
        Object[] args = new Object[1];
        args[0] = term36258;
        Object retValue = callMethod(klass, "add", argTypes, term36176, args);
        assertTrue(recursiveEquals(term36176, term36776));
        assertTrue(recursiveEquals(term36258, term36777));
        assertTrue(recursiveEquals(retValue, term36773));
    }

};


