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

public class Complex_pow_629025138359 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term82411;
     Object term82495;
     Object term82784;
     Object term82785;
     Object term82781;

    public Complex_pow_629025138359() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term82411 = newInstance(Class.forName("org.apache.commons.math.complex.Complex"));
        setDoubleField(term82411, term82411.getClass(), "real", 4.504827988018176E15);
        setDoubleField(term82411, term82411.getClass(), "imaginary", 4.504827988018176E15);
        term82495 = newInstance(Class.forName("org.apache.commons.math.complex.Complex"));
        term82784 = newInstance(Class.forName("org.apache.commons.math.complex.Complex"));
        setDoubleField(term82784, term82784.getClass(), "imaginary", 4.504827988018176E15);
        setDoubleField(term82784, term82784.getClass(), "real", 4.504827988018176E15);
        term82785 = newInstance(Class.forName("org.apache.commons.math.complex.Complex"));
        setDoubleField(term82785, term82785.getClass(), "imaginary", 0.0);
        setDoubleField(term82785, term82785.getClass(), "real", 0.0);
        term82781 = newInstance(Class.forName("org.apache.commons.math.complex.Complex"));
        setDoubleField(term82781, term82781.getClass(), "imaginary", 0.0);
        setDoubleField(term82781, term82781.getClass(), "real", 1.0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.complex.Complex");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.apache.commons.math.complex.Complex");
        Object[] args = new Object[1];
        args[0] = term82495;
        Object retValue = callMethod(klass, "pow", argTypes, term82411, args);
        assertTrue(recursiveEquals(term82411, term82784));
        assertTrue(recursiveEquals(term82495, term82785));
        assertTrue(recursiveEquals(retValue, term82781));
    }

};


