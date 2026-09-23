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

public class Fraction_add_1925368547253 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term80748;
     Object term80836;

    public Fraction_add_1925368547253() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term80748 = newInstance(Class.forName("org.apache.commons.math.fraction.Fraction"));
        setIntField(term80748, term80748.getClass(), "numerator", 16);
        setIntField(term80748, term80748.getClass(), "denominator", -335251465);
        term80836 = newInstance(Class.forName("org.apache.commons.math.fraction.Fraction"));
        setIntField(term80836, term80836.getClass(), "numerator", 256);
        setIntField(term80836, term80836.getClass(), "denominator", 1216889931);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.fraction.Fraction");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.apache.commons.math.fraction.Fraction");
        Object[] args = new Object[1];
        args[0] = term80836;
        try {
            callMethod(klass, "add", argTypes, term80748, args);
            assertTrue(false);
        }
        catch (ArithmeticException e) {
        }

    }

};


