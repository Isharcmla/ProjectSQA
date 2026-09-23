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

public class Complex_acos_1430561531386 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term92054;
     Object term92848;
     Object term92845;

    public Complex_acos_1430561531386() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term92054 = newInstance(Class.forName("org.apache.commons.math.complex.Complex"));
        setDoubleField(term92054, term92054.getClass(), "real", 1.8014398511579136E16);
        setDoubleField(term92054, term92054.getClass(), "imaginary", -9.1513144428168479E18);
        term92848 = newInstance(Class.forName("org.apache.commons.math.complex.Complex"));
        setDoubleField(term92848, term92848.getClass(), "imaginary", -9.1513144428168479E18);
        setDoubleField(term92848, term92848.getClass(), "real", 1.8014398511579136E16);
        term92845 = newInstance(Class.forName("org.apache.commons.math.complex.Complex"));
        setDoubleField(term92845, term92845.getClass(), "imaginary", Double.POSITIVE_INFINITY);
        setDoubleField(term92845, term92845.getClass(), "real", Double.POSITIVE_INFINITY);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.complex.Complex");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "acos", argTypes, term92054, args);
        assertTrue(recursiveEquals(term92054, term92848));
        assertTrue(recursiveEquals(retValue, term92845));
    }

};


