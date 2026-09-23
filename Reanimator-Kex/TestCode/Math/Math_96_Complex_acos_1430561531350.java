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

public class Complex_acos_1430561531350 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term79101;
     Object term80008;
     Object term80005;

    public Complex_acos_1430561531350() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term79101 = newInstance(Class.forName("org.apache.commons.math.complex.Complex"));
        setDoubleField(term79101, term79101.getClass(), "real", 1.44115188344291328E17);
        setDoubleField(term79101, term79101.getClass(), "imaginary", -6.9175290276389847E18);
        term80008 = newInstance(Class.forName("org.apache.commons.math.complex.Complex"));
        setDoubleField(term80008, term80008.getClass(), "imaginary", -6.9175290276389847E18);
        setDoubleField(term80008, term80008.getClass(), "real", 1.44115188344291328E17);
        term80005 = newInstance(Class.forName("org.apache.commons.math.complex.Complex"));
        setDoubleField(term80005, term80005.getClass(), "imaginary", Double.POSITIVE_INFINITY);
        setDoubleField(term80005, term80005.getClass(), "real", Double.POSITIVE_INFINITY);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.complex.Complex");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "acos", argTypes, term79101, args);
        assertTrue(recursiveEquals(term79101, term80008));
        assertTrue(recursiveEquals(retValue, term80005));
    }

};


