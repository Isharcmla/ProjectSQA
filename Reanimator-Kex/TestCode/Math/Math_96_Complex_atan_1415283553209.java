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

public class Complex_atan_1415283553209 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term34806;
     Object term34990;
     Object term34987;

    public Complex_atan_1415283553209() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term34806 = newInstance(Class.forName("org.apache.commons.math.complex.Complex"));
        setDoubleField(term34806, term34806.getClass(), "real", -9.0792567800594432E18);
        setDoubleField(term34806, term34806.getClass(), "imaginary", -9.0786938988254986E18);
        term34990 = newInstance(Class.forName("org.apache.commons.math.complex.Complex"));
        setDoubleField(term34990, term34990.getClass(), "imaginary", -9.0786938988254986E18);
        setDoubleField(term34990, term34990.getClass(), "real", -9.0792567800594432E18);
        term34987 = newInstance(Class.forName("org.apache.commons.math.complex.Complex"));
        setDoubleField(term34987, term34987.getClass(), "imaginary", 0.0);
        setDoubleField(term34987, term34987.getClass(), "real", -1.5707963267948966);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.complex.Complex");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "atan", argTypes, term34806, args);
        assertTrue(recursiveEquals(term34806, term34990));
        assertTrue(recursiveEquals(retValue, term34987));
    }

};


