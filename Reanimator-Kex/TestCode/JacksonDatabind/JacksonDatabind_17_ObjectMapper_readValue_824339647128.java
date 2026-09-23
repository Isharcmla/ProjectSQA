package com.fasterxml.jackson.databind;

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
import static com.fasterxml.jackson.databind.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Integer;

public class ObjectMapper_readValue_824339647128 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term6599;
     Object term6604;
     Object term6606;

    public ObjectMapper_readValue_824339647128() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term6599 = (byte[]) newByteArray(4);
        setByteElement(term6599, 0, (byte) 36);
        setByteElement(term6599, 1, (byte) 118);
        setByteElement(term6599, 2, (byte) 106);
        setByteElement(term6599, 3, (byte) 98);
        term6604 = new Integer(1227103734);
        term6606 = new Integer(-1339778481);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.fasterxml.jackson.databind.ObjectMapper");
        Class<?>[] argTypes = new Class<?>[4];
        argTypes[0] = Array.newInstance(byte.class, 0).getClass();
        argTypes[1] = int.class;
        argTypes[2] = int.class;
        argTypes[3] = Class.forName("com.fasterxml.jackson.databind.JavaType");
        Object[] args = new Object[4];
        args[0] = term6599;
        args[1] = term6604;
        args[2] = term6606;
        args[3] = null;
        callMethod(klass, "readValue", argTypes, null, args);
    }

};


