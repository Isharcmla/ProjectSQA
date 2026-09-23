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
import static org.apache.commons.math.complex.EqualityUtils.*;

public class Complex_multiply_1192379372109 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term9560;
     Object term9589;
     Object term9583;

    public Complex_multiply_1192379372109() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term9560 = newInstance(Class.forName("org.apache.commons.math.complex.Complex"));
        setBooleanField(term9560, term9560.getClass(), "isNaN", false);
        term9589 = newInstance(Class.forName("org.apache.commons.math.complex.Complex"));
        setDoubleField(term9589, term9589.getClass(), "imaginary", 0.0);
        setDoubleField(term9589, term9589.getClass(), "real", 0.0);
        setBooleanField(term9589, term9589.getClass(), "isNaN", false);
        setBooleanField(term9589, term9589.getClass(), "isInfinite", false);
        term9583 = newInstance(Class.forName("org.apache.commons.math.complex.Complex"));
        setDoubleField(term9583, term9583.getClass(), "imaginary", 0.0);
        setDoubleField(term9583, term9583.getClass(), "real", 0.0);
        setBooleanField(term9583, term9583.getClass(), "isNaN", false);
        setBooleanField(term9583, term9583.getClass(), "isInfinite", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.complex.Complex");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = double.class;
        Object[] args = new Object[1];
        args[0] = 0.0;
        Object retValue = callMethod(klass, "multiply", argTypes, term9560, args);
        assertTrue(recursiveEquals(term9560, term9589));
        assertTrue(recursiveEquals(retValue, term9583));
    }

};


