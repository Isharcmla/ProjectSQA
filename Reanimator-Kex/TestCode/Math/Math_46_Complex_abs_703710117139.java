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

public class Complex_abs_703710117139 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term10515;
     Object term10546;

    public Complex_abs_703710117139() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term10515 = newInstance(Class.forName("org.apache.commons.math.complex.Complex"));
        setBooleanField(term10515, term10515.getClass(), "isNaN", false);
        setBooleanField(term10515, term10515.getClass(), "isInfinite", false);
        setDoubleField(term10515, term10515.getClass(), "real", -9.2053576383452938E18);
        term10546 = newInstance(Class.forName("org.apache.commons.math.complex.Complex"));
        setDoubleField(term10546, term10546.getClass(), "imaginary", 0.0);
        setDoubleField(term10546, term10546.getClass(), "real", -9.2053576383452938E18);
        setBooleanField(term10546, term10546.getClass(), "isNaN", false);
        setBooleanField(term10546, term10546.getClass(), "isInfinite", false);
        setBooleanField(term10546, term10546.getClass(), "isZero", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.complex.Complex");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "abs", argTypes, term10515, args);
        assertTrue(recursiveEquals(term10515, term10546));
        assertTrue(recursiveEquals(retValue, 9.2053576383452938E18));
    }

};


