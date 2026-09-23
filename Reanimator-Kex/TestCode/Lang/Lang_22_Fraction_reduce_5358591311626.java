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

public class Fraction_reduce_5358591311626 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term529467;
     Object term530300;
     Object term530297;

    public Fraction_reduce_5358591311626() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term529467 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term529467, term529467.getClass(), "numerator", 991432594);
        setIntField(term529467, term529467.getClass(), "denominator", 1171345409);
        term530300 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term530300, term530300.getClass(), "numerator", 991432594);
        setIntField(term530300, term530300.getClass(), "denominator", 1171345409);
        setField(term530300, term530300.getClass(), "toString", null);
        setField(term530300, term530300.getClass(), "toProperString", null);
        term530297 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term530297, term530297.getClass(), "numerator", 991432594);
        setIntField(term530297, term530297.getClass(), "denominator", 1171345409);
        setField(term530297, term530297.getClass(), "toString", null);
        setField(term530297, term530297.getClass(), "toProperString", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang3.math.Fraction");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "reduce", argTypes, term529467, args);
        assertTrue(recursiveEquals(term529467, term530300));
        assertTrue(recursiveEquals(retValue, term530297));
    }

};


