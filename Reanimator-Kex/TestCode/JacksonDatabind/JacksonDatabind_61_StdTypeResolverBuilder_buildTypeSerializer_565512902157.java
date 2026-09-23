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

public class StdTypeResolverBuilder_buildTypeSerializer_565512902157 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term133673;
     Object term133927;
     Object term134334;
     Object term134338;

    public StdTypeResolverBuilder_buildTypeSerializer_565512902157() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term134340 = Class.forName((String) "com.fasterxml.jackson.databind.ObjectMapper$DefaultTyping");
        Field term134339 = ((Class) term134340).getDeclaredField((String) "OBJECT_AND_NON_CONCRETE");
        ((Field) term134339).setAccessible(true);
        Object enum202 = ((Field) term134339).get((Object) null);
        term133673 = newInstance(Class.forName("com.fasterxml.jackson.databind.ObjectMapper$DefaultTypeResolverBuilder"));
        setField(term133673, term133673.getClass(), "_appliesFor", enum202);
        term133927 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ArrayType"));
        Class<? extends Object> term134701 = Class.forName((String) "com.fasterxml.jackson.databind.ObjectMapper$DefaultTyping");
        Field term134700 = ((Class) term134701).getDeclaredField((String) "OBJECT_AND_NON_CONCRETE");
        ((Field) term134700).setAccessible(true);
        Object enum203 = ((Field) term134700).get((Object) null);
        term134334 = newInstance(Class.forName("com.fasterxml.jackson.databind.ObjectMapper$DefaultTypeResolverBuilder"));
        setField(term134334, term134334.getClass(), "_appliesFor", enum203);
        setField(term134334, term134334.getClass(), "_idType", null);
        setField(term134334, term134334.getClass(), "_includeAs", null);
        setField(term134334, term134334.getClass(), "_typeProperty", null);
        setBooleanField(term134334, term134334.getClass(), "_typeIdVisible", false);
        setField(term134334, term134334.getClass(), "_defaultImpl", null);
        setField(term134334, term134334.getClass(), "_customIdResolver", null);
        term134338 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ArrayType"));
        setField(term134338, term134338.getClass(), "_componentType", null);
        setField(term134338, term134338.getClass(), "_emptyArray", null);
        setField(term134338, term134338.getClass(), "_superClass", null);
        setField(term134338, term134338.getClass(), "_superInterfaces", null);
        setField(term134338, term134338.getClass(), "_bindings", null);
        setField(term134338, term134338.getClass(), "_canonicalName", null);
        setField(term134338, term134338.getClass(), "_class", null);
        setIntField(term134338, term134338.getClass(), "_hash", 0);
        setField(term134338, term134338.getClass(), "_valueHandler", null);
        setField(term134338, term134338.getClass(), "_typeHandler", null);
        setBooleanField(term134338, term134338.getClass(), "_asStatic", false);
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
        args[1] = term133927;
        args[2] = null;
        callMethod(klass, "buildTypeSerializer", argTypes, term133673, args);
        assertTrue(recursiveEquals(term133673, term134334));
        assertTrue(recursiveEquals(term133927, null));
    }

};


