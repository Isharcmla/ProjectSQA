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

public class Fraction_add_276352704752 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term237900;
     Object term237982;

    public Fraction_add_276352704752() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term237900 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term237900, term237900.getClass(), "numerator", 512);
        setIntField(term237900, term237900.getClass(), "denominator", 603990660);
        term237982 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term237982, term237982.getClass(), "numerator", -2147483648);
        setIntField(term237982, term237982.getClass(), "denominator", -1308646430);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang3.math.Fraction");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.apache.commons.lang3.math.Fraction");
        Object[] args = new Object[1];
        args[0] = term237982;
        try {
            callMethod(klass, "add", argTypes, term237900, args);
            assertTrue(false);
        }
        catch (ArithmeticException e) {
        }

    }

};


