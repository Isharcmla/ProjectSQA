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

public class Complex_acos_1430561531380 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term90123;
     Object term90665;
     Object term90662;

    public Complex_acos_1430561531380() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term90123 = newInstance(Class.forName("org.apache.commons.math.complex.Complex"));
        setDoubleField(term90123, term90123.getClass(), "real", -9.2188684350799217E18);
        setDoubleField(term90123, term90123.getClass(), "imaginary", 1.8155135997837312E16);
        term90665 = newInstance(Class.forName("org.apache.commons.math.complex.Complex"));
        setDoubleField(term90665, term90665.getClass(), "imaginary", 1.8155135997837312E16);
        setDoubleField(term90665, term90665.getClass(), "real", -9.2188684350799217E18);
        term90662 = newInstance(Class.forName("org.apache.commons.math.complex.Complex"));
        setDoubleField(term90662, term90662.getClass(), "imaginary", -44.36093309426231);
        setDoubleField(term90662, term90662.getClass(), "real", 3.1396233107517584);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.complex.Complex");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "acos", argTypes, term90123, args);
        assertTrue(recursiveEquals(term90123, term90665));
        assertTrue(recursiveEquals(retValue, term90662));
    }

};


