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

public class Complex_valueOf_186383455379 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term224;
     Object term226;
     Object term4516;

    public Complex_valueOf_186383455379() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term224 = new Double(0.3626177854778667);
        term226 = new Double(0.3163771663728089);
        term4516 = newInstance(Class.forName("org.apache.commons.math.complex.Complex"));
        setDoubleField(term4516, term4516.getClass(), "imaginary", 0.3163771663728089);
        setDoubleField(term4516, term4516.getClass(), "real", 0.3626177854778667);
        setBooleanField(term4516, term4516.getClass(), "isNaN", false);
        setBooleanField(term4516, term4516.getClass(), "isInfinite", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.complex.Complex");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = double.class;
        argTypes[1] = double.class;
        Object[] args = new Object[2];
        args[0] = term224;
        args[1] = term226;
        Object retValue = callMethod(klass, "valueOf", argTypes, null, args);
        assertTrue(recursiveEquals(term224, 0.3626177854778667));
        assertTrue(recursiveEquals(term226, 0.3163771663728089));
        assertTrue(recursiveEquals(retValue, term4516));
    }

};


