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

public class Complex_acos_1430561531247 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term44896;
     Object term45186;
     Object term45183;

    public Complex_acos_1430561531247() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term44896 = newInstance(Class.forName("org.apache.commons.math.complex.Complex"));
        setDoubleField(term44896, term44896.getClass(), "real", 5.770237022568448E17);
        setDoubleField(term44896, term44896.getClass(), "imaginary", 2.3069689091205366E18);
        term45186 = newInstance(Class.forName("org.apache.commons.math.complex.Complex"));
        setDoubleField(term45186, term45186.getClass(), "imaginary", 2.3069689091205366E18);
        setDoubleField(term45186, term45186.getClass(), "real", 5.770237022568448E17);
        term45183 = newInstance(Class.forName("org.apache.commons.math.complex.Complex"));
        setDoubleField(term45183, term45183.getClass(), "imaginary", -43.00595438229394);
        setDoubleField(term45183, term45183.getClass(), "real", 1.3257028333303618);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.complex.Complex");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "acos", argTypes, term44896, args);
        assertTrue(recursiveEquals(term44896, term45186));
        assertTrue(recursiveEquals(retValue, term45183));
    }

};


