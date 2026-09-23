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

public class StdTypeResolverBuilder_buildTypeDeserializer_1703628023171 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term149487;
     Object term149741;
     Object term150400;
     Object term150404;

    public StdTypeResolverBuilder_buildTypeDeserializer_1703628023171() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term150425 = Class.forName((String) "com.fasterxml.jackson.databind.ObjectMapper$DefaultTyping");
        Field term150424 = ((Class) term150425).getDeclaredField((String) "JAVA_LANG_OBJECT");
        ((Field) term150424).setAccessible(true);
        Object enum217 = ((Field) term150424).get((Object) null);
        term149487 = newInstance(Class.forName("com.fasterxml.jackson.databind.ObjectMapper$DefaultTypeResolverBuilder"));
        setField(term149487, term149487.getClass(), "_appliesFor", enum217);
        Class<? extends Object> term149777 = Class.forName((String) "java.util.regex.Pattern$GroupCurly");
        term149741 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ArrayType"));
        setField(term149741, term149741.getClass(), "_class", term149777);
        Class<? extends Object> term150869 = Class.forName((String) "com.fasterxml.jackson.databind.ObjectMapper$DefaultTyping");
        Field term150868 = ((Class) term150869).getDeclaredField((String) "JAVA_LANG_OBJECT");
        ((Field) term150868).setAccessible(true);
        Object enum218 = ((Field) term150868).get((Object) null);
        term150400 = newInstance(Class.forName("com.fasterxml.jackson.databind.ObjectMapper$DefaultTypeResolverBuilder"));
        setField(term150400, term150400.getClass(), "_appliesFor", enum218);
        setField(term150400, term150400.getClass(), "_idType", null);
        setField(term150400, term150400.getClass(), "_includeAs", null);
        setField(term150400, term150400.getClass(), "_typeProperty", null);
        setBooleanField(term150400, term150400.getClass(), "_typeIdVisible", false);
        setField(term150400, term150400.getClass(), "_defaultImpl", null);
        setField(term150400, term150400.getClass(), "_customIdResolver", null);
        Class<? extends Object> term150405 = Class.forName((String) "com.fasterxml.jackson.annotation.JsonInclude");
        term150404 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ArrayType"));
        setField(term150404, term150404.getClass(), "_componentType", null);
        setField(term150404, term150404.getClass(), "_emptyArray", null);
        setField(term150404, term150404.getClass(), "_superClass", null);
        setField(term150404, term150404.getClass(), "_superInterfaces", null);
        setField(term150404, term150404.getClass(), "_bindings", null);
        setField(term150404, term150404.getClass(), "_canonicalName", null);
        setField(term150404, term150404.getClass(), "_class", term150405);
        setIntField(term150404, term150404.getClass(), "_hash", 0);
        setField(term150404, term150404.getClass(), "_valueHandler", null);
        setField(term150404, term150404.getClass(), "_typeHandler", null);
        setBooleanField(term150404, term150404.getClass(), "_asStatic", false);
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
        args[1] = term149741;
        args[2] = null;
        callMethod(klass, "buildTypeDeserializer", argTypes, term149487, args);
        assertTrue(recursiveEquals(term149487, term150400));
        assertTrue(recursiveEquals(term149741, null));
    }

};


