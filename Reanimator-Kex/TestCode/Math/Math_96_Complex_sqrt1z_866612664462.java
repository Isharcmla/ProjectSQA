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

public class Complex_sqrt1z_866612664462 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term115035;
     Object term115724;
     Object term115721;

    public Complex_sqrt1z_866612664462() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term115035 = newInstance(Class.forName("org.apache.commons.math.complex.Complex"));
        setDoubleField(term115035, term115035.getClass(), "real", 1.34217728E8);
        setDoubleField(term115035, term115035.getClass(), "imaginary", -4.6116860184273879E18);
        term115724 = newInstance(Class.forName("org.apache.commons.math.complex.Complex"));
        setDoubleField(term115724, term115724.getClass(), "imaginary", -4.6116860184273879E18);
        setDoubleField(term115724, term115724.getClass(), "real", 1.34217728E8);
        term115721 = newInstance(Class.forName("org.apache.commons.math.complex.Complex"));
        setDoubleField(term115721, term115721.getClass(), "imaginary", 1.34217728E8);
        setDoubleField(term115721, term115721.getClass(), "real", 4.6116860184273879E18);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.complex.Complex");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "sqrt1z", argTypes, term115035, args);
        assertTrue(recursiveEquals(term115035, term115724));
        assertTrue(recursiveEquals(retValue, term115721));
    }

};


