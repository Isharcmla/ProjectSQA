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

public class Fraction_reduce_335503525897 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term256453;
     Object term256556;
     Object term256550;

    public Fraction_reduce_335503525897() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term256453 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term256453, term256453.getClass(), "numerator", -2092218590);
        setIntField(term256453, term256453.getClass(), "denominator", 1060931879);
        term256556 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term256556, term256556.getClass(), "numerator", -2092218590);
        setIntField(term256556, term256556.getClass(), "denominator", 1060931879);
        setField(term256556, term256556.getClass(), "toString", null);
        setField(term256556, term256556.getClass(), "toProperString", null);
        term256550 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term256550, term256550.getClass(), "numerator", -298888370);
        setIntField(term256550, term256550.getClass(), "denominator", 151561697);
        setField(term256550, term256550.getClass(), "toString", null);
        setField(term256550, term256550.getClass(), "toProperString", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang.math.Fraction");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "reduce", argTypes, term256453, args);
        assertTrue(recursiveEquals(term256453, term256556));
        assertTrue(recursiveEquals(retValue, term256550));
    }

};


