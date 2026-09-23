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

public class Fraction_reduce_3355035251716 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term503011;
     Object term503788;
     Object term503785;

    public Fraction_reduce_3355035251716() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term503011 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term503011, term503011.getClass(), "numerator", -1996502162);
        setIntField(term503011, term503011.getClass(), "denominator", 138283717);
        term503788 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term503788, term503788.getClass(), "numerator", -1996502162);
        setIntField(term503788, term503788.getClass(), "denominator", 138283717);
        setField(term503788, term503788.getClass(), "toString", null);
        setField(term503788, term503788.getClass(), "toProperString", null);
        term503785 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term503785, term503785.getClass(), "numerator", -1996502162);
        setIntField(term503785, term503785.getClass(), "denominator", 138283717);
        setField(term503785, term503785.getClass(), "toString", null);
        setField(term503785, term503785.getClass(), "toProperString", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang.math.Fraction");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "reduce", argTypes, term503011, args);
        assertTrue(recursiveEquals(term503011, term503788));
        assertTrue(recursiveEquals(retValue, term503785));
    }

};


