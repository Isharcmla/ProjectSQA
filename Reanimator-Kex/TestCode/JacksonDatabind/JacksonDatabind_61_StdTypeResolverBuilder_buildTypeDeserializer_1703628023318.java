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

public class StdTypeResolverBuilder_buildTypeDeserializer_1703628023318 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term338617;
     Object term339035;
     Object term341161;
     Object term341168;

    public StdTypeResolverBuilder_buildTypeDeserializer_1703628023318() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term341189 = Class.forName((String) "com.fasterxml.jackson.databind.ObjectMapper$DefaultTyping");
        Field term341188 = ((Class) term341189).getDeclaredField((String) "OBJECT_AND_NON_CONCRETE");
        ((Field) term341188).setAccessible(true);
        Object enum392 = ((Field) term341188).get((Object) null);
        Class<? extends Object> term341550 = Class.forName((String) "com.fasterxml.jackson.annotation.JsonTypeInfo$Id");
        Field term341549 = ((Class) term341550).getDeclaredField((String) "NONE");
        ((Field) term341549).setAccessible(true);
        Object enum393 = ((Field) term341549).get((Object) null);
        term338617 = newInstance(Class.forName("com.fasterxml.jackson.databind.ObjectMapper$DefaultTypeResolverBuilder"));
        setField(term338617, term338617.getClass(), "_appliesFor", enum392);
        setField(term338617, term338617.getClass(), "_idType", enum393);
        Class<? extends Object> term339071 = Class.forName((String) "java.io.ObjectInputStream$GetFieldImpl");
        term339035 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ResolvedRecursiveType"));
        setField(term339035, term339035.getClass(), "_class", term339071);
        Class<? extends Object> term341925 = Class.forName((String) "com.fasterxml.jackson.databind.ObjectMapper$DefaultTyping");
        Field term341924 = ((Class) term341925).getDeclaredField((String) "OBJECT_AND_NON_CONCRETE");
        ((Field) term341924).setAccessible(true);
        Object enum394 = ((Field) term341924).get((Object) null);
        Class<? extends Object> term342286 = Class.forName((String) "com.fasterxml.jackson.annotation.JsonTypeInfo$Id");
        Field term342285 = ((Class) term342286).getDeclaredField((String) "NONE");
        ((Field) term342285).setAccessible(true);
        Object enum395 = ((Field) term342285).get((Object) null);
        term341161 = newInstance(Class.forName("com.fasterxml.jackson.databind.ObjectMapper$DefaultTypeResolverBuilder"));
        setField(term341161, term341161.getClass(), "_appliesFor", enum394);
        setField(term341161, term341161.getClass(), "_idType", enum395);
        setField(term341161, term341161.getClass(), "_includeAs", null);
        setField(term341161, term341161.getClass(), "_typeProperty", null);
        setBooleanField(term341161, term341161.getClass(), "_typeIdVisible", false);
        setField(term341161, term341161.getClass(), "_defaultImpl", null);
        setField(term341161, term341161.getClass(), "_customIdResolver", null);
        Class<? extends Object> term341169 = Class.forName((String) "com.fasterxml.jackson.databind.ser.impl.IteratorSerializer");
        term341168 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ResolvedRecursiveType"));
        setField(term341168, term341168.getClass(), "_referencedType", null);
        setField(term341168, term341168.getClass(), "_superClass", null);
        setField(term341168, term341168.getClass(), "_superInterfaces", null);
        setField(term341168, term341168.getClass(), "_bindings", null);
        setField(term341168, term341168.getClass(), "_canonicalName", null);
        setField(term341168, term341168.getClass(), "_class", term341169);
        setIntField(term341168, term341168.getClass(), "_hash", 0);
        setField(term341168, term341168.getClass(), "_valueHandler", null);
        setField(term341168, term341168.getClass(), "_typeHandler", null);
        setBooleanField(term341168, term341168.getClass(), "_asStatic", false);
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
        args[1] = term339035;
        args[2] = null;
        callMethod(klass, "buildTypeDeserializer", argTypes, term338617, args);
        assertTrue(recursiveEquals(term338617, term341161));
        assertTrue(recursiveEquals(term339035, null));
    }

};


