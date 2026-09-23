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

public class Fraction_reduce_335503525588 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term162288;
     Object term162652;
     Object term162649;

    public Fraction_reduce_335503525588() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term162288 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term162288, term162288.getClass(), "numerator", 226353682);
        setIntField(term162288, term162288.getClass(), "denominator", 2040796881);
        term162652 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term162652, term162652.getClass(), "numerator", 226353682);
        setIntField(term162652, term162652.getClass(), "denominator", 2040796881);
        setField(term162652, term162652.getClass(), "toString", null);
        setField(term162652, term162652.getClass(), "toProperString", null);
        term162649 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term162649, term162649.getClass(), "numerator", 226353682);
        setIntField(term162649, term162649.getClass(), "denominator", 2040796881);
        setField(term162649, term162649.getClass(), "toString", null);
        setField(term162649, term162649.getClass(), "toProperString", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang.math.Fraction");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "reduce", argTypes, term162288, args);
        assertTrue(recursiveEquals(term162288, term162652));
        assertTrue(recursiveEquals(retValue, term162649));
    }

};


