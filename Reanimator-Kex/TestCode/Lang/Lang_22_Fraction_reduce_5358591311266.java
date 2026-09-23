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

public class Fraction_reduce_5358591311266 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term410504;
     Object term411009;
     Object term411006;

    public Fraction_reduce_5358591311266() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term410504 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term410504, term410504.getClass(), "numerator", -628195126);
        setIntField(term410504, term410504.getClass(), "denominator", 1880670387);
        term411009 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term411009, term411009.getClass(), "numerator", -628195126);
        setIntField(term411009, term411009.getClass(), "denominator", 1880670387);
        setField(term411009, term411009.getClass(), "toString", null);
        setField(term411009, term411009.getClass(), "toProperString", null);
        term411006 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term411006, term411006.getClass(), "numerator", -628195126);
        setIntField(term411006, term411006.getClass(), "denominator", 1880670387);
        setField(term411006, term411006.getClass(), "toString", null);
        setField(term411006, term411006.getClass(), "toProperString", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang3.math.Fraction");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "reduce", argTypes, term410504, args);
        assertTrue(recursiveEquals(term410504, term411009));
        assertTrue(recursiveEquals(retValue, term411006));
    }

};


