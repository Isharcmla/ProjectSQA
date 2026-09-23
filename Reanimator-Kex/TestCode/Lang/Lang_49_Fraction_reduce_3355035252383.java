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

public class Fraction_reduce_3355035252383 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term705686;
     Object term706666;
     Object term706660;

    public Fraction_reduce_3355035252383() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term705686 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term705686, term705686.getClass(), "numerator", -119917398);
        setIntField(term705686, term705686.getClass(), "denominator", 1102704453);
        term706666 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term706666, term706666.getClass(), "numerator", -119917398);
        setIntField(term706666, term706666.getClass(), "denominator", 1102704453);
        setField(term706666, term706666.getClass(), "toString", null);
        setField(term706666, term706666.getClass(), "toProperString", null);
        term706660 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term706660, term706660.getClass(), "numerator", -39972466);
        setIntField(term706660, term706660.getClass(), "denominator", 367568151);
        setField(term706660, term706660.getClass(), "toString", null);
        setField(term706660, term706660.getClass(), "toProperString", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang.math.Fraction");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "reduce", argTypes, term705686, args);
        assertTrue(recursiveEquals(term705686, term706666));
        assertTrue(recursiveEquals(retValue, term706660));
    }

};


