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

public class Complex_sqrt_106063174578 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term195;
     Object term9294;
     Object term9289;

    public Complex_sqrt_106063174578() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term195 = newInstance(Class.forName("org.apache.commons.math3.complex.Complex"));
        setDoubleField(term195, term195.getClass(), "imaginary", 0.426231085465289);
        setDoubleField(term195, term195.getClass(), "real", 0.0027299293098262956);
        setBooleanField(term195, term195.getClass(), "isNaN", false);
        setBooleanField(term195, term195.getClass(), "isInfinite", false);
        term9294 = newInstance(Class.forName("org.apache.commons.math3.complex.Complex"));
        setDoubleField(term9294, term9294.getClass(), "imaginary", 0.426231085465289);
        setDoubleField(term9294, term9294.getClass(), "real", 0.0027299293098262956);
        setBooleanField(term9294, term9294.getClass(), "isNaN", false);
        setBooleanField(term9294, term9294.getClass(), "isInfinite", false);
        term9289 = newInstance(Class.forName("org.apache.commons.math3.complex.Complex"));
        setDoubleField(term9289, term9289.getClass(), "imaginary", 0.4601683922248966);
        setDoubleField(term9289, term9289.getClass(), "real", 0.4631251218760137);
        setBooleanField(term9289, term9289.getClass(), "isNaN", false);
        setBooleanField(term9289, term9289.getClass(), "isInfinite", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math3.complex.Complex");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "sqrt", argTypes, term195, args);
        assertTrue(recursiveEquals(term195, term9294));
        assertTrue(recursiveEquals(retValue, term9289));
    }

};


