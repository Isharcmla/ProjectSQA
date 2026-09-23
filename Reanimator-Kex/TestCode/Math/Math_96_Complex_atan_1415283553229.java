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

public class Complex_atan_1415283553229 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term39517;
     Object term39904;
     Object term39901;

    public Complex_atan_1415283553229() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term39517 = newInstance(Class.forName("org.apache.commons.math.complex.Complex"));
        setDoubleField(term39517, term39517.getClass(), "real", -9.0792568487789199E18);
        setDoubleField(term39517, term39517.getClass(), "imaginary", -9.1873388417893007E18);
        term39904 = newInstance(Class.forName("org.apache.commons.math.complex.Complex"));
        setDoubleField(term39904, term39904.getClass(), "imaginary", -9.1873388417893007E18);
        setDoubleField(term39904, term39904.getClass(), "real", -9.0792568487789199E18);
        term39901 = newInstance(Class.forName("org.apache.commons.math.complex.Complex"));
        setDoubleField(term39901, term39901.getClass(), "imaginary", 0.0);
        setDoubleField(term39901, term39901.getClass(), "real", -1.5707963267948966);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.complex.Complex");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "atan", argTypes, term39517, args);
        assertTrue(recursiveEquals(term39517, term39904));
        assertTrue(recursiveEquals(retValue, term39901));
    }

};


