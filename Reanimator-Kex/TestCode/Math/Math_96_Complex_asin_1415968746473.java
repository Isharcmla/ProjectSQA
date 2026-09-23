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

public class Complex_asin_1415968746473 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term118111;
     Object term118530;
     Object term118527;

    public Complex_asin_1415968746473() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term118111 = newInstance(Class.forName("org.apache.commons.math.complex.Complex"));
        setDoubleField(term118111, term118111.getClass(), "real", 1.31505164094799872E18);
        setDoubleField(term118111, term118111.getClass(), "imaginary", -8.935137262656553E18);
        term118530 = newInstance(Class.forName("org.apache.commons.math.complex.Complex"));
        setDoubleField(term118530, term118530.getClass(), "imaginary", -8.935137262656553E18);
        setDoubleField(term118530, term118530.getClass(), "real", 1.31505164094799872E18);
        term118527 = newInstance(Class.forName("org.apache.commons.math.complex.Complex"));
        setDoubleField(term118527, term118527.getClass(), "imaginary", -44.34038534604873);
        setDoubleField(term118527, term118527.getClass(), "real", 0.1461284721891154);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.complex.Complex");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "asin", argTypes, term118111, args);
        assertTrue(recursiveEquals(term118111, term118530));
        assertTrue(recursiveEquals(retValue, term118527));
    }

};


