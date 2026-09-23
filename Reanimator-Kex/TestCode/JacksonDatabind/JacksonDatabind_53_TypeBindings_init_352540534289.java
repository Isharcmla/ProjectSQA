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

public class TypeBindings_init_352540534289 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term95045;
     Object term95046;
     Object term95537;
     Object term95543;
     Object term95544;

    public TypeBindings_init_352540534289() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term95202 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.TypeBindings"));
        Object[] term95050 = (Object[]) newArray("java.lang.String", 0);
        Object[] term95051 = (Object[]) newArray("com.fasterxml.jackson.databind.JavaType", 0);
        setField(term95202, term95202.getClass(), "_names", term95050);
        setField(term95202, term95202.getClass(), "_types", term95051);
        term95045 = (Object[]) newArray("java.lang.String", 3);
        term95046 = (Object[]) newArray("com.fasterxml.jackson.databind.JavaType", 3);
        Object term95306 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ReferenceType"));
        Object term95410 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ReferenceType"));
        Object term95502 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.MapType"));
        setIntField(term95306, term95306.getClass(), "_hash", 0);
        setElement(term95046, 0, term95306);
        setIntField(term95410, term95410.getClass(), "_hash", 0);
        setElement(term95046, 1, term95410);
        setElement(term95046, 2, term95502);
        term95537 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.TypeBindings"));
        Object[] term95538 = (Object[]) newArray("java.lang.String", 3);
        Object[] term95539 = (Object[]) newArray("com.fasterxml.jackson.databind.JavaType", 3);
        Object term95540 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ReferenceType"));
        Object term95541 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ReferenceType"));
        Object term95542 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.MapType"));
        setField(term95537, term95537.getClass(), "_names", term95538);
        setField(term95540, term95540.getClass(), "_referencedType", null);
        setField(term95540, term95540.getClass(), "_superClass", null);
        setField(term95540, term95540.getClass(), "_superInterfaces", null);
        setField(term95540, term95540.getClass(), "_bindings", null);
        setField(term95540, term95540.getClass(), "_canonicalName", null);
        setField(term95540, term95540.getClass(), "_class", null);
        setIntField(term95540, term95540.getClass(), "_hash", 0);
        setField(term95540, term95540.getClass(), "_valueHandler", null);
        setField(term95540, term95540.getClass(), "_typeHandler", null);
        setBooleanField(term95540, term95540.getClass(), "_asStatic", false);
        setElement(term95539, 0, term95540);
        setField(term95541, term95541.getClass(), "_referencedType", null);
        setField(term95541, term95541.getClass(), "_superClass", null);
        setField(term95541, term95541.getClass(), "_superInterfaces", null);
        setField(term95541, term95541.getClass(), "_bindings", null);
        setField(term95541, term95541.getClass(), "_canonicalName", null);
        setField(term95541, term95541.getClass(), "_class", null);
        setIntField(term95541, term95541.getClass(), "_hash", 0);
        setField(term95541, term95541.getClass(), "_valueHandler", null);
        setField(term95541, term95541.getClass(), "_typeHandler", null);
        setBooleanField(term95541, term95541.getClass(), "_asStatic", false);
        setElement(term95539, 1, term95541);
        setField(term95542, term95542.getClass(), "_keyType", null);
        setField(term95542, term95542.getClass(), "_valueType", null);
        setField(term95542, term95542.getClass(), "_superClass", null);
        setField(term95542, term95542.getClass(), "_superInterfaces", null);
        setField(term95542, term95542.getClass(), "_bindings", null);
        setField(term95542, term95542.getClass(), "_canonicalName", null);
        setField(term95542, term95542.getClass(), "_class", null);
        setIntField(term95542, term95542.getClass(), "_hash", 0);
        setField(term95542, term95542.getClass(), "_valueHandler", null);
        setField(term95542, term95542.getClass(), "_typeHandler", null);
        setBooleanField(term95542, term95542.getClass(), "_asStatic", false);
        setElement(term95539, 2, term95542);
        setField(term95537, term95537.getClass(), "_types", term95539);
        setField(term95537, term95537.getClass(), "_unboundVariables", null);
        setIntField(term95537, term95537.getClass(), "_hashCode", 1);
        term95543 = (Object[]) newArray("java.lang.String", 3);
        term95544 = (Object[]) newArray("com.fasterxml.jackson.databind.JavaType", 3);
        Object term95545 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ReferenceType"));
        Object term95546 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ReferenceType"));
        Object term95547 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.MapType"));
        setField(term95545, term95545.getClass(), "_referencedType", null);
        setField(term95545, term95545.getClass(), "_superClass", null);
        setField(term95545, term95545.getClass(), "_superInterfaces", null);
        setField(term95545, term95545.getClass(), "_bindings", null);
        setField(term95545, term95545.getClass(), "_canonicalName", null);
        setField(term95545, term95545.getClass(), "_class", null);
        setIntField(term95545, term95545.getClass(), "_hash", 0);
        setField(term95545, term95545.getClass(), "_valueHandler", null);
        setField(term95545, term95545.getClass(), "_typeHandler", null);
        setBooleanField(term95545, term95545.getClass(), "_asStatic", false);
        setElement(term95544, 0, term95545);
        setField(term95546, term95546.getClass(), "_referencedType", null);
        setField(term95546, term95546.getClass(), "_superClass", null);
        setField(term95546, term95546.getClass(), "_superInterfaces", null);
        setField(term95546, term95546.getClass(), "_bindings", null);
        setField(term95546, term95546.getClass(), "_canonicalName", null);
        setField(term95546, term95546.getClass(), "_class", null);
        setIntField(term95546, term95546.getClass(), "_hash", 0);
        setField(term95546, term95546.getClass(), "_valueHandler", null);
        setField(term95546, term95546.getClass(), "_typeHandler", null);
        setBooleanField(term95546, term95546.getClass(), "_asStatic", false);
        setElement(term95544, 1, term95546);
        setField(term95547, term95547.getClass(), "_keyType", null);
        setField(term95547, term95547.getClass(), "_valueType", null);
        setField(term95547, term95547.getClass(), "_superClass", null);
        setField(term95547, term95547.getClass(), "_superInterfaces", null);
        setField(term95547, term95547.getClass(), "_bindings", null);
        setField(term95547, term95547.getClass(), "_canonicalName", null);
        setField(term95547, term95547.getClass(), "_class", null);
        setIntField(term95547, term95547.getClass(), "_hash", 0);
        setField(term95547, term95547.getClass(), "_valueHandler", null);
        setField(term95547, term95547.getClass(), "_typeHandler", null);
        setBooleanField(term95547, term95547.getClass(), "_asStatic", false);
        setElement(term95544, 2, term95547);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.fasterxml.jackson.databind.type.TypeBindings");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Array.newInstance(Class.forName("java.lang.String"), 0).getClass();
        argTypes[1] = Array.newInstance(Class.forName("com.fasterxml.jackson.databind.JavaType"), 0).getClass();
        argTypes[2] = Array.newInstance(Class.forName("java.lang.String"), 0).getClass();
        Object[] args = new Object[3];
        args[0] = term95045;
        args[1] = term95046;
        args[2] = null;
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term95537));
        assertTrue(recursiveEquals(term95045, term95543));
        assertTrue(recursiveEquals(term95046, term95544));
    }

};


