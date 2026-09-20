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

public class Fraction_doubleValue_162544806239 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term36;
     Object term1696;

    public Fraction_doubleValue_162544806239() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term36 = newInstance(Class.forName("org.apache.commons.math3.fraction.Fraction"));
        setIntField(term36, term36.getClass(), "denominator", -883034806);
        setIntField(term36, term36.getClass(), "numerator", 1585847225);
        term1696 = newInstance(Class.forName("org.apache.commons.math3.fraction.Fraction"));
        setIntField(term1696, term1696.getClass(), "denominator", -883034806);
        setIntField(term1696, term1696.getClass(), "numerator", 1585847225);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math3.fraction.Fraction");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "doubleValue", argTypes, term36, args);
        assertTrue(recursiveEquals(term36, term1696));
        assertTrue(recursiveEquals(retValue, -1.7959056814347134));
    }

};
