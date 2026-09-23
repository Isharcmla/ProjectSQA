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

public class StdTypeResolverBuilder_buildTypeSerializer_565512902378 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term406076;
     Object term406338;
     Object term408190;
     Object term408194;

    public StdTypeResolverBuilder_buildTypeSerializer_565512902378() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term408204 = Class.forName((String) "com.fasterxml.jackson.databind.ObjectMapper$DefaultTyping");
        Field term408203 = ((Class) term408204).getDeclaredField((String) "NON_CONCRETE_AND_ARRAYS");
        ((Field) term408203).setAccessible(true);
        Object enum473 = ((Field) term408203).get((Object) null);
        term406076 = newInstance(Class.forName("com.fasterxml.jackson.databind.ObjectMapper$DefaultTypeResolverBuilder"));
        setField(term406076, term406076.getClass(), "_appliesFor", enum473);
        Class<? extends Object> term406472 = Class.forName((String) "com.fasterxml.jackson.databind.deser.std.NumberDeserializers");
        term406338 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ReferenceType"));
        Object term406436 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.SimpleType"));
        setField(term406436, term406436.getClass(), "_class", term406472);
        setField(term406338, term406338.getClass(), "_referencedType", term406436);
        Class<? extends Object> term408747 = Class.forName((String) "com.fasterxml.jackson.databind.ObjectMapper$DefaultTyping");
        Field term408746 = ((Class) term408747).getDeclaredField((String) "NON_CONCRETE_AND_ARRAYS");
        ((Field) term408746).setAccessible(true);
        Object enum474 = ((Field) term408746).get((Object) null);
        term408190 = newInstance(Class.forName("com.fasterxml.jackson.databind.ObjectMapper$DefaultTypeResolverBuilder"));
        setField(term408190, term408190.getClass(), "_appliesFor", enum474);
        setField(term408190, term408190.getClass(), "_idType", null);
        setField(term408190, term408190.getClass(), "_includeAs", null);
        setField(term408190, term408190.getClass(), "_typeProperty", null);
        setBooleanField(term408190, term408190.getClass(), "_typeIdVisible", false);
        setField(term408190, term408190.getClass(), "_defaultImpl", null);
        setField(term408190, term408190.getClass(), "_customIdResolver", null);
        Class<? extends Object> term408196 = Class.forName((String) "com.fasterxml.jackson.databind.ser.BasicSerializerFactory$1");
        term408194 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ReferenceType"));
        Object term408195 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.SimpleType"));
        setField(term408195, term408195.getClass(), "_superClass", null);
        setField(term408195, term408195.getClass(), "_superInterfaces", null);
        setField(term408195, term408195.getClass(), "_bindings", null);
        setField(term408195, term408195.getClass(), "_canonicalName", null);
        setField(term408195, term408195.getClass(), "_class", term408196);
        setIntField(term408195, term408195.getClass(), "_hash", 0);
        setField(term408195, term408195.getClass(), "_valueHandler", null);
        setField(term408195, term408195.getClass(), "_typeHandler", null);
        setBooleanField(term408195, term408195.getClass(), "_asStatic", false);
        setField(term408194, term408194.getClass(), "_referencedType", term408195);
        setField(term408194, term408194.getClass(), "_anchorType", null);
        setField(term408194, term408194.getClass(), "_superClass", null);
        setField(term408194, term408194.getClass(), "_superInterfaces", null);
        setField(term408194, term408194.getClass(), "_bindings", null);
        setField(term408194, term408194.getClass(), "_canonicalName", null);
        setField(term408194, term408194.getClass(), "_class", null);
        setIntField(term408194, term408194.getClass(), "_hash", 0);
        setField(term408194, term408194.getClass(), "_valueHandler", null);
        setField(term408194, term408194.getClass(), "_typeHandler", null);
        setBooleanField(term408194, term408194.getClass(), "_asStatic", false);
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
        args[1] = term406338;
        args[2] = null;
        callMethod(klass, "buildTypeSerializer", argTypes, term406076, args);
        assertTrue(recursiveEquals(term406076, term408190));
        assertTrue(recursiveEquals(term406338, null));
    }

};


