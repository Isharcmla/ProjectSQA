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

public class MapLikeType_init_1153958894202 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term83579;
     Object term83699;
     Object term83803;
     Object term84059;
     Object term84084;
     Object term84085;
     Object term84086;

    public MapLikeType_init_1153958894202() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term83543 = Class.forName((String) "java.util.stream.ForEachOps$ForEachOp$OfRef");
        Object term83507 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.MapLikeType"));
        setField(term83507, term83507.getClass(), "_class", term83543);
        term83579 = Class.forName((String) "java.util.stream.ReduceOps$3");
        term83699 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ResolvedRecursiveType"));
        setIntField(term83699, term83699.getClass(), "_hash", 0);
        term83803 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ReferenceType"));
        setIntField(term83803, term83803.getClass(), "_hash", 0);
        Class<? extends Object> term84065 = Class.forName((String) "kex.java.util.HashSet");
        term84059 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.MapLikeType"));
        Object term84060 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ResolvedRecursiveType"));
        Object term84061 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ReferenceType"));
        Object term84062 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.TypeBindings"));
        Object[] term84063 = (Object[]) newArray("java.lang.String", 0);
        Object[] term84064 = (Object[]) newArray("com.fasterxml.jackson.databind.JavaType", 0);
        setField(term84060, term84060.getClass(), "_referencedType", null);
        setField(term84060, term84060.getClass(), "_superClass", null);
        setField(term84060, term84060.getClass(), "_superInterfaces", null);
        setField(term84060, term84060.getClass(), "_bindings", null);
        setField(term84060, term84060.getClass(), "_canonicalName", null);
        setField(term84060, term84060.getClass(), "_class", null);
        setIntField(term84060, term84060.getClass(), "_hash", 0);
        setField(term84060, term84060.getClass(), "_valueHandler", null);
        setField(term84060, term84060.getClass(), "_typeHandler", null);
        setBooleanField(term84060, term84060.getClass(), "_asStatic", false);
        setField(term84059, term84059.getClass(), "_keyType", term84060);
        setField(term84061, term84061.getClass(), "_referencedType", null);
        setField(term84061, term84061.getClass(), "_anchorType", null);
        setField(term84061, term84061.getClass(), "_superClass", null);
        setField(term84061, term84061.getClass(), "_superInterfaces", null);
        setField(term84061, term84061.getClass(), "_bindings", null);
        setField(term84061, term84061.getClass(), "_canonicalName", null);
        setField(term84061, term84061.getClass(), "_class", null);
        setIntField(term84061, term84061.getClass(), "_hash", 0);
        setField(term84061, term84061.getClass(), "_valueHandler", null);
        setField(term84061, term84061.getClass(), "_typeHandler", null);
        setBooleanField(term84061, term84061.getClass(), "_asStatic", false);
        setField(term84059, term84059.getClass(), "_valueType", term84061);
        setField(term84059, term84059.getClass(), "_superClass", null);
        setField(term84059, term84059.getClass(), "_superInterfaces", null);
        setField(term84062, term84062.getClass(), "_names", term84063);
        setField(term84062, term84062.getClass(), "_types", term84064);
        setField(term84062, term84062.getClass(), "_unboundVariables", null);
        setIntField(term84062, term84062.getClass(), "_hashCode", 1);
        setField(term84059, term84059.getClass(), "_bindings", term84062);
        setField(term84059, term84059.getClass(), "_canonicalName", null);
        setField(term84059, term84059.getClass(), "_class", term84065);
        setIntField(term84059, term84059.getClass(), "_hash", 222356260);
        setField(term84059, term84059.getClass(), "_valueHandler", null);
        setField(term84059, term84059.getClass(), "_typeHandler", null);
        setBooleanField(term84059, term84059.getClass(), "_asStatic", false);
        term84084 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ResolvedRecursiveType"));
        setField(term84084, term84084.getClass(), "_referencedType", null);
        setField(term84084, term84084.getClass(), "_superClass", null);
        setField(term84084, term84084.getClass(), "_superInterfaces", null);
        setField(term84084, term84084.getClass(), "_bindings", null);
        setField(term84084, term84084.getClass(), "_canonicalName", null);
        setField(term84084, term84084.getClass(), "_class", null);
        setIntField(term84084, term84084.getClass(), "_hash", 0);
        setField(term84084, term84084.getClass(), "_valueHandler", null);
        setField(term84084, term84084.getClass(), "_typeHandler", null);
        setBooleanField(term84084, term84084.getClass(), "_asStatic", false);
        term84085 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ReferenceType"));
        setField(term84085, term84085.getClass(), "_referencedType", null);
        setField(term84085, term84085.getClass(), "_anchorType", null);
        setField(term84085, term84085.getClass(), "_superClass", null);
        setField(term84085, term84085.getClass(), "_superInterfaces", null);
        setField(term84085, term84085.getClass(), "_bindings", null);
        setField(term84085, term84085.getClass(), "_canonicalName", null);
        setField(term84085, term84085.getClass(), "_class", null);
        setIntField(term84085, term84085.getClass(), "_hash", 0);
        setField(term84085, term84085.getClass(), "_valueHandler", null);
        setField(term84085, term84085.getClass(), "_typeHandler", null);
        setBooleanField(term84085, term84085.getClass(), "_asStatic", false);
        term84086 = Class.forName((String) "kex.java.util.HashSet");
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
        args[0] = term83579;
        args[1] = null;
        args[2] = null;
        args[3] = null;
        args[4] = term83699;
        args[5] = term83803;
        args[6] = null;
        args[7] = null;
        args[8] = false;
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term84059));
        assertTrue(recursiveEquals(term83579, term84084));
        assertTrue(recursiveEquals(term83699, null));
        assertTrue(recursiveEquals(term83803, false));
    }

};


