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

public class Complex_abs_703710117178 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term27410;
     Object term27912;

    public Complex_abs_703710117178() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term27410 = newInstance(Class.forName("org.apache.commons.math.complex.Complex"));
        setDoubleField(term27410, term27410.getClass(), "real", -9.2188684372274053E18);
        setDoubleField(term27410, term27410.getClass(), "imaginary", 9.2188684372274053E18);
        term27912 = newInstance(Class.forName("org.apache.commons.math.complex.Complex"));
        setDoubleField(term27912, term27912.getClass(), "imaginary", 9.2188684372274053E18);
        setDoubleField(term27912, term27912.getClass(), "real", -9.2188684372274053E18);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.complex.Complex");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "abs", argTypes, term27410, args);
        assertTrue(recursiveEquals(term27410, term27912));
        assertTrue(recursiveEquals(retValue, 1.3037448773660258E19));
    }

};


