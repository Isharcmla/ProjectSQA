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

public class Complex_asin_1415968746503 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term127484;
     Object term127700;
     Object term127697;

    public Complex_asin_1415968746503() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term127484 = newInstance(Class.forName("org.apache.commons.math.complex.Complex"));
        setDoubleField(term127484, term127484.getClass(), "real", -9.1872025023474565E18);
        setDoubleField(term127484, term127484.getClass(), "imaginary", -8.070450531174187E18);
        term127700 = newInstance(Class.forName("org.apache.commons.math.complex.Complex"));
        setDoubleField(term127700, term127700.getClass(), "imaginary", -8.070450531174187E18);
        setDoubleField(term127700, term127700.getClass(), "real", -9.1872025023474565E18);
        term127697 = newInstance(Class.forName("org.apache.commons.math.complex.Complex"));
        setDoubleField(term127697, term127697.getClass(), "imaginary", -44.64345031859928);
        setDoubleField(term127697, term127697.getClass(), "real", -0.8500186011499828);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.complex.Complex");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "asin", argTypes, term127484, args);
        assertTrue(recursiveEquals(term127484, term127700));
        assertTrue(recursiveEquals(retValue, term127697));
    }

};


