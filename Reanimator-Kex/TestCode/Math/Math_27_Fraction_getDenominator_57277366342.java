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

public class Fraction_getDenominator_57277366342 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term46;
     Object term1825;

    public Fraction_getDenominator_57277366342() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term46 = newInstance(Class.forName("org.apache.commons.math3.fraction.Fraction"));
        setIntField(term46, term46.getClass(), "denominator", 1048535127);
        setIntField(term46, term46.getClass(), "numerator", -655067527);
        term1825 = newInstance(Class.forName("org.apache.commons.math3.fraction.Fraction"));
        setIntField(term1825, term1825.getClass(), "denominator", 1048535127);
        setIntField(term1825, term1825.getClass(), "numerator", -655067527);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math3.fraction.Fraction");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "getDenominator", argTypes, term46, args);
        assertTrue(recursiveEquals(term46, term1825));
        assertTrue(recursiveEquals(retValue, 1048535127));
    }

};


