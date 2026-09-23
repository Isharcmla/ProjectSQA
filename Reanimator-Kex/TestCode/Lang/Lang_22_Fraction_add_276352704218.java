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

public class Fraction_add_276352704218 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term55255;
     Object term55337;

    public Fraction_add_276352704218() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term55255 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term55255, term55255.getClass(), "numerator", -2147483648);
        setIntField(term55255, term55255.getClass(), "denominator", 759393492);
        term55337 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term55337, term55337.getClass(), "numerator", -2147483648);
        setIntField(term55337, term55337.getClass(), "denominator", -1119050182);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang3.math.Fraction");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.apache.commons.lang3.math.Fraction");
        Object[] args = new Object[1];
        args[0] = term55337;
        try {
            callMethod(klass, "add", argTypes, term55255, args);
            assertTrue(false);
        }
        catch (ArithmeticException e) {
        }

    }

};


