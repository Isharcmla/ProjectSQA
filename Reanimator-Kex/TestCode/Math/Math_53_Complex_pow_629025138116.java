package org.apache.commons.math.complex;

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
import static org.apache.commons.math.complex.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class Complex_pow_629025138116 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term10930;
     Object term11014;

    public Complex_pow_629025138116() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term10930 = newInstance(Class.forName("org.apache.commons.math.complex.Complex"));
        setBooleanField(term10930, term10930.getClass(), "isNaN", false);
        setBooleanField(term10930, term10930.getClass(), "isInfinite", false);
        setDoubleField(term10930, term10930.getClass(), "real", 4.503633987108864E15);
        setDoubleField(term10930, term10930.getClass(), "imaginary", 0.0);
        term11014 = newInstance(Class.forName("org.apache.commons.math.complex.Complex"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.complex.Complex");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.apache.commons.math.complex.Complex");
        Object[] args = new Object[1];
        args[0] = term11014;
        callMethod(klass, "pow", argTypes, term10930, args);
    }

};


