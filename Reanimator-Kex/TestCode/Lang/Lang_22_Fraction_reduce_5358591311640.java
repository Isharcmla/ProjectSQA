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

public class Fraction_reduce_5358591311640 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term533804;
     Object term535019;
     Object term535016;

    public Fraction_reduce_5358591311640() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term533804 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term533804, term533804.getClass(), "numerator", 813719946);
        setIntField(term533804, term533804.getClass(), "denominator", 620830237);
        term535019 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term535019, term535019.getClass(), "numerator", 813719946);
        setIntField(term535019, term535019.getClass(), "denominator", 620830237);
        setField(term535019, term535019.getClass(), "toString", null);
        setField(term535019, term535019.getClass(), "toProperString", null);
        term535016 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term535016, term535016.getClass(), "numerator", 813719946);
        setIntField(term535016, term535016.getClass(), "denominator", 620830237);
        setField(term535016, term535016.getClass(), "toString", null);
        setField(term535016, term535016.getClass(), "toProperString", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang3.math.Fraction");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "reduce", argTypes, term533804, args);
        assertTrue(recursiveEquals(term533804, term535019));
        assertTrue(recursiveEquals(retValue, term535016));
    }

};


