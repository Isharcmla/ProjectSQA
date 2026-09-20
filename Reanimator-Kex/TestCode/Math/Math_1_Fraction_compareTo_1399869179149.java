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

public class Fraction_compareTo_1399869179149 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term55130;
     Object term55220;
     Object term55230;
     Object term55231;

    public Fraction_compareTo_1399869179149() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term55130 = newInstance(Class.forName("org.apache.commons.math3.fraction.Fraction"));
        setIntField(term55130, term55130.getClass(), "numerator", 1079628126);
        setIntField(term55130, term55130.getClass(), "denominator", 204820989);
        term55220 = newInstance(Class.forName("org.apache.commons.math3.fraction.Fraction"));
        setIntField(term55220, term55220.getClass(), "denominator", 232737883);
        setIntField(term55220, term55220.getClass(), "numerator", 1600769845);
        term55230 = newInstance(Class.forName("org.apache.commons.math3.fraction.Fraction"));
        setIntField(term55230, term55230.getClass(), "denominator", 204820989);
        setIntField(term55230, term55230.getClass(), "numerator", 1079628126);
        term55231 = newInstance(Class.forName("org.apache.commons.math3.fraction.Fraction"));
        setIntField(term55231, term55231.getClass(), "denominator", 232737883);
        setIntField(term55231, term55231.getClass(), "numerator", 1600769845);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math3.fraction.Fraction");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.apache.commons.math3.fraction.Fraction");
        Object[] args = new Object[1];
        args[0] = term55220;
        Object retValue = callMethod(klass, "compareTo", argTypes, term55130, args);
        assertTrue(recursiveEquals(term55130, term55230));
        assertTrue(recursiveEquals(term55220, term55231));
        assertTrue(recursiveEquals(retValue, -1));
    }

};
