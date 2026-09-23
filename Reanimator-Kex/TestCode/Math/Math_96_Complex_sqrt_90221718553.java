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

public class Complex_sqrt_90221718553 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term90;
     Object term1540;
     Object term1537;

    public Complex_sqrt_90221718553() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term90 = newInstance(Class.forName("org.apache.commons.math.complex.Complex"));
        setDoubleField(term90, term90.getClass(), "imaginary", 0.7919370314903882);
        setDoubleField(term90, term90.getClass(), "real", 0.2109867221632754);
        term1540 = newInstance(Class.forName("org.apache.commons.math.complex.Complex"));
        setDoubleField(term1540, term1540.getClass(), "imaginary", 0.7919370314903882);
        setDoubleField(term1540, term1540.getClass(), "real", 0.2109867221632754);
        term1537 = newInstance(Class.forName("org.apache.commons.math.complex.Complex"));
        setDoubleField(term1537, term1537.getClass(), "imaginary", 0.5516221205146339);
        setDoubleField(term1537, term1537.getClass(), "real", 0.7178256654678327);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.complex.Complex");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "sqrt", argTypes, term90, args);
        assertTrue(recursiveEquals(term90, term1540));
        assertTrue(recursiveEquals(retValue, term1537));
    }

};


