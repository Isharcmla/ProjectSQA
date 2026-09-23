package org.apache.commons.lang3.math;

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
import java.lang.ArithmeticException;
import static org.apache.commons.lang3.math.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class Fraction_add_276352704885 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term281679;
     Object term281761;

    public Fraction_add_276352704885() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term281679 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term281679, term281679.getClass(), "numerator", 268435456);
        setIntField(term281679, term281679.getClass(), "denominator", 1199425540);
        term281761 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term281761, term281761.getClass(), "numerator", 1073741824);
        setIntField(term281761, term281761.getClass(), "denominator", -1798710126);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang3.math.Fraction");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.apache.commons.lang3.math.Fraction");
        Object[] args = new Object[1];
        args[0] = term281761;
        try {
            callMethod(klass, "add", argTypes, term281679, args);
            assertTrue(false);
        }
        catch (ArithmeticException e) {
        }

    }

};


