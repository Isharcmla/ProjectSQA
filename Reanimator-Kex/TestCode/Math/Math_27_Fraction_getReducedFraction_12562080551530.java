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

public class Fraction_getReducedFraction_12562080551530 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term638272;

    public Fraction_getReducedFraction_12562080551530() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term638272 = newInstance(Class.forName("org.apache.commons.math3.fraction.Fraction"));
        setIntField(term638272, term638272.getClass(), "denominator", 326775395);
        setIntField(term638272, term638272.getClass(), "numerator", 179862393);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math3.fraction.Fraction");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = int.class;
        argTypes[1] = int.class;
        Object[] args = new Object[2];
        args[0] = -899311965;
        args[1] = -1633876975;
        Object retValue = callMethod(klass, "getReducedFraction", argTypes, null, args);
        assertTrue(recursiveEquals(retValue, term638272));
    }

};


