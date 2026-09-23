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

public class Fraction_reduce_3355035252082 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term614230;
     Object term614762;
     Object term614759;

    public Fraction_reduce_3355035252082() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term614230 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term614230, term614230.getClass(), "numerator", -1968999670);
        setIntField(term614230, term614230.getClass(), "denominator", 2074347139);
        term614762 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term614762, term614762.getClass(), "numerator", -1968999670);
        setIntField(term614762, term614762.getClass(), "denominator", 2074347139);
        setField(term614762, term614762.getClass(), "toString", null);
        setField(term614762, term614762.getClass(), "toProperString", null);
        term614759 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term614759, term614759.getClass(), "numerator", -1968999670);
        setIntField(term614759, term614759.getClass(), "denominator", 2074347139);
        setField(term614759, term614759.getClass(), "toString", null);
        setField(term614759, term614759.getClass(), "toProperString", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang.math.Fraction");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "reduce", argTypes, term614230, args);
        assertTrue(recursiveEquals(term614230, term614762));
        assertTrue(recursiveEquals(retValue, term614759));
    }

};


