package com.fasterxml.jackson.databind.type;

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
import static com.fasterxml.jackson.databind.type.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import static com.fasterxml.jackson.databind.type.EqualityUtils.*;
import java.lang.Object;

public class TypeBindings_init_352540534193 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term63286;
     Object term63287;
     Object term63927;
     Object term63934;
     Object term63935;

    public TypeBindings_init_352540534193() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term63440 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.TypeBindings"));
        Object[] term63292 = (Object[]) newArray("com.fasterxml.jackson.databind.JavaType", 0);
        setField(term63440, term63440.getClass(), "_names", null);
        setField(term63440, term63440.getClass(), "_types", term63292);
        term63286 = (Object[]) newArray("java.lang.String", 4);
        term63287 = (Object[]) newArray("com.fasterxml.jackson.databind.JavaType", 4);
        Object term63560 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ResolvedRecursiveType"));
        Object term63664 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ReferenceType"));
        Object term63764 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.MapLikeType"));
        Object term63884 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ResolvedRecursiveType"));
        setIntField(term63560, term63560.getClass(), "_hash", 0);
        setElement(term63287, 0, term63560);
        setIntField(term63664, term63664.getClass(), "_hash", 0);
        setElement(term63287, 1, term63664);
        setElement(term63287, 2, term63764);
        setElement(term63287, 3, term63884);
        term63927 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.TypeBindings"));
        Object[] term63928 = (Object[]) newArray("java.lang.String", 4);
        Object[] term63929 = (Object[]) newArray("com.fasterxml.jackson.databind.JavaType", 4);
        Object term63930 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ResolvedRecursiveType"));
        Object term63931 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ReferenceType"));
        Object term63932 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.MapLikeType"));
        Object term63933 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ResolvedRecursiveType"));
        setField(term63927, term63927.getClass(), "_names", term63928);
        setField(term63930, term63930.getClass(), "_referencedType", null);
        setField(term63930, term63930.getClass(), "_superClass", null);
        setField(term63930, term63930.getClass(), "_superInterfaces", null);
        setField(term63930, term63930.getClass(), "_bindings", null);
        setField(term63930, term63930.getClass(), "_canonicalName", null);
        setField(term63930, term63930.getClass(), "_class", null);
        setIntField(term63930, term63930.getClass(), "_hash", 0);
        setField(term63930, term63930.getClass(), "_valueHandler", null);
        setField(term63930, term63930.getClass(), "_typeHandler", null);
        setBooleanField(term63930, term63930.getClass(), "_asStatic", false);
        setElement(term63929, 0, term63930);
        setField(term63931, term63931.getClass(), "_referencedType", null);
        setField(term63931, term63931.getClass(), "_superClass", null);
        setField(term63931, term63931.getClass(), "_superInterfaces", null);
        setField(term63931, term63931.getClass(), "_bindings", null);
        setField(term63931, term63931.getClass(), "_canonicalName", null);
        setField(term63931, term63931.getClass(), "_class", null);
        setIntField(term63931, term63931.getClass(), "_hash", 0);
        setField(term63931, term63931.getClass(), "_valueHandler", null);
        setField(term63931, term63931.getClass(), "_typeHandler", null);
        setBooleanField(term63931, term63931.getClass(), "_asStatic", false);
        setElement(term63929, 1, term63931);
        setField(term63932, term63932.getClass(), "_keyType", null);
        setField(term63932, term63932.getClass(), "_valueType", null);
        setField(term63932, term63932.getClass(), "_superClass", null);
        setField(term63932, term63932.getClass(), "_superInterfaces", null);
        setField(term63932, term63932.getClass(), "_bindings", null);
        setField(term63932, term63932.getClass(), "_canonicalName", null);
        setField(term63932, term63932.getClass(), "_class", null);
        setIntField(term63932, term63932.getClass(), "_hash", 0);
        setField(term63932, term63932.getClass(), "_valueHandler", null);
        setField(term63932, term63932.getClass(), "_typeHandler", null);
        setBooleanField(term63932, term63932.getClass(), "_asStatic", false);
        setElement(term63929, 2, term63932);
        setField(term63933, term63933.getClass(), "_referencedType", null);
        setField(term63933, term63933.getClass(), "_superClass", null);
        setField(term63933, term63933.getClass(), "_superInterfaces", null);
        setField(term63933, term63933.getClass(), "_bindings", null);
        setField(term63933, term63933.getClass(), "_canonicalName", null);
        setField(term63933, term63933.getClass(), "_class", null);
        setIntField(term63933, term63933.getClass(), "_hash", 0);
        setField(term63933, term63933.getClass(), "_valueHandler", null);
        setField(term63933, term63933.getClass(), "_typeHandler", null);
        setBooleanField(term63933, term63933.getClass(), "_asStatic", false);
        setElement(term63929, 3, term63933);
        setField(term63927, term63927.getClass(), "_types", term63929);
        setField(term63927, term63927.getClass(), "_unboundVariables", null);
        setIntField(term63927, term63927.getClass(), "_hashCode", 1);
        term63934 = (Object[]) newArray("java.lang.String", 4);
        term63935 = (Object[]) newArray("com.fasterxml.jackson.databind.JavaType", 4);
        Object term63936 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ResolvedRecursiveType"));
        Object term63937 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ReferenceType"));
        Object term63938 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.MapLikeType"));
        Object term63939 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ResolvedRecursiveType"));
        setField(term63936, term63936.getClass(), "_referencedType", null);
        setField(term63936, term63936.getClass(), "_superClass", null);
        setField(term63936, term63936.getClass(), "_superInterfaces", null);
        setField(term63936, term63936.getClass(), "_bindings", null);
        setField(term63936, term63936.getClass(), "_canonicalName", null);
        setField(term63936, term63936.getClass(), "_class", null);
        setIntField(term63936, term63936.getClass(), "_hash", 0);
        setField(term63936, term63936.getClass(), "_valueHandler", null);
        setField(term63936, term63936.getClass(), "_typeHandler", null);
        setBooleanField(term63936, term63936.getClass(), "_asStatic", false);
        setElement(term63935, 0, term63936);
        setField(term63937, term63937.getClass(), "_referencedType", null);
        setField(term63937, term63937.getClass(), "_superClass", null);
        setField(term63937, term63937.getClass(), "_superInterfaces", null);
        setField(term63937, term63937.getClass(), "_bindings", null);
        setField(term63937, term63937.getClass(), "_canonicalName", null);
        setField(term63937, term63937.getClass(), "_class", null);
        setIntField(term63937, term63937.getClass(), "_hash", 0);
        setField(term63937, term63937.getClass(), "_valueHandler", null);
        setField(term63937, term63937.getClass(), "_typeHandler", null);
        setBooleanField(term63937, term63937.getClass(), "_asStatic", false);
        setElement(term63935, 1, term63937);
        setField(term63938, term63938.getClass(), "_keyType", null);
        setField(term63938, term63938.getClass(), "_valueType", null);
        setField(term63938, term63938.getClass(), "_superClass", null);
        setField(term63938, term63938.getClass(), "_superInterfaces", null);
        setField(term63938, term63938.getClass(), "_bindings", null);
        setField(term63938, term63938.getClass(), "_canonicalName", null);
        setField(term63938, term63938.getClass(), "_class", null);
        setIntField(term63938, term63938.getClass(), "_hash", 0);
        setField(term63938, term63938.getClass(), "_valueHandler", null);
        setField(term63938, term63938.getClass(), "_typeHandler", null);
        setBooleanField(term63938, term63938.getClass(), "_asStatic", false);
        setElement(term63935, 2, term63938);
        setField(term63939, term63939.getClass(), "_referencedType", null);
        setField(term63939, term63939.getClass(), "_superClass", null);
        setField(term63939, term63939.getClass(), "_superInterfaces", null);
        setField(term63939, term63939.getClass(), "_bindings", null);
        setField(term63939, term63939.getClass(), "_canonicalName", null);
        setField(term63939, term63939.getClass(), "_class", null);
        setIntField(term63939, term63939.getClass(), "_hash", 0);
        setField(term63939, term63939.getClass(), "_valueHandler", null);
        setField(term63939, term63939.getClass(), "_typeHandler", null);
        setBooleanField(term63939, term63939.getClass(), "_asStatic", false);
        setElement(term63935, 3, term63939);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.fasterxml.jackson.databind.type.TypeBindings");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Array.newInstance(Class.forName("java.lang.String"), 0).getClass();
        argTypes[1] = Array.newInstance(Class.forName("com.fasterxml.jackson.databind.JavaType"), 0).getClass();
        argTypes[2] = Array.newInstance(Class.forName("java.lang.String"), 0).getClass();
        Object[] args = new Object[3];
        args[0] = term63286;
        args[1] = term63287;
        args[2] = null;
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term63927));
        assertTrue(recursiveEquals(term63286, term63934));
        assertTrue(recursiveEquals(term63287, term63935));
    }

};


