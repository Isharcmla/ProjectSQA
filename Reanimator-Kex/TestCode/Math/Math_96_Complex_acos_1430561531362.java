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

public class Complex_acos_1430561531362 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term83389;
     Object term84110;
     Object term84107;

    public Complex_acos_1430561531362() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term83389 = newInstance(Class.forName("org.apache.commons.math.complex.Complex"));
        setDoubleField(term83389, term83389.getClass(), "real", 4.5079976738816E15);
        setDoubleField(term83389, term83389.getClass(), "imaginary", 7.2057594038059008E16);
        term84110 = newInstance(Class.forName("org.apache.commons.math.complex.Complex"));
        setDoubleField(term84110, term84110.getClass(), "imaginary", 7.2057594038059008E16);
        setDoubleField(term84110, term84110.getClass(), "real", 4.5079976738816E15);
        term84107 = newInstance(Class.forName("org.apache.commons.math.complex.Complex"));
        setDoubleField(term84107, term84107.getClass(), "imaginary", -39.51134241382155);
        setDoubleField(term84107, term84107.getClass(), "real", 1.5083167193647793);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.complex.Complex");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "acos", argTypes, term83389, args);
        assertTrue(recursiveEquals(term83389, term84110));
        assertTrue(recursiveEquals(retValue, term84107));
    }

};


