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

public class Fraction_addSub_63537990177 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term8660;
     Object term8740;

    public Fraction_addSub_63537990177() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term8660 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term8660, term8660.getClass(), "numerator", 1048576);
        setIntField(term8660, term8660.getClass(), "denominator", 1073741825);
        term8740 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term8740, term8740.getClass(), "numerator", 536870912);
        setIntField(term8740, term8740.getClass(), "denominator", 2);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang.math.Fraction");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("org.apache.commons.lang.math.Fraction");
        argTypes[1] = boolean.class;
        Object[] args = new Object[2];
        args[0] = term8740;
        args[1] = false;
        try {
            callMethod(klass, "addSub", argTypes, term8660, args);
            assertTrue(false);
        }
        catch (ArithmeticException e) {
        }

    }

};


