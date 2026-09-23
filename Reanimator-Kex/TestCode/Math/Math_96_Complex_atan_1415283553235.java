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

public class Complex_atan_1415283553235 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term41658;
     Object term41842;
     Object term41839;

    public Complex_atan_1415283553235() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term41658 = newInstance(Class.forName("org.apache.commons.math.complex.Complex"));
        setDoubleField(term41658, term41658.getClass(), "real", 5.7674222728013414E17);
        setDoubleField(term41658, term41658.getClass(), "imaginary", -9.1513122437935923E18);
        term41842 = newInstance(Class.forName("org.apache.commons.math.complex.Complex"));
        setDoubleField(term41842, term41842.getClass(), "imaginary", -9.1513122437935923E18);
        setDoubleField(term41842, term41842.getClass(), "real", 5.7674222728013414E17);
        term41839 = newInstance(Class.forName("org.apache.commons.math.complex.Complex"));
        setDoubleField(term41839, term41839.getClass(), "imaginary", 0.0);
        setDoubleField(term41839, term41839.getClass(), "real", -1.5707963267948966);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.complex.Complex");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "atan", argTypes, term41658, args);
        assertTrue(recursiveEquals(term41658, term41842));
        assertTrue(recursiveEquals(retValue, term41839));
    }

};


