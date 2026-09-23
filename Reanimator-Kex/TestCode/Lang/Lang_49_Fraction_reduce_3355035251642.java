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

public class Fraction_reduce_3355035251642 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term481547;
     Object term482507;
     Object term482504;

    public Fraction_reduce_3355035251642() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term481547 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term481547, term481547.getClass(), "numerator", 143054338);
        setIntField(term481547, term481547.getClass(), "denominator", 2068015865);
        term482507 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term482507, term482507.getClass(), "numerator", 143054338);
        setIntField(term482507, term482507.getClass(), "denominator", 2068015865);
        setField(term482507, term482507.getClass(), "toString", null);
        setField(term482507, term482507.getClass(), "toProperString", null);
        term482504 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term482504, term482504.getClass(), "numerator", 143054338);
        setIntField(term482504, term482504.getClass(), "denominator", 2068015865);
        setField(term482504, term482504.getClass(), "toString", null);
        setField(term482504, term482504.getClass(), "toProperString", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang.math.Fraction");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "reduce", argTypes, term481547, args);
        assertTrue(recursiveEquals(term481547, term482507));
        assertTrue(recursiveEquals(retValue, term482504));
    }

};


