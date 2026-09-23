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

public class UTF8JsonGenerator_writeStringSegments_1222722254125 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term417;
     Object term424;
     Object term426;

    public UTF8JsonGenerator_writeStringSegments_1222722254125() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term417 = (char[]) newCharArray(6);
        setCharElement(term417, 0, 'A');
        setCharElement(term417, 1, 'E');
        setCharElement(term417, 2, 't');
        setCharElement(term417, 3, 'R');
        setCharElement(term417, 4, 'r');
        setCharElement(term417, 5, 'b');
        term424 = new Integer(1135664017);
        term426 = new Integer(590364439);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.fasterxml.jackson.core.json.UTF8JsonGenerator");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Array.newInstance(char.class, 0).getClass();
        argTypes[1] = int.class;
        argTypes[2] = int.class;
        Object[] args = new Object[3];
        args[0] = term417;
        args[1] = term424;
        args[2] = term426;
        try {
            callMethod(klass, "_writeStringSegments", argTypes, null, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


