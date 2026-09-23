package com.fasterxml.jackson.databind.ser.std;

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
import static com.fasterxml.jackson.databind.ser.std.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import static com.fasterxml.jackson.databind.ser.std.EqualityUtils.*;
import java.lang.String;

public class StdKeySerializers_getStdKeySerializer_138447779017 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5677;
     Object term6172;

    public StdKeySerializers_getStdKeySerializer_138447779017() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term5677 = Class.forName((String) "java.util.concurrent.SynchronousQueue$TransferStack$SNode");
        term6172 = Class.forName((String) "com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeDeserializer");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.fasterxml.jackson.databind.ser.std.StdKeySerializers");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.fasterxml.jackson.databind.SerializationConfig");
        argTypes[1] = Class.forName("java.lang.Class");
        argTypes[2] = boolean.class;
        Object[] args = new Object[3];
        args[0] = null;
        args[1] = term5677;
        args[2] = false;
        Object retValue = callMethod(klass, "getStdKeySerializer", argTypes, null, args);
        assertTrue(recursiveEquals(term5677, term6172));
        assertTrue(recursiveEquals(retValue, null));
    }

};


