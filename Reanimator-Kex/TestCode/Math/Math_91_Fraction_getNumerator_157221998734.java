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

public class Fraction_getNumerator_157221998734 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term47;
     Object term1307;

    public Fraction_getNumerator_157221998734() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term47 = newInstance(Class.forName("org.apache.commons.math.fraction.Fraction"));
        setIntField(term47, term47.getClass(), "denominator", -655067527);
        setIntField(term47, term47.getClass(), "numerator", -6029667);
        term1307 = newInstance(Class.forName("org.apache.commons.math.fraction.Fraction"));
        setIntField(term1307, term1307.getClass(), "denominator", -655067527);
        setIntField(term1307, term1307.getClass(), "numerator", -6029667);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.fraction.Fraction");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "getNumerator", argTypes, term47, args);
        assertTrue(recursiveEquals(term47, term1307));
        assertTrue(recursiveEquals(retValue, -6029667));
    }

};


