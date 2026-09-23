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

public class Complex_acos_143056153199 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term9413;
     Object term9629;
     Object term9626;

    public Complex_acos_143056153199() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term9413 = newInstance(Class.forName("org.apache.commons.math.complex.Complex"));
        setDoubleField(term9413, term9413.getClass(), "real", 9.2188684372274053E18);
        setDoubleField(term9413, term9413.getClass(), "imaginary", -9.2031058385316086E18);
        term9629 = newInstance(Class.forName("org.apache.commons.math.complex.Complex"));
        setDoubleField(term9629, term9629.getClass(), "imaginary", -9.2031058385316086E18);
        setDoubleField(term9629, term9629.getClass(), "real", 9.2188684372274053E18);
        term9626 = newInstance(Class.forName("org.apache.commons.math.complex.Complex"));
        setDoubleField(term9626, term9626.getClass(), "imaginary", -7.278045395879426);
        setDoubleField(term9626, term9626.getClass(), "real", -2.356194490192345);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.complex.Complex");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "acos", argTypes, term9413, args);
        assertTrue(recursiveEquals(term9413, term9629));
        assertTrue(recursiveEquals(retValue, term9626));
    }

};


