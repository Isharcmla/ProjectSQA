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

public class MapLikeType_init_1153958894133 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term37550;
     Object term37642;
     Object term37748;
     Object term38563;
     Object term38588;
     Object term38589;
     Object term38590;

    public MapLikeType_init_1153958894133() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term37514 = Class.forName((String) "java.lang.module.ModuleReference");
        Object term37478 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.MapLikeType"));
        setField(term37478, term37478.getClass(), "_class", term37514);
        term37550 = Class.forName((String) "kex.java.lang.System");
        term37642 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.MapType"));
        setIntField(term37642, term37642.getClass(), "_hash", 0);
        term37748 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.CollectionType"));
        setIntField(term37748, term37748.getClass(), "_hash", 0);
        Class<? extends Object> term38569 = Class.forName((String) "com.fasterxml.jackson.databind.deser.std.ByteBufferDeserializer");
        term38563 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.MapLikeType"));
        Object term38564 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.MapType"));
        Object term38565 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.CollectionType"));
        Object term38566 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.TypeBindings"));
        Object[] term38567 = (Object[]) newArray("java.lang.String", 0);
        Object[] term38568 = (Object[]) newArray("com.fasterxml.jackson.databind.JavaType", 0);
        setField(term38564, term38564.getClass(), "_keyType", null);
        setField(term38564, term38564.getClass(), "_valueType", null);
        setField(term38564, term38564.getClass(), "_superClass", null);
        setField(term38564, term38564.getClass(), "_superInterfaces", null);
        setField(term38564, term38564.getClass(), "_bindings", null);
        setField(term38564, term38564.getClass(), "_canonicalName", null);
        setField(term38564, term38564.getClass(), "_class", null);
        setIntField(term38564, term38564.getClass(), "_hash", 0);
        setField(term38564, term38564.getClass(), "_valueHandler", null);
        setField(term38564, term38564.getClass(), "_typeHandler", null);
        setBooleanField(term38564, term38564.getClass(), "_asStatic", false);
        setField(term38563, term38563.getClass(), "_keyType", term38564);
        setField(term38565, term38565.getClass(), "_elementType", null);
        setField(term38565, term38565.getClass(), "_superClass", null);
        setField(term38565, term38565.getClass(), "_superInterfaces", null);
        setField(term38565, term38565.getClass(), "_bindings", null);
        setField(term38565, term38565.getClass(), "_canonicalName", null);
        setField(term38565, term38565.getClass(), "_class", null);
        setIntField(term38565, term38565.getClass(), "_hash", 0);
        setField(term38565, term38565.getClass(), "_valueHandler", null);
        setField(term38565, term38565.getClass(), "_typeHandler", null);
        setBooleanField(term38565, term38565.getClass(), "_asStatic", false);
        setField(term38563, term38563.getClass(), "_valueType", term38565);
        setField(term38563, term38563.getClass(), "_superClass", null);
        setField(term38563, term38563.getClass(), "_superInterfaces", null);
        setField(term38566, term38566.getClass(), "_names", term38567);
        setField(term38566, term38566.getClass(), "_types", term38568);
        setField(term38566, term38566.getClass(), "_unboundVariables", null);
        setIntField(term38566, term38566.getClass(), "_hashCode", 1);
        setField(term38563, term38563.getClass(), "_bindings", term38566);
        setField(term38563, term38563.getClass(), "_canonicalName", null);
        setField(term38563, term38563.getClass(), "_class", term38569);
        setIntField(term38563, term38563.getClass(), "_hash", 1148656532);
        setField(term38563, term38563.getClass(), "_valueHandler", null);
        setField(term38563, term38563.getClass(), "_typeHandler", null);
        setBooleanField(term38563, term38563.getClass(), "_asStatic", false);
        term38588 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.MapType"));
        setField(term38588, term38588.getClass(), "_keyType", null);
        setField(term38588, term38588.getClass(), "_valueType", null);
        setField(term38588, term38588.getClass(), "_superClass", null);
        setField(term38588, term38588.getClass(), "_superInterfaces", null);
        setField(term38588, term38588.getClass(), "_bindings", null);
        setField(term38588, term38588.getClass(), "_canonicalName", null);
        setField(term38588, term38588.getClass(), "_class", null);
        setIntField(term38588, term38588.getClass(), "_hash", 0);
        setField(term38588, term38588.getClass(), "_valueHandler", null);
        setField(term38588, term38588.getClass(), "_typeHandler", null);
        setBooleanField(term38588, term38588.getClass(), "_asStatic", false);
        term38589 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.CollectionType"));
        setField(term38589, term38589.getClass(), "_elementType", null);
        setField(term38589, term38589.getClass(), "_superClass", null);
        setField(term38589, term38589.getClass(), "_superInterfaces", null);
        setField(term38589, term38589.getClass(), "_bindings", null);
        setField(term38589, term38589.getClass(), "_canonicalName", null);
        setField(term38589, term38589.getClass(), "_class", null);
        setIntField(term38589, term38589.getClass(), "_hash", 0);
        setField(term38589, term38589.getClass(), "_valueHandler", null);
        setField(term38589, term38589.getClass(), "_typeHandler", null);
        setBooleanField(term38589, term38589.getClass(), "_asStatic", false);
        term38590 = Class.forName((String) "com.fasterxml.jackson.databind.deser.std.ByteBufferDeserializer");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.fasterxml.jackson.databind.type.MapLikeType");
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
        args[0] = term37550;
        args[1] = null;
        args[2] = null;
        args[3] = null;
        args[4] = term37642;
        args[5] = term37748;
        args[6] = null;
        args[7] = null;
        args[8] = false;
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term38563));
        assertTrue(recursiveEquals(term37550, term38588));
        assertTrue(recursiveEquals(term37642, null));
        assertTrue(recursiveEquals(term37748, false));
    }

};


