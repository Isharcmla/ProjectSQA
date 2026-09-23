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

public class Complex_exp_8949039648 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term72;
     Object term1351;
     Object term1348;

    public Complex_exp_8949039648() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term72 = newInstance(Class.forName("org.apache.commons.math.complex.Complex"));
        setDoubleField(term72, term72.getClass(), "imaginary", 0.8823181080774973);
        setDoubleField(term72, term72.getClass(), "real", 0.2192450926212024);
        term1351 = newInstance(Class.forName("org.apache.commons.math.complex.Complex"));
        setDoubleField(term1351, term1351.getClass(), "imaginary", 0.8823181080774973);
        setDoubleField(term1351, term1351.getClass(), "real", 0.2192450926212024);
        term1348 = newInstance(Class.forName("org.apache.commons.math.complex.Complex"));
        setDoubleField(term1348, term1348.getClass(), "imaginary", 0.9615115110212344);
        setDoubleField(term1348, term1348.getClass(), "real", 0.7911133302198373);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.complex.Complex");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "exp", argTypes, term72, args);
        assertTrue(recursiveEquals(term72, term1351));
        assertTrue(recursiveEquals(retValue, term1348));
    }

};


