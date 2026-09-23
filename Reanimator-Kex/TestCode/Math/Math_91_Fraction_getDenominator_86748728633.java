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

public class Fraction_getDenominator_86748728633 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term44;
     Object term1302;

    public Fraction_getDenominator_86748728633() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term44 = newInstance(Class.forName("org.apache.commons.math.fraction.Fraction"));
        setIntField(term44, term44.getClass(), "denominator", 1622346318);
        setIntField(term44, term44.getClass(), "numerator", 1048535127);
        term1302 = newInstance(Class.forName("org.apache.commons.math.fraction.Fraction"));
        setIntField(term1302, term1302.getClass(), "denominator", 1622346318);
        setIntField(term1302, term1302.getClass(), "numerator", 1048535127);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.fraction.Fraction");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "getDenominator", argTypes, term44, args);
        assertTrue(recursiveEquals(term44, term1302));
        assertTrue(recursiveEquals(retValue, 1622346318));
    }

};


