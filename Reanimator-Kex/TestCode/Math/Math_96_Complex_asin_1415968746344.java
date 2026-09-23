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

public class Complex_asin_1415968746344 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term76710;
     Object term77722;
     Object term77719;

    public Complex_asin_1415968746344() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term76710 = newInstance(Class.forName("org.apache.commons.math.complex.Complex"));
        setDoubleField(term76710, term76710.getClass(), "real", -9.0791864800347423E18);
        setDoubleField(term76710, term76710.getClass(), "imaginary", -9.0792568444839526E18);
        term77722 = newInstance(Class.forName("org.apache.commons.math.complex.Complex"));
        setDoubleField(term77722, term77722.getClass(), "imaginary", -9.0792568444839526E18);
        setDoubleField(term77722, term77722.getClass(), "real", -9.0791864800347423E18);
        term77719 = newInstance(Class.forName("org.apache.commons.math.complex.Complex"));
        setDoubleField(term77719, term77719.getClass(), "imaginary", -44.69224091366379);
        setDoubleField(term77719, term77719.getClass(), "real", -0.7853942883709412);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.complex.Complex");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "asin", argTypes, term76710, args);
        assertTrue(recursiveEquals(term76710, term77722));
        assertTrue(recursiveEquals(retValue, term77719));
    }

};


