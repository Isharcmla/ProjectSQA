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

public class Complex_acos_1430561531264 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term49098;
     Object term49810;
     Object term49807;

    public Complex_acos_1430561531264() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term49098 = newInstance(Class.forName("org.apache.commons.math.complex.Complex"));
        setDoubleField(term49098, term49098.getClass(), "real", -9.0792568487783956E18);
        setDoubleField(term49098, term49098.getClass(), "imaginary", -9.0789753738022093E18);
        term49810 = newInstance(Class.forName("org.apache.commons.math.complex.Complex"));
        setDoubleField(term49810, term49810.getClass(), "imaginary", -9.0789753738022093E18);
        setDoubleField(term49810, term49810.getClass(), "real", -9.0792568487783956E18);
        term49807 = newInstance(Class.forName("org.apache.commons.math.complex.Complex"));
        setDoubleField(term49807, term49807.getClass(), "imaginary", -7.278045395879426);
        setDoubleField(term49807, term49807.getClass(), "real", 2.356194490192345);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.complex.Complex");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "acos", argTypes, term49098, args);
        assertTrue(recursiveEquals(term49098, term49810));
        assertTrue(recursiveEquals(retValue, term49807));
    }

};


