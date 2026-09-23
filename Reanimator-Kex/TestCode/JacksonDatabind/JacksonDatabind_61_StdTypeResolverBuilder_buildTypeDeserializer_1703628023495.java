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

public class StdTypeResolverBuilder_buildTypeDeserializer_1703628023495 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term567366;
     Object term567628;

    public StdTypeResolverBuilder_buildTypeDeserializer_1703628023495() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term568829 = Class.forName((String) "com.fasterxml.jackson.databind.ObjectMapper$DefaultTyping");
        Field term568828 = ((Class) term568829).getDeclaredField((String) "NON_CONCRETE_AND_ARRAYS");
        ((Field) term568828).setAccessible(true);
        Object enum621 = ((Field) term568828).get((Object) null);
        term567366 = newInstance(Class.forName("com.fasterxml.jackson.databind.ObjectMapper$DefaultTypeResolverBuilder"));
        setField(term567366, term567366.getClass(), "_appliesFor", enum621);
        Class<? extends Object> term567770 = Class.forName((String) "com.fasterxml.jackson.databind.annotation.JsonAppend$Attr");
        term567628 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ReferenceType"));
        Object term567734 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.CollectionType"));
        setField(term567734, term567734.getClass(), "_class", term567770);
        setField(term567628, term567628.getClass(), "_referencedType", term567734);
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
        args[1] = term567628;
        args[2] = null;
        try {
            callMethod(klass, "buildTypeDeserializer", argTypes, term567366, args);
            assertTrue(false);
        }
        catch (InaccessibleObjectException e) {
        }

    }

};


