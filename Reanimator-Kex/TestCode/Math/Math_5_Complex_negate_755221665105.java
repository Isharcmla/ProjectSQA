package org.apache.commons.math3.complex;

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
import static org.apache.commons.math3.complex.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import static org.apache.commons.math3.complex.EqualityUtils.*;

public class Complex_negate_755221665105 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term12984;
     Object term13008;
     Object term13003;

    public Complex_negate_755221665105() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term12984 = newInstance(Class.forName("org.apache.commons.math3.complex.Complex"));
        setBooleanField(term12984, term12984.getClass(), "isNaN", false);
        term13008 = newInstance(Class.forName("org.apache.commons.math3.complex.Complex"));
        setDoubleField(term13008, term13008.getClass(), "imaginary", 0.0);
        setDoubleField(term13008, term13008.getClass(), "real", 0.0);
        setBooleanField(term13008, term13008.getClass(), "isNaN", false);
        setBooleanField(term13008, term13008.getClass(), "isInfinite", false);
        term13003 = newInstance(Class.forName("org.apache.commons.math3.complex.Complex"));
        setDoubleField(term13003, term13003.getClass(), "imaginary", -0.0);
        setDoubleField(term13003, term13003.getClass(), "real", -0.0);
        setBooleanField(term13003, term13003.getClass(), "isNaN", false);
        setBooleanField(term13003, term13003.getClass(), "isInfinite", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math3.complex.Complex");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "negate", argTypes, term12984, args);
        assertTrue(recursiveEquals(term12984, term13008));
        assertTrue(recursiveEquals(retValue, term13003));
    }

};


