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

public class Complex_asin_1415968746324 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term69830;
     Object term70638;
     Object term70635;

    public Complex_asin_1415968746324() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term69830 = newInstance(Class.forName("org.apache.commons.math.complex.Complex"));
        setDoubleField(term69830, term69830.getClass(), "real", -9.1513144428167168E18);
        setDoubleField(term69830, term69830.getClass(), "imaginary", -6.9175290276368876E18);
        term70638 = newInstance(Class.forName("org.apache.commons.math.complex.Complex"));
        setDoubleField(term70638, term70638.getClass(), "imaginary", -6.9175290276368876E18);
        setDoubleField(term70638, term70638.getClass(), "real", -9.1513144428167168E18);
        term70635 = newInstance(Class.forName("org.apache.commons.math.complex.Complex"));
        setDoubleField(term70635, term70635.getClass(), "imaginary", -44.579557667369876);
        setDoubleField(term70635, term70635.getClass(), "real", -0.9235263916250952);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.complex.Complex");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "asin", argTypes, term69830, args);
        assertTrue(recursiveEquals(term69830, term70638));
        assertTrue(recursiveEquals(retValue, term70635));
    }

};


