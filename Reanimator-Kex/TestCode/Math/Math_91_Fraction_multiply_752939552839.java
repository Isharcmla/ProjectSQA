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

public class Fraction_multiply_752939552839 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term315999;
     Object term316087;

    public Fraction_multiply_752939552839() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term315999 = newInstance(Class.forName("org.apache.commons.math.fraction.Fraction"));
        setIntField(term315999, term315999.getClass(), "numerator", -922468318);
        term316087 = newInstance(Class.forName("org.apache.commons.math.fraction.Fraction"));
        setIntField(term316087, term316087.getClass(), "numerator", -922468318);
        setIntField(term316087, term316087.getClass(), "denominator", -486793287);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.fraction.Fraction");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.apache.commons.math.fraction.Fraction");
        Object[] args = new Object[1];
        args[0] = term316087;
        callMethod(klass, "multiply", argTypes, term315999, args);
    }

};


