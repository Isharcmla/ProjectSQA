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

public class MapType_init_1937319099237 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term94809;
     Object term94915;
     Object term95019;
     Object term97222;
     Object term97247;
     Object term97248;
     Object term97249;

    public MapType_init_1937319099237() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term94773 = Class.forName((String) "java.lang.invoke.VarHandleLongs$FieldInstanceReadWrite");
        Object term94737 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.MapType"));
        setField(term94737, term94737.getClass(), "_class", term94773);
        term94809 = Class.forName((String) "java.math.MathContext");
        term94915 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.CollectionType"));
        setIntField(term94915, term94915.getClass(), "_hash", 0);
        term95019 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ReferenceType"));
        setIntField(term95019, term95019.getClass(), "_hash", 0);
        Class<? extends Object> term97228 = Class.forName((String) "com.fasterxml.jackson.core.sym.Name");
        term97222 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.MapType"));
        Object term97223 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.CollectionType"));
        Object term97224 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ReferenceType"));
        Object term97225 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.TypeBindings"));
        Object[] term97226 = (Object[]) newArray("java.lang.String", 0);
        Object[] term97227 = (Object[]) newArray("com.fasterxml.jackson.databind.JavaType", 0);
        setField(term97223, term97223.getClass(), "_elementType", null);
        setField(term97223, term97223.getClass(), "_superClass", null);
        setField(term97223, term97223.getClass(), "_superInterfaces", null);
        setField(term97223, term97223.getClass(), "_bindings", null);
        setField(term97223, term97223.getClass(), "_canonicalName", null);
        setField(term97223, term97223.getClass(), "_class", null);
        setIntField(term97223, term97223.getClass(), "_hash", 0);
        setField(term97223, term97223.getClass(), "_valueHandler", null);
        setField(term97223, term97223.getClass(), "_typeHandler", null);
        setBooleanField(term97223, term97223.getClass(), "_asStatic", false);
        setField(term97222, term97222.getClass(), "_keyType", term97223);
        setField(term97224, term97224.getClass(), "_referencedType", null);
        setField(term97224, term97224.getClass(), "_superClass", null);
        setField(term97224, term97224.getClass(), "_superInterfaces", null);
        setField(term97224, term97224.getClass(), "_bindings", null);
        setField(term97224, term97224.getClass(), "_canonicalName", null);
        setField(term97224, term97224.getClass(), "_class", null);
        setIntField(term97224, term97224.getClass(), "_hash", 0);
        setField(term97224, term97224.getClass(), "_valueHandler", null);
        setField(term97224, term97224.getClass(), "_typeHandler", null);
        setBooleanField(term97224, term97224.getClass(), "_asStatic", false);
        setField(term97222, term97222.getClass(), "_valueType", term97224);
        setField(term97222, term97222.getClass(), "_superClass", null);
        setField(term97222, term97222.getClass(), "_superInterfaces", null);
        setField(term97225, term97225.getClass(), "_names", term97226);
        setField(term97225, term97225.getClass(), "_types", term97227);
        setField(term97225, term97225.getClass(), "_unboundVariables", null);
        setIntField(term97225, term97225.getClass(), "_hashCode", 1);
        setField(term97222, term97222.getClass(), "_bindings", term97225);
        setField(term97222, term97222.getClass(), "_canonicalName", null);
        setField(term97222, term97222.getClass(), "_class", term97228);
        setIntField(term97222, term97222.getClass(), "_hash", -74041191);
        setField(term97222, term97222.getClass(), "_valueHandler", null);
        setField(term97222, term97222.getClass(), "_typeHandler", null);
        setBooleanField(term97222, term97222.getClass(), "_asStatic", false);
        term97247 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.CollectionType"));
        setField(term97247, term97247.getClass(), "_elementType", null);
        setField(term97247, term97247.getClass(), "_superClass", null);
        setField(term97247, term97247.getClass(), "_superInterfaces", null);
        setField(term97247, term97247.getClass(), "_bindings", null);
        setField(term97247, term97247.getClass(), "_canonicalName", null);
        setField(term97247, term97247.getClass(), "_class", null);
        setIntField(term97247, term97247.getClass(), "_hash", 0);
        setField(term97247, term97247.getClass(), "_valueHandler", null);
        setField(term97247, term97247.getClass(), "_typeHandler", null);
        setBooleanField(term97247, term97247.getClass(), "_asStatic", false);
        term97248 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ReferenceType"));
        setField(term97248, term97248.getClass(), "_referencedType", null);
        setField(term97248, term97248.getClass(), "_superClass", null);
        setField(term97248, term97248.getClass(), "_superInterfaces", null);
        setField(term97248, term97248.getClass(), "_bindings", null);
        setField(term97248, term97248.getClass(), "_canonicalName", null);
        setField(term97248, term97248.getClass(), "_class", null);
        setIntField(term97248, term97248.getClass(), "_hash", 0);
        setField(term97248, term97248.getClass(), "_valueHandler", null);
        setField(term97248, term97248.getClass(), "_typeHandler", null);
        setBooleanField(term97248, term97248.getClass(), "_asStatic", false);
        term97249 = Class.forName((String) "com.fasterxml.jackson.core.sym.Name");
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
        args[0] = term94809;
        args[1] = null;
        args[2] = null;
        args[3] = null;
        args[4] = term94915;
        args[5] = term95019;
        args[6] = null;
        args[7] = null;
        args[8] = false;
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term97222));
        assertTrue(recursiveEquals(term94809, term97247));
        assertTrue(recursiveEquals(term94915, null));
        assertTrue(recursiveEquals(term95019, false));
    }

};


