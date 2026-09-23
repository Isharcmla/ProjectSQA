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

public class Complex_readResolve_129001964788 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term242;
     Object term10456;
     Object term10451;

    public Complex_readResolve_129001964788() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term242 = newInstance(Class.forName("org.apache.commons.math.complex.Complex"));
        setDoubleField(term242, term242.getClass(), "imaginary", 0.5617009352394552);
        setDoubleField(term242, term242.getClass(), "real", 0.09067063848644474);
        setBooleanField(term242, term242.getClass(), "isNaN", true);
        setBooleanField(term242, term242.getClass(), "isInfinite", false);
        term10456 = newInstance(Class.forName("org.apache.commons.math.complex.Complex"));
        setDoubleField(term10456, term10456.getClass(), "imaginary", 0.5617009352394552);
        setDoubleField(term10456, term10456.getClass(), "real", 0.09067063848644474);
        setBooleanField(term10456, term10456.getClass(), "isNaN", true);
        setBooleanField(term10456, term10456.getClass(), "isInfinite", false);
        term10451 = newInstance(Class.forName("org.apache.commons.math.complex.Complex"));
        setDoubleField(term10451, term10451.getClass(), "imaginary", 0.5617009352394552);
        setDoubleField(term10451, term10451.getClass(), "real", 0.09067063848644474);
        setBooleanField(term10451, term10451.getClass(), "isNaN", false);
        setBooleanField(term10451, term10451.getClass(), "isInfinite", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.complex.Complex");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "readResolve", argTypes, term242, args);
        assertTrue(recursiveEquals(term242, term10456));
        assertTrue(recursiveEquals(retValue, term10451));
    }

};


