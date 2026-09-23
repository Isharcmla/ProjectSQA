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

public class Complex_asin_1415968746117 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term13891;
     Object term14102;
     Object term14099;

    public Complex_asin_1415968746117() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term13891 = newInstance(Class.forName("org.apache.commons.math.complex.Complex"));
        setDoubleField(term13891, term13891.getClass(), "real", -8.0704505322479278E18);
        setDoubleField(term13891, term13891.getClass(), "imaginary", -9.2053532402987827E18);
        term14102 = newInstance(Class.forName("org.apache.commons.math.complex.Complex"));
        setDoubleField(term14102, term14102.getClass(), "imaginary", -9.2053532402987827E18);
        setDoubleField(term14102, term14102.getClass(), "real", -8.0704505322479278E18);
        term14099 = newInstance(Class.forName("org.apache.commons.math.complex.Complex"));
        setDoubleField(term14099, term14099.getClass(), "imaginary", -44.64456531587375);
        setDoubleField(term14099, term14099.getClass(), "real", -0.7197992283986068);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.complex.Complex");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "asin", argTypes, term13891, args);
        assertTrue(recursiveEquals(term13891, term14102));
        assertTrue(recursiveEquals(retValue, term14099));
    }

};


