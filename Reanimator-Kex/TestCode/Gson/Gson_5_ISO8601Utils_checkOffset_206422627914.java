package com.google.gson.internal.bind.util;

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
import static com.google.gson.internal.bind.util.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import static com.google.gson.internal.bind.util.EqualityUtils.*;
import java.lang.Integer;
import java.lang.Character;

public class ISO8601Utils_checkOffset_206422627914 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term75;
     Object term77;

    public ISO8601Utils_checkOffset_206422627914() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term75 = new Integer(1484323161);
        term77 = new Character('P');
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.gson.internal.bind.util.ISO8601Utils");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("java.lang.String");
        argTypes[1] = int.class;
        argTypes[2] = char.class;
        Object[] args = new Object[3];
        args[0] = "sjlJAEtRrb";
        args[1] = term75;
        args[2] = term77;
        Object retValue = callMethod(klass, "checkOffset", argTypes, null, args);
        assertTrue(recursiveEquals(term75, 1484323161));
        assertTrue(recursiveEquals(term77, 'P'));
        assertTrue(recursiveEquals(retValue, false));
    }

};


