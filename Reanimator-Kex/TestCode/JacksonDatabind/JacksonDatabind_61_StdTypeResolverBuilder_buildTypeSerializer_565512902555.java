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

public class StdTypeResolverBuilder_buildTypeSerializer_565512902555 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term668074;
     Object term668336;
     Object term669508;
     Object term669512;

    public StdTypeResolverBuilder_buildTypeSerializer_565512902555() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term669522 = Class.forName((String) "com.fasterxml.jackson.databind.ObjectMapper$DefaultTyping");
        Field term669521 = ((Class) term669522).getDeclaredField((String) "NON_CONCRETE_AND_ARRAYS");
        ((Field) term669521).setAccessible(true);
        Object enum709 = ((Field) term669521).get((Object) null);
        term668074 = newInstance(Class.forName("com.fasterxml.jackson.databind.ObjectMapper$DefaultTypeResolverBuilder"));
        setField(term668074, term668074.getClass(), "_appliesFor", enum709);
        Class<? extends Object> term668478 = Class.forName((String) "com.fasterxml.jackson.core.Versioned");
        term668336 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ReferenceType"));
        Object term668442 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.CollectionType"));
        setField(term668442, term668442.getClass(), "_class", term668478);
        setField(term668336, term668336.getClass(), "_referencedType", term668442);
        Class<? extends Object> term669993 = Class.forName((String) "com.fasterxml.jackson.databind.ObjectMapper$DefaultTyping");
        Field term669992 = ((Class) term669993).getDeclaredField((String) "NON_CONCRETE_AND_ARRAYS");
        ((Field) term669992).setAccessible(true);
        Object enum710 = ((Field) term669992).get((Object) null);
        term669508 = newInstance(Class.forName("com.fasterxml.jackson.databind.ObjectMapper$DefaultTypeResolverBuilder"));
        setField(term669508, term669508.getClass(), "_appliesFor", enum710);
        setField(term669508, term669508.getClass(), "_idType", null);
        setField(term669508, term669508.getClass(), "_includeAs", null);
        setField(term669508, term669508.getClass(), "_typeProperty", null);
        setBooleanField(term669508, term669508.getClass(), "_typeIdVisible", false);
        setField(term669508, term669508.getClass(), "_defaultImpl", null);
        setField(term669508, term669508.getClass(), "_customIdResolver", null);
        Class<? extends Object> term669514 = Class.forName((String) "com.fasterxml.jackson.databind.node.JsonNodeFactory");
        term669512 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ReferenceType"));
        Object term669513 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.CollectionType"));
        setField(term669513, term669513.getClass(), "_elementType", null);
        setField(term669513, term669513.getClass(), "_superClass", null);
        setField(term669513, term669513.getClass(), "_superInterfaces", null);
        setField(term669513, term669513.getClass(), "_bindings", null);
        setField(term669513, term669513.getClass(), "_canonicalName", null);
        setField(term669513, term669513.getClass(), "_class", term669514);
        setIntField(term669513, term669513.getClass(), "_hash", 0);
        setField(term669513, term669513.getClass(), "_valueHandler", null);
        setField(term669513, term669513.getClass(), "_typeHandler", null);
        setBooleanField(term669513, term669513.getClass(), "_asStatic", false);
        setField(term669512, term669512.getClass(), "_referencedType", term669513);
        setField(term669512, term669512.getClass(), "_anchorType", null);
        setField(term669512, term669512.getClass(), "_superClass", null);
        setField(term669512, term669512.getClass(), "_superInterfaces", null);
        setField(term669512, term669512.getClass(), "_bindings", null);
        setField(term669512, term669512.getClass(), "_canonicalName", null);
        setField(term669512, term669512.getClass(), "_class", null);
        setIntField(term669512, term669512.getClass(), "_hash", 0);
        setField(term669512, term669512.getClass(), "_valueHandler", null);
        setField(term669512, term669512.getClass(), "_typeHandler", null);
        setBooleanField(term669512, term669512.getClass(), "_asStatic", false);
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
        args[1] = term668336;
        args[2] = null;
        callMethod(klass, "buildTypeSerializer", argTypes, term668074, args);
        assertTrue(recursiveEquals(term668074, term669508));
        assertTrue(recursiveEquals(term668336, null));
    }

};


