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

public class StdTypeResolverBuilder_buildTypeDeserializer_1703628023147 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term122104;
     Object term122358;
     Object term123395;
     Object term123399;

    public StdTypeResolverBuilder_buildTypeDeserializer_1703628023147() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term123401 = Class.forName((String) "com.fasterxml.jackson.databind.ObjectMapper$DefaultTyping");
        Field term123400 = ((Class) term123401).getDeclaredField((String) "OBJECT_AND_NON_CONCRETE");
        ((Field) term123400).setAccessible(true);
        Object enum186 = ((Field) term123400).get((Object) null);
        term122104 = newInstance(Class.forName("com.fasterxml.jackson.databind.ObjectMapper$DefaultTypeResolverBuilder"));
        setField(term122104, term122104.getClass(), "_appliesFor", enum186);
        term122358 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ArrayType"));
        Class<? extends Object> term123762 = Class.forName((String) "com.fasterxml.jackson.databind.ObjectMapper$DefaultTyping");
        Field term123761 = ((Class) term123762).getDeclaredField((String) "OBJECT_AND_NON_CONCRETE");
        ((Field) term123761).setAccessible(true);
        Object enum187 = ((Field) term123761).get((Object) null);
        term123395 = newInstance(Class.forName("com.fasterxml.jackson.databind.ObjectMapper$DefaultTypeResolverBuilder"));
        setField(term123395, term123395.getClass(), "_appliesFor", enum187);
        setField(term123395, term123395.getClass(), "_idType", null);
        setField(term123395, term123395.getClass(), "_includeAs", null);
        setField(term123395, term123395.getClass(), "_typeProperty", null);
        setBooleanField(term123395, term123395.getClass(), "_typeIdVisible", false);
        setField(term123395, term123395.getClass(), "_defaultImpl", null);
        setField(term123395, term123395.getClass(), "_customIdResolver", null);
        term123399 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ArrayType"));
        setField(term123399, term123399.getClass(), "_componentType", null);
        setField(term123399, term123399.getClass(), "_emptyArray", null);
        setField(term123399, term123399.getClass(), "_superClass", null);
        setField(term123399, term123399.getClass(), "_superInterfaces", null);
        setField(term123399, term123399.getClass(), "_bindings", null);
        setField(term123399, term123399.getClass(), "_canonicalName", null);
        setField(term123399, term123399.getClass(), "_class", null);
        setIntField(term123399, term123399.getClass(), "_hash", 0);
        setField(term123399, term123399.getClass(), "_valueHandler", null);
        setField(term123399, term123399.getClass(), "_typeHandler", null);
        setBooleanField(term123399, term123399.getClass(), "_asStatic", false);
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
        args[1] = term122358;
        args[2] = null;
        callMethod(klass, "buildTypeDeserializer", argTypes, term122104, args);
        assertTrue(recursiveEquals(term122104, term123395));
        assertTrue(recursiveEquals(term122358, null));
    }

};


