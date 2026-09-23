package com.fasterxml.jackson.core.json;

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
import java.lang.NullPointerException;
import static com.fasterxml.jackson.core.json.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Integer;

public class UTF8StreamJsonParser_parseEscapedName_373237690124 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term118;
     Object term125;
     Object term127;
     Object term129;
     Object term131;

    public UTF8StreamJsonParser_parseEscapedName_373237690124() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term118 = (int[]) newIntArray(6);
        setIntElement(term118, 0, 1135664017);
        setIntElement(term118, 1, 590364439);
        setIntElement(term118, 2, 865208305);
        setIntElement(term118, 3, -1275173084);
        setIntElement(term118, 4, -244121226);
        setIntElement(term118, 5, -203030934);
        term125 = new Integer(-1179120542);
        term127 = new Integer(-73683645);
        term129 = new Integer(-226514366);
        term131 = new Integer(1193880199);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.fasterxml.jackson.core.json.UTF8StreamJsonParser");
        Class<?>[] argTypes = new Class<?>[5];
        argTypes[0] = Array.newInstance(int.class, 0).getClass();
        argTypes[1] = int.class;
        argTypes[2] = int.class;
        argTypes[3] = int.class;
        argTypes[4] = int.class;
        Object[] args = new Object[5];
        args[0] = term118;
        args[1] = term125;
        args[2] = term127;
        args[3] = term129;
        args[4] = term131;
        try {
            callMethod(klass, "parseEscapedName", argTypes, null, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


