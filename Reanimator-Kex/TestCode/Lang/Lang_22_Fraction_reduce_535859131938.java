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

public class Fraction_reduce_535859131938 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term300133;
     Object term300762;
     Object term300759;

    public Fraction_reduce_535859131938() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term300133 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term300133, term300133.getClass(), "numerator", 17490514);
        setIntField(term300133, term300133.getClass(), "denominator", 1095797025);
        term300762 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term300762, term300762.getClass(), "numerator", 17490514);
        setIntField(term300762, term300762.getClass(), "denominator", 1095797025);
        setField(term300762, term300762.getClass(), "toString", null);
        setField(term300762, term300762.getClass(), "toProperString", null);
        term300759 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term300759, term300759.getClass(), "numerator", 17490514);
        setIntField(term300759, term300759.getClass(), "denominator", 1095797025);
        setField(term300759, term300759.getClass(), "toString", null);
        setField(term300759, term300759.getClass(), "toProperString", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang3.math.Fraction");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "reduce", argTypes, term300133, args);
        assertTrue(recursiveEquals(term300133, term300762));
        assertTrue(recursiveEquals(retValue, term300759));
    }

};


