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

public class Fraction_reduce_5358591312100 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term683463;
     Object term684537;
     Object term684534;

    public Fraction_reduce_5358591312100() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term683463 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term683463, term683463.getClass(), "numerator", -1148111602);
        setIntField(term683463, term683463.getClass(), "denominator", 1184401553);
        term684537 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term684537, term684537.getClass(), "numerator", -1148111602);
        setIntField(term684537, term684537.getClass(), "denominator", 1184401553);
        setField(term684537, term684537.getClass(), "toString", null);
        setField(term684537, term684537.getClass(), "toProperString", null);
        term684534 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term684534, term684534.getClass(), "numerator", -1148111602);
        setIntField(term684534, term684534.getClass(), "denominator", 1184401553);
        setField(term684534, term684534.getClass(), "toString", null);
        setField(term684534, term684534.getClass(), "toProperString", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang3.math.Fraction");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "reduce", argTypes, term683463, args);
        assertTrue(recursiveEquals(term683463, term684537));
        assertTrue(recursiveEquals(retValue, term684534));
    }

};


