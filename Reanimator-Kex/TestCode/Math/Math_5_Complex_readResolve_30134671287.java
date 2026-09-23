package org.apache.commons.math3.complex;

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
import static org.apache.commons.math3.complex.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import static org.apache.commons.math3.complex.EqualityUtils.*;

public class Complex_readResolve_30134671287 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term242;
     Object term10693;
     Object term10688;

    public Complex_readResolve_30134671287() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term242 = newInstance(Class.forName("org.apache.commons.math3.complex.Complex"));
        setDoubleField(term242, term242.getClass(), "imaginary", 0.5617009352394552);
        setDoubleField(term242, term242.getClass(), "real", 0.09067063848644474);
        setBooleanField(term242, term242.getClass(), "isNaN", true);
        setBooleanField(term242, term242.getClass(), "isInfinite", false);
        term10693 = newInstance(Class.forName("org.apache.commons.math3.complex.Complex"));
        setDoubleField(term10693, term10693.getClass(), "imaginary", 0.5617009352394552);
        setDoubleField(term10693, term10693.getClass(), "real", 0.09067063848644474);
        setBooleanField(term10693, term10693.getClass(), "isNaN", true);
        setBooleanField(term10693, term10693.getClass(), "isInfinite", false);
        term10688 = newInstance(Class.forName("org.apache.commons.math3.complex.Complex"));
        setDoubleField(term10688, term10688.getClass(), "imaginary", 0.5617009352394552);
        setDoubleField(term10688, term10688.getClass(), "real", 0.09067063848644474);
        setBooleanField(term10688, term10688.getClass(), "isNaN", false);
        setBooleanField(term10688, term10688.getClass(), "isInfinite", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math3.complex.Complex");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "readResolve", argTypes, term242, args);
        assertTrue(recursiveEquals(term242, term10693));
        assertTrue(recursiveEquals(retValue, term10688));
    }

};


