package org.apache.commons.math3.complex;

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
import static org.apache.commons.math3.complex.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class Complex_pow_2061976937116 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term14961;
     Object term15047;

    public Complex_pow_2061976937116() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term14961 = newInstance(Class.forName("org.apache.commons.math3.complex.Complex"));
        setBooleanField(term14961, term14961.getClass(), "isNaN", false);
        setBooleanField(term14961, term14961.getClass(), "isInfinite", false);
        setDoubleField(term14961, term14961.getClass(), "real", 4.503633987108864E15);
        setDoubleField(term14961, term14961.getClass(), "imaginary", -9.2188684372274053E18);
        term15047 = newInstance(Class.forName("org.apache.commons.math3.complex.Complex"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math3.complex.Complex");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.apache.commons.math3.complex.Complex");
        Object[] args = new Object[1];
        args[0] = term15047;
        callMethod(klass, "pow", argTypes, term14961, args);
    }

};


