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

public class Complex_sqrt_902217185113 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term13131;
     Object term13170;
     Object term13167;

    public Complex_sqrt_902217185113() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term13131 = newInstance(Class.forName("org.apache.commons.math.complex.Complex"));
        setDoubleField(term13131, term13131.getClass(), "real", 0.0);
        setDoubleField(term13131, term13131.getClass(), "imaginary", -9.2188684372274053E18);
        term13170 = newInstance(Class.forName("org.apache.commons.math.complex.Complex"));
        setDoubleField(term13170, term13170.getClass(), "imaginary", -9.2188684372274053E18);
        setDoubleField(term13170, term13170.getClass(), "real", 0.0);
        term13167 = newInstance(Class.forName("org.apache.commons.math.complex.Complex"));
        setDoubleField(term13167, term13167.getClass(), "imaginary", -2.1469592959843702E9);
        setDoubleField(term13167, term13167.getClass(), "real", 2.1469592959843702E9);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.complex.Complex");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "sqrt", argTypes, term13131, args);
        assertTrue(recursiveEquals(term13131, term13170));
        assertTrue(recursiveEquals(retValue, term13167));
    }

};


