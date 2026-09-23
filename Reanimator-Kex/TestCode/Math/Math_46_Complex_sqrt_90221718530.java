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

public class Complex_sqrt_90221718530 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term216;

    public Complex_sqrt_90221718530() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term216 = newInstance(Class.forName("org.apache.commons.math.complex.Complex"));
        setDoubleField(term216, term216.getClass(), "imaginary", 0.03699061125289671);
        setDoubleField(term216, term216.getClass(), "real", 0.6047137830113202);
        setBooleanField(term216, term216.getClass(), "isNaN", false);
        setBooleanField(term216, term216.getClass(), "isInfinite", true);
        setBooleanField(term216, term216.getClass(), "isZero", true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.complex.Complex");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "sqrt", argTypes, term216, args);
    }

};


