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

public class Fraction_reduce_3355035252394 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term709955;
     Object term710981;
     Object term710978;

    public Fraction_reduce_3355035252394() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term709955 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term709955, term709955.getClass(), "numerator", 16639042);
        setIntField(term709955, term709955.getClass(), "denominator", 1417605657);
        term710981 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term710981, term710981.getClass(), "numerator", 16639042);
        setIntField(term710981, term710981.getClass(), "denominator", 1417605657);
        setField(term710981, term710981.getClass(), "toString", null);
        setField(term710981, term710981.getClass(), "toProperString", null);
        term710978 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term710978, term710978.getClass(), "numerator", 16639042);
        setIntField(term710978, term710978.getClass(), "denominator", 1417605657);
        setField(term710978, term710978.getClass(), "toString", null);
        setField(term710978, term710978.getClass(), "toProperString", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang.math.Fraction");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "reduce", argTypes, term709955, args);
        assertTrue(recursiveEquals(term709955, term710981));
        assertTrue(recursiveEquals(retValue, term710978));
    }

};


