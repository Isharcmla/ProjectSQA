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

public class Complex_atan_1415283553447 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term111158;
     Object term111559;
     Object term111556;

    public Complex_atan_1415283553447() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term111158 = newInstance(Class.forName("org.apache.commons.math.complex.Complex"));
        setDoubleField(term111158, term111158.getClass(), "real", -9.18734323876207E18);
        setDoubleField(term111158, term111158.getClass(), "imaginary", 4.611690416473899E18);
        term111559 = newInstance(Class.forName("org.apache.commons.math.complex.Complex"));
        setDoubleField(term111559, term111559.getClass(), "imaginary", 4.611690416473899E18);
        setDoubleField(term111559, term111559.getClass(), "real", -9.18734323876207E18);
        term111556 = newInstance(Class.forName("org.apache.commons.math.complex.Complex"));
        setDoubleField(term111556, term111556.getClass(), "imaginary", 0.0);
        setDoubleField(term111556, term111556.getClass(), "real", -1.5707963267948966);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.complex.Complex");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "atan", argTypes, term111158, args);
        assertTrue(recursiveEquals(term111158, term111559));
        assertTrue(recursiveEquals(retValue, term111556));
    }

};


