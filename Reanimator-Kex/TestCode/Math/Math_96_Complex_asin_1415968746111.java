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

public class Complex_asin_1415968746111 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term12621;
     Object term13021;
     Object term13018;

    public Complex_asin_1415968746111() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term12621 = newInstance(Class.forName("org.apache.commons.math.complex.Complex"));
        setDoubleField(term12621, term12621.getClass(), "real", -9.0792392565928755E18);
        setDoubleField(term12621, term12621.getClass(), "imaginary", -8.935140561189077E18);
        term13021 = newInstance(Class.forName("org.apache.commons.math.complex.Complex"));
        setDoubleField(term13021, term13021.getClass(), "imaginary", -8.935140561189077E18);
        setDoubleField(term13021, term13021.getClass(), "real", -9.0792392565928755E18);
        term13018 = newInstance(Class.forName("org.apache.commons.math.complex.Complex"));
        setDoubleField(term13018, term13018.getClass(), "imaginary", -44.68430757361993);
        setDoubleField(term13018, term13018.getClass(), "real", -0.7933970855680154);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.complex.Complex");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "asin", argTypes, term12621, args);
        assertTrue(recursiveEquals(term12621, term13021));
        assertTrue(recursiveEquals(retValue, term13018));
    }

};


