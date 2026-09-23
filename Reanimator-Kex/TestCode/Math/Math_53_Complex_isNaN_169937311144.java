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

public class Complex_isNaN_169937311144 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term56;
     Object term398;

    public Complex_isNaN_169937311144() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term56 = newInstance(Class.forName("org.apache.commons.math.complex.Complex"));
        setDoubleField(term56, term56.getClass(), "imaginary", 0.43692187681405226);
        setDoubleField(term56, term56.getClass(), "real", 0.7633268466829064);
        setBooleanField(term56, term56.getClass(), "isNaN", true);
        setBooleanField(term56, term56.getClass(), "isInfinite", true);
        term398 = newInstance(Class.forName("org.apache.commons.math.complex.Complex"));
        setDoubleField(term398, term398.getClass(), "imaginary", 0.43692187681405226);
        setDoubleField(term398, term398.getClass(), "real", 0.7633268466829064);
        setBooleanField(term398, term398.getClass(), "isNaN", true);
        setBooleanField(term398, term398.getClass(), "isInfinite", true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.complex.Complex");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "isNaN", argTypes, term56, args);
        assertTrue(recursiveEquals(term56, term398));
    }

};


