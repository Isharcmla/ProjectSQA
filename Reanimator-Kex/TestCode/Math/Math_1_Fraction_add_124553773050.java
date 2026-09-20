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
import java.lang.Integer;

public class Fraction_add_124553773050 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term73;
     Object term76;
     Object term2725;
     Object term2716;

    public Fraction_add_124553773050() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term73 = newInstance(Class.forName("org.apache.commons.math3.fraction.Fraction"));
        setIntField(term73, term73.getClass(), "denominator", -469968304);
        setIntField(term73, term73.getClass(), "numerator", -1145578966);
        term76 = new Integer(679763016);
        term2725 = newInstance(Class.forName("org.apache.commons.math3.fraction.Fraction"));
        setIntField(term2725, term2725.getClass(), "denominator", -469968304);
        setIntField(term2725, term2725.getClass(), "numerator", -1145578966);
        term2716 = newInstance(Class.forName("org.apache.commons.math3.fraction.Fraction"));
        setIntField(term2716, term2716.getClass(), "denominator", 234984152);
        setIntField(term2716, term2716.getClass(), "numerator", 448462763);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math3.fraction.Fraction");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term76;
        Object retValue = callMethod(klass, "add", argTypes, term73, args);
        assertTrue(recursiveEquals(term73, term2725));
        assertTrue(recursiveEquals(term76, 679763016));
        assertTrue(recursiveEquals(retValue, term2716));
    }

};
