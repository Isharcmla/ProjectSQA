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

public class Fraction_reduce_5358591311478 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term480711;
     Object term481438;
     Object term481435;

    public Fraction_reduce_5358591311478() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term480711 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term480711, term480711.getClass(), "numerator", -1075388670);
        setIntField(term480711, term480711.getClass(), "denominator", 1542385799);
        term481438 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term481438, term481438.getClass(), "numerator", -1075388670);
        setIntField(term481438, term481438.getClass(), "denominator", 1542385799);
        setField(term481438, term481438.getClass(), "toString", null);
        setField(term481438, term481438.getClass(), "toProperString", null);
        term481435 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term481435, term481435.getClass(), "numerator", -1075388670);
        setIntField(term481435, term481435.getClass(), "denominator", 1542385799);
        setField(term481435, term481435.getClass(), "toString", null);
        setField(term481435, term481435.getClass(), "toProperString", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang3.math.Fraction");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "reduce", argTypes, term480711, args);
        assertTrue(recursiveEquals(term480711, term481438));
        assertTrue(recursiveEquals(retValue, term481435));
    }

};


