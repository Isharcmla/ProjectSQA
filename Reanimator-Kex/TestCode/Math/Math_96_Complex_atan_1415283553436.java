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

public class Complex_atan_1415283553436 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term108438;
     Object term108773;
     Object term108770;

    public Complex_atan_1415283553436() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term108438 = newInstance(Class.forName("org.apache.commons.math.complex.Complex"));
        setDoubleField(term108438, term108438.getClass(), "real", 4.61168601842765E18);
        setDoubleField(term108438, term108438.getClass(), "imaginary", -9.21872769973905E18);
        term108773 = newInstance(Class.forName("org.apache.commons.math.complex.Complex"));
        setDoubleField(term108773, term108773.getClass(), "imaginary", -9.21872769973905E18);
        setDoubleField(term108773, term108773.getClass(), "real", 4.61168601842765E18);
        term108770 = newInstance(Class.forName("org.apache.commons.math.complex.Complex"));
        setDoubleField(term108770, term108770.getClass(), "imaginary", 0.0);
        setDoubleField(term108770, term108770.getClass(), "real", -1.5707963267948966);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.complex.Complex");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "atan", argTypes, term108438, args);
        assertTrue(recursiveEquals(term108438, term108773));
        assertTrue(recursiveEquals(retValue, term108770));
    }

};


