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

public class Complex_sqrt_902217185433 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term108007;
     Object term108105;
     Object term108102;

    public Complex_sqrt_902217185433() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term108007 = newInstance(Class.forName("org.apache.commons.math.complex.Complex"));
        setDoubleField(term108007, term108007.getClass(), "real", -9.0792562962800312E18);
        setDoubleField(term108007, term108007.getClass(), "imaginary", 1.44115740574744576E17);
        term108105 = newInstance(Class.forName("org.apache.commons.math.complex.Complex"));
        setDoubleField(term108105, term108105.getClass(), "imaginary", 1.44115740574744576E17);
        setDoubleField(term108105, term108105.getClass(), "real", -9.0792562962800312E18);
        term108102 = newInstance(Class.forName("org.apache.commons.math.complex.Complex"));
        setDoubleField(term108102, term108102.getClass(), "imaginary", 3.0132753193740315E9);
        setDoubleField(term108102, term108102.getClass(), "real", 2.391347044329868E7);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.complex.Complex");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "sqrt", argTypes, term108007, args);
        assertTrue(recursiveEquals(term108007, term108105));
        assertTrue(recursiveEquals(retValue, term108102));
    }

};


