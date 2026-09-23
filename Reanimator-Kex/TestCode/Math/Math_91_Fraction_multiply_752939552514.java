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
import static org.apache.commons.math.fraction.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class Fraction_multiply_752939552514 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term192987;
     Object term193075;

    public Fraction_multiply_752939552514() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term192987 = newInstance(Class.forName("org.apache.commons.math.fraction.Fraction"));
        setIntField(term192987, term192987.getClass(), "numerator", -1879048190);
        term193075 = newInstance(Class.forName("org.apache.commons.math.fraction.Fraction"));
        setIntField(term193075, term193075.getClass(), "numerator", -1879048190);
        setIntField(term193075, term193075.getClass(), "denominator", -1370192919);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.fraction.Fraction");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.apache.commons.math.fraction.Fraction");
        Object[] args = new Object[1];
        args[0] = term193075;
        callMethod(klass, "multiply", argTypes, term192987, args);
    }

};


