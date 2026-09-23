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

public class Complex_asin_141596874689 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term7091;
     Object term7307;
     Object term7304;

    public Complex_asin_141596874689() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term7091 = newInstance(Class.forName("org.apache.commons.math.complex.Complex"));
        setDoubleField(term7091, term7091.getClass(), "real", -9.0781309488720773E18);
        setDoubleField(term7091, term7091.getClass(), "imaginary", -8.0693246323410862E18);
        term7307 = newInstance(Class.forName("org.apache.commons.math.complex.Complex"));
        setDoubleField(term7307, term7307.getClass(), "imaginary", -8.0693246323410862E18);
        setDoubleField(term7307, term7307.getClass(), "real", -9.0781309488720773E18);
        term7304 = newInstance(Class.forName("org.apache.commons.math.complex.Complex"));
        setDoubleField(term7304, term7304.getClass(), "imaginary", -44.63668263445679);
        setDoubleField(term7304, term7304.getClass(), "real", -0.844161684164794);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.complex.Complex");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "asin", argTypes, term7091, args);
        assertTrue(recursiveEquals(term7091, term7307));
        assertTrue(recursiveEquals(retValue, term7304));
    }

};


