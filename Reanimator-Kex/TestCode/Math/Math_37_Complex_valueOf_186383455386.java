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
import java.lang.Double;

public class Complex_valueOf_186383455386 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term236;
     Object term238;
     Object term10411;

    public Complex_valueOf_186383455386() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term236 = new Double(0.16988691727397487);
        term238 = new Double(0.39286935532362843);
        term10411 = newInstance(Class.forName("org.apache.commons.math.complex.Complex"));
        setDoubleField(term10411, term10411.getClass(), "imaginary", 0.39286935532362843);
        setDoubleField(term10411, term10411.getClass(), "real", 0.16988691727397487);
        setBooleanField(term10411, term10411.getClass(), "isNaN", false);
        setBooleanField(term10411, term10411.getClass(), "isInfinite", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.complex.Complex");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = double.class;
        argTypes[1] = double.class;
        Object[] args = new Object[2];
        args[0] = term236;
        args[1] = term238;
        Object retValue = callMethod(klass, "valueOf", argTypes, null, args);
        assertTrue(recursiveEquals(term236, 0.16988691727397487));
        assertTrue(recursiveEquals(term238, 0.39286935532362843));
        assertTrue(recursiveEquals(retValue, term10411));
    }

};


