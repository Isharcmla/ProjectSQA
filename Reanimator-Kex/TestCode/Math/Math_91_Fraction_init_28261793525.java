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
import java.lang.Double;
import java.lang.Integer;

public class Fraction_init_28261793525 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term658;
     Object term660;

    public Fraction_init_28261793525() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term658 = new Double(0.0);
        term660 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.fraction.Fraction");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = double.class;
        argTypes[1] = int.class;
        Object[] args = new Object[2];
        args[0] = term658;
        args[1] = term660;
        Object instance = callConstructor(klass, argTypes, args);
    }

};


