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

public class Complex_atan_1415283553427 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term106464;
     Object term107424;
     Object term107421;

    public Complex_atan_1415283553427() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term106464 = newInstance(Class.forName("org.apache.commons.math.complex.Complex"));
        setDoubleField(term106464, term106464.getClass(), "real", 3.7154696925806592E16);
        setDoubleField(term106464, term106464.getClass(), "imaginary", -9.1873432398357463E18);
        term107424 = newInstance(Class.forName("org.apache.commons.math.complex.Complex"));
        setDoubleField(term107424, term107424.getClass(), "imaginary", -9.1873432398357463E18);
        setDoubleField(term107424, term107424.getClass(), "real", 3.7154696925806592E16);
        term107421 = newInstance(Class.forName("org.apache.commons.math.complex.Complex"));
        setDoubleField(term107421, term107421.getClass(), "imaginary", 0.0);
        setDoubleField(term107421, term107421.getClass(), "real", -1.5707963267948966);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.complex.Complex");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "atan", argTypes, term106464, args);
        assertTrue(recursiveEquals(term106464, term107424));
        assertTrue(recursiveEquals(retValue, term107421));
    }

};


