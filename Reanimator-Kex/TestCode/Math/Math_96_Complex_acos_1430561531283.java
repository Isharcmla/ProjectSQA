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

public class Complex_acos_1430561531283 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term55354;
     Object term55565;
     Object term55562;

    public Complex_acos_1430561531283() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term55354 = newInstance(Class.forName("org.apache.commons.math.complex.Complex"));
        setDoubleField(term55354, term55354.getClass(), "real", 5.7646075230552064E17);
        setDoubleField(term55354, term55354.getClass(), "imaginary", 4.61168601842765E18);
        term55565 = newInstance(Class.forName("org.apache.commons.math.complex.Complex"));
        setDoubleField(term55565, term55565.getClass(), "imaginary", 4.61168601842765E18);
        setDoubleField(term55565, term55565.getClass(), "real", 5.7646075230552064E17);
        term55562 = newInstance(Class.forName("org.apache.commons.math.complex.Complex"));
        setDoubleField(term55562, term55562.getClass(), "imaginary", -43.67602446854465);
        setDoubleField(term55562, term55562.getClass(), "real", 1.4464413322476943);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.complex.Complex");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "acos", argTypes, term55354, args);
        assertTrue(recursiveEquals(term55354, term55565));
        assertTrue(recursiveEquals(retValue, term55562));
    }

};


