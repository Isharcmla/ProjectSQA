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

public class StdTypeResolverBuilder_buildTypeDeserializer_1703628023541 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term645616;
     Object term645878;

    public StdTypeResolverBuilder_buildTypeDeserializer_1703628023541() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term647117 = Class.forName((String) "com.fasterxml.jackson.databind.ObjectMapper$DefaultTyping");
        Field term647116 = ((Class) term647117).getDeclaredField((String) "OBJECT_AND_NON_CONCRETE");
        ((Field) term647116).setAccessible(true);
        Object enum690 = ((Field) term647116).get((Object) null);
        term645616 = newInstance(Class.forName("com.fasterxml.jackson.databind.ObjectMapper$DefaultTypeResolverBuilder"));
        setField(term645616, term645616.getClass(), "_appliesFor", enum690);
        Class<? extends Object> term646010 = Class.forName((String) "java.util.AbstractList$SubList");
        term645878 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ReferenceType"));
        Object term645974 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ArrayType"));
        setField(term645974, term645974.getClass(), "_class", term646010);
        setField(term645878, term645878.getClass(), "_referencedType", term645974);
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
        args[1] = term645878;
        args[2] = null;
        try {
            callMethod(klass, "buildTypeDeserializer", argTypes, term645616, args);
            assertTrue(false);
        }
        catch (InaccessibleObjectException e) {
        }

    }

};


