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

public class Complex_acos_1430561531302 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term61680;
     Object term62284;
     Object term62281;

    public Complex_acos_1430561531302() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term61680 = newInstance(Class.forName("org.apache.commons.math.complex.Complex"));
        setDoubleField(term61680, term61680.getClass(), "real", -9.079256848242049E18);
        setDoubleField(term61680, term61680.getClass(), "imaginary", 1.15292150461104128E18);
        term62284 = newInstance(Class.forName("org.apache.commons.math.complex.Complex"));
        setDoubleField(term62284, term62284.getClass(), "imaginary", 1.15292150461104128E18);
        setDoubleField(term62284, term62284.getClass(), "real", -9.079256848242049E18);
        term62281 = newInstance(Class.forName("org.apache.commons.math.complex.Complex"));
        setDoubleField(term62281, term62281.getClass(), "imaginary", -44.353669369855375);
        setDoubleField(term62281, term62281.getClass(), "real", 3.015284536518709);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.complex.Complex");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "acos", argTypes, term61680, args);
        assertTrue(recursiveEquals(term61680, term62284));
        assertTrue(recursiveEquals(retValue, term62281));
    }

};


