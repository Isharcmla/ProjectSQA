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

public class Complex_abs_703710117134 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term23176;
     Object term23206;

    public Complex_abs_703710117134() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term23176 = newInstance(Class.forName("org.apache.commons.math.complex.Complex"));
        setBooleanField(term23176, term23176.getClass(), "isNaN", false);
        setBooleanField(term23176, term23176.getClass(), "isInfinite", false);
        setDoubleField(term23176, term23176.getClass(), "real", 5.62949953421312E15);
        setDoubleField(term23176, term23176.getClass(), "imaginary", -9.2188684372274053E18);
        term23206 = newInstance(Class.forName("org.apache.commons.math.complex.Complex"));
        setDoubleField(term23206, term23206.getClass(), "imaginary", -9.2188684372274053E18);
        setDoubleField(term23206, term23206.getClass(), "real", 5.62949953421312E15);
        setBooleanField(term23206, term23206.getClass(), "isNaN", false);
        setBooleanField(term23206, term23206.getClass(), "isInfinite", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.complex.Complex");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "abs", argTypes, term23176, args);
        assertTrue(recursiveEquals(term23176, term23206));
        assertTrue(recursiveEquals(retValue, 9.2188701560534333E18));
    }

};


