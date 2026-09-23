package org.apache.commons.math3.fraction;

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
import static org.apache.commons.math3.fraction.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import static org.apache.commons.math3.fraction.EqualityUtils.*;

public class Fraction_getReducedFraction_1256208055381 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term153255;

    public Fraction_getReducedFraction_1256208055381() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term153255 = newInstance(Class.forName("org.apache.commons.math3.fraction.Fraction"));
        setIntField(term153255, term153255.getClass(), "denominator", 160892955);
        setIntField(term153255, term153255.getClass(), "numerator", 118564721);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math3.fraction.Fraction");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = int.class;
        argTypes[1] = int.class;
        Object[] args = new Object[2];
        args[0] = -1067082489;
        args[1] = -1448036595;
        Object retValue = callMethod(klass, "getReducedFraction", argTypes, null, args);
        assertTrue(recursiveEquals(retValue, term153255));
    }

};


