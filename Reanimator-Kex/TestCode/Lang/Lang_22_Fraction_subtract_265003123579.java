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

public class Fraction_subtract_265003123579 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term179021;
     Object term179103;

    public Fraction_subtract_265003123579() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term179021 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term179021, term179021.getClass(), "numerator", -2147483648);
        setIntField(term179021, term179021.getClass(), "denominator", -19210248);
        term179103 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term179103, term179103.getClass(), "numerator", -2147483648);
        setIntField(term179103, term179103.getClass(), "denominator", 14943196);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang3.math.Fraction");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.apache.commons.lang3.math.Fraction");
        Object[] args = new Object[1];
        args[0] = term179103;
        try {
            callMethod(klass, "subtract", argTypes, term179021, args);
            assertTrue(false);
        }
        catch (ArithmeticException e) {
        }

    }

};


