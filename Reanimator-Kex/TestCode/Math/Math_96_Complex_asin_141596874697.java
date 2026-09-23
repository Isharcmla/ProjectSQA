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

public class Complex_asin_141596874697 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term9057;
     Object term9268;
     Object term9265;

    public Complex_asin_141596874697() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term9057 = newInstance(Class.forName("org.apache.commons.math.complex.Complex"));
        setDoubleField(term9057, term9057.getClass(), "real", 5.62949953421312E15);
        setDoubleField(term9057, term9057.getClass(), "imaginary", -9.2177425373205627E18);
        term9268 = newInstance(Class.forName("org.apache.commons.math.complex.Complex"));
        setDoubleField(term9268, term9268.getClass(), "imaginary", -9.2177425373205627E18);
        setDoubleField(term9268, term9268.getClass(), "real", 5.62949953421312E15);
        term9265 = newInstance(Class.forName("org.apache.commons.math.complex.Complex"));
        setDoubleField(term9265, term9265.getClass(), "imaginary", -44.36080920442572);
        setDoubleField(term9265, term9265.getClass(), "real", 6.107242431122287E-4);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.complex.Complex");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "asin", argTypes, term9057, args);
        assertTrue(recursiveEquals(term9057, term9268));
        assertTrue(recursiveEquals(retValue, term9265));
    }

};


