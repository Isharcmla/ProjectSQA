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

public class Fraction_reduce_335503525340 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term90036;
     Object term90471;
     Object term90468;

    public Fraction_reduce_335503525340() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term90036 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term90036, term90036.getClass(), "numerator", -29276554);
        setIntField(term90036, term90036.getClass(), "denominator", 1070631933);
        term90471 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term90471, term90471.getClass(), "numerator", -29276554);
        setIntField(term90471, term90471.getClass(), "denominator", 1070631933);
        setField(term90471, term90471.getClass(), "toString", null);
        setField(term90471, term90471.getClass(), "toProperString", null);
        term90468 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term90468, term90468.getClass(), "numerator", -29276554);
        setIntField(term90468, term90468.getClass(), "denominator", 1070631933);
        setField(term90468, term90468.getClass(), "toString", null);
        setField(term90468, term90468.getClass(), "toProperString", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang.math.Fraction");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "reduce", argTypes, term90036, args);
        assertTrue(recursiveEquals(term90036, term90471));
        assertTrue(recursiveEquals(retValue, term90468));
    }

};


