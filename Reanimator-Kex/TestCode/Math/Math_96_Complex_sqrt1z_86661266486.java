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

public class Complex_sqrt1z_86661266486 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term6102;
     Object term6530;
     Object term6527;

    public Complex_sqrt1z_86661266486() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term6102 = newInstance(Class.forName("org.apache.commons.math.complex.Complex"));
        setDoubleField(term6102, term6102.getClass(), "real", -9.1873432398358118E18);
        setDoubleField(term6102, term6102.getClass(), "imaginary", -9.2188684372274043E18);
        term6530 = newInstance(Class.forName("org.apache.commons.math.complex.Complex"));
        setDoubleField(term6530, term6530.getClass(), "imaginary", -9.2188684372274043E18);
        setDoubleField(term6530, term6530.getClass(), "real", -9.1873432398358118E18);
        term6527 = newInstance(Class.forName("org.apache.commons.math.complex.Complex"));
        setDoubleField(term6527, term6527.getClass(), "imaginary", -9.1873432398358118E18);
        setDoubleField(term6527, term6527.getClass(), "real", 9.2188684372274043E18);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.complex.Complex");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "sqrt1z", argTypes, term6102, args);
        assertTrue(recursiveEquals(term6102, term6530));
        assertTrue(recursiveEquals(retValue, term6527));
    }

};


