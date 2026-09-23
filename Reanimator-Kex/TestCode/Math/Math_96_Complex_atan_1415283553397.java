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

public class Complex_atan_1415283553397 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term96425;
     Object term96812;
     Object term96809;

    public Complex_atan_1415283553397() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term96425 = newInstance(Class.forName("org.apache.commons.math.complex.Complex"));
        setDoubleField(term96425, term96425.getClass(), "real", 1.8014398509482048E16);
        setDoubleField(term96425, term96425.getClass(), "imaginary", -8.9351416521131295E18);
        term96812 = newInstance(Class.forName("org.apache.commons.math.complex.Complex"));
        setDoubleField(term96812, term96812.getClass(), "imaginary", -8.9351416521131295E18);
        setDoubleField(term96812, term96812.getClass(), "real", 1.8014398509482048E16);
        term96809 = newInstance(Class.forName("org.apache.commons.math.complex.Complex"));
        setDoubleField(term96809, term96809.getClass(), "imaginary", 0.0);
        setDoubleField(term96809, term96809.getClass(), "real", -1.5707963267948966);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.complex.Complex");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "atan", argTypes, term96425, args);
        assertTrue(recursiveEquals(term96425, term96812));
        assertTrue(recursiveEquals(retValue, term96809));
    }

};


