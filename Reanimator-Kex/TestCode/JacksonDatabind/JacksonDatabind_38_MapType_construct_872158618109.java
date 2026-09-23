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
import java.lang.String;
import java.lang.Object;

public class MapType_construct_872158618109 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term27053;
     Object term27145;
     Object term27249;
     Object term27642;
     Object term27643;
     Object term27644;
     Object term27476;

    public MapType_construct_872158618109() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term27053 = Class.forName((String) "com.fasterxml.jackson.databind.deser.KeyDeserializers");
        term27145 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.MapType"));
        setIntField(term27145, term27145.getClass(), "_hash", 0);
        term27249 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ReferenceType"));
        setIntField(term27249, term27249.getClass(), "_hash", 0);
        term27642 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.MapType"));
        setField(term27642, term27642.getClass(), "_keyType", null);
        setField(term27642, term27642.getClass(), "_valueType", null);
        setField(term27642, term27642.getClass(), "_superClass", null);
        setField(term27642, term27642.getClass(), "_superInterfaces", null);
        setField(term27642, term27642.getClass(), "_bindings", null);
        setField(term27642, term27642.getClass(), "_canonicalName", null);
        setField(term27642, term27642.getClass(), "_class", null);
        setIntField(term27642, term27642.getClass(), "_hash", 0);
        setField(term27642, term27642.getClass(), "_valueHandler", null);
        setField(term27642, term27642.getClass(), "_typeHandler", null);
        setBooleanField(term27642, term27642.getClass(), "_asStatic", false);
        term27643 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ReferenceType"));
        setField(term27643, term27643.getClass(), "_referencedType", null);
        setField(term27643, term27643.getClass(), "_superClass", null);
        setField(term27643, term27643.getClass(), "_superInterfaces", null);
        setField(term27643, term27643.getClass(), "_bindings", null);
        setField(term27643, term27643.getClass(), "_canonicalName", null);
        setField(term27643, term27643.getClass(), "_class", null);
        setIntField(term27643, term27643.getClass(), "_hash", 0);
        setField(term27643, term27643.getClass(), "_valueHandler", null);
        setField(term27643, term27643.getClass(), "_typeHandler", null);
        setBooleanField(term27643, term27643.getClass(), "_asStatic", false);
        term27644 = Class.forName((String) "com.fasterxml.jackson.databind.deser.impl.PropertyBasedObjectIdGenerator");
        Class<? extends Object> term27481 = Class.forName((String) "com.fasterxml.jackson.databind.deser.impl.PropertyBasedObjectIdGenerator");
        term27476 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.MapType"));
        Object term27469 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.MapType"));
        Object term27473 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ReferenceType"));
        Object term27477 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.TypeBindings"));
        Object[] term27478 = (Object[]) newArray("java.lang.String", 0);
        Object[] term27479 = (Object[]) newArray("com.fasterxml.jackson.databind.JavaType", 0);
        setField(term27469, term27469.getClass(), "_keyType", null);
        setField(term27469, term27469.getClass(), "_valueType", null);
        setField(term27469, term27469.getClass(), "_superClass", null);
        setField(term27469, term27469.getClass(), "_superInterfaces", null);
        setField(term27469, term27469.getClass(), "_bindings", null);
        setField(term27469, term27469.getClass(), "_canonicalName", null);
        setField(term27469, term27469.getClass(), "_class", null);
        setIntField(term27469, term27469.getClass(), "_hash", 0);
        setField(term27469, term27469.getClass(), "_valueHandler", null);
        setField(term27469, term27469.getClass(), "_typeHandler", null);
        setBooleanField(term27469, term27469.getClass(), "_asStatic", false);
        setField(term27476, term27476.getClass(), "_keyType", term27469);
        setField(term27473, term27473.getClass(), "_referencedType", null);
        setField(term27473, term27473.getClass(), "_superClass", null);
        setField(term27473, term27473.getClass(), "_superInterfaces", null);
        setField(term27473, term27473.getClass(), "_bindings", null);
        setField(term27473, term27473.getClass(), "_canonicalName", null);
        setField(term27473, term27473.getClass(), "_class", null);
        setIntField(term27473, term27473.getClass(), "_hash", 0);
        setField(term27473, term27473.getClass(), "_valueHandler", null);
        setField(term27473, term27473.getClass(), "_typeHandler", null);
        setBooleanField(term27473, term27473.getClass(), "_asStatic", false);
        setField(term27476, term27476.getClass(), "_valueType", term27473);
        setField(term27476, term27476.getClass(), "_superClass", null);
        setField(term27476, term27476.getClass(), "_superInterfaces", null);
        setField(term27477, term27477.getClass(), "_names", term27478);
        setField(term27477, term27477.getClass(), "_types", term27479);
        setField(term27477, term27477.getClass(), "_unboundVariables", null);
        setIntField(term27477, term27477.getClass(), "_hashCode", 1);
        setField(term27476, term27476.getClass(), "_bindings", term27477);
        setField(term27476, term27476.getClass(), "_canonicalName", null);
        setField(term27476, term27476.getClass(), "_class", term27481);
        setIntField(term27476, term27476.getClass(), "_hash", 203145851);
        setField(term27476, term27476.getClass(), "_valueHandler", null);
        setField(term27476, term27476.getClass(), "_typeHandler", null);
        setBooleanField(term27476, term27476.getClass(), "_asStatic", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.fasterxml.jackson.databind.type.MapType");
        Class<?>[] argTypes = new Class<?>[6];
        argTypes[0] = Class.forName("java.lang.Class");
        argTypes[1] = Class.forName("com.fasterxml.jackson.databind.type.TypeBindings");
        argTypes[2] = Class.forName("com.fasterxml.jackson.databind.JavaType");
        argTypes[3] = Array.newInstance(Class.forName("com.fasterxml.jackson.databind.JavaType"), 0).getClass();
        argTypes[4] = Class.forName("com.fasterxml.jackson.databind.JavaType");
        argTypes[5] = Class.forName("com.fasterxml.jackson.databind.JavaType");
        Object[] args = new Object[6];
        args[0] = term27053;
        args[1] = null;
        args[2] = null;
        args[3] = null;
        args[4] = term27145;
        args[5] = term27249;
        Object retValue = callMethod(klass, "construct", argTypes, null, args);
        assertTrue(recursiveEquals(term27053, term27642));
        assertTrue(recursiveEquals(term27145, null));
        assertTrue(recursiveEquals(term27249, null));
        assertTrue(recursiveEquals(retValue, term27476));
    }

};


