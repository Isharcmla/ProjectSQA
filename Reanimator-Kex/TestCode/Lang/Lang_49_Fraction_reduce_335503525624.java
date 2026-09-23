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

public class Fraction_reduce_335503525624 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term173693;
     Object term174017;
     Object term174011;

    public Fraction_reduce_335503525624() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term173693 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term173693, term173693.getClass(), "numerator", 1009889818);
        setIntField(term173693, term173693.getClass(), "denominator", 552012293);
        term174017 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term174017, term174017.getClass(), "numerator", 1009889818);
        setIntField(term174017, term174017.getClass(), "denominator", 552012293);
        setField(term174017, term174017.getClass(), "toString", null);
        setField(term174017, term174017.getClass(), "toProperString", null);
        term174011 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term174011, term174011.getClass(), "numerator", 144269974);
        setIntField(term174011, term174011.getClass(), "denominator", 78858899);
        setField(term174011, term174011.getClass(), "toString", null);
        setField(term174011, term174011.getClass(), "toProperString", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang.math.Fraction");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "reduce", argTypes, term173693, args);
        assertTrue(recursiveEquals(term173693, term174017));
        assertTrue(recursiveEquals(retValue, term174011));
    }

};


