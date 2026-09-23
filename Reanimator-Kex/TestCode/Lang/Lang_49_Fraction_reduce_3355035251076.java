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

public class Fraction_reduce_3355035251076 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term310460;
     Object term311299;
     Object term311296;

    public Fraction_reduce_3355035251076() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term310460 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term310460, term310460.getClass(), "numerator", 130117682);
        setIntField(term310460, term310460.getClass(), "denominator", 539771985);
        term311299 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term311299, term311299.getClass(), "numerator", 130117682);
        setIntField(term311299, term311299.getClass(), "denominator", 539771985);
        setField(term311299, term311299.getClass(), "toString", null);
        setField(term311299, term311299.getClass(), "toProperString", null);
        term311296 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term311296, term311296.getClass(), "numerator", 130117682);
        setIntField(term311296, term311296.getClass(), "denominator", 539771985);
        setField(term311296, term311296.getClass(), "toString", null);
        setField(term311296, term311296.getClass(), "toProperString", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang.math.Fraction");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "reduce", argTypes, term310460, args);
        assertTrue(recursiveEquals(term310460, term311299));
        assertTrue(recursiveEquals(retValue, term311296));
    }

};


