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

public class Fraction_reduce_5358591312582 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term846767;
     Object term847431;
     Object term847428;

    public Fraction_reduce_5358591312582() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term846767 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term846767, term846767.getClass(), "numerator", -1006370814);
        setIntField(term846767, term846767.getClass(), "denominator", 1763680871);
        term847431 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term847431, term847431.getClass(), "numerator", -1006370814);
        setIntField(term847431, term847431.getClass(), "denominator", 1763680871);
        setField(term847431, term847431.getClass(), "toString", null);
        setField(term847431, term847431.getClass(), "toProperString", null);
        term847428 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term847428, term847428.getClass(), "numerator", -1006370814);
        setIntField(term847428, term847428.getClass(), "denominator", 1763680871);
        setField(term847428, term847428.getClass(), "toString", null);
        setField(term847428, term847428.getClass(), "toProperString", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang3.math.Fraction");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "reduce", argTypes, term846767, args);
        assertTrue(recursiveEquals(term846767, term847431));
        assertTrue(recursiveEquals(retValue, term847428));
    }

};


