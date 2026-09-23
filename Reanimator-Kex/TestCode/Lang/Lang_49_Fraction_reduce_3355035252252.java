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

public class Fraction_reduce_3355035252252 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term666809;
     Object term667229;
     Object term667226;

    public Fraction_reduce_3355035252252() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term666809 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term666809, term666809.getClass(), "numerator", -612383766);
        setIntField(term666809, term666809.getClass(), "denominator", 402660835);
        term667229 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term667229, term667229.getClass(), "numerator", -612383766);
        setIntField(term667229, term667229.getClass(), "denominator", 402660835);
        setField(term667229, term667229.getClass(), "toString", null);
        setField(term667229, term667229.getClass(), "toProperString", null);
        term667226 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term667226, term667226.getClass(), "numerator", -612383766);
        setIntField(term667226, term667226.getClass(), "denominator", 402660835);
        setField(term667226, term667226.getClass(), "toString", null);
        setField(term667226, term667226.getClass(), "toProperString", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang.math.Fraction");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "reduce", argTypes, term666809, args);
        assertTrue(recursiveEquals(term666809, term667229));
        assertTrue(recursiveEquals(retValue, term667226));
    }

};


