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
import java.lang.reflect.InaccessibleObjectException;
import static com.fasterxml.jackson.databind.deser.std.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.lang.String;

public class StdValueInstantiator_init_1394365189237 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term231801;

    public StdValueInstantiator_init_1394365189237() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term231697 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.std.StdValueInstantiator"));
        Class<? extends Object> term231837 = Class.forName((String) "java.lang.String");
        Class<? extends Object> term232003 = Class.forName((String) "com.fasterxml.jackson.databind.type.MapType");
        term231801 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ReferenceType"));
        Object term231967 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.MapType"));
        Object term232133 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.MapType"));
        Object term232285 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.PlaceholderForType"));
        setField(term231801, term231801.getClass(), "_class", term231837);
        setField(term231967, term231967.getClass(), "_canonicalName", null);
        setField(term231967, term231967.getClass(), "_class", term232003);
        setField(term232133, term232133.getClass(), "_canonicalName", "");
        setField(term231967, term231967.getClass(), "_keyType", term232133);
        setField(term232285, term232285.getClass(), "_canonicalName", "com.fasterxml.jackson.databind.deser.std.StdValueInstantiator");
        setField(term231967, term231967.getClass(), "_valueType", term232285);
        setField(term231801, term231801.getClass(), "_referencedType", term231967);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.fasterxml.jackson.databind.deser.std.StdValueInstantiator");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.fasterxml.jackson.databind.DeserializationConfig");
        argTypes[1] = Class.forName("com.fasterxml.jackson.databind.JavaType");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = term231801;
        try {
            Object instance = callConstructor(klass, argTypes, args);
            assertTrue(false);
        }
        catch (InaccessibleObjectException e) {
        }

    }

};


