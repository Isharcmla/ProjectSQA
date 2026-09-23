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

public class Fraction_floatValue_171928758641 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term43;
     Object term1820;

    public Fraction_floatValue_171928758641() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term43 = newInstance(Class.forName("org.apache.commons.math3.fraction.Fraction"));
        setIntField(term43, term43.getClass(), "denominator", -1456670397);
        setIntField(term43, term43.getClass(), "numerator", 1622346318);
        term1820 = newInstance(Class.forName("org.apache.commons.math3.fraction.Fraction"));
        setIntField(term1820, term1820.getClass(), "denominator", -1456670397);
        setIntField(term1820, term1820.getClass(), "numerator", 1622346318);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math3.fraction.Fraction");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "floatValue", argTypes, term43, args);
        assertTrue(recursiveEquals(term43, term1820));
        assertTrue(recursiveEquals(retValue, -1.113736F));
    }

};


