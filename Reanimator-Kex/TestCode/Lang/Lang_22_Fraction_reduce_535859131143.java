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

public class Fraction_reduce_535859131143 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term32839;
     Object term33292;
     Object term33289;

    public Fraction_reduce_535859131143() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term32839 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term32839, term32839.getClass(), "numerator", -2147483648);
        setIntField(term32839, term32839.getClass(), "denominator", 0);
        term33292 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term33292, term33292.getClass(), "numerator", -2147483648);
        setIntField(term33292, term33292.getClass(), "denominator", 0);
        setField(term33292, term33292.getClass(), "toString", null);
        setField(term33292, term33292.getClass(), "toProperString", null);
        term33289 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term33289, term33289.getClass(), "numerator", -2147483648);
        setIntField(term33289, term33289.getClass(), "denominator", 0);
        setField(term33289, term33289.getClass(), "toString", null);
        setField(term33289, term33289.getClass(), "toProperString", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang3.math.Fraction");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "reduce", argTypes, term32839, args);
        assertTrue(recursiveEquals(term32839, term33292));
        assertTrue(recursiveEquals(retValue, term33289));
    }

};


