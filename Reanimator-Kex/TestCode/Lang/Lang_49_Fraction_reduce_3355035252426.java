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

public class Fraction_reduce_3355035252426 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term720957;
     Object term721578;
     Object term721575;

    public Fraction_reduce_3355035252426() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term720957 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term720957, term720957.getClass(), "numerator", 1107558926);
        setIntField(term720957, term720957.getClass(), "denominator", 595590111);
        term721578 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term721578, term721578.getClass(), "numerator", 1107558926);
        setIntField(term721578, term721578.getClass(), "denominator", 595590111);
        setField(term721578, term721578.getClass(), "toString", null);
        setField(term721578, term721578.getClass(), "toProperString", null);
        term721575 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term721575, term721575.getClass(), "numerator", 1107558926);
        setIntField(term721575, term721575.getClass(), "denominator", 595590111);
        setField(term721575, term721575.getClass(), "toString", null);
        setField(term721575, term721575.getClass(), "toProperString", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang.math.Fraction");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "reduce", argTypes, term720957, args);
        assertTrue(recursiveEquals(term720957, term721578));
        assertTrue(recursiveEquals(retValue, term721575));
    }

};


