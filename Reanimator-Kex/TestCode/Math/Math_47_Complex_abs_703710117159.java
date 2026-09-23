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

public class Complex_abs_703710117159 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term14966;
     Object term14998;

    public Complex_abs_703710117159() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term14966 = newInstance(Class.forName("org.apache.commons.math.complex.Complex"));
        setBooleanField(term14966, term14966.getClass(), "isNaN", false);
        setBooleanField(term14966, term14966.getClass(), "isInfinite", false);
        setDoubleField(term14966, term14966.getClass(), "real", 0.0);
        term14998 = newInstance(Class.forName("org.apache.commons.math.complex.Complex"));
        setDoubleField(term14998, term14998.getClass(), "imaginary", 0.0);
        setDoubleField(term14998, term14998.getClass(), "real", 0.0);
        setBooleanField(term14998, term14998.getClass(), "isNaN", false);
        setBooleanField(term14998, term14998.getClass(), "isInfinite", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.complex.Complex");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "abs", argTypes, term14966, args);
        assertTrue(recursiveEquals(term14966, term14998));
        assertTrue(recursiveEquals(retValue, 0.0));
    }

};


