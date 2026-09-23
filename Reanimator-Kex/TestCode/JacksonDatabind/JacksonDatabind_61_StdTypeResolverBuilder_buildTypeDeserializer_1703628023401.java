package com.fasterxml.jackson.databind.jsontype.impl;

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
import static com.fasterxml.jackson.databind.jsontype.impl.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.String;
import java.lang.Object;

public class StdTypeResolverBuilder_buildTypeDeserializer_1703628023401 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term431550;
     Object term431812;

    public StdTypeResolverBuilder_buildTypeDeserializer_1703628023401() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term432820 = Class.forName((String) "com.fasterxml.jackson.databind.ObjectMapper$DefaultTyping");
        Field term432819 = ((Class) term432820).getDeclaredField((String) "JAVA_LANG_OBJECT");
        ((Field) term432819).setAccessible(true);
        Object enum499 = ((Field) term432819).get((Object) null);
        term431550 = newInstance(Class.forName("com.fasterxml.jackson.databind.ObjectMapper$DefaultTypeResolverBuilder"));
        setField(term431550, term431550.getClass(), "_appliesFor", enum499);
        Class<? extends Object> term431848 = Class.forName((String) "java.nio.channels.Channels$ReadableByteChannelImpl");
        term431812 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ReferenceType"));
        setField(term431812, term431812.getClass(), "_class", term431848);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.fasterxml.jackson.databind.DeserializationConfig");
        argTypes[1] = Class.forName("com.fasterxml.jackson.databind.JavaType");
        argTypes[2] = Class.forName("java.util.Collection");
        Object[] args = new Object[3];
        args[0] = null;
        args[1] = term431812;
        args[2] = null;
        try {
            callMethod(klass, "buildTypeDeserializer", argTypes, term431550, args);
            assertTrue(false);
        }
        catch (InaccessibleObjectException e) {
        }

    }

};


