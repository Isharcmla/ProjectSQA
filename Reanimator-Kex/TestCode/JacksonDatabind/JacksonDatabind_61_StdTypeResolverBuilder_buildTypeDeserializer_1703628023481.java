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

public class StdTypeResolverBuilder_buildTypeDeserializer_1703628023481 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term547287;
     Object term547549;
     Object term548127;
     Object term548131;

    public StdTypeResolverBuilder_buildTypeDeserializer_1703628023481() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term548135 = Class.forName((String) "com.fasterxml.jackson.databind.ObjectMapper$DefaultTyping");
        Field term548134 = ((Class) term548135).getDeclaredField((String) "JAVA_LANG_OBJECT");
        ((Field) term548134).setAccessible(true);
        Object enum604 = ((Field) term548134).get((Object) null);
        term547287 = newInstance(Class.forName("com.fasterxml.jackson.databind.ObjectMapper$DefaultTypeResolverBuilder"));
        setField(term547287, term547287.getClass(), "_appliesFor", enum604);
        term547549 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ReferenceType"));
        Object term547653 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ReferenceType"));
        Object term547751 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.SimpleType"));
        setField(term547653, term547653.getClass(), "_referencedType", term547751);
        setField(term547549, term547549.getClass(), "_referencedType", term547653);
        Class<? extends Object> term548475 = Class.forName((String) "com.fasterxml.jackson.databind.ObjectMapper$DefaultTyping");
        Field term548474 = ((Class) term548475).getDeclaredField((String) "JAVA_LANG_OBJECT");
        ((Field) term548474).setAccessible(true);
        Object enum605 = ((Field) term548474).get((Object) null);
        term548127 = newInstance(Class.forName("com.fasterxml.jackson.databind.ObjectMapper$DefaultTypeResolverBuilder"));
        setField(term548127, term548127.getClass(), "_appliesFor", enum605);
        setField(term548127, term548127.getClass(), "_idType", null);
        setField(term548127, term548127.getClass(), "_includeAs", null);
        setField(term548127, term548127.getClass(), "_typeProperty", null);
        setBooleanField(term548127, term548127.getClass(), "_typeIdVisible", false);
        setField(term548127, term548127.getClass(), "_defaultImpl", null);
        setField(term548127, term548127.getClass(), "_customIdResolver", null);
        term548131 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ReferenceType"));
        Object term548132 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ReferenceType"));
        Object term548133 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.SimpleType"));
        setField(term548133, term548133.getClass(), "_superClass", null);
        setField(term548133, term548133.getClass(), "_superInterfaces", null);
        setField(term548133, term548133.getClass(), "_bindings", null);
        setField(term548133, term548133.getClass(), "_canonicalName", null);
        setField(term548133, term548133.getClass(), "_class", null);
        setIntField(term548133, term548133.getClass(), "_hash", 0);
        setField(term548133, term548133.getClass(), "_valueHandler", null);
        setField(term548133, term548133.getClass(), "_typeHandler", null);
        setBooleanField(term548133, term548133.getClass(), "_asStatic", false);
        setField(term548132, term548132.getClass(), "_referencedType", term548133);
        setField(term548132, term548132.getClass(), "_anchorType", null);
        setField(term548132, term548132.getClass(), "_superClass", null);
        setField(term548132, term548132.getClass(), "_superInterfaces", null);
        setField(term548132, term548132.getClass(), "_bindings", null);
        setField(term548132, term548132.getClass(), "_canonicalName", null);
        setField(term548132, term548132.getClass(), "_class", null);
        setIntField(term548132, term548132.getClass(), "_hash", 0);
        setField(term548132, term548132.getClass(), "_valueHandler", null);
        setField(term548132, term548132.getClass(), "_typeHandler", null);
        setBooleanField(term548132, term548132.getClass(), "_asStatic", false);
        setField(term548131, term548131.getClass(), "_referencedType", term548132);
        setField(term548131, term548131.getClass(), "_anchorType", null);
        setField(term548131, term548131.getClass(), "_superClass", null);
        setField(term548131, term548131.getClass(), "_superInterfaces", null);
        setField(term548131, term548131.getClass(), "_bindings", null);
        setField(term548131, term548131.getClass(), "_canonicalName", null);
        setField(term548131, term548131.getClass(), "_class", null);
        setIntField(term548131, term548131.getClass(), "_hash", 0);
        setField(term548131, term548131.getClass(), "_valueHandler", null);
        setField(term548131, term548131.getClass(), "_typeHandler", null);
        setBooleanField(term548131, term548131.getClass(), "_asStatic", false);
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
        args[1] = term547549;
        args[2] = null;
        callMethod(klass, "buildTypeDeserializer", argTypes, term547287, args);
        assertTrue(recursiveEquals(term547287, term548127));
        assertTrue(recursiveEquals(term547549, null));
    }

};


