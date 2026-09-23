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

public class Fraction_reduce_335503525351 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term92458;
     Object term93473;
     Object term93470;

    public Fraction_reduce_335503525351() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term92458 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term92458, term92458.getClass(), "numerator", 1342175570);
        setIntField(term92458, term92458.getClass(), "denominator", 1879048273);
        term93473 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term93473, term93473.getClass(), "numerator", 1342175570);
        setIntField(term93473, term93473.getClass(), "denominator", 1879048273);
        setField(term93473, term93473.getClass(), "toString", null);
        setField(term93473, term93473.getClass(), "toProperString", null);
        term93470 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term93470, term93470.getClass(), "numerator", 1342175570);
        setIntField(term93470, term93470.getClass(), "denominator", 1879048273);
        setField(term93470, term93470.getClass(), "toString", null);
        setField(term93470, term93470.getClass(), "toProperString", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang.math.Fraction");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "reduce", argTypes, term92458, args);
        assertTrue(recursiveEquals(term92458, term93473));
        assertTrue(recursiveEquals(retValue, term93470));
    }

};


