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

public class Complex_abs_70371011760 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1820;
     Object term1990;

    public Complex_abs_70371011760() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1820 = newInstance(Class.forName("org.apache.commons.math.complex.Complex"));
        setDoubleField(term1820, term1820.getClass(), "real", 9.2188684372274053E18);
        setDoubleField(term1820, term1820.getClass(), "imaginary", -9.2188684372274053E18);
        term1990 = newInstance(Class.forName("org.apache.commons.math.complex.Complex"));
        setDoubleField(term1990, term1990.getClass(), "imaginary", -9.2188684372274053E18);
        setDoubleField(term1990, term1990.getClass(), "real", 9.2188684372274053E18);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.complex.Complex");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "abs", argTypes, term1820, args);
        assertTrue(recursiveEquals(term1820, term1990));
        assertTrue(recursiveEquals(retValue, 1.3037448773660258E19));
    }

};


