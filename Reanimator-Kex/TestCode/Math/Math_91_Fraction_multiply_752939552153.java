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

public class Fraction_multiply_752939552153 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term42941;
     Object term43029;

    public Fraction_multiply_752939552153() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term42941 = newInstance(Class.forName("org.apache.commons.math.fraction.Fraction"));
        setIntField(term42941, term42941.getClass(), "numerator", -2147483646);
        term43029 = newInstance(Class.forName("org.apache.commons.math.fraction.Fraction"));
        setIntField(term43029, term43029.getClass(), "numerator", -2147483646);
        setIntField(term43029, term43029.getClass(), "denominator", -1073741823);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.fraction.Fraction");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.apache.commons.math.fraction.Fraction");
        Object[] args = new Object[1];
        args[0] = term43029;
        callMethod(klass, "multiply", argTypes, term42941, args);
    }

};


