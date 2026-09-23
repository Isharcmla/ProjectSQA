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

public class Fraction_reduce_335503525731 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term204882;
     Object term205094;
     Object term205091;

    public Fraction_reduce_335503525731() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term204882 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term204882, term204882.getClass(), "numerator", -1912525670);
        setIntField(term204882, term204882.getClass(), "denominator", 1552122123);
        term205094 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term205094, term205094.getClass(), "numerator", -1912525670);
        setIntField(term205094, term205094.getClass(), "denominator", 1552122123);
        setField(term205094, term205094.getClass(), "toString", null);
        setField(term205094, term205094.getClass(), "toProperString", null);
        term205091 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term205091, term205091.getClass(), "numerator", -1912525670);
        setIntField(term205091, term205091.getClass(), "denominator", 1552122123);
        setField(term205091, term205091.getClass(), "toString", null);
        setField(term205091, term205091.getClass(), "toProperString", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang.math.Fraction");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "reduce", argTypes, term204882, args);
        assertTrue(recursiveEquals(term204882, term205094));
        assertTrue(recursiveEquals(retValue, term205091));
    }

};


