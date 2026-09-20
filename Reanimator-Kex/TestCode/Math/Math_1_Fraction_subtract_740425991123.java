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

public class Fraction_subtract_740425991123 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term41566;
     Object term41656;
     Object term41670;
     Object term41671;
     Object term41663;

    public Fraction_subtract_740425991123() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term41566 = newInstance(Class.forName("org.apache.commons.math3.fraction.Fraction"));
        setIntField(term41566, term41566.getClass(), "numerator", -1);
        term41656 = newInstance(Class.forName("org.apache.commons.math3.fraction.Fraction"));
        setIntField(term41656, term41656.getClass(), "numerator", 0);
        term41670 = newInstance(Class.forName("org.apache.commons.math3.fraction.Fraction"));
        setIntField(term41670, term41670.getClass(), "denominator", 0);
        setIntField(term41670, term41670.getClass(), "numerator", -1);
        term41671 = newInstance(Class.forName("org.apache.commons.math3.fraction.Fraction"));
        setIntField(term41671, term41671.getClass(), "denominator", 0);
        setIntField(term41671, term41671.getClass(), "numerator", 0);
        term41663 = newInstance(Class.forName("org.apache.commons.math3.fraction.Fraction"));
        setIntField(term41663, term41663.getClass(), "denominator", 0);
        setIntField(term41663, term41663.getClass(), "numerator", -1);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math3.fraction.Fraction");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.apache.commons.math3.fraction.Fraction");
        Object[] args = new Object[1];
        args[0] = term41656;
        Object retValue = callMethod(klass, "subtract", argTypes, term41566, args);
        assertTrue(recursiveEquals(term41566, term41670));
        assertTrue(recursiveEquals(term41656, term41671));
        assertTrue(recursiveEquals(retValue, term41663));
    }

};
