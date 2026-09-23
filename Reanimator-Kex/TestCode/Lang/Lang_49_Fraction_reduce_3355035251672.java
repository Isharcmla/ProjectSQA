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

public class Fraction_reduce_3355035251672 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term491641;
     Object term492075;
     Object term492072;

    public Fraction_reduce_3355035251672() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term491641 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term491641, term491641.getClass(), "numerator", 813697194);
        setIntField(term491641, term491641.getClass(), "denominator", 339668461);
        term492075 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term492075, term492075.getClass(), "numerator", 813697194);
        setIntField(term492075, term492075.getClass(), "denominator", 339668461);
        setField(term492075, term492075.getClass(), "toString", null);
        setField(term492075, term492075.getClass(), "toProperString", null);
        term492072 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term492072, term492072.getClass(), "numerator", 813697194);
        setIntField(term492072, term492072.getClass(), "denominator", 339668461);
        setField(term492072, term492072.getClass(), "toString", null);
        setField(term492072, term492072.getClass(), "toProperString", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang.math.Fraction");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "reduce", argTypes, term491641, args);
        assertTrue(recursiveEquals(term491641, term492075));
        assertTrue(recursiveEquals(retValue, term492072));
    }

};


