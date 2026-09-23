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

public class Complex_hashCode_73221275551 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term57;
     Object term469;

    public Complex_hashCode_73221275551() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term57 = newInstance(Class.forName("org.apache.commons.math.complex.Complex"));
        setDoubleField(term57, term57.getClass(), "imaginary", 0.7633268466829064);
        setDoubleField(term57, term57.getClass(), "real", 0.13481025392611334);
        setBooleanField(term57, term57.getClass(), "isNaN", false);
        setBooleanField(term57, term57.getClass(), "isInfinite", false);
        term469 = newInstance(Class.forName("org.apache.commons.math.complex.Complex"));
        setDoubleField(term469, term469.getClass(), "imaginary", 0.7633268466829064);
        setDoubleField(term469, term469.getClass(), "real", 0.13481025392611334);
        setBooleanField(term469, term469.getClass(), "isNaN", false);
        setBooleanField(term469, term469.getClass(), "isInfinite", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.complex.Complex");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "hashCode", argTypes, term57, args);
        assertTrue(recursiveEquals(term57, term469));
        assertTrue(recursiveEquals(retValue, -1525732652));
    }

};


