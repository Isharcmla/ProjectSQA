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

public class Complex_pow_62902513822 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term133;
     Object term138;

    public Complex_pow_62902513822() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term133 = newInstance(Class.forName("org.apache.commons.math.complex.Complex"));
        setDoubleField(term133, term133.getClass(), "imaginary", 0.8454723071922143);
        setDoubleField(term133, term133.getClass(), "real", 0.8566567697571895);
        setBooleanField(term133, term133.getClass(), "isNaN", false);
        setBooleanField(term133, term133.getClass(), "isInfinite", false);
        term138 = newInstance(Class.forName("org.apache.commons.math.complex.Complex"));
        setDoubleField(term138, term138.getClass(), "imaginary", 0.9203805380592256);
        setDoubleField(term138, term138.getClass(), "real", 0.5804948995371725);
        setBooleanField(term138, term138.getClass(), "isNaN", true);
        setBooleanField(term138, term138.getClass(), "isInfinite", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.complex.Complex");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.apache.commons.math.complex.Complex");
        Object[] args = new Object[1];
        args[0] = term138;
        callMethod(klass, "pow", argTypes, term133, args);
    }

};


