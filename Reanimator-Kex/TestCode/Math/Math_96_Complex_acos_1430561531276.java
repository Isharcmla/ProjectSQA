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

public class Complex_acos_1430561531276 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term52961;
     Object term53676;
     Object term53673;

    public Complex_acos_1430561531276() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term52961 = newInstance(Class.forName("org.apache.commons.math.complex.Complex"));
        setDoubleField(term52961, term52961.getClass(), "real", 1.9140298416324608E16);
        setDoubleField(term52961, term52961.getClass(), "imaginary", 4.5035996273705E15);
        term53676 = newInstance(Class.forName("org.apache.commons.math.complex.Complex"));
        setDoubleField(term53676, term53676.getClass(), "imaginary", 4.5035996273705E15);
        setDoubleField(term53676, term53676.getClass(), "real", 1.9140298416324608E16);
        term53673 = newInstance(Class.forName("org.apache.commons.math.complex.Complex"));
        setDoubleField(term53673, term53673.getClass(), "imaginary", -38.210662096860915);
        setDoubleField(term53673, term53673.getClass(), "real", 0.2310906671958973);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.complex.Complex");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "acos", argTypes, term52961, args);
        assertTrue(recursiveEquals(term52961, term53676));
        assertTrue(recursiveEquals(retValue, term53673));
    }

};


