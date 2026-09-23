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

public class Fraction_reduce_5358591312372 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term775584;
     Object term776523;
     Object term776517;

    public Fraction_reduce_5358591312372() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term775584 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term775584, term775584.getClass(), "numerator", 178455298);
        setIntField(term775584, term775584.getClass(), "denominator", 2013306633);
        term776523 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term776523, term776523.getClass(), "numerator", 178455298);
        setIntField(term776523, term776523.getClass(), "denominator", 2013306633);
        setField(term776523, term776523.getClass(), "toString", null);
        setField(term776523, term776523.getClass(), "toProperString", null);
        term776517 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term776517, term776517.getClass(), "numerator", 7758926);
        setIntField(term776517, term776517.getClass(), "denominator", 87535071);
        setField(term776517, term776517.getClass(), "toString", null);
        setField(term776517, term776517.getClass(), "toProperString", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang3.math.Fraction");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "reduce", argTypes, term775584, args);
        assertTrue(recursiveEquals(term775584, term776523));
        assertTrue(recursiveEquals(retValue, term776517));
    }

};


