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

public class StdTypeResolverBuilder_buildTypeSerializer_565512902299 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term316818;
     Object term317080;
     Object term317822;
     Object term317826;

    public StdTypeResolverBuilder_buildTypeSerializer_565512902299() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term317836 = Class.forName((String) "com.fasterxml.jackson.databind.ObjectMapper$DefaultTyping");
        Field term317835 = ((Class) term317836).getDeclaredField((String) "JAVA_LANG_OBJECT");
        ((Field) term317835).setAccessible(true);
        Object enum369 = ((Field) term317835).get((Object) null);
        term316818 = newInstance(Class.forName("com.fasterxml.jackson.databind.ObjectMapper$DefaultTypeResolverBuilder"));
        setField(term316818, term316818.getClass(), "_appliesFor", enum369);
        Class<? extends Object> term317230 = Class.forName((String) "java.lang.invoke.StringConcatException");
        term317080 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ReferenceType"));
        Object term317194 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.CollectionLikeType"));
        setField(term317194, term317194.getClass(), "_class", term317230);
        setField(term317080, term317080.getClass(), "_referencedType", term317194);
        Class<? extends Object> term318292 = Class.forName((String) "com.fasterxml.jackson.databind.ObjectMapper$DefaultTyping");
        Field term318291 = ((Class) term318292).getDeclaredField((String) "JAVA_LANG_OBJECT");
        ((Field) term318291).setAccessible(true);
        Object enum370 = ((Field) term318291).get((Object) null);
        term317822 = newInstance(Class.forName("com.fasterxml.jackson.databind.ObjectMapper$DefaultTypeResolverBuilder"));
        setField(term317822, term317822.getClass(), "_appliesFor", enum370);
        setField(term317822, term317822.getClass(), "_idType", null);
        setField(term317822, term317822.getClass(), "_includeAs", null);
        setField(term317822, term317822.getClass(), "_typeProperty", null);
        setBooleanField(term317822, term317822.getClass(), "_typeIdVisible", false);
        setField(term317822, term317822.getClass(), "_defaultImpl", null);
        setField(term317822, term317822.getClass(), "_customIdResolver", null);
        Class<? extends Object> term317828 = Class.forName((String) "com.fasterxml.jackson.annotation.JsonCreator");
        term317826 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ReferenceType"));
        Object term317827 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.CollectionLikeType"));
        setField(term317827, term317827.getClass(), "_elementType", null);
        setField(term317827, term317827.getClass(), "_superClass", null);
        setField(term317827, term317827.getClass(), "_superInterfaces", null);
        setField(term317827, term317827.getClass(), "_bindings", null);
        setField(term317827, term317827.getClass(), "_canonicalName", null);
        setField(term317827, term317827.getClass(), "_class", term317828);
        setIntField(term317827, term317827.getClass(), "_hash", 0);
        setField(term317827, term317827.getClass(), "_valueHandler", null);
        setField(term317827, term317827.getClass(), "_typeHandler", null);
        setBooleanField(term317827, term317827.getClass(), "_asStatic", false);
        setField(term317826, term317826.getClass(), "_referencedType", term317827);
        setField(term317826, term317826.getClass(), "_anchorType", null);
        setField(term317826, term317826.getClass(), "_superClass", null);
        setField(term317826, term317826.getClass(), "_superInterfaces", null);
        setField(term317826, term317826.getClass(), "_bindings", null);
        setField(term317826, term317826.getClass(), "_canonicalName", null);
        setField(term317826, term317826.getClass(), "_class", null);
        setIntField(term317826, term317826.getClass(), "_hash", 0);
        setField(term317826, term317826.getClass(), "_valueHandler", null);
        setField(term317826, term317826.getClass(), "_typeHandler", null);
        setBooleanField(term317826, term317826.getClass(), "_asStatic", false);
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
        args[1] = term317080;
        args[2] = null;
        callMethod(klass, "buildTypeSerializer", argTypes, term316818, args);
        assertTrue(recursiveEquals(term316818, term317822));
        assertTrue(recursiveEquals(term317080, null));
    }

};


