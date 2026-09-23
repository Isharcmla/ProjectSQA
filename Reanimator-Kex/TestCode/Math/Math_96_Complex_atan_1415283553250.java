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

public class Complex_atan_1415283553250 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term45418;
     Object term46088;
     Object term46085;

    public Complex_atan_1415283553250() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term45418 = newInstance(Class.forName("org.apache.commons.math.complex.Complex"));
        setDoubleField(term45418, term45418.getClass(), "real", 4.503599627370498E15);
        setDoubleField(term45418, term45418.getClass(), "imaginary", -4.6094342186137027E18);
        term46088 = newInstance(Class.forName("org.apache.commons.math.complex.Complex"));
        setDoubleField(term46088, term46088.getClass(), "imaginary", -4.6094342186137027E18);
        setDoubleField(term46088, term46088.getClass(), "real", 4.503599627370498E15);
        term46085 = newInstance(Class.forName("org.apache.commons.math.complex.Complex"));
        setDoubleField(term46085, term46085.getClass(), "imaginary", 0.0);
        setDoubleField(term46085, term46085.getClass(), "real", -1.5707963267948966);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.complex.Complex");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "atan", argTypes, term45418, args);
        assertTrue(recursiveEquals(term45418, term46088));
        assertTrue(recursiveEquals(retValue, term46085));
    }

};


