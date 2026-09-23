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

public class Complex_pow_62902513828 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term168;
     Object term173;

    public Complex_pow_62902513828() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term168 = newInstance(Class.forName("org.apache.commons.math.complex.Complex"));
        setDoubleField(term168, term168.getClass(), "imaginary", 0.025133051616627267);
        setDoubleField(term168, term168.getClass(), "real", 0.016575281023182953);
        setBooleanField(term168, term168.getClass(), "isNaN", false);
        setBooleanField(term168, term168.getClass(), "isInfinite", false);
        term173 = newInstance(Class.forName("org.apache.commons.math.complex.Complex"));
        setDoubleField(term173, term173.getClass(), "imaginary", 0.5308350402051779);
        setDoubleField(term173, term173.getClass(), "real", 0.7154795600170818);
        setBooleanField(term173, term173.getClass(), "isNaN", true);
        setBooleanField(term173, term173.getClass(), "isInfinite", true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.complex.Complex");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.apache.commons.math.complex.Complex");
        Object[] args = new Object[1];
        args[0] = term173;
        callMethod(klass, "pow", argTypes, term168, args);
    }

};


