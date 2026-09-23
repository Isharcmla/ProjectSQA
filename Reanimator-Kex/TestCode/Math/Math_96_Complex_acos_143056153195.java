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

public class Complex_acos_143056153195 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term8372;
     Object term8580;
     Object term8577;

    public Complex_acos_143056153195() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term8372 = newInstance(Class.forName("org.apache.commons.math.complex.Complex"));
        setDoubleField(term8372, term8372.getClass(), "real", -9.2188684370931876E18);
        setDoubleField(term8372, term8372.getClass(), "imaginary", -9.2166166374137201E18);
        term8580 = newInstance(Class.forName("org.apache.commons.math.complex.Complex"));
        setDoubleField(term8580, term8580.getClass(), "imaginary", -9.2166166374137201E18);
        setDoubleField(term8580, term8580.getClass(), "real", -9.2188684370931876E18);
        term8577 = newInstance(Class.forName("org.apache.commons.math.complex.Complex"));
        setDoubleField(term8577, term8577.getClass(), "imaginary", Double.POSITIVE_INFINITY);
        setDoubleField(term8577, term8577.getClass(), "real", Double.POSITIVE_INFINITY);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.complex.Complex");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "acos", argTypes, term8372, args);
        assertTrue(recursiveEquals(term8372, term8580));
        assertTrue(recursiveEquals(retValue, term8577));
    }

};


