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

public class Complex_acos_1430561531272 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term51549;
     Object term52267;
     Object term52264;

    public Complex_acos_1430561531272() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term51549 = newInstance(Class.forName("org.apache.commons.math.complex.Complex"));
        setDoubleField(term51549, term51549.getClass(), "real", 1.44115188612726784E17);
        setDoubleField(term51549, term51549.getClass(), "imaginary", 1.7179869184E10);
        term52267 = newInstance(Class.forName("org.apache.commons.math.complex.Complex"));
        setDoubleField(term52267, term52267.getClass(), "imaginary", 1.7179869184E10);
        setDoubleField(term52267, term52267.getClass(), "real", 1.44115188612726784E17);
        term52264 = newInstance(Class.forName("org.apache.commons.math.complex.Complex"));
        setDoubleField(term52264, term52264.getClass(), "imaginary", -40.20253647620213);
        setDoubleField(term52264, term52264.getClass(), "real", 1.1920928910669147E-7);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.complex.Complex");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "acos", argTypes, term51549, args);
        assertTrue(recursiveEquals(term51549, term52267));
        assertTrue(recursiveEquals(retValue, term52264));
    }

};


