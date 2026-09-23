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

public class Fraction_reduce_335503525567 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term156095;
     Object term156584;
     Object term156578;

    public Fraction_reduce_335503525567() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term156095 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term156095, term156095.getClass(), "numerator", -165562830);
        setIntField(term156095, term156095.getClass(), "denominator", 990042639);
        term156584 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term156584, term156584.getClass(), "numerator", -165562830);
        setIntField(term156584, term156584.getClass(), "denominator", 990042639);
        setField(term156584, term156584.getClass(), "toString", null);
        setField(term156584, term156584.getClass(), "toProperString", null);
        term156578 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term156578, term156578.getClass(), "numerator", -55187610);
        setIntField(term156578, term156578.getClass(), "denominator", 330014213);
        setField(term156578, term156578.getClass(), "toString", null);
        setField(term156578, term156578.getClass(), "toProperString", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang.math.Fraction");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "reduce", argTypes, term156095, args);
        assertTrue(recursiveEquals(term156095, term156584));
        assertTrue(recursiveEquals(retValue, term156578));
    }

};


