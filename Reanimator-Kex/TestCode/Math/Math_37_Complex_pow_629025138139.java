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

public class Complex_pow_629025138139 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term24052;
     Object term24136;

    public Complex_pow_629025138139() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term24052 = newInstance(Class.forName("org.apache.commons.math.complex.Complex"));
        setBooleanField(term24052, term24052.getClass(), "isNaN", false);
        setBooleanField(term24052, term24052.getClass(), "isInfinite", false);
        setDoubleField(term24052, term24052.getClass(), "real", -9.2188684372274053E18);
        term24136 = newInstance(Class.forName("org.apache.commons.math.complex.Complex"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.complex.Complex");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.apache.commons.math.complex.Complex");
        Object[] args = new Object[1];
        args[0] = term24136;
        callMethod(klass, "pow", argTypes, term24052, args);
    }

};


