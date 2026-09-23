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

public class Fraction_add_2763527042477 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term810790;
     Object term810872;

    public Fraction_add_2763527042477() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term810790 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term810790, term810790.getClass(), "numerator", 16);
        setIntField(term810790, term810790.getClass(), "denominator", 2073090908);
        term810872 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term810872, term810872.getClass(), "numerator", 524288);
        setIntField(term810872, term810872.getClass(), "denominator", -1816362594);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang3.math.Fraction");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.apache.commons.lang3.math.Fraction");
        Object[] args = new Object[1];
        args[0] = term810872;
        try {
            callMethod(klass, "add", argTypes, term810790, args);
            assertTrue(false);
        }
        catch (ArithmeticException e) {
        }

    }

};


