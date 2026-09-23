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

public class Fraction_reduce_3355035251381 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term403712;
     Object term404154;
     Object term404151;

    public Fraction_reduce_3355035251381() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term403712 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term403712, term403712.getClass(), "numerator", -16251442);
        setIntField(term403712, term403712.getClass(), "denominator", 1603011201);
        term404154 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term404154, term404154.getClass(), "numerator", -16251442);
        setIntField(term404154, term404154.getClass(), "denominator", 1603011201);
        setField(term404154, term404154.getClass(), "toString", null);
        setField(term404154, term404154.getClass(), "toProperString", null);
        term404151 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term404151, term404151.getClass(), "numerator", -16251442);
        setIntField(term404151, term404151.getClass(), "denominator", 1603011201);
        setField(term404151, term404151.getClass(), "toString", null);
        setField(term404151, term404151.getClass(), "toProperString", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang.math.Fraction");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "reduce", argTypes, term403712, args);
        assertTrue(recursiveEquals(term403712, term404154));
        assertTrue(recursiveEquals(retValue, term404151));
    }

};


