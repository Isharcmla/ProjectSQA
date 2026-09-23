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

public class Complex_acos_1430561531219 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term37655;
     Object term37866;
     Object term37863;

    public Complex_acos_1430561531219() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term37655 = newInstance(Class.forName("org.apache.commons.math.complex.Complex"));
        setDoubleField(term37655, term37655.getClass(), "real", 7.318349394477056E16);
        setDoubleField(term37655, term37655.getClass(), "imaginary", 7.318349394477056E16);
        term37866 = newInstance(Class.forName("org.apache.commons.math.complex.Complex"));
        setDoubleField(term37866, term37866.getClass(), "imaginary", 7.318349394477056E16);
        setDoubleField(term37866, term37866.getClass(), "real", 7.318349394477056E16);
        term37863 = newInstance(Class.forName("org.apache.commons.math.complex.Complex"));
        setDoubleField(term37863, term37863.getClass(), "imaginary", -39.87146706873282);
        setDoubleField(term37863, term37863.getClass(), "real", 0.7853981633974483);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.complex.Complex");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "acos", argTypes, term37655, args);
        assertTrue(recursiveEquals(term37655, term37866));
        assertTrue(recursiveEquals(retValue, term37863));
    }

};


