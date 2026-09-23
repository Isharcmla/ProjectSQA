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

public class Fraction_subtract_740425991674 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term276098;
     Object term276188;
     Object term276787;
     Object term276788;
     Object term276784;

    public Fraction_subtract_740425991674() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term276098 = newInstance(Class.forName("org.apache.commons.math3.fraction.Fraction"));
        setIntField(term276098, term276098.getClass(), "numerator", 2);
        setIntField(term276098, term276098.getClass(), "denominator", 1);
        term276188 = newInstance(Class.forName("org.apache.commons.math3.fraction.Fraction"));
        setIntField(term276188, term276188.getClass(), "numerator", 16777216);
        setIntField(term276188, term276188.getClass(), "denominator", -218304148);
        term276787 = newInstance(Class.forName("org.apache.commons.math3.fraction.Fraction"));
        setIntField(term276787, term276787.getClass(), "denominator", 1);
        setIntField(term276787, term276787.getClass(), "numerator", 2);
        term276788 = newInstance(Class.forName("org.apache.commons.math3.fraction.Fraction"));
        setIntField(term276788, term276788.getClass(), "denominator", -218304148);
        setIntField(term276788, term276788.getClass(), "numerator", 16777216);
        term276784 = newInstance(Class.forName("org.apache.commons.math3.fraction.Fraction"));
        setIntField(term276784, term276784.getClass(), "denominator", 54576037);
        setIntField(term276784, term276784.getClass(), "numerator", 113346378);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math3.fraction.Fraction");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.apache.commons.math3.fraction.Fraction");
        Object[] args = new Object[1];
        args[0] = term276188;
        Object retValue = callMethod(klass, "subtract", argTypes, term276098, args);
        assertTrue(recursiveEquals(term276098, term276787));
        assertTrue(recursiveEquals(term276188, term276788));
        assertTrue(recursiveEquals(retValue, term276784));
    }

};


