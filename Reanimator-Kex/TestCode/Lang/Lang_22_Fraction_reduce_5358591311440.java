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

public class Fraction_reduce_5358591311440 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term469668;
     Object term470144;
     Object term470141;

    public Fraction_reduce_5358591311440() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term469668 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term469668, term469668.getClass(), "numerator", -417988606);
        setIntField(term469668, term469668.getClass(), "denominator", 2134591847);
        term470144 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term470144, term470144.getClass(), "numerator", -417988606);
        setIntField(term470144, term470144.getClass(), "denominator", 2134591847);
        setField(term470144, term470144.getClass(), "toString", null);
        setField(term470144, term470144.getClass(), "toProperString", null);
        term470141 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term470141, term470141.getClass(), "numerator", -417988606);
        setIntField(term470141, term470141.getClass(), "denominator", 2134591847);
        setField(term470141, term470141.getClass(), "toString", null);
        setField(term470141, term470141.getClass(), "toProperString", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang3.math.Fraction");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "reduce", argTypes, term469668, args);
        assertTrue(recursiveEquals(term469668, term470144));
        assertTrue(recursiveEquals(retValue, term470141));
    }

};


