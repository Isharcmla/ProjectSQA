package org.apache.commons.math3.fraction;

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
import org.apache.commons.math3.exception.MathArithmeticException;
import static org.apache.commons.math3.fraction.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class Fraction_add_751775572199 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term70980;
     Object term71070;

    public Fraction_add_751775572199() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term70980 = newInstance(Class.forName("org.apache.commons.math3.fraction.Fraction"));
        setIntField(term70980, term70980.getClass(), "numerator", 131072);
        setIntField(term70980, term70980.getClass(), "denominator", -800938302);
        term71070 = newInstance(Class.forName("org.apache.commons.math3.fraction.Fraction"));
        setIntField(term71070, term71070.getClass(), "numerator", 1024);
        setIntField(term71070, term71070.getClass(), "denominator", -1820448743);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math3.fraction.Fraction");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.apache.commons.math3.fraction.Fraction");
        Object[] args = new Object[1];
        args[0] = term71070;
        try {
            callMethod(klass, "add", argTypes, term70980, args);
            assertTrue(false);
        }
        catch (MathArithmeticException e) {
        }

    }

};


