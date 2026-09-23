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

public class Complex_acos_1430561531328 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term71357;
     Object term71966;
     Object term71963;

    public Complex_acos_1430561531328() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term71357 = newInstance(Class.forName("org.apache.commons.math.complex.Complex"));
        setDoubleField(term71357, term71357.getClass(), "real", -9.0792567800594432E18);
        setDoubleField(term71357, term71357.getClass(), "imaginary", 1.1529215056805888E18);
        term71966 = newInstance(Class.forName("org.apache.commons.math.complex.Complex"));
        setDoubleField(term71966, term71966.getClass(), "imaginary", 1.1529215056805888E18);
        setDoubleField(term71966, term71966.getClass(), "real", -9.0792567800594432E18);
        term71963 = newInstance(Class.forName("org.apache.commons.math.complex.Complex"));
        setDoubleField(term71963, term71963.getClass(), "imaginary", -44.35366936247956);
        setDoubleField(term71963, term71963.getClass(), "real", 3.0152845354642954);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.complex.Complex");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "acos", argTypes, term71357, args);
        assertTrue(recursiveEquals(term71357, term71966));
        assertTrue(recursiveEquals(retValue, term71963));
    }

};


