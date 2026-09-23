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

public class Fraction_reduce_33550352548 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term419;
     Object term3172;
     Object term3145;

    public Fraction_reduce_33550352548() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term419 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term419, term419.getClass(), "numerator", -226514366);
        setIntField(term419, term419.getClass(), "denominator", 1193880199);
        setField(term419, term419.getClass(), "toString", "tbcdzjIfER");
        setField(term419, term419.getClass(), "toProperString", "HyxfbSQYBe");
        term3172 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term3172, term3172.getClass(), "numerator", -226514366);
        setIntField(term3172, term3172.getClass(), "denominator", 1193880199);
        setField(term3172, term3172.getClass(), "toString", "tbcdzjIfER");
        setField(term3172, term3172.getClass(), "toProperString", "HyxfbSQYBe");
        term3145 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term3145, term3145.getClass(), "numerator", -226514366);
        setIntField(term3145, term3145.getClass(), "denominator", 1193880199);
        setField(term3145, term3145.getClass(), "toString", "tbcdzjIfER");
        setField(term3145, term3145.getClass(), "toProperString", "HyxfbSQYBe");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang.math.Fraction");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "reduce", argTypes, term419, args);
        assertTrue(recursiveEquals(term419, term3172));
        assertTrue(recursiveEquals(retValue, term3145));
    }

};


