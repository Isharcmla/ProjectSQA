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

public class StdTypeResolverBuilder_buildTypeDeserializer_1703628023463 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term521993;
     Object term522255;

    public StdTypeResolverBuilder_buildTypeDeserializer_1703628023463() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term523445 = Class.forName((String) "com.fasterxml.jackson.databind.ObjectMapper$DefaultTyping");
        Field term523444 = ((Class) term523445).getDeclaredField((String) "JAVA_LANG_OBJECT");
        ((Field) term523444).setAccessible(true);
        Object enum581 = ((Field) term523444).get((Object) null);
        term521993 = newInstance(Class.forName("com.fasterxml.jackson.databind.ObjectMapper$DefaultTypeResolverBuilder"));
        setField(term521993, term521993.getClass(), "_appliesFor", enum581);
        Class<? extends Object> term522395 = Class.forName((String) "java.util.stream.ForEachOps$ForEachOp$OfLong");
        term522255 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ReferenceType"));
        Object term522359 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ReferenceType"));
        setField(term522359, term522359.getClass(), "_class", term522395);
        setField(term522255, term522255.getClass(), "_referencedType", term522359);
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
        args[1] = term522255;
        args[2] = null;
        try {
            callMethod(klass, "buildTypeDeserializer", argTypes, term521993, args);
            assertTrue(false);
        }
        catch (InaccessibleObjectException e) {
        }

    }

};


