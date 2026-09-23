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

public class Complex_acos_1430561531251 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term45904;
     Object term46304;
     Object term46301;

    public Complex_acos_1430561531251() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term45904 = newInstance(Class.forName("org.apache.commons.math.complex.Complex"));
        setDoubleField(term45904, term45904.getClass(), "real", -9.2052169008569385E18);
        setDoubleField(term45904, term45904.getClass(), "imaginary", 3.6028797027352576E16);
        term46304 = newInstance(Class.forName("org.apache.commons.math.complex.Complex"));
        setDoubleField(term46304, term46304.getClass(), "imaginary", 3.6028797027352576E16);
        setDoubleField(term46304, term46304.getClass(), "real", -9.2052169008569385E18);
        term46301 = newInstance(Class.forName("org.apache.commons.math.complex.Complex"));
        setDoubleField(term46301, term46301.getClass(), "imaginary", -44.35945689169405);
        setDoubleField(term46301, term46301.getClass(), "real", 3.137678719410774);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.complex.Complex");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "acos", argTypes, term45904, args);
        assertTrue(recursiveEquals(term45904, term46304));
        assertTrue(recursiveEquals(retValue, term46301));
    }

};


