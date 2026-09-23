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

public class Complex_sqrt1z_86661266454 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term93;
     Object term1632;
     Object term1629;

    public Complex_sqrt1z_86661266454() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term93 = newInstance(Class.forName("org.apache.commons.math.complex.Complex"));
        setDoubleField(term93, term93.getClass(), "imaginary", 0.3227335400819148);
        setDoubleField(term93, term93.getClass(), "real", 0.43337207054070237);
        term1632 = newInstance(Class.forName("org.apache.commons.math.complex.Complex"));
        setDoubleField(term1632, term1632.getClass(), "imaginary", 0.3227335400819148);
        setDoubleField(term1632, term1632.getClass(), "real", 0.43337207054070237);
        term1629 = newInstance(Class.forName("org.apache.commons.math.complex.Complex"));
        setDoubleField(term1629, term1629.getClass(), "imaginary", -0.14447235286218557);
        setDoubleField(term1629, term1629.getClass(), "real", 0.9681001224618274);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.complex.Complex");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "sqrt1z", argTypes, term93, args);
        assertTrue(recursiveEquals(term93, term1632));
        assertTrue(recursiveEquals(retValue, term1629));
    }

};


