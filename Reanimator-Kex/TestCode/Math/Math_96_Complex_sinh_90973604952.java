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

public class Complex_sinh_90973604952 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term87;
     Object term1503;
     Object term1500;

    public Complex_sinh_90973604952() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term87 = newInstance(Class.forName("org.apache.commons.math.complex.Complex"));
        setDoubleField(term87, term87.getClass(), "imaginary", 0.5804948995371725);
        setDoubleField(term87, term87.getClass(), "real", 0.20737514139742264);
        term1503 = newInstance(Class.forName("org.apache.commons.math.complex.Complex"));
        setDoubleField(term1503, term1503.getClass(), "imaginary", 0.5804948995371725);
        setDoubleField(term1503, term1503.getClass(), "real", 0.20737514139742264);
        term1500 = newInstance(Class.forName("org.apache.commons.math.complex.Complex"));
        setDoubleField(term1500, term1500.getClass(), "imaginary", 0.5602727900959323);
        setDoubleField(term1500, term1500.getClass(), "real", 0.17465083715480637);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.complex.Complex");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "sinh", argTypes, term87, args);
        assertTrue(recursiveEquals(term87, term1503));
        assertTrue(recursiveEquals(retValue, term1500));
    }

};


