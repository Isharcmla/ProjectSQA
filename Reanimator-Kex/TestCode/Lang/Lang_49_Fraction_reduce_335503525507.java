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

public class Fraction_reduce_335503525507 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term139584;
     Object term139671;
     Object term139668;

    public Fraction_reduce_335503525507() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term139584 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term139584, term139584.getClass(), "numerator", 135355866);
        setIntField(term139584, term139584.getClass(), "denominator", 268954117);
        term139671 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term139671, term139671.getClass(), "numerator", 135355866);
        setIntField(term139671, term139671.getClass(), "denominator", 268954117);
        setField(term139671, term139671.getClass(), "toString", null);
        setField(term139671, term139671.getClass(), "toProperString", null);
        term139668 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term139668, term139668.getClass(), "numerator", 135355866);
        setIntField(term139668, term139668.getClass(), "denominator", 268954117);
        setField(term139668, term139668.getClass(), "toString", null);
        setField(term139668, term139668.getClass(), "toProperString", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang.math.Fraction");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "reduce", argTypes, term139584, args);
        assertTrue(recursiveEquals(term139584, term139671));
        assertTrue(recursiveEquals(retValue, term139668));
    }

};


