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

public class Fraction_reduce_5358591311694 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term549495;
     Object term549966;
     Object term549963;

    public Fraction_reduce_5358591311694() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term549495 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term549495, term549495.getClass(), "numerator", -528018942);
        setIntField(term549495, term549495.getClass(), "denominator", 679349303);
        term549966 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term549966, term549966.getClass(), "numerator", -528018942);
        setIntField(term549966, term549966.getClass(), "denominator", 679349303);
        setField(term549966, term549966.getClass(), "toString", null);
        setField(term549966, term549966.getClass(), "toProperString", null);
        term549963 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term549963, term549963.getClass(), "numerator", -528018942);
        setIntField(term549963, term549963.getClass(), "denominator", 679349303);
        setField(term549963, term549963.getClass(), "toString", null);
        setField(term549963, term549963.getClass(), "toProperString", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang3.math.Fraction");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "reduce", argTypes, term549495, args);
        assertTrue(recursiveEquals(term549495, term549966));
        assertTrue(recursiveEquals(retValue, term549963));
    }

};


