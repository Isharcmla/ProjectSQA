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
import java.lang.String;

public class MapType_init_1937319099113 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term30116;
     Object term30208;
     Object term30314;
     Object term30661;
     Object term30686;
     Object term30687;
     Object term30688;

    public MapType_init_1937319099113() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term30080 = Class.forName((String) "java.nio.file.WatchEvent$Kind");
        Object term30044 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.MapType"));
        setField(term30044, term30044.getClass(), "_class", term30080);
        term30116 = Class.forName((String) "java.nio.charset.IllegalCharsetNameException");
        term30208 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.MapType"));
        setIntField(term30208, term30208.getClass(), "_hash", 0);
        term30314 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.CollectionType"));
        setIntField(term30314, term30314.getClass(), "_hash", 0);
        Class<? extends Object> term30667 = Class.forName((String) "com.fasterxml.jackson.databind.util.package-info");
        term30661 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.MapType"));
        Object term30662 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.MapType"));
        Object term30663 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.CollectionType"));
        Object term30664 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.TypeBindings"));
        Object[] term30665 = (Object[]) newArray("java.lang.String", 0);
        Object[] term30666 = (Object[]) newArray("com.fasterxml.jackson.databind.JavaType", 0);
        setField(term30662, term30662.getClass(), "_keyType", null);
        setField(term30662, term30662.getClass(), "_valueType", null);
        setField(term30662, term30662.getClass(), "_superClass", null);
        setField(term30662, term30662.getClass(), "_superInterfaces", null);
        setField(term30662, term30662.getClass(), "_bindings", null);
        setField(term30662, term30662.getClass(), "_canonicalName", null);
        setField(term30662, term30662.getClass(), "_class", null);
        setIntField(term30662, term30662.getClass(), "_hash", 0);
        setField(term30662, term30662.getClass(), "_valueHandler", null);
        setField(term30662, term30662.getClass(), "_typeHandler", null);
        setBooleanField(term30662, term30662.getClass(), "_asStatic", false);
        setField(term30661, term30661.getClass(), "_keyType", term30662);
        setField(term30663, term30663.getClass(), "_elementType", null);
        setField(term30663, term30663.getClass(), "_superClass", null);
        setField(term30663, term30663.getClass(), "_superInterfaces", null);
        setField(term30663, term30663.getClass(), "_bindings", null);
        setField(term30663, term30663.getClass(), "_canonicalName", null);
        setField(term30663, term30663.getClass(), "_class", null);
        setIntField(term30663, term30663.getClass(), "_hash", 0);
        setField(term30663, term30663.getClass(), "_valueHandler", null);
        setField(term30663, term30663.getClass(), "_typeHandler", null);
        setBooleanField(term30663, term30663.getClass(), "_asStatic", false);
        setField(term30661, term30661.getClass(), "_valueType", term30663);
        setField(term30661, term30661.getClass(), "_superClass", null);
        setField(term30661, term30661.getClass(), "_superInterfaces", null);
        setField(term30664, term30664.getClass(), "_names", term30665);
        setField(term30664, term30664.getClass(), "_types", term30666);
        setField(term30664, term30664.getClass(), "_unboundVariables", null);
        setIntField(term30664, term30664.getClass(), "_hashCode", 1);
        setField(term30661, term30661.getClass(), "_bindings", term30664);
        setField(term30661, term30661.getClass(), "_canonicalName", null);
        setField(term30661, term30661.getClass(), "_class", term30667);
        setIntField(term30661, term30661.getClass(), "_hash", -54581694);
        setField(term30661, term30661.getClass(), "_valueHandler", null);
        setField(term30661, term30661.getClass(), "_typeHandler", null);
        setBooleanField(term30661, term30661.getClass(), "_asStatic", false);
        term30686 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.MapType"));
        setField(term30686, term30686.getClass(), "_keyType", null);
        setField(term30686, term30686.getClass(), "_valueType", null);
        setField(term30686, term30686.getClass(), "_superClass", null);
        setField(term30686, term30686.getClass(), "_superInterfaces", null);
        setField(term30686, term30686.getClass(), "_bindings", null);
        setField(term30686, term30686.getClass(), "_canonicalName", null);
        setField(term30686, term30686.getClass(), "_class", null);
        setIntField(term30686, term30686.getClass(), "_hash", 0);
        setField(term30686, term30686.getClass(), "_valueHandler", null);
        setField(term30686, term30686.getClass(), "_typeHandler", null);
        setBooleanField(term30686, term30686.getClass(), "_asStatic", false);
        term30687 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.CollectionType"));
        setField(term30687, term30687.getClass(), "_elementType", null);
        setField(term30687, term30687.getClass(), "_superClass", null);
        setField(term30687, term30687.getClass(), "_superInterfaces", null);
        setField(term30687, term30687.getClass(), "_bindings", null);
        setField(term30687, term30687.getClass(), "_canonicalName", null);
        setField(term30687, term30687.getClass(), "_class", null);
        setIntField(term30687, term30687.getClass(), "_hash", 0);
        setField(term30687, term30687.getClass(), "_valueHandler", null);
        setField(term30687, term30687.getClass(), "_typeHandler", null);
        setBooleanField(term30687, term30687.getClass(), "_asStatic", false);
        term30688 = Class.forName((String) "com.fasterxml.jackson.databind.util.package-info");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.fasterxml.jackson.databind.type.MapType");
        Class<?>[] argTypes = new Class<?>[9];
        argTypes[0] = Class.forName("java.lang.Class");
        argTypes[1] = Class.forName("com.fasterxml.jackson.databind.type.TypeBindings");
        argTypes[2] = Class.forName("com.fasterxml.jackson.databind.JavaType");
        argTypes[3] = Array.newInstance(Class.forName("com.fasterxml.jackson.databind.JavaType"), 0).getClass();
        argTypes[4] = Class.forName("com.fasterxml.jackson.databind.JavaType");
        argTypes[5] = Class.forName("com.fasterxml.jackson.databind.JavaType");
        argTypes[6] = Class.forName("java.lang.Object");
        argTypes[7] = Class.forName("java.lang.Object");
        argTypes[8] = boolean.class;
        Object[] args = new Object[9];
        args[0] = term30116;
        args[1] = null;
        args[2] = null;
        args[3] = null;
        args[4] = term30208;
        args[5] = term30314;
        args[6] = null;
        args[7] = null;
        args[8] = false;
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term30661));
        assertTrue(recursiveEquals(term30116, term30686));
        assertTrue(recursiveEquals(term30208, null));
        assertTrue(recursiveEquals(term30314, false));
    }

};


