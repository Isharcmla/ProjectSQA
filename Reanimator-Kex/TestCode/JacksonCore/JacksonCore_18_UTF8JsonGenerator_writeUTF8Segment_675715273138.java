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

public class UTF8JsonGenerator_writeUTF8Segment_675715273138 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term654;
     Object term661;
     Object term663;

    public UTF8JsonGenerator_writeUTF8Segment_675715273138() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term654 = (byte[]) newByteArray(6);
        setByteElement(term654, 0, (byte) 80);
        setByteElement(term654, 1, (byte) 42);
        setByteElement(term654, 2, (byte) 72);
        setByteElement(term654, 3, (byte) 111);
        setByteElement(term654, 4, (byte) 99);
        setByteElement(term654, 5, (byte) -12);
        term661 = new Integer(-1786399638);
        term663 = new Integer(2055867847);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.fasterxml.jackson.core.json.UTF8JsonGenerator");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Array.newInstance(byte.class, 0).getClass();
        argTypes[1] = int.class;
        argTypes[2] = int.class;
        Object[] args = new Object[3];
        args[0] = term654;
        args[1] = term661;
        args[2] = term663;
        try {
            callMethod(klass, "_writeUTF8Segment", argTypes, null, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


