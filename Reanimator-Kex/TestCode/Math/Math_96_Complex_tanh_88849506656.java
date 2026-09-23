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

public class Complex_tanh_88849506656 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term99;
     Object term1669;
     Object term1666;

    public Complex_tanh_88849506656() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term99 = newInstance(Class.forName("org.apache.commons.math.complex.Complex"));
        setDoubleField(term99, term99.getClass(), "imaginary", 0.11179067076100713);
        setDoubleField(term99, term99.getClass(), "real", 0.5306473989087822);
        term1669 = newInstance(Class.forName("org.apache.commons.math.complex.Complex"));
        setDoubleField(term1669, term1669.getClass(), "imaginary", 0.11179067076100713);
        setDoubleField(term1669, term1669.getClass(), "real", 0.5306473989087822);
        term1666 = newInstance(Class.forName("org.apache.commons.math.complex.Complex"));
        setDoubleField(term1666, term1666.getClass(), "imaginary", 0.08550281957526984);
        setDoubleField(term1666, term1666.getClass(), "real", 0.4905394576860832);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.complex.Complex");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "tanh", argTypes, term99, args);
        assertTrue(recursiveEquals(term99, term1669));
        assertTrue(recursiveEquals(retValue, term1666));
    }

};


