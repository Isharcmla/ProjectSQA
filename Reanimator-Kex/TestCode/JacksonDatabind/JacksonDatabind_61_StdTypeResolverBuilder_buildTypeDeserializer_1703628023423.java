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

public class StdTypeResolverBuilder_buildTypeDeserializer_1703628023423 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term462885;
     Object term463147;
     Object term464405;
     Object term464409;

    public StdTypeResolverBuilder_buildTypeDeserializer_1703628023423() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term464419 = Class.forName((String) "com.fasterxml.jackson.databind.ObjectMapper$DefaultTyping");
        Field term464418 = ((Class) term464419).getDeclaredField((String) "NON_CONCRETE_AND_ARRAYS");
        ((Field) term464418).setAccessible(true);
        Object enum526 = ((Field) term464418).get((Object) null);
        term462885 = newInstance(Class.forName("com.fasterxml.jackson.databind.ObjectMapper$DefaultTypeResolverBuilder"));
        setField(term462885, term462885.getClass(), "_appliesFor", enum526);
        Class<? extends Object> term463281 = Class.forName((String) "kex.java.util.concurrent.atomic.AtomicLong");
        term463147 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ReferenceType"));
        Object term463245 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.SimpleType"));
        setField(term463245, term463245.getClass(), "_class", term463281);
        setField(term463147, term463147.getClass(), "_referencedType", term463245);
        Class<? extends Object> term464908 = Class.forName((String) "com.fasterxml.jackson.databind.ObjectMapper$DefaultTyping");
        Field term464907 = ((Class) term464908).getDeclaredField((String) "NON_CONCRETE_AND_ARRAYS");
        ((Field) term464907).setAccessible(true);
        Object enum527 = ((Field) term464907).get((Object) null);
        term464405 = newInstance(Class.forName("com.fasterxml.jackson.databind.ObjectMapper$DefaultTypeResolverBuilder"));
        setField(term464405, term464405.getClass(), "_appliesFor", enum527);
        setField(term464405, term464405.getClass(), "_idType", null);
        setField(term464405, term464405.getClass(), "_includeAs", null);
        setField(term464405, term464405.getClass(), "_typeProperty", null);
        setBooleanField(term464405, term464405.getClass(), "_typeIdVisible", false);
        setField(term464405, term464405.getClass(), "_defaultImpl", null);
        setField(term464405, term464405.getClass(), "_customIdResolver", null);
        Class<? extends Object> term464411 = Class.forName((String) "com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler");
        term464409 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ReferenceType"));
        Object term464410 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.SimpleType"));
        setField(term464410, term464410.getClass(), "_superClass", null);
        setField(term464410, term464410.getClass(), "_superInterfaces", null);
        setField(term464410, term464410.getClass(), "_bindings", null);
        setField(term464410, term464410.getClass(), "_canonicalName", null);
        setField(term464410, term464410.getClass(), "_class", term464411);
        setIntField(term464410, term464410.getClass(), "_hash", 0);
        setField(term464410, term464410.getClass(), "_valueHandler", null);
        setField(term464410, term464410.getClass(), "_typeHandler", null);
        setBooleanField(term464410, term464410.getClass(), "_asStatic", false);
        setField(term464409, term464409.getClass(), "_referencedType", term464410);
        setField(term464409, term464409.getClass(), "_anchorType", null);
        setField(term464409, term464409.getClass(), "_superClass", null);
        setField(term464409, term464409.getClass(), "_superInterfaces", null);
        setField(term464409, term464409.getClass(), "_bindings", null);
        setField(term464409, term464409.getClass(), "_canonicalName", null);
        setField(term464409, term464409.getClass(), "_class", null);
        setIntField(term464409, term464409.getClass(), "_hash", 0);
        setField(term464409, term464409.getClass(), "_valueHandler", null);
        setField(term464409, term464409.getClass(), "_typeHandler", null);
        setBooleanField(term464409, term464409.getClass(), "_asStatic", false);
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
        args[1] = term463147;
        args[2] = null;
        callMethod(klass, "buildTypeDeserializer", argTypes, term462885, args);
        assertTrue(recursiveEquals(term462885, term464405));
        assertTrue(recursiveEquals(term463147, null));
    }

};


