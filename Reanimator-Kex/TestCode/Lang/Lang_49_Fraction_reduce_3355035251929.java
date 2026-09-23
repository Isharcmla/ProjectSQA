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

public class Fraction_reduce_3355035251929 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term567061;
     Object term567262;
     Object term567259;

    public Fraction_reduce_3355035251929() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term567061 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term567061, term567061.getClass(), "numerator", -1643844034);
        setIntField(term567061, term567061.getClass(), "denominator", 2013759753);
        term567262 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term567262, term567262.getClass(), "numerator", -1643844034);
        setIntField(term567262, term567262.getClass(), "denominator", 2013759753);
        setField(term567262, term567262.getClass(), "toString", null);
        setField(term567262, term567262.getClass(), "toProperString", null);
        term567259 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term567259, term567259.getClass(), "numerator", -1643844034);
        setIntField(term567259, term567259.getClass(), "denominator", 2013759753);
        setField(term567259, term567259.getClass(), "toString", null);
        setField(term567259, term567259.getClass(), "toProperString", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang.math.Fraction");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "reduce", argTypes, term567061, args);
        assertTrue(recursiveEquals(term567061, term567262));
        assertTrue(recursiveEquals(retValue, term567259));
    }

};


