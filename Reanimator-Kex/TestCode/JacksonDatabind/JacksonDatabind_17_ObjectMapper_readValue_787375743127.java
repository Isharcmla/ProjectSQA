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

public class ObjectMapper_readValue_787375743127 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term6580;

    public ObjectMapper_readValue_787375743127() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term6580 = (byte[]) newByteArray(9);
        setByteElement(term6580, 0, (byte) 87);
        setByteElement(term6580, 1, (byte) 121);
        setByteElement(term6580, 2, (byte) -99);
        setByteElement(term6580, 3, (byte) -2);
        setByteElement(term6580, 4, (byte) -16);
        setByteElement(term6580, 5, (byte) -112);
        setByteElement(term6580, 6, (byte) -111);
        setByteElement(term6580, 7, (byte) 23);
        setByteElement(term6580, 8, (byte) -15);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.fasterxml.jackson.databind.ObjectMapper");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Array.newInstance(byte.class, 0).getClass();
        argTypes[1] = Class.forName("com.fasterxml.jackson.databind.JavaType");
        Object[] args = new Object[2];
        args[0] = term6580;
        args[1] = null;
        callMethod(klass, "readValue", argTypes, null, args);
    }

};


