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

public class Fraction_addSub_1853047840305 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term85973;
     Object term86055;

    public Fraction_addSub_1853047840305() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term85973 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term85973, term85973.getClass(), "numerator", -2147483648);
        setIntField(term85973, term85973.getClass(), "denominator", 1073741825);
        term86055 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term86055, term86055.getClass(), "numerator", -2147483648);
        setIntField(term86055, term86055.getClass(), "denominator", 2);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang3.math.Fraction");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("org.apache.commons.lang3.math.Fraction");
        argTypes[1] = boolean.class;
        Object[] args = new Object[2];
        args[0] = term86055;
        args[1] = false;
        try {
            callMethod(klass, "addSub", argTypes, term85973, args);
            assertTrue(false);
        }
        catch (ArithmeticException e) {
        }

    }

};


