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

public class Complex_divide_886435667128 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term16124;
     Object term16208;
     Object term16387;
     Object term16388;
     Object term16384;

    public Complex_divide_886435667128() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term16124 = newInstance(Class.forName("org.apache.commons.math.complex.Complex"));
        setDoubleField(term16124, term16124.getClass(), "real", -9.2188684372274053E18);
        setDoubleField(term16124, term16124.getClass(), "imaginary", -9.2166166374137201E18);
        term16208 = newInstance(Class.forName("org.apache.commons.math.complex.Complex"));
        setDoubleField(term16208, term16208.getClass(), "real", 0.0);
        setDoubleField(term16208, term16208.getClass(), "imaginary", -9.2166166374137201E18);
        term16387 = newInstance(Class.forName("org.apache.commons.math.complex.Complex"));
        setDoubleField(term16387, term16387.getClass(), "imaginary", -9.2166166374137201E18);
        setDoubleField(term16387, term16387.getClass(), "real", -9.2188684372274053E18);
        term16388 = newInstance(Class.forName("org.apache.commons.math.complex.Complex"));
        setDoubleField(term16388, term16388.getClass(), "imaginary", -9.2166166374137201E18);
        setDoubleField(term16388, term16388.getClass(), "real", 0.0);
        term16384 = newInstance(Class.forName("org.apache.commons.math.complex.Complex"));
        setDoubleField(term16384, term16384.getClass(), "imaginary", -1.0002443195699975);
        setDoubleField(term16384, term16384.getClass(), "real", 1.0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.complex.Complex");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.apache.commons.math.complex.Complex");
        Object[] args = new Object[1];
        args[0] = term16208;
        Object retValue = callMethod(klass, "divide", argTypes, term16124, args);
        assertTrue(recursiveEquals(term16124, term16387));
        assertTrue(recursiveEquals(term16208, term16388));
        assertTrue(recursiveEquals(retValue, term16384));
    }

};


