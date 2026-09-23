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

public class Complex_asin_1415968746204 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term33358;
     Object term33659;
     Object term33656;

    public Complex_asin_1415968746204() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term33358 = newInstance(Class.forName("org.apache.commons.math.complex.Complex"));
        setDoubleField(term33358, term33358.getClass(), "real", -9.2188684361536635E18);
        setDoubleField(term33358, term33358.getClass(), "imaginary", -9.2188684372274053E18);
        term33659 = newInstance(Class.forName("org.apache.commons.math.complex.Complex"));
        setDoubleField(term33659, term33659.getClass(), "imaginary", -9.2188684372274053E18);
        setDoubleField(term33659, term33659.getClass(), "real", -9.2188684361536635E18);
        term33656 = newInstance(Class.forName("org.apache.commons.math.complex.Complex"));
        setDoubleField(term33656, term33656.getClass(), "imaginary", -44.70750474556013);
        setDoubleField(term33656, term33656.getClass(), "real", -0.7853981633392122);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.complex.Complex");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "asin", argTypes, term33358, args);
        assertTrue(recursiveEquals(term33358, term33659));
        assertTrue(recursiveEquals(retValue, term33656));
    }

};


