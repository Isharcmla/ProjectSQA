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

public class Complex_atan_1415283553231 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term40345;
     Object term40529;
     Object term40526;

    public Complex_atan_1415283553231() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term40345 = newInstance(Class.forName("org.apache.commons.math.complex.Complex"));
        setDoubleField(term40345, term40345.getClass(), "real", 3.6028798092705792E16);
        setDoubleField(term40345, term40345.getClass(), "imaginary", -4.6116838194041324E18);
        term40529 = newInstance(Class.forName("org.apache.commons.math.complex.Complex"));
        setDoubleField(term40529, term40529.getClass(), "imaginary", -4.6116838194041324E18);
        setDoubleField(term40529, term40529.getClass(), "real", 3.6028798092705792E16);
        term40526 = newInstance(Class.forName("org.apache.commons.math.complex.Complex"));
        setDoubleField(term40526, term40526.getClass(), "imaginary", 0.0);
        setDoubleField(term40526, term40526.getClass(), "real", -1.5707963267948966);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.complex.Complex");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "atan", argTypes, term40345, args);
        assertTrue(recursiveEquals(term40345, term40529));
        assertTrue(recursiveEquals(retValue, term40526));
    }

};


