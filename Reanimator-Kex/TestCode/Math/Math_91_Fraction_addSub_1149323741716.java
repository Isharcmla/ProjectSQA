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
import java.lang.ArithmeticException;
import static org.apache.commons.math.fraction.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class Fraction_addSub_1149323741716 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term268114;
     Object term268202;

    public Fraction_addSub_1149323741716() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term268114 = newInstance(Class.forName("org.apache.commons.math.fraction.Fraction"));
        setIntField(term268114, term268114.getClass(), "numerator", -2147483648);
        setIntField(term268114, term268114.getClass(), "denominator", 1);
        term268202 = newInstance(Class.forName("org.apache.commons.math.fraction.Fraction"));
        setIntField(term268202, term268202.getClass(), "numerator", 16777216);
        setIntField(term268202, term268202.getClass(), "denominator", -2147483644);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.fraction.Fraction");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("org.apache.commons.math.fraction.Fraction");
        argTypes[1] = boolean.class;
        Object[] args = new Object[2];
        args[0] = term268202;
        args[1] = false;
        try {
            callMethod(klass, "addSub", argTypes, term268114, args);
            assertTrue(false);
        }
        catch (ArithmeticException e) {
        }

    }

};


