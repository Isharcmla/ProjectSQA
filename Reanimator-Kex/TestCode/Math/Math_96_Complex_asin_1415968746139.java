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

public class Complex_asin_1415968746139 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term18910;
     Object term19126;
     Object term19123;

    public Complex_asin_1415968746139() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term18910 = newInstance(Class.forName("org.apache.commons.math.complex.Complex"));
        setDoubleField(term18910, term18910.getClass(), "real", -9.1513144428168438E18);
        setDoubleField(term18910, term18910.getClass(), "imaginary", -4.6116684262413435E18);
        term19126 = newInstance(Class.forName("org.apache.commons.math.complex.Complex"));
        setDoubleField(term19126, term19126.getClass(), "imaginary", -4.6116684262413435E18);
        setDoubleField(term19126, term19126.getClass(), "real", -9.1513144428168438E18);
        term19123 = newInstance(Class.forName("org.apache.commons.math.complex.Complex"));
        setDoubleField(term19123, term19123.getClass(), "imaginary", -44.466725890322394);
        setDoubleField(term19123, term19123.getClass(), "real", -1.104005607119032);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.complex.Complex");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "asin", argTypes, term18910, args);
        assertTrue(recursiveEquals(term18910, term19126));
        assertTrue(recursiveEquals(retValue, term19123));
    }

};


