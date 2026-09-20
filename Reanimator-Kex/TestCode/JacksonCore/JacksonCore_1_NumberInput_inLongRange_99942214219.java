package com.fasterxml.jackson.core.io;

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
import static com.fasterxml.jackson.core.io.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import static com.fasterxml.jackson.core.io.EqualityUtils.*;
import java.lang.Integer;
import java.lang.Boolean;

public class NumberInput_inLongRange_99942214219 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term73;
     Object term77;
     Object term79;
     Object term81;
     Object term1440;

    public NumberInput_inLongRange_99942214219() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term73 = (char[]) newCharArray(3);
        setCharElement(term73, 0, 'D');
        setCharElement(term73, 1, 's');
        setCharElement(term73, 2, 'j');
        term77 = new Integer(-1922583790);
        term79 = new Integer(-616727354);
        term81 = new Boolean(false);
        term1440 = (char[]) newCharArray(3);
        setCharElement(term1440, 0, 'D');
        setCharElement(term1440, 1, 's');
        setCharElement(term1440, 2, 'j');
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.fasterxml.jackson.core.io.NumberInput");
        Class<?>[] argTypes = new Class<?>[4];
        argTypes[0] = Array.newInstance(char.class, 0).getClass();
        argTypes[1] = int.class;
        argTypes[2] = int.class;
        argTypes[3] = boolean.class;
        Object[] args = new Object[4];
        args[0] = term73;
        args[1] = term77;
        args[2] = term79;
        args[3] = term81;
        Object retValue = callMethod(klass, "inLongRange", argTypes, null, args);
        assertTrue(recursiveEquals(term73, term1440));
        assertTrue(recursiveEquals(term77, -1922583790));
        assertTrue(recursiveEquals(term79, -616727354));
        assertTrue(recursiveEquals(term81, false));
        assertTrue(recursiveEquals(retValue, true));
    }

};
