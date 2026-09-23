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

public class Fraction_reduce_5358591311430 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term466439;
     Object term466974;
     Object term466971;

    public Fraction_reduce_5358591311430() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term466439 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term466439, term466439.getClass(), "numerator", 33641858);
        setIntField(term466439, term466439.getClass(), "denominator", 2022248489);
        term466974 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term466974, term466974.getClass(), "numerator", 33641858);
        setIntField(term466974, term466974.getClass(), "denominator", 2022248489);
        setField(term466974, term466974.getClass(), "toString", null);
        setField(term466974, term466974.getClass(), "toProperString", null);
        term466971 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term466971, term466971.getClass(), "numerator", 33641858);
        setIntField(term466971, term466971.getClass(), "denominator", 2022248489);
        setField(term466971, term466971.getClass(), "toString", null);
        setField(term466971, term466971.getClass(), "toProperString", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang3.math.Fraction");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "reduce", argTypes, term466439, args);
        assertTrue(recursiveEquals(term466439, term466974));
        assertTrue(recursiveEquals(retValue, term466971));
    }

};


