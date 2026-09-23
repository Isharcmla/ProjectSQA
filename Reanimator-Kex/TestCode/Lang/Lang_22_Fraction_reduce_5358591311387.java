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

public class Fraction_reduce_5358591311387 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term452553;
     Object term453384;
     Object term453381;

    public Fraction_reduce_5358591311387() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term452553 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term452553, term452553.getClass(), "numerator", -2079796986);
        setIntField(term452553, term452553.getClass(), "denominator", 1711767461);
        term453384 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term453384, term453384.getClass(), "numerator", -2079796986);
        setIntField(term453384, term453384.getClass(), "denominator", 1711767461);
        setField(term453384, term453384.getClass(), "toString", null);
        setField(term453384, term453384.getClass(), "toProperString", null);
        term453381 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term453381, term453381.getClass(), "numerator", -2079796986);
        setIntField(term453381, term453381.getClass(), "denominator", 1711767461);
        setField(term453381, term453381.getClass(), "toString", null);
        setField(term453381, term453381.getClass(), "toProperString", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang3.math.Fraction");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "reduce", argTypes, term452553, args);
        assertTrue(recursiveEquals(term452553, term453384));
        assertTrue(recursiveEquals(retValue, term453381));
    }

};


