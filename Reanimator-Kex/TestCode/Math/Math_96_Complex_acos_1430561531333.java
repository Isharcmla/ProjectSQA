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

public class Complex_acos_1430561531333 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term72569;
     Object term73562;
     Object term73559;

    public Complex_acos_1430561531333() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term72569 = newInstance(Class.forName("org.apache.commons.math.complex.Complex"));
        setDoubleField(term72569, term72569.getClass(), "real", 2.3061244841904046E18);
        setDoubleField(term72569, term72569.getClass(), "imaginary", 1.15292150460684698E18);
        term73562 = newInstance(Class.forName("org.apache.commons.math.complex.Complex"));
        setDoubleField(term73562, term73562.getClass(), "imaginary", 1.15292150460684698E18);
        setDoubleField(term73562, term73562.getClass(), "real", 2.3061244841904046E18);
        term73559 = newInstance(Class.forName("org.apache.commons.math.complex.Complex"));
        setDoubleField(term73559, term73559.getClass(), "imaginary", -43.08679462304751);
        setDoubleField(term73559, term73559.getClass(), "real", 0.4635987856437509);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.complex.Complex");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "acos", argTypes, term72569, args);
        assertTrue(recursiveEquals(term72569, term73562));
        assertTrue(recursiveEquals(retValue, term73559));
    }

};


