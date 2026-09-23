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

public class Fraction_reduce_535859131936 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term299911;
     Object term300238;
     Object term300235;

    public Fraction_reduce_535859131936() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term299911 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term299911, term299911.getClass(), "numerator", -1054801010);
        setIntField(term299911, term299911.getClass(), "denominator", 1494392417);
        term300238 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term300238, term300238.getClass(), "numerator", -1054801010);
        setIntField(term300238, term300238.getClass(), "denominator", 1494392417);
        setField(term300238, term300238.getClass(), "toString", null);
        setField(term300238, term300238.getClass(), "toProperString", null);
        term300235 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term300235, term300235.getClass(), "numerator", -1054801010);
        setIntField(term300235, term300235.getClass(), "denominator", 1494392417);
        setField(term300235, term300235.getClass(), "toString", null);
        setField(term300235, term300235.getClass(), "toProperString", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang3.math.Fraction");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "reduce", argTypes, term299911, args);
        assertTrue(recursiveEquals(term299911, term300238));
        assertTrue(recursiveEquals(retValue, term300235));
    }

};


