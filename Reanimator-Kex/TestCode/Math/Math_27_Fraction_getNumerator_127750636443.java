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

public class Fraction_getNumerator_127750636443 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term49;
     Object term1830;

    public Fraction_getNumerator_127750636443() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term49 = newInstance(Class.forName("org.apache.commons.math3.fraction.Fraction"));
        setIntField(term49, term49.getClass(), "denominator", -6029667);
        setIntField(term49, term49.getClass(), "numerator", -2068769794);
        term1830 = newInstance(Class.forName("org.apache.commons.math3.fraction.Fraction"));
        setIntField(term1830, term1830.getClass(), "denominator", -6029667);
        setIntField(term1830, term1830.getClass(), "numerator", -2068769794);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math3.fraction.Fraction");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "getNumerator", argTypes, term49, args);
        assertTrue(recursiveEquals(term49, term1830));
        assertTrue(recursiveEquals(retValue, -2068769794));
    }

};


