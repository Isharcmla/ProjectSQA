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

public class Complex_acos_1430561531377 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term88897;
     Object term89524;
     Object term89521;

    public Complex_acos_1430561531377() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term88897 = newInstance(Class.forName("org.apache.commons.math.complex.Complex"));
        setDoubleField(term88897, term88897.getClass(), "real", 1.442559255642112E17);
        setDoubleField(term88897, term88897.getClass(), "imaginary", 9.00719925477376E15);
        term89524 = newInstance(Class.forName("org.apache.commons.math.complex.Complex"));
        setDoubleField(term89524, term89524.getClass(), "imaginary", 9.00719925477376E15);
        setDoubleField(term89524, term89524.getClass(), "real", 1.442559255642112E17);
        term89521 = newInstance(Class.forName("org.apache.commons.math.complex.Complex"));
        setDoubleField(term89521, term89521.getClass(), "imaginary", -40.205458084348194);
        setDoubleField(term89521, term89521.getClass(), "real", 0.062358071415111564);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.complex.Complex");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "acos", argTypes, term88897, args);
        assertTrue(recursiveEquals(term88897, term89524));
        assertTrue(recursiveEquals(retValue, term89521));
    }

};


