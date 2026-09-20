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

public class Fraction_subtract_74042599177 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term13637;
     Object term13727;
     Object term13845;
     Object term13846;
     Object term13842;

    public Fraction_subtract_74042599177() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term13637 = newInstance(Class.forName("org.apache.commons.math3.fraction.Fraction"));
        setIntField(term13637, term13637.getClass(), "numerator", 16777216);
        setIntField(term13637, term13637.getClass(), "denominator", 1686065648);
        term13727 = newInstance(Class.forName("org.apache.commons.math3.fraction.Fraction"));
        setIntField(term13727, term13727.getClass(), "numerator", -2147483648);
        setIntField(term13727, term13727.getClass(), "denominator", -1264549236);
        term13845 = newInstance(Class.forName("org.apache.commons.math3.fraction.Fraction"));
        setIntField(term13845, term13845.getClass(), "denominator", 1686065648);
        setIntField(term13845, term13845.getClass(), "numerator", 16777216);
        term13846 = newInstance(Class.forName("org.apache.commons.math3.fraction.Fraction"));
        setIntField(term13846, term13846.getClass(), "denominator", -1264549236);
        setIntField(term13846, term13846.getClass(), "numerator", -2147483648);
        term13842 = newInstance(Class.forName("org.apache.commons.math3.fraction.Fraction"));
        setIntField(term13842, term13842.getClass(), "denominator", 316137309);
        setIntField(term13842, term13842.getClass(), "numerator", -533725184);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math3.fraction.Fraction");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.apache.commons.math3.fraction.Fraction");
        Object[] args = new Object[1];
        args[0] = term13727;
        Object retValue = callMethod(klass, "subtract", argTypes, term13637, args);
        assertTrue(recursiveEquals(term13637, term13845));
        assertTrue(recursiveEquals(term13727, term13846));
        assertTrue(recursiveEquals(retValue, term13842));
    }

};
