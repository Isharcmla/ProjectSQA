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

public class Complex_pow_62902513826 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term156;
     Object term161;

    public Complex_pow_62902513826() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term156 = newInstance(Class.forName("org.apache.commons.math.complex.Complex"));
        setDoubleField(term156, term156.getClass(), "imaginary", 0.9126850255993704);
        setDoubleField(term156, term156.getClass(), "real", 0.11179067076100713);
        setBooleanField(term156, term156.getClass(), "isNaN", false);
        setBooleanField(term156, term156.getClass(), "isInfinite", true);
        term161 = newInstance(Class.forName("org.apache.commons.math.complex.Complex"));
        setDoubleField(term161, term161.getClass(), "imaginary", 0.5306473989087822);
        setDoubleField(term161, term161.getClass(), "real", 0.022483645678509023);
        setBooleanField(term161, term161.getClass(), "isNaN", false);
        setBooleanField(term161, term161.getClass(), "isInfinite", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.complex.Complex");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.apache.commons.math.complex.Complex");
        Object[] args = new Object[1];
        args[0] = term161;
        callMethod(klass, "pow", argTypes, term156, args);
    }

};


