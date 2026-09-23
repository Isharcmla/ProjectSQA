package com.fasterxml.jackson.core.base;

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
import java.lang.NegativeArraySizeException;
import static com.fasterxml.jackson.core.base.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Integer;

public class ParserBase_growArrayBy_555570067118 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term176;
     Object term182;

    public ParserBase_growArrayBy_555570067118() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term176 = (int[]) newIntArray(5);
        setIntElement(term176, 0, 1135664017);
        setIntElement(term176, 1, 590364439);
        setIntElement(term176, 2, 865208305);
        setIntElement(term176, 3, -1275173084);
        setIntElement(term176, 4, -244121226);
        term182 = new Integer(-203030934);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.fasterxml.jackson.core.base.ParserBase");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Array.newInstance(int.class, 0).getClass();
        argTypes[1] = int.class;
        Object[] args = new Object[2];
        args[0] = term176;
        args[1] = term182;
        try {
            callMethod(klass, "growArrayBy", argTypes, null, args);
            assertTrue(false);
        }
        catch (NegativeArraySizeException e) {
        }

    }

};


