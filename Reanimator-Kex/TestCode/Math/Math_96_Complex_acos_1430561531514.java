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

public class Complex_acos_1430561531514 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term130657;
     Object term131465;
     Object term131462;

    public Complex_acos_1430561531514() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term130657 = newInstance(Class.forName("org.apache.commons.math.complex.Complex"));
        setDoubleField(term130657, term130657.getClass(), "real", 2.199023255552E12);
        setDoubleField(term130657, term130657.getClass(), "imaginary", 1.8014399046352896E16);
        term131465 = newInstance(Class.forName("org.apache.commons.math.complex.Complex"));
        setDoubleField(term131465, term131465.getClass(), "imaginary", 1.8014399046352896E16);
        setDoubleField(term131465, term131465.getClass(), "real", 2.199023255552E12);
        term131462 = newInstance(Class.forName("org.apache.commons.math.complex.Complex"));
        setDoubleField(term131462, term131462.getClass(), "imaginary", -38.12309496804989);
        setDoubleField(term131462, term131462.getClass(), "real", 1.570674256486641);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.complex.Complex");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "acos", argTypes, term130657, args);
        assertTrue(recursiveEquals(term130657, term131465));
        assertTrue(recursiveEquals(retValue, term131462));
    }

};


