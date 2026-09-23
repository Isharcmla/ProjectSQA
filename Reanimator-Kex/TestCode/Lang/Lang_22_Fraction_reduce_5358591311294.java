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

public class Fraction_reduce_5358591311294 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term419297;
     Object term419854;
     Object term419851;

    public Fraction_reduce_5358591311294() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term419297 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term419297, term419297.getClass(), "numerator", -786345982);
        setIntField(term419297, term419297.getClass(), "denominator", 2109080839);
        term419854 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term419854, term419854.getClass(), "numerator", -786345982);
        setIntField(term419854, term419854.getClass(), "denominator", 2109080839);
        setField(term419854, term419854.getClass(), "toString", null);
        setField(term419854, term419854.getClass(), "toProperString", null);
        term419851 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term419851, term419851.getClass(), "numerator", -786345982);
        setIntField(term419851, term419851.getClass(), "denominator", 2109080839);
        setField(term419851, term419851.getClass(), "toString", null);
        setField(term419851, term419851.getClass(), "toProperString", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang3.math.Fraction");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "reduce", argTypes, term419297, args);
        assertTrue(recursiveEquals(term419297, term419854));
        assertTrue(recursiveEquals(retValue, term419851));
    }

};


