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

public class Fraction_abs_1193627825111 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term19464;
     Object term19469;
     Object term19466;

    public Fraction_abs_1193627825111() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term19464 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term19464, term19464.getClass(), "numerator", 0);
        term19469 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term19469, term19469.getClass(), "numerator", 0);
        setIntField(term19469, term19469.getClass(), "denominator", 0);
        setField(term19469, term19469.getClass(), "toString", null);
        setField(term19469, term19469.getClass(), "toProperString", null);
        term19466 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term19466, term19466.getClass(), "numerator", 0);
        setIntField(term19466, term19466.getClass(), "denominator", 0);
        setField(term19466, term19466.getClass(), "toString", null);
        setField(term19466, term19466.getClass(), "toProperString", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang.math.Fraction");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "abs", argTypes, term19464, args);
        assertTrue(recursiveEquals(term19464, term19469));
        assertTrue(recursiveEquals(retValue, term19466));
    }

};


