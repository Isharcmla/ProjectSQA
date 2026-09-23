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

public class Fraction_add_751775572383 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term168631;
     Object term168721;

    public Fraction_add_751775572383() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term168631 = newInstance(Class.forName("org.apache.commons.math3.fraction.Fraction"));
        setIntField(term168631, term168631.getClass(), "numerator", 65536);
        setIntField(term168631, term168631.getClass(), "denominator", -528089070);
        term168721 = newInstance(Class.forName("org.apache.commons.math3.fraction.Fraction"));
        setIntField(term168721, term168721.getClass(), "numerator", 4096);
        setIntField(term168721, term168721.getClass(), "denominator", -1564086831);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math3.fraction.Fraction");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.apache.commons.math3.fraction.Fraction");
        Object[] args = new Object[1];
        args[0] = term168721;
        try {
            callMethod(klass, "add", argTypes, term168631, args);
            assertTrue(false);
        }
        catch (MathArithmeticException e) {
        }

    }

};


