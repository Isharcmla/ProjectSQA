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

public class Fraction_add_1454977021902 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term257802;
     Object term257882;

    public Fraction_add_1454977021902() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term257802 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term257802, term257802.getClass(), "numerator", -2147483648);
        setIntField(term257802, term257802.getClass(), "denominator", 1073733632);
        term257882 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term257882, term257882.getClass(), "numerator", -2147483648);
        setIntField(term257882, term257882.getClass(), "denominator", 1073741824);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang.math.Fraction");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.apache.commons.lang.math.Fraction");
        Object[] args = new Object[1];
        args[0] = term257882;
        try {
            callMethod(klass, "add", argTypes, term257802, args);
            assertTrue(false);
        }
        catch (ArithmeticException e) {
        }

    }

};


