package org.apache.commons.lang.math;

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
import java.lang.ArithmeticException;
import static org.apache.commons.lang.math.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class Fraction_add_14549770212266 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term669922;
     Object term670002;

    public Fraction_add_14549770212266() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term669922 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term669922, term669922.getClass(), "numerator", 128);
        setIntField(term669922, term669922.getClass(), "denominator", 1810225468);
        term670002 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term670002, term670002.getClass(), "numerator", 1073741824);
        setIntField(term670002, term670002.getClass(), "denominator", -2013400050);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang.math.Fraction");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.apache.commons.lang.math.Fraction");
        Object[] args = new Object[1];
        args[0] = term670002;
        try {
            callMethod(klass, "add", argTypes, term669922, args);
            assertTrue(false);
        }
        catch (ArithmeticException e) {
        }

    }

};


