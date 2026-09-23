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
import java.lang.Double;

public class Complex_valueOf_107163855280 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term268;
     Object term3979;

    public Complex_valueOf_107163855280() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term268 = new Double(0.8819646072665548);
        term3979 = newInstance(Class.forName("org.apache.commons.math.complex.Complex"));
        setDoubleField(term3979, term3979.getClass(), "imaginary", 0.0);
        setDoubleField(term3979, term3979.getClass(), "real", 0.8819646072665548);
        setBooleanField(term3979, term3979.getClass(), "isNaN", false);
        setBooleanField(term3979, term3979.getClass(), "isInfinite", false);
        setBooleanField(term3979, term3979.getClass(), "isZero", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.complex.Complex");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = double.class;
        Object[] args = new Object[1];
        args[0] = term268;
        Object retValue = callMethod(klass, "valueOf", argTypes, null, args);
        assertTrue(recursiveEquals(term268, 0.8819646072665548));
        assertTrue(recursiveEquals(retValue, term3979));
    }

};


