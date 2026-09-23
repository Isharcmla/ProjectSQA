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

public class Complex_sqrt_902217185147 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term20812;
     Object term20849;
     Object term20846;

    public Complex_sqrt_902217185147() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term20812 = newInstance(Class.forName("org.apache.commons.math.complex.Complex"));
        setDoubleField(term20812, term20812.getClass(), "real", 3.5184372088832E13);
        setDoubleField(term20812, term20812.getClass(), "imaginary", 3.5184372088832E13);
        term20849 = newInstance(Class.forName("org.apache.commons.math.complex.Complex"));
        setDoubleField(term20849, term20849.getClass(), "imaginary", 3.5184372088832E13);
        setDoubleField(term20849, term20849.getClass(), "real", 3.5184372088832E13);
        term20846 = newInstance(Class.forName("org.apache.commons.math.complex.Complex"));
        setDoubleField(term20846, term20846.getClass(), "imaginary", 2699429.9493388967);
        setDoubleField(term20846, term20846.getClass(), "real", 6517000.394370082);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.complex.Complex");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "sqrt", argTypes, term20812, args);
        assertTrue(recursiveEquals(term20812, term20849));
        assertTrue(recursiveEquals(retValue, term20846));
    }

};


