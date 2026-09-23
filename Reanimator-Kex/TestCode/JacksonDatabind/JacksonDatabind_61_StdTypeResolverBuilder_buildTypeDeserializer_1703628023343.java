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
import static com.fasterxml.jackson.databind.jsontype.impl.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import static com.fasterxml.jackson.databind.jsontype.impl.EqualityUtils.*;
import java.lang.String;
import java.lang.Object;

public class StdTypeResolverBuilder_buildTypeDeserializer_1703628023343 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term368575;
     Object term368839;
     Object term369209;
     Object term369213;

    public StdTypeResolverBuilder_buildTypeDeserializer_1703628023343() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term369215 = Class.forName((String) "com.fasterxml.jackson.databind.ObjectMapper$DefaultTyping");
        Field term369214 = ((Class) term369215).getDeclaredField((String) "JAVA_LANG_OBJECT");
        ((Field) term369214).setAccessible(true);
        Object enum422 = ((Field) term369214).get((Object) null);
        term368575 = newInstance(Class.forName("com.fasterxml.jackson.databind.ObjectMapper$DefaultTypeResolverBuilder"));
        setField(term368575, term368575.getClass(), "_appliesFor", enum422);
        term368839 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.CollectionType"));
        setField(term368839, term368839.getClass(), "_class", null);
        Class<? extends Object> term369555 = Class.forName((String) "com.fasterxml.jackson.databind.ObjectMapper$DefaultTyping");
        Field term369554 = ((Class) term369555).getDeclaredField((String) "JAVA_LANG_OBJECT");
        ((Field) term369554).setAccessible(true);
        Object enum423 = ((Field) term369554).get((Object) null);
        term369209 = newInstance(Class.forName("com.fasterxml.jackson.databind.ObjectMapper$DefaultTypeResolverBuilder"));
        setField(term369209, term369209.getClass(), "_appliesFor", enum423);
        setField(term369209, term369209.getClass(), "_idType", null);
        setField(term369209, term369209.getClass(), "_includeAs", null);
        setField(term369209, term369209.getClass(), "_typeProperty", null);
        setBooleanField(term369209, term369209.getClass(), "_typeIdVisible", false);
        setField(term369209, term369209.getClass(), "_defaultImpl", null);
        setField(term369209, term369209.getClass(), "_customIdResolver", null);
        term369213 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.CollectionType"));
        setField(term369213, term369213.getClass(), "_elementType", null);
        setField(term369213, term369213.getClass(), "_superClass", null);
        setField(term369213, term369213.getClass(), "_superInterfaces", null);
        setField(term369213, term369213.getClass(), "_bindings", null);
        setField(term369213, term369213.getClass(), "_canonicalName", null);
        setField(term369213, term369213.getClass(), "_class", null);
        setIntField(term369213, term369213.getClass(), "_hash", 0);
        setField(term369213, term369213.getClass(), "_valueHandler", null);
        setField(term369213, term369213.getClass(), "_typeHandler", null);
        setBooleanField(term369213, term369213.getClass(), "_asStatic", false);
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
        args[1] = term368839;
        args[2] = null;
        callMethod(klass, "buildTypeDeserializer", argTypes, term368575, args);
        assertTrue(recursiveEquals(term368575, term369209));
        assertTrue(recursiveEquals(term368839, null));
    }

};


