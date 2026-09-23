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

public class Fraction_reduce_3355035252285 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term676520;
     Object term676729;
     Object term676726;

    public Fraction_reduce_3355035252285() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term676520 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term676520, term676520.getClass(), "numerator", -1737826118);
        setIntField(term676520, term676520.getClass(), "denominator", 1342723419);
        term676729 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term676729, term676729.getClass(), "numerator", -1737826118);
        setIntField(term676729, term676729.getClass(), "denominator", 1342723419);
        setField(term676729, term676729.getClass(), "toString", null);
        setField(term676729, term676729.getClass(), "toProperString", null);
        term676726 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term676726, term676726.getClass(), "numerator", -1737826118);
        setIntField(term676726, term676726.getClass(), "denominator", 1342723419);
        setField(term676726, term676726.getClass(), "toString", null);
        setField(term676726, term676726.getClass(), "toProperString", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang.math.Fraction");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "reduce", argTypes, term676520, args);
        assertTrue(recursiveEquals(term676520, term676729));
        assertTrue(recursiveEquals(retValue, term676726));
    }

};


