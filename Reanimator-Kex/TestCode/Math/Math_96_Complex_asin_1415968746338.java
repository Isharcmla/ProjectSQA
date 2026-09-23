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

public class Complex_asin_1415968746338 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term74586;
     Object term75405;
     Object term75402;

    public Complex_asin_1415968746338() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term74586 = newInstance(Class.forName("org.apache.commons.math.complex.Complex"));
        setDoubleField(term74586, term74586.getClass(), "real", 7.2057602627862528E16);
        setDoubleField(term74586, term74586.getClass(), "imaginary", 0.0);
        term75405 = newInstance(Class.forName("org.apache.commons.math.complex.Complex"));
        setDoubleField(term75405, term75405.getClass(), "imaginary", 0.0);
        setDoubleField(term75405, term75405.getClass(), "real", 7.2057602627862528E16);
        term75402 = newInstance(Class.forName("org.apache.commons.math.complex.Complex"));
        setDoubleField(term75402, term75402.getClass(), "imaginary", -39.509389411126165);
        setDoubleField(term75402, term75402.getClass(), "real", 1.5707963267948966);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.complex.Complex");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "asin", argTypes, term74586, args);
        assertTrue(recursiveEquals(term74586, term75405));
        assertTrue(recursiveEquals(retValue, term75402));
    }

};


