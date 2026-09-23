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

public class Complex_acos_1430561531103 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term10826;
     Object term11037;
     Object term11034;

    public Complex_acos_1430561531103() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term10826 = newInstance(Class.forName("org.apache.commons.math.complex.Complex"));
        setDoubleField(term10826, term10826.getClass(), "real", 9.0159953477632E15);
        setDoubleField(term10826, term10826.getClass(), "imaginary", 2.3058431466526474E18);
        term11037 = newInstance(Class.forName("org.apache.commons.math.complex.Complex"));
        setDoubleField(term11037, term11037.getClass(), "imaginary", 2.3058431466526474E18);
        setDoubleField(term11037, term11037.getClass(), "real", 9.0159953477632E15);
        term11034 = newInstance(Class.forName("org.apache.commons.math.complex.Complex"));
        setDoubleField(term11034, term11034.getClass(), "imaginary", -42.97513289856487);
        setDoubleField(term11034, term11034.getClass(), "real", 1.566886282256982);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.complex.Complex");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "acos", argTypes, term10826, args);
        assertTrue(recursiveEquals(term10826, term11037));
        assertTrue(recursiveEquals(retValue, term11034));
    }

};


