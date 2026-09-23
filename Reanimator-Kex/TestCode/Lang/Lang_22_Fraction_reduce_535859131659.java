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

public class Fraction_reduce_535859131659 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term207638;
     Object term208205;
     Object term208202;

    public Fraction_reduce_535859131659() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term207638 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term207638, term207638.getClass(), "numerator", -2146587134);
        setIntField(term207638, term207638.getClass(), "denominator", 1432084487);
        term208205 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term208205, term208205.getClass(), "numerator", -2146587134);
        setIntField(term208205, term208205.getClass(), "denominator", 1432084487);
        setField(term208205, term208205.getClass(), "toString", null);
        setField(term208205, term208205.getClass(), "toProperString", null);
        term208202 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term208202, term208202.getClass(), "numerator", -2146587134);
        setIntField(term208202, term208202.getClass(), "denominator", 1432084487);
        setField(term208202, term208202.getClass(), "toString", null);
        setField(term208202, term208202.getClass(), "toProperString", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang3.math.Fraction");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "reduce", argTypes, term207638, args);
        assertTrue(recursiveEquals(term207638, term208205));
        assertTrue(recursiveEquals(retValue, term208202));
    }

};


