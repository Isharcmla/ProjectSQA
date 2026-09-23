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

public class Fraction_getField_191671734561 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term129;
     Object term7550;
     Object term7546;

    public Fraction_getField_191671734561() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term129 = newInstance(Class.forName("org.apache.commons.math3.fraction.Fraction"));
        setIntField(term129, term129.getClass(), "denominator", 962840079);
        setIntField(term129, term129.getClass(), "numerator", 1540719661);
        term7550 = newInstance(Class.forName("org.apache.commons.math3.fraction.Fraction"));
        setIntField(term7550, term7550.getClass(), "denominator", 962840079);
        setIntField(term7550, term7550.getClass(), "numerator", 1540719661);
        term7546 = newInstance(Class.forName("org.apache.commons.math3.fraction.FractionField"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math3.fraction.Fraction");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "getField", argTypes, term129, args);
        assertTrue(recursiveEquals(term129, term7550));
        assertTrue(recursiveEquals(retValue, term7546));
    }

};


