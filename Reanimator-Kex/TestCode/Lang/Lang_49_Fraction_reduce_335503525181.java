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

public class Fraction_reduce_335503525181 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term41651;
     Object term42529;
     Object term42526;

    public Fraction_reduce_335503525181() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term41651 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term41651, term41651.getClass(), "numerator", 1154223666);
        setIntField(term41651, term41651.getClass(), "denominator", 1978336433);
        term42529 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term42529, term42529.getClass(), "numerator", 1154223666);
        setIntField(term42529, term42529.getClass(), "denominator", 1978336433);
        setField(term42529, term42529.getClass(), "toString", null);
        setField(term42529, term42529.getClass(), "toProperString", null);
        term42526 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term42526, term42526.getClass(), "numerator", 1154223666);
        setIntField(term42526, term42526.getClass(), "denominator", 1978336433);
        setField(term42526, term42526.getClass(), "toString", null);
        setField(term42526, term42526.getClass(), "toProperString", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang.math.Fraction");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "reduce", argTypes, term41651, args);
        assertTrue(recursiveEquals(term41651, term42529));
        assertTrue(recursiveEquals(retValue, term42526));
    }

};


