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

public class Complex_pow_629025138527 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term135076;
     Object term135160;
     Object term135441;
     Object term135442;
     Object term135438;

    public Complex_pow_629025138527() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term135076 = newInstance(Class.forName("org.apache.commons.math.complex.Complex"));
        setDoubleField(term135076, term135076.getClass(), "real", 0.0);
        setDoubleField(term135076, term135076.getClass(), "imaginary", 0.0);
        term135160 = newInstance(Class.forName("org.apache.commons.math.complex.Complex"));
        setDoubleField(term135160, term135160.getClass(), "real", -9.2166166374137201E18);
        setDoubleField(term135160, term135160.getClass(), "imaginary", -9.2188684286374707E18);
        term135441 = newInstance(Class.forName("org.apache.commons.math.complex.Complex"));
        setDoubleField(term135441, term135441.getClass(), "imaginary", 0.0);
        setDoubleField(term135441, term135441.getClass(), "real", 0.0);
        term135442 = newInstance(Class.forName("org.apache.commons.math.complex.Complex"));
        setDoubleField(term135442, term135442.getClass(), "imaginary", -9.2188684286374707E18);
        setDoubleField(term135442, term135442.getClass(), "real", -9.2166166374137201E18);
        term135438 = newInstance(Class.forName("org.apache.commons.math.complex.Complex"));
        setDoubleField(term135438, term135438.getClass(), "imaginary", Double.NaN);
        setDoubleField(term135438, term135438.getClass(), "real", Double.NaN);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.complex.Complex");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.apache.commons.math.complex.Complex");
        Object[] args = new Object[1];
        args[0] = term135160;
        Object retValue = callMethod(klass, "pow", argTypes, term135076, args);
        assertTrue(recursiveEquals(term135076, term135441));
        assertTrue(recursiveEquals(term135160, term135442));
        assertTrue(recursiveEquals(retValue, term135438));
    }

};


