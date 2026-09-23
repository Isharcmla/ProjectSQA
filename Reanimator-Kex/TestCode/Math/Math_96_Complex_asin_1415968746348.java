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
import java.lang.Double;

public class Complex_asin_1415968746348 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term78522;
     Object term79309;
     Object term79306;

    public Complex_asin_1415968746348() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term78522 = newInstance(Class.forName("org.apache.commons.math.complex.Complex"));
        setDoubleField(term78522, term78522.getClass(), "real", -9.2143648333050675E18);
        setDoubleField(term78522, term78522.getClass(), "imaginary", 4.503599895805952E15);
        term79309 = newInstance(Class.forName("org.apache.commons.math.complex.Complex"));
        setDoubleField(term79309, term79309.getClass(), "imaginary", 4.503599895805952E15);
        setDoubleField(term79309, term79309.getClass(), "real", -9.2143648333050675E18);
        term79306 = newInstance(Class.forName("org.apache.commons.math.complex.Complex"));
        setDoubleField(term79306, term79306.getClass(), "imaginary", Double.POSITIVE_INFINITY);
        setDoubleField(term79306, term79306.getClass(), "real", Double.POSITIVE_INFINITY);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.complex.Complex");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "asin", argTypes, term78522, args);
        assertTrue(recursiveEquals(term78522, term79309));
        assertTrue(recursiveEquals(retValue, term79306));
    }

};


