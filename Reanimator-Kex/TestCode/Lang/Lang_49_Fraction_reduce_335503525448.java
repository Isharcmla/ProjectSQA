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

public class Fraction_reduce_335503525448 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term122187;
     Object term122863;
     Object term122860;

    public Fraction_reduce_335503525448() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term122187 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term122187, term122187.getClass(), "numerator", 671088642);
        setIntField(term122187, term122187.getClass(), "denominator", 603979769);
        term122863 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term122863, term122863.getClass(), "numerator", 671088642);
        setIntField(term122863, term122863.getClass(), "denominator", 603979769);
        setField(term122863, term122863.getClass(), "toString", null);
        setField(term122863, term122863.getClass(), "toProperString", null);
        term122860 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term122860, term122860.getClass(), "numerator", 671088642);
        setIntField(term122860, term122860.getClass(), "denominator", 603979769);
        setField(term122860, term122860.getClass(), "toString", null);
        setField(term122860, term122860.getClass(), "toProperString", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang.math.Fraction");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "reduce", argTypes, term122187, args);
        assertTrue(recursiveEquals(term122187, term122863));
        assertTrue(recursiveEquals(retValue, term122860));
    }

};


