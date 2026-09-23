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

public class Fraction_reduce_3355035252544 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term758672;
     Object term759612;
     Object term759609;

    public Fraction_reduce_3355035252544() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term758672 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term758672, term758672.getClass(), "numerator", 30);
        setIntField(term758672, term758672.getClass(), "denominator", 1073741831);
        term759612 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term759612, term759612.getClass(), "numerator", 30);
        setIntField(term759612, term759612.getClass(), "denominator", 1073741831);
        setField(term759612, term759612.getClass(), "toString", null);
        setField(term759612, term759612.getClass(), "toProperString", null);
        term759609 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term759609, term759609.getClass(), "numerator", 30);
        setIntField(term759609, term759609.getClass(), "denominator", 1073741831);
        setField(term759609, term759609.getClass(), "toString", null);
        setField(term759609, term759609.getClass(), "toProperString", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang.math.Fraction");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "reduce", argTypes, term758672, args);
        assertTrue(recursiveEquals(term758672, term759612));
        assertTrue(recursiveEquals(retValue, term759609));
    }

};


