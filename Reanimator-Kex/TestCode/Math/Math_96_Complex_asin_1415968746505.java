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

public class Complex_asin_1415968746505 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term128315;
     Object term128531;
     Object term128528;

    public Complex_asin_1415968746505() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term128315 = newInstance(Class.forName("org.apache.commons.math.complex.Complex"));
        setDoubleField(term128315, term128315.getClass(), "real", -6.9175290276389847E18);
        setDoubleField(term128315, term128315.getClass(), "imaginary", -6.9175290276243046E18);
        term128531 = newInstance(Class.forName("org.apache.commons.math.complex.Complex"));
        setDoubleField(term128531, term128531.getClass(), "imaginary", -6.9175290276243046E18);
        setDoubleField(term128531, term128531.getClass(), "real", -6.9175290276389847E18);
        term128528 = newInstance(Class.forName("org.apache.commons.math.complex.Complex"));
        setDoubleField(term128528, term128528.getClass(), "imaginary", -44.42031107366333);
        setDoubleField(term128528, term128528.getClass(), "real", -0.7853981633985093);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.complex.Complex");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "asin", argTypes, term128315, args);
        assertTrue(recursiveEquals(term128315, term128531));
        assertTrue(recursiveEquals(retValue, term128528));
    }

};


