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

public class Complex_pow_629025138175 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term27200;
     Object term27275;
     Object term27276;
     Object term27272;

    public Complex_pow_629025138175() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term27200 = newInstance(Class.forName("org.apache.commons.math.complex.Complex"));
        setDoubleField(term27200, term27200.getClass(), "real", -9.2166166374137201E18);
        setDoubleField(term27200, term27200.getClass(), "imaginary", 9.2188684372274053E18);
        term27275 = newInstance(Class.forName("org.apache.commons.math.complex.Complex"));
        setDoubleField(term27275, term27275.getClass(), "imaginary", 9.2188684372274053E18);
        setDoubleField(term27275, term27275.getClass(), "real", -9.2166166374137201E18);
        term27276 = newInstance(Class.forName("org.apache.commons.math.complex.Complex"));
        setDoubleField(term27276, term27276.getClass(), "imaginary", 9.2188684372274053E18);
        setDoubleField(term27276, term27276.getClass(), "real", -9.2166166374137201E18);
        term27272 = newInstance(Class.forName("org.apache.commons.math.complex.Complex"));
        setDoubleField(term27272, term27272.getClass(), "imaginary", -0.0);
        setDoubleField(term27272, term27272.getClass(), "real", -0.0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.complex.Complex");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.apache.commons.math.complex.Complex");
        Object[] args = new Object[1];
        args[0] = term27200;
        Object retValue = callMethod(klass, "pow", argTypes, term27200, args);
        assertTrue(recursiveEquals(term27200, term27275));
        assertTrue(recursiveEquals(term27200, term27276));
        assertTrue(recursiveEquals(retValue, term27272));
    }

};


