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

public class Complex_asin_1415968746199 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term32604;
     Object term32807;
     Object term32804;

    public Complex_asin_1415968746199() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term32604 = newInstance(Class.forName("org.apache.commons.math.complex.Complex"));
        setDoubleField(term32604, term32604.getClass(), "real", 7.3183493944770624E16);
        setDoubleField(term32604, term32604.getClass(), "imaginary", 2.3080948090273792E18);
        term32807 = newInstance(Class.forName("org.apache.commons.math.complex.Complex"));
        setDoubleField(term32807, term32807.getClass(), "imaginary", 2.3080948090273792E18);
        setDoubleField(term32807, term32807.getClass(), "real", 7.3183493944770624E16);
        term32804 = newInstance(Class.forName("org.apache.commons.math.complex.Complex"));
        setDoubleField(term32804, term32804.getClass(), "imaginary", Double.POSITIVE_INFINITY);
        setDoubleField(term32804, term32804.getClass(), "real", Double.POSITIVE_INFINITY);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.complex.Complex");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "asin", argTypes, term32604, args);
        assertTrue(recursiveEquals(term32604, term32807));
        assertTrue(recursiveEquals(retValue, term32804));
    }

};


