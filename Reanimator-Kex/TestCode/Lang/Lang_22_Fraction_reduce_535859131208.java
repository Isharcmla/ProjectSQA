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

public class Fraction_reduce_535859131208 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term52507;
     Object term52950;
     Object term52947;

    public Fraction_reduce_535859131208() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term52507 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term52507, term52507.getClass(), "numerator", -2146959358);
        setIntField(term52507, term52507.getClass(), "denominator", 1993834359);
        term52950 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term52950, term52950.getClass(), "numerator", -2146959358);
        setIntField(term52950, term52950.getClass(), "denominator", 1993834359);
        setField(term52950, term52950.getClass(), "toString", null);
        setField(term52950, term52950.getClass(), "toProperString", null);
        term52947 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term52947, term52947.getClass(), "numerator", -2146959358);
        setIntField(term52947, term52947.getClass(), "denominator", 1993834359);
        setField(term52947, term52947.getClass(), "toString", null);
        setField(term52947, term52947.getClass(), "toProperString", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang3.math.Fraction");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "reduce", argTypes, term52507, args);
        assertTrue(recursiveEquals(term52507, term52950));
        assertTrue(recursiveEquals(retValue, term52947));
    }

};


