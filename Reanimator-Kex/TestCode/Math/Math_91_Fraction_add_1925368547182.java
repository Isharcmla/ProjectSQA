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

public class Fraction_add_1925368547182 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term54938;
     Object term55026;

    public Fraction_add_1925368547182() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term54938 = newInstance(Class.forName("org.apache.commons.math.fraction.Fraction"));
        setIntField(term54938, term54938.getClass(), "numerator", 1048576);
        setIntField(term54938, term54938.getClass(), "denominator", -328035431);
        term55026 = newInstance(Class.forName("org.apache.commons.math.fraction.Fraction"));
        setIntField(term55026, term55026.getClass(), "numerator", 4096);
        setIntField(term55026, term55026.getClass(), "denominator", 1604637797);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.fraction.Fraction");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.apache.commons.math.fraction.Fraction");
        Object[] args = new Object[1];
        args[0] = term55026;
        try {
            callMethod(klass, "add", argTypes, term54938, args);
            assertTrue(false);
        }
        catch (ArithmeticException e) {
        }

    }

};


