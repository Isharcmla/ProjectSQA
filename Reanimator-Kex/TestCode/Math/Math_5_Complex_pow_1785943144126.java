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

public class Complex_pow_1785943144126 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term17399;

    public Complex_pow_1785943144126() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term17399 = newInstance(Class.forName("org.apache.commons.math3.complex.Complex"));
        setBooleanField(term17399, term17399.getClass(), "isNaN", false);
        setBooleanField(term17399, term17399.getClass(), "isInfinite", false);
        setDoubleField(term17399, term17399.getClass(), "real", 9.2195614560039731E18);
        setDoubleField(term17399, term17399.getClass(), "imaginary", -3.810580850802688E15);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math3.complex.Complex");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = double.class;
        Object[] args = new Object[1];
        args[0] = 0.0;
        callMethod(klass, "pow", argTypes, term17399, args);
    }

};


