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

public class StdTypeResolverBuilder_buildTypeSerializer_565512902291 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term306753;
     Object term307015;
     Object term307508;
     Object term307512;

    public StdTypeResolverBuilder_buildTypeSerializer_565512902291() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term307515 = Class.forName((String) "com.fasterxml.jackson.databind.ObjectMapper$DefaultTyping");
        Field term307514 = ((Class) term307515).getDeclaredField((String) "JAVA_LANG_OBJECT");
        ((Field) term307514).setAccessible(true);
        Object enum360 = ((Field) term307514).get((Object) null);
        term306753 = newInstance(Class.forName("com.fasterxml.jackson.databind.ObjectMapper$DefaultTypeResolverBuilder"));
        setField(term306753, term306753.getClass(), "_appliesFor", enum360);
        term307015 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ReferenceType"));
        Object term307135 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ResolvedRecursiveType"));
        setField(term307015, term307015.getClass(), "_referencedType", term307135);
        Class<? extends Object> term307855 = Class.forName((String) "com.fasterxml.jackson.databind.ObjectMapper$DefaultTyping");
        Field term307854 = ((Class) term307855).getDeclaredField((String) "JAVA_LANG_OBJECT");
        ((Field) term307854).setAccessible(true);
        Object enum361 = ((Field) term307854).get((Object) null);
        term307508 = newInstance(Class.forName("com.fasterxml.jackson.databind.ObjectMapper$DefaultTypeResolverBuilder"));
        setField(term307508, term307508.getClass(), "_appliesFor", enum361);
        setField(term307508, term307508.getClass(), "_idType", null);
        setField(term307508, term307508.getClass(), "_includeAs", null);
        setField(term307508, term307508.getClass(), "_typeProperty", null);
        setBooleanField(term307508, term307508.getClass(), "_typeIdVisible", false);
        setField(term307508, term307508.getClass(), "_defaultImpl", null);
        setField(term307508, term307508.getClass(), "_customIdResolver", null);
        term307512 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ReferenceType"));
        Object term307513 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ResolvedRecursiveType"));
        setField(term307513, term307513.getClass(), "_referencedType", null);
        setField(term307513, term307513.getClass(), "_superClass", null);
        setField(term307513, term307513.getClass(), "_superInterfaces", null);
        setField(term307513, term307513.getClass(), "_bindings", null);
        setField(term307513, term307513.getClass(), "_canonicalName", null);
        setField(term307513, term307513.getClass(), "_class", null);
        setIntField(term307513, term307513.getClass(), "_hash", 0);
        setField(term307513, term307513.getClass(), "_valueHandler", null);
        setField(term307513, term307513.getClass(), "_typeHandler", null);
        setBooleanField(term307513, term307513.getClass(), "_asStatic", false);
        setField(term307512, term307512.getClass(), "_referencedType", term307513);
        setField(term307512, term307512.getClass(), "_anchorType", null);
        setField(term307512, term307512.getClass(), "_superClass", null);
        setField(term307512, term307512.getClass(), "_superInterfaces", null);
        setField(term307512, term307512.getClass(), "_bindings", null);
        setField(term307512, term307512.getClass(), "_canonicalName", null);
        setField(term307512, term307512.getClass(), "_class", null);
        setIntField(term307512, term307512.getClass(), "_hash", 0);
        setField(term307512, term307512.getClass(), "_valueHandler", null);
        setField(term307512, term307512.getClass(), "_typeHandler", null);
        setBooleanField(term307512, term307512.getClass(), "_asStatic", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.fasterxml.jackson.databind.SerializationConfig");
        argTypes[1] = Class.forName("com.fasterxml.jackson.databind.JavaType");
        argTypes[2] = Class.forName("java.util.Collection");
        Object[] args = new Object[3];
        args[0] = null;
        args[1] = term307015;
        args[2] = null;
        callMethod(klass, "buildTypeSerializer", argTypes, term306753, args);
        assertTrue(recursiveEquals(term306753, term307508));
        assertTrue(recursiveEquals(term307015, null));
    }

};


