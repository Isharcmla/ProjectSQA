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

public class Complex_abs_703710117105 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term9233;
     Object term9263;

    public Complex_abs_703710117105() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term9233 = newInstance(Class.forName("org.apache.commons.math.complex.Complex"));
        setBooleanField(term9233, term9233.getClass(), "isNaN", false);
        setBooleanField(term9233, term9233.getClass(), "isInfinite", false);
        setDoubleField(term9233, term9233.getClass(), "real", 5.62949953421312E15);
        setDoubleField(term9233, term9233.getClass(), "imaginary", -9.2188684372274053E18);
        term9263 = newInstance(Class.forName("org.apache.commons.math.complex.Complex"));
        setDoubleField(term9263, term9263.getClass(), "imaginary", -9.2188684372274053E18);
        setDoubleField(term9263, term9263.getClass(), "real", 5.62949953421312E15);
        setBooleanField(term9263, term9263.getClass(), "isNaN", false);
        setBooleanField(term9263, term9263.getClass(), "isInfinite", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.complex.Complex");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "abs", argTypes, term9233, args);
        assertTrue(recursiveEquals(term9233, term9263));
        assertTrue(recursiveEquals(retValue, 9.2188701560534333E18));
    }

};


