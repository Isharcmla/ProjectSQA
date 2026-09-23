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

public class Complex_asin_1415968746411 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term101494;
     Object term101921;
     Object term101918;

    public Complex_asin_1415968746411() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term101494 = newInstance(Class.forName("org.apache.commons.math.complex.Complex"));
        setDoubleField(term101494, term101494.getClass(), "real", 5.7646075230342349E17);
        setDoubleField(term101494, term101494.getClass(), "imaginary", -9.1513144428168479E18);
        term101921 = newInstance(Class.forName("org.apache.commons.math.complex.Complex"));
        setDoubleField(term101921, term101921.getClass(), "imaginary", -9.1513144428168479E18);
        setDoubleField(term101921, term101921.getClass(), "real", 5.7646075230342349E17);
        term101918 = newInstance(Class.forName("org.apache.commons.math.complex.Complex"));
        setDoubleField(term101918, term101918.getClass(), "imaginary", -44.35555645645362);
        setDoubleField(term101918, term101918.getClass(), "real", 0.0629090060351253);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.complex.Complex");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "asin", argTypes, term101494, args);
        assertTrue(recursiveEquals(term101494, term101921));
        assertTrue(recursiveEquals(retValue, term101918));
    }

};


