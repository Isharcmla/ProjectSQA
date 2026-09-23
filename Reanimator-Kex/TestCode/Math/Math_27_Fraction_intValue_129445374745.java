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

public class Fraction_intValue_129445374745 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term55;
     Object term1841;

    public Fraction_intValue_129445374745() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term55 = newInstance(Class.forName("org.apache.commons.math3.fraction.Fraction"));
        setIntField(term55, term55.getClass(), "denominator", 1135664017);
        setIntField(term55, term55.getClass(), "numerator", 590364439);
        term1841 = newInstance(Class.forName("org.apache.commons.math3.fraction.Fraction"));
        setIntField(term1841, term1841.getClass(), "denominator", 1135664017);
        setIntField(term1841, term1841.getClass(), "numerator", 590364439);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math3.fraction.Fraction");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "intValue", argTypes, term55, args);
        assertTrue(recursiveEquals(term55, term1841));
        assertTrue(recursiveEquals(retValue, 0));
    }

};


