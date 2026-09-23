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

public class CollectionLikeType_init_124091301103 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term26212;
     Object term26316;
     Object term27840;
     Object term27864;
     Object term27865;

    public CollectionLikeType_init_124091301103() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term26176 = Class.forName((String) "com.fasterxml.jackson.databind.ser.std.EnumSerializer");
        Object term26140 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.CollectionLikeType"));
        setField(term26140, term26140.getClass(), "_class", term26176);
        term26212 = Class.forName((String) "com.fasterxml.jackson.databind.deser.DeserializerCache");
        term26316 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ReferenceType"));
        setIntField(term26316, term26316.getClass(), "_hash", 0);
        Class<? extends Object> term27845 = Class.forName((String) "com.fasterxml.jackson.databind.deser.std.ContainerDeserializerBase");
        term27840 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.CollectionLikeType"));
        Object term27841 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ReferenceType"));
        Object term27842 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.TypeBindings"));
        Object[] term27843 = (Object[]) newArray("java.lang.String", 0);
        Object[] term27844 = (Object[]) newArray("com.fasterxml.jackson.databind.JavaType", 0);
        setField(term27841, term27841.getClass(), "_referencedType", null);
        setField(term27841, term27841.getClass(), "_anchorType", null);
        setField(term27841, term27841.getClass(), "_superClass", null);
        setField(term27841, term27841.getClass(), "_superInterfaces", null);
        setField(term27841, term27841.getClass(), "_bindings", null);
        setField(term27841, term27841.getClass(), "_canonicalName", null);
        setField(term27841, term27841.getClass(), "_class", null);
        setIntField(term27841, term27841.getClass(), "_hash", 0);
        setField(term27841, term27841.getClass(), "_valueHandler", null);
        setField(term27841, term27841.getClass(), "_typeHandler", null);
        setBooleanField(term27841, term27841.getClass(), "_asStatic", false);
        setField(term27840, term27840.getClass(), "_elementType", term27841);
        setField(term27840, term27840.getClass(), "_superClass", null);
        setField(term27840, term27840.getClass(), "_superInterfaces", null);
        setField(term27842, term27842.getClass(), "_names", term27843);
        setField(term27842, term27842.getClass(), "_types", term27844);
        setField(term27842, term27842.getClass(), "_unboundVariables", null);
        setIntField(term27842, term27842.getClass(), "_hashCode", 1);
        setField(term27840, term27840.getClass(), "_bindings", term27842);
        setField(term27840, term27840.getClass(), "_canonicalName", null);
        setField(term27840, term27840.getClass(), "_class", term27845);
        setIntField(term27840, term27840.getClass(), "_hash", 116249356);
        setField(term27840, term27840.getClass(), "_valueHandler", null);
        setField(term27840, term27840.getClass(), "_typeHandler", null);
        setBooleanField(term27840, term27840.getClass(), "_asStatic", false);
        term27864 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ReferenceType"));
        setField(term27864, term27864.getClass(), "_referencedType", null);
        setField(term27864, term27864.getClass(), "_anchorType", null);
        setField(term27864, term27864.getClass(), "_superClass", null);
        setField(term27864, term27864.getClass(), "_superInterfaces", null);
        setField(term27864, term27864.getClass(), "_bindings", null);
        setField(term27864, term27864.getClass(), "_canonicalName", null);
        setField(term27864, term27864.getClass(), "_class", null);
        setIntField(term27864, term27864.getClass(), "_hash", 0);
        setField(term27864, term27864.getClass(), "_valueHandler", null);
        setField(term27864, term27864.getClass(), "_typeHandler", null);
        setBooleanField(term27864, term27864.getClass(), "_asStatic", false);
        term27865 = Class.forName((String) "com.fasterxml.jackson.databind.deser.std.ContainerDeserializerBase");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.fasterxml.jackson.databind.type.CollectionLikeType");
        Class<?>[] argTypes = new Class<?>[8];
        argTypes[0] = Class.forName("java.lang.Class");
        argTypes[1] = Class.forName("com.fasterxml.jackson.databind.type.TypeBindings");
        argTypes[2] = Class.forName("com.fasterxml.jackson.databind.JavaType");
        argTypes[3] = Array.newInstance(Class.forName("com.fasterxml.jackson.databind.JavaType"), 0).getClass();
        argTypes[4] = Class.forName("com.fasterxml.jackson.databind.JavaType");
        argTypes[5] = Class.forName("java.lang.Object");
        argTypes[6] = Class.forName("java.lang.Object");
        argTypes[7] = boolean.class;
        Object[] args = new Object[8];
        args[0] = term26212;
        args[1] = null;
        args[2] = null;
        args[3] = null;
        args[4] = term26316;
        args[5] = null;
        args[6] = null;
        args[7] = false;
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term27840));
        assertTrue(recursiveEquals(term26212, term27864));
        assertTrue(recursiveEquals(term26316, false));
    }

};


