package org.apache.commons.math.fraction;

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
import static org.apache.commons.math.fraction.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import static org.apache.commons.math.fraction.EqualityUtils.*;

public class Fraction_negate_30844742338 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term59;
     Object term1440;
     Object term1432;

    public Fraction_negate_30844742338() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term59 = newInstance(Class.forName("org.apache.commons.math.fraction.Fraction"));
        setIntField(term59, term59.getClass(), "denominator", -1275173084);
        setIntField(term59, term59.getClass(), "numerator", -244121226);
        term1440 = newInstance(Class.forName("org.apache.commons.math.fraction.Fraction"));
        setIntField(term1440, term1440.getClass(), "denominator", -1275173084);
        setIntField(term1440, term1440.getClass(), "numerator", -244121226);
        term1432 = newInstance(Class.forName("org.apache.commons.math.fraction.Fraction"));
        setIntField(term1432, term1432.getClass(), "denominator", 637586542);
        setIntField(term1432, term1432.getClass(), "numerator", -122060613);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.fraction.Fraction");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "negate", argTypes, term59, args);
        assertTrue(recursiveEquals(term59, term1440));
        assertTrue(recursiveEquals(retValue, term1432));
    }

};


