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

public class StdTypeResolverBuilder_buildTypeDeserializer_1703628023384 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term412147;
     Object term412409;
     Object term413987;
     Object term413991;

    public StdTypeResolverBuilder_buildTypeDeserializer_1703628023384() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term413994 = Class.forName((String) "com.fasterxml.jackson.databind.ObjectMapper$DefaultTyping");
        Field term413993 = ((Class) term413994).getDeclaredField((String) "JAVA_LANG_OBJECT");
        ((Field) term413993).setAccessible(true);
        Object enum480 = ((Field) term413993).get((Object) null);
        term412147 = newInstance(Class.forName("com.fasterxml.jackson.databind.ObjectMapper$DefaultTypeResolverBuilder"));
        setField(term412147, term412147.getClass(), "_appliesFor", enum480);
        term412409 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ReferenceType"));
        Object term412529 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ResolvedRecursiveType"));
        setField(term412409, term412409.getClass(), "_referencedType", term412529);
        Class<? extends Object> term414334 = Class.forName((String) "com.fasterxml.jackson.databind.ObjectMapper$DefaultTyping");
        Field term414333 = ((Class) term414334).getDeclaredField((String) "JAVA_LANG_OBJECT");
        ((Field) term414333).setAccessible(true);
        Object enum481 = ((Field) term414333).get((Object) null);
        term413987 = newInstance(Class.forName("com.fasterxml.jackson.databind.ObjectMapper$DefaultTypeResolverBuilder"));
        setField(term413987, term413987.getClass(), "_appliesFor", enum481);
        setField(term413987, term413987.getClass(), "_idType", null);
        setField(term413987, term413987.getClass(), "_includeAs", null);
        setField(term413987, term413987.getClass(), "_typeProperty", null);
        setBooleanField(term413987, term413987.getClass(), "_typeIdVisible", false);
        setField(term413987, term413987.getClass(), "_defaultImpl", null);
        setField(term413987, term413987.getClass(), "_customIdResolver", null);
        term413991 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ReferenceType"));
        Object term413992 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ResolvedRecursiveType"));
        setField(term413992, term413992.getClass(), "_referencedType", null);
        setField(term413992, term413992.getClass(), "_superClass", null);
        setField(term413992, term413992.getClass(), "_superInterfaces", null);
        setField(term413992, term413992.getClass(), "_bindings", null);
        setField(term413992, term413992.getClass(), "_canonicalName", null);
        setField(term413992, term413992.getClass(), "_class", null);
        setIntField(term413992, term413992.getClass(), "_hash", 0);
        setField(term413992, term413992.getClass(), "_valueHandler", null);
        setField(term413992, term413992.getClass(), "_typeHandler", null);
        setBooleanField(term413992, term413992.getClass(), "_asStatic", false);
        setField(term413991, term413991.getClass(), "_referencedType", term413992);
        setField(term413991, term413991.getClass(), "_anchorType", null);
        setField(term413991, term413991.getClass(), "_superClass", null);
        setField(term413991, term413991.getClass(), "_superInterfaces", null);
        setField(term413991, term413991.getClass(), "_bindings", null);
        setField(term413991, term413991.getClass(), "_canonicalName", null);
        setField(term413991, term413991.getClass(), "_class", null);
        setIntField(term413991, term413991.getClass(), "_hash", 0);
        setField(term413991, term413991.getClass(), "_valueHandler", null);
        setField(term413991, term413991.getClass(), "_typeHandler", null);
        setBooleanField(term413991, term413991.getClass(), "_asStatic", false);
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
        args[1] = term412409;
        args[2] = null;
        callMethod(klass, "buildTypeDeserializer", argTypes, term412147, args);
        assertTrue(recursiveEquals(term412147, term413987));
        assertTrue(recursiveEquals(term412409, null));
    }

};


