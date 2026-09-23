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

public class StdTypeResolverBuilder_buildTypeDeserializer_1703628023533 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term633196;
     Object term633458;
     Object term633929;
     Object term633933;

    public StdTypeResolverBuilder_buildTypeDeserializer_1703628023533() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term633936 = Class.forName((String) "com.fasterxml.jackson.databind.ObjectMapper$DefaultTyping");
        Field term633935 = ((Class) term633936).getDeclaredField((String) "JAVA_LANG_OBJECT");
        ((Field) term633935).setAccessible(true);
        Object enum680 = ((Field) term633935).get((Object) null);
        term633196 = newInstance(Class.forName("com.fasterxml.jackson.databind.ObjectMapper$DefaultTypeResolverBuilder"));
        setField(term633196, term633196.getClass(), "_appliesFor", enum680);
        term633458 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ReferenceType"));
        Object term633556 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.SimpleType"));
        setField(term633458, term633458.getClass(), "_referencedType", term633556);
        Class<? extends Object> term634276 = Class.forName((String) "com.fasterxml.jackson.databind.ObjectMapper$DefaultTyping");
        Field term634275 = ((Class) term634276).getDeclaredField((String) "JAVA_LANG_OBJECT");
        ((Field) term634275).setAccessible(true);
        Object enum681 = ((Field) term634275).get((Object) null);
        term633929 = newInstance(Class.forName("com.fasterxml.jackson.databind.ObjectMapper$DefaultTypeResolverBuilder"));
        setField(term633929, term633929.getClass(), "_appliesFor", enum681);
        setField(term633929, term633929.getClass(), "_idType", null);
        setField(term633929, term633929.getClass(), "_includeAs", null);
        setField(term633929, term633929.getClass(), "_typeProperty", null);
        setBooleanField(term633929, term633929.getClass(), "_typeIdVisible", false);
        setField(term633929, term633929.getClass(), "_defaultImpl", null);
        setField(term633929, term633929.getClass(), "_customIdResolver", null);
        term633933 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ReferenceType"));
        Object term633934 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.SimpleType"));
        setField(term633934, term633934.getClass(), "_superClass", null);
        setField(term633934, term633934.getClass(), "_superInterfaces", null);
        setField(term633934, term633934.getClass(), "_bindings", null);
        setField(term633934, term633934.getClass(), "_canonicalName", null);
        setField(term633934, term633934.getClass(), "_class", null);
        setIntField(term633934, term633934.getClass(), "_hash", 0);
        setField(term633934, term633934.getClass(), "_valueHandler", null);
        setField(term633934, term633934.getClass(), "_typeHandler", null);
        setBooleanField(term633934, term633934.getClass(), "_asStatic", false);
        setField(term633933, term633933.getClass(), "_referencedType", term633934);
        setField(term633933, term633933.getClass(), "_anchorType", null);
        setField(term633933, term633933.getClass(), "_superClass", null);
        setField(term633933, term633933.getClass(), "_superInterfaces", null);
        setField(term633933, term633933.getClass(), "_bindings", null);
        setField(term633933, term633933.getClass(), "_canonicalName", null);
        setField(term633933, term633933.getClass(), "_class", null);
        setIntField(term633933, term633933.getClass(), "_hash", 0);
        setField(term633933, term633933.getClass(), "_valueHandler", null);
        setField(term633933, term633933.getClass(), "_typeHandler", null);
        setBooleanField(term633933, term633933.getClass(), "_asStatic", false);
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
        args[1] = term633458;
        args[2] = null;
        callMethod(klass, "buildTypeDeserializer", argTypes, term633196, args);
        assertTrue(recursiveEquals(term633196, term633929));
        assertTrue(recursiveEquals(term633458, null));
    }

};


