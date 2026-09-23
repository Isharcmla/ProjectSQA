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

public class Complex_acos_1430561531233 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term41131;
     Object term41347;
     Object term41344;

    public Complex_acos_1430561531233() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term41131 = newInstance(Class.forName("org.apache.commons.math.complex.Complex"));
        setDoubleField(term41131, term41131.getClass(), "real", -6.9175279281294541E18);
        setDoubleField(term41131, term41131.getClass(), "imaginary", 1.7592186044416E13);
        term41347 = newInstance(Class.forName("org.apache.commons.math.complex.Complex"));
        setDoubleField(term41347, term41347.getClass(), "imaginary", 1.7592186044416E13);
        setDoubleField(term41347, term41347.getClass(), "real", -6.9175279281294541E18);
        term41344 = newInstance(Class.forName("org.apache.commons.math.complex.Complex"));
        setDoubleField(term41344, term41344.getClass(), "imaginary", -44.07373732444222);
        setDoubleField(term41344, term41344.getClass(), "real", 3.1415901104578787);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.complex.Complex");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "acos", argTypes, term41131, args);
        assertTrue(recursiveEquals(term41131, term41347));
        assertTrue(recursiveEquals(retValue, term41344));
    }

};


