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

public class Complex_acos_1430561531420 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term104549;
     Object term105540;
     Object term105537;

    public Complex_acos_1430561531420() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term104549 = newInstance(Class.forName("org.apache.commons.math.complex.Complex"));
        setDoubleField(term104549, term104549.getClass(), "real", 2.3058474072602051E18);
        setDoubleField(term104549, term104549.getClass(), "imaginary", -6.9175290276410819E18);
        term105540 = newInstance(Class.forName("org.apache.commons.math.complex.Complex"));
        setDoubleField(term105540, term105540.getClass(), "imaginary", -6.9175290276410819E18);
        setDoubleField(term105540, term105540.getClass(), "real", 2.3058474072602051E18);
        term105537 = newInstance(Class.forName("org.apache.commons.math.complex.Complex"));
        setDoubleField(term105537, term105537.getClass(), "imaginary", Double.POSITIVE_INFINITY);
        setDoubleField(term105537, term105537.getClass(), "real", Double.POSITIVE_INFINITY);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.complex.Complex");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "acos", argTypes, term104549, args);
        assertTrue(recursiveEquals(term104549, term105540));
        assertTrue(recursiveEquals(retValue, term105537));
    }

};


