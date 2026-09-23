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

public class Fraction_getReducedFraction_656328745380 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term132845;

    public Fraction_getReducedFraction_656328745380() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term132845 = newInstance(Class.forName("org.apache.commons.math.fraction.Fraction"));
        setIntField(term132845, term132845.getClass(), "denominator", 1150833179);
        setIntField(term132845, term132845.getClass(), "numerator", -2129617406);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.fraction.Fraction");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = int.class;
        argTypes[1] = int.class;
        Object[] args = new Object[2];
        args[0] = -2129617406;
        args[1] = 1150833179;
        Object retValue = callMethod(klass, "getReducedFraction", argTypes, null, args);
        assertTrue(recursiveEquals(retValue, term132845));
    }

};


