package com.fasterxml.jackson.databind.deser.std;

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
import static com.fasterxml.jackson.databind.deser.std.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.lang.String;

public class StdValueInstantiator_init_1394365189175 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term126669;

    public StdValueInstantiator_init_1394365189175() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term126565 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.std.StdValueInstantiator"));
        Class<? extends Object> term126705 = Class.forName((String) "com.fasterxml.jackson.databind.type.ArrayType");
        Class<? extends Object> term126871 = Class.forName((String) "java.lang.String");
        term126669 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ReferenceType"));
        Object term126835 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.MapType"));
        Object term127005 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ArrayType"));
        setField(term126669, term126669.getClass(), "_class", term126705);
        setField(term126835, term126835.getClass(), "_canonicalName", null);
        setField(term126835, term126835.getClass(), "_class", term126871);
        setField(term126835, term126835.getClass(), "_keyType", term127005);
        setField(term126669, term126669.getClass(), "_referencedType", term126835);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.fasterxml.jackson.databind.deser.std.StdValueInstantiator");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.fasterxml.jackson.databind.DeserializationConfig");
        argTypes[1] = Class.forName("com.fasterxml.jackson.databind.JavaType");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = term126669;
        try {
            Object instance = callConstructor(klass, argTypes, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


