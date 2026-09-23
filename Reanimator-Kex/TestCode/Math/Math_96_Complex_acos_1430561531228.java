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

public class Complex_acos_1430561531228 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term39125;
     Object term39720;
     Object term39717;

    public Complex_acos_1430561531228() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term39125 = newInstance(Class.forName("org.apache.commons.math.complex.Complex"));
        setDoubleField(term39125, term39125.getClass(), "real", -9.2188684286374707E18);
        setDoubleField(term39125, term39125.getClass(), "imaginary", -9.2188684372274012E18);
        term39720 = newInstance(Class.forName("org.apache.commons.math.complex.Complex"));
        setDoubleField(term39720, term39720.getClass(), "imaginary", -9.2188684372274012E18);
        setDoubleField(term39720, term39720.getClass(), "real", -9.2188684286374707E18);
        term39717 = newInstance(Class.forName("org.apache.commons.math.complex.Complex"));
        setDoubleField(term39717, term39717.getClass(), "imaginary", Double.POSITIVE_INFINITY);
        setDoubleField(term39717, term39717.getClass(), "real", Double.POSITIVE_INFINITY);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.complex.Complex");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "acos", argTypes, term39125, args);
        assertTrue(recursiveEquals(term39125, term39720));
        assertTrue(recursiveEquals(retValue, term39717));
    }

};


