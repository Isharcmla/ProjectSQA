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

public class ObjectMapper_readValue_1312889641126 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term6567;
     Object term6572;
     Object term6574;

    public ObjectMapper_readValue_1312889641126() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term6567 = (byte[]) newByteArray(4);
        setByteElement(term6567, 0, (byte) 49);
        setByteElement(term6567, 1, (byte) -54);
        setByteElement(term6567, 2, (byte) 67);
        setByteElement(term6567, 3, (byte) 78);
        term6572 = new Integer(-1955890973);
        term6574 = new Integer(-2038273078);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.fasterxml.jackson.databind.ObjectMapper");
        Class<?>[] argTypes = new Class<?>[4];
        argTypes[0] = Array.newInstance(byte.class, 0).getClass();
        argTypes[1] = int.class;
        argTypes[2] = int.class;
        argTypes[3] = Class.forName("com.fasterxml.jackson.core.type.TypeReference");
        Object[] args = new Object[4];
        args[0] = term6567;
        args[1] = term6572;
        args[2] = term6574;
        args[3] = null;
        callMethod(klass, "readValue", argTypes, null, args);
    }

};


