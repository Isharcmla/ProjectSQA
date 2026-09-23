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

public class StdTypeResolverBuilder_buildTypeDeserializer_1703628023394 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term422164;
     Object term422426;
     Object term424600;
     Object term424604;

    public StdTypeResolverBuilder_buildTypeDeserializer_1703628023394() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term424607 = Class.forName((String) "com.fasterxml.jackson.databind.ObjectMapper$DefaultTyping");
        Field term424606 = ((Class) term424607).getDeclaredField((String) "JAVA_LANG_OBJECT");
        ((Field) term424606).setAccessible(true);
        Object enum491 = ((Field) term424606).get((Object) null);
        term422164 = newInstance(Class.forName("com.fasterxml.jackson.databind.ObjectMapper$DefaultTypeResolverBuilder"));
        setField(term422164, term422164.getClass(), "_appliesFor", enum491);
        term422426 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ReferenceType"));
        Object term422524 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.SimpleType"));
        setField(term422426, term422426.getClass(), "_referencedType", term422524);
        Class<? extends Object> term424947 = Class.forName((String) "com.fasterxml.jackson.databind.ObjectMapper$DefaultTyping");
        Field term424946 = ((Class) term424947).getDeclaredField((String) "JAVA_LANG_OBJECT");
        ((Field) term424946).setAccessible(true);
        Object enum492 = ((Field) term424946).get((Object) null);
        term424600 = newInstance(Class.forName("com.fasterxml.jackson.databind.ObjectMapper$DefaultTypeResolverBuilder"));
        setField(term424600, term424600.getClass(), "_appliesFor", enum492);
        setField(term424600, term424600.getClass(), "_idType", null);
        setField(term424600, term424600.getClass(), "_includeAs", null);
        setField(term424600, term424600.getClass(), "_typeProperty", null);
        setBooleanField(term424600, term424600.getClass(), "_typeIdVisible", false);
        setField(term424600, term424600.getClass(), "_defaultImpl", null);
        setField(term424600, term424600.getClass(), "_customIdResolver", null);
        term424604 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ReferenceType"));
        Object term424605 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.SimpleType"));
        setField(term424605, term424605.getClass(), "_superClass", null);
        setField(term424605, term424605.getClass(), "_superInterfaces", null);
        setField(term424605, term424605.getClass(), "_bindings", null);
        setField(term424605, term424605.getClass(), "_canonicalName", null);
        setField(term424605, term424605.getClass(), "_class", null);
        setIntField(term424605, term424605.getClass(), "_hash", 0);
        setField(term424605, term424605.getClass(), "_valueHandler", null);
        setField(term424605, term424605.getClass(), "_typeHandler", null);
        setBooleanField(term424605, term424605.getClass(), "_asStatic", false);
        setField(term424604, term424604.getClass(), "_referencedType", term424605);
        setField(term424604, term424604.getClass(), "_anchorType", null);
        setField(term424604, term424604.getClass(), "_superClass", null);
        setField(term424604, term424604.getClass(), "_superInterfaces", null);
        setField(term424604, term424604.getClass(), "_bindings", null);
        setField(term424604, term424604.getClass(), "_canonicalName", null);
        setField(term424604, term424604.getClass(), "_class", null);
        setIntField(term424604, term424604.getClass(), "_hash", 0);
        setField(term424604, term424604.getClass(), "_valueHandler", null);
        setField(term424604, term424604.getClass(), "_typeHandler", null);
        setBooleanField(term424604, term424604.getClass(), "_asStatic", false);
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
        args[1] = term422426;
        args[2] = null;
        callMethod(klass, "buildTypeDeserializer", argTypes, term422164, args);
        assertTrue(recursiveEquals(term422164, term424600));
        assertTrue(recursiveEquals(term422426, null));
    }

};


