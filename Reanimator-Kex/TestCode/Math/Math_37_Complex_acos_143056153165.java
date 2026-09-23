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

public class Complex_acos_143056153165 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term133;
     Object term645;
     Object term635;

    public Complex_acos_143056153165() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term133 = newInstance(Class.forName("org.apache.commons.math.complex.Complex"));
        setDoubleField(term133, term133.getClass(), "imaginary", 0.8454723071922143);
        setDoubleField(term133, term133.getClass(), "real", 0.8566567697571895);
        setBooleanField(term133, term133.getClass(), "isNaN", true);
        setBooleanField(term133, term133.getClass(), "isInfinite", true);
        term645 = newInstance(Class.forName("org.apache.commons.math.complex.Complex"));
        setDoubleField(term645, term645.getClass(), "imaginary", 0.8454723071922143);
        setDoubleField(term645, term645.getClass(), "real", 0.8566567697571895);
        setBooleanField(term645, term645.getClass(), "isNaN", true);
        setBooleanField(term645, term645.getClass(), "isInfinite", true);
        term635 = newInstance(Class.forName("org.apache.commons.math.complex.Complex"));
        setDoubleField(term635, term635.getClass(), "imaginary", Double.NaN);
        setDoubleField(term635, term635.getClass(), "real", Double.NaN);
        setBooleanField(term635, term635.getClass(), "isNaN", true);
        setBooleanField(term635, term635.getClass(), "isInfinite", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.complex.Complex");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "acos", argTypes, term133, args);
        assertTrue(recursiveEquals(term133, term645));
        assertTrue(recursiveEquals(retValue, term635));
    }

};


