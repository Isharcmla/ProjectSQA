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

public class Fraction_reduce_3355035251398 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term408716;
     Object term409415;
     Object term409412;

    public Fraction_reduce_3355035251398() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term408716 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term408716, term408716.getClass(), "numerator", -978382722);
        setIntField(term408716, term408716.getClass(), "denominator", 484870073);
        term409415 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term409415, term409415.getClass(), "numerator", -978382722);
        setIntField(term409415, term409415.getClass(), "denominator", 484870073);
        setField(term409415, term409415.getClass(), "toString", null);
        setField(term409415, term409415.getClass(), "toProperString", null);
        term409412 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term409412, term409412.getClass(), "numerator", -978382722);
        setIntField(term409412, term409412.getClass(), "denominator", 484870073);
        setField(term409412, term409412.getClass(), "toString", null);
        setField(term409412, term409412.getClass(), "toProperString", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang.math.Fraction");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "reduce", argTypes, term408716, args);
        assertTrue(recursiveEquals(term408716, term409415));
        assertTrue(recursiveEquals(retValue, term409412));
    }

};


