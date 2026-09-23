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

public class Complex_subtract_1918809348113 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term7450;
     Object term7476;
     Object term7470;

    public Complex_subtract_1918809348113() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term7450 = newInstance(Class.forName("org.apache.commons.math.complex.Complex"));
        setBooleanField(term7450, term7450.getClass(), "isNaN", false);
        setDoubleField(term7450, term7450.getClass(), "real", 4.6613060143221309E18);
        setDoubleField(term7450, term7450.getClass(), "imaginary", 9.2188684372274053E18);
        term7476 = newInstance(Class.forName("org.apache.commons.math.complex.Complex"));
        setDoubleField(term7476, term7476.getClass(), "imaginary", 9.2188684372274053E18);
        setDoubleField(term7476, term7476.getClass(), "real", 4.6613060143221309E18);
        setBooleanField(term7476, term7476.getClass(), "isNaN", false);
        setBooleanField(term7476, term7476.getClass(), "isInfinite", false);
        term7470 = newInstance(Class.forName("org.apache.commons.math.complex.Complex"));
        setDoubleField(term7470, term7470.getClass(), "imaginary", 9.2188684372274053E18);
        setDoubleField(term7470, term7470.getClass(), "real", 4.6613060143221309E18);
        setBooleanField(term7470, term7470.getClass(), "isNaN", false);
        setBooleanField(term7470, term7470.getClass(), "isInfinite", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.complex.Complex");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = double.class;
        Object[] args = new Object[1];
        args[0] = -1.3981170654461152;
        Object retValue = callMethod(klass, "subtract", argTypes, term7450, args);
        assertTrue(recursiveEquals(term7450, term7476));
        assertTrue(recursiveEquals(retValue, term7470));
    }

};


