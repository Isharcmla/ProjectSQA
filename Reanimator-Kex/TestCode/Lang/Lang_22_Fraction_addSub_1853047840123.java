package org.apache.commons.lang3.math;

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
import static org.apache.commons.lang3.math.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class Fraction_addSub_1853047840123 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term25070;
     Object term25152;

    public Fraction_addSub_1853047840123() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term25070 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term25070, term25070.getClass(), "numerator", 1073741824);
        setIntField(term25070, term25070.getClass(), "denominator", 536870913);
        term25152 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term25152, term25152.getClass(), "numerator", 1073741824);
        setIntField(term25152, term25152.getClass(), "denominator", 2);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang3.math.Fraction");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("org.apache.commons.lang3.math.Fraction");
        argTypes[1] = boolean.class;
        Object[] args = new Object[2];
        args[0] = term25152;
        args[1] = false;
        try {
            callMethod(klass, "addSub", argTypes, term25070, args);
            assertTrue(false);
        }
        catch (ArithmeticException e) {
        }

    }

};


