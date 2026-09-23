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

public class TypeBindings_init_352540534221 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term72429;
     Object term72430;
     Object term73106;
     Object term73113;
     Object term73114;

    public TypeBindings_init_352540534221() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term72598 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.TypeBindings"));
        Object[] term72435 = (Object[]) newArray("java.lang.String", 0);
        Object[] term72436 = (Object[]) newArray("com.fasterxml.jackson.databind.JavaType", 0);
        setField(term72598, term72598.getClass(), "_names", term72435);
        setField(term72598, term72598.getClass(), "_types", term72436);
        term72429 = (Object[]) newArray("java.lang.String", 4);
        term72430 = (Object[]) newArray("com.fasterxml.jackson.databind.JavaType", 4);
        Object term72718 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ResolvedRecursiveType"));
        Object term72822 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ReferenceType"));
        Object term72914 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.MapType"));
        Object term73018 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ReferenceType"));
        setIntField(term72718, term72718.getClass(), "_hash", 0);
        setElement(term72430, 0, term72718);
        setIntField(term72822, term72822.getClass(), "_hash", 0);
        setElement(term72430, 1, term72822);
        setIntField(term72914, term72914.getClass(), "_hash", 0);
        setElement(term72430, 2, term72914);
        setElement(term72430, 3, term73018);
        term73106 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.TypeBindings"));
        Object[] term73107 = (Object[]) newArray("java.lang.String", 4);
        Object[] term73108 = (Object[]) newArray("com.fasterxml.jackson.databind.JavaType", 4);
        Object term73109 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ResolvedRecursiveType"));
        Object term73110 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ReferenceType"));
        Object term73111 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.MapType"));
        Object term73112 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ReferenceType"));
        setField(term73106, term73106.getClass(), "_names", term73107);
        setField(term73109, term73109.getClass(), "_referencedType", null);
        setField(term73109, term73109.getClass(), "_superClass", null);
        setField(term73109, term73109.getClass(), "_superInterfaces", null);
        setField(term73109, term73109.getClass(), "_bindings", null);
        setField(term73109, term73109.getClass(), "_canonicalName", null);
        setField(term73109, term73109.getClass(), "_class", null);
        setIntField(term73109, term73109.getClass(), "_hash", 0);
        setField(term73109, term73109.getClass(), "_valueHandler", null);
        setField(term73109, term73109.getClass(), "_typeHandler", null);
        setBooleanField(term73109, term73109.getClass(), "_asStatic", false);
        setElement(term73108, 0, term73109);
        setField(term73110, term73110.getClass(), "_referencedType", null);
        setField(term73110, term73110.getClass(), "_superClass", null);
        setField(term73110, term73110.getClass(), "_superInterfaces", null);
        setField(term73110, term73110.getClass(), "_bindings", null);
        setField(term73110, term73110.getClass(), "_canonicalName", null);
        setField(term73110, term73110.getClass(), "_class", null);
        setIntField(term73110, term73110.getClass(), "_hash", 0);
        setField(term73110, term73110.getClass(), "_valueHandler", null);
        setField(term73110, term73110.getClass(), "_typeHandler", null);
        setBooleanField(term73110, term73110.getClass(), "_asStatic", false);
        setElement(term73108, 1, term73110);
        setField(term73111, term73111.getClass(), "_keyType", null);
        setField(term73111, term73111.getClass(), "_valueType", null);
        setField(term73111, term73111.getClass(), "_superClass", null);
        setField(term73111, term73111.getClass(), "_superInterfaces", null);
        setField(term73111, term73111.getClass(), "_bindings", null);
        setField(term73111, term73111.getClass(), "_canonicalName", null);
        setField(term73111, term73111.getClass(), "_class", null);
        setIntField(term73111, term73111.getClass(), "_hash", 0);
        setField(term73111, term73111.getClass(), "_valueHandler", null);
        setField(term73111, term73111.getClass(), "_typeHandler", null);
        setBooleanField(term73111, term73111.getClass(), "_asStatic", false);
        setElement(term73108, 2, term73111);
        setField(term73112, term73112.getClass(), "_referencedType", null);
        setField(term73112, term73112.getClass(), "_superClass", null);
        setField(term73112, term73112.getClass(), "_superInterfaces", null);
        setField(term73112, term73112.getClass(), "_bindings", null);
        setField(term73112, term73112.getClass(), "_canonicalName", null);
        setField(term73112, term73112.getClass(), "_class", null);
        setIntField(term73112, term73112.getClass(), "_hash", 0);
        setField(term73112, term73112.getClass(), "_valueHandler", null);
        setField(term73112, term73112.getClass(), "_typeHandler", null);
        setBooleanField(term73112, term73112.getClass(), "_asStatic", false);
        setElement(term73108, 3, term73112);
        setField(term73106, term73106.getClass(), "_types", term73108);
        setField(term73106, term73106.getClass(), "_unboundVariables", null);
        setIntField(term73106, term73106.getClass(), "_hashCode", 1);
        term73113 = (Object[]) newArray("java.lang.String", 4);
        term73114 = (Object[]) newArray("com.fasterxml.jackson.databind.JavaType", 4);
        Object term73115 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ResolvedRecursiveType"));
        Object term73116 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ReferenceType"));
        Object term73117 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.MapType"));
        Object term73118 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ReferenceType"));
        setField(term73115, term73115.getClass(), "_referencedType", null);
        setField(term73115, term73115.getClass(), "_superClass", null);
        setField(term73115, term73115.getClass(), "_superInterfaces", null);
        setField(term73115, term73115.getClass(), "_bindings", null);
        setField(term73115, term73115.getClass(), "_canonicalName", null);
        setField(term73115, term73115.getClass(), "_class", null);
        setIntField(term73115, term73115.getClass(), "_hash", 0);
        setField(term73115, term73115.getClass(), "_valueHandler", null);
        setField(term73115, term73115.getClass(), "_typeHandler", null);
        setBooleanField(term73115, term73115.getClass(), "_asStatic", false);
        setElement(term73114, 0, term73115);
        setField(term73116, term73116.getClass(), "_referencedType", null);
        setField(term73116, term73116.getClass(), "_superClass", null);
        setField(term73116, term73116.getClass(), "_superInterfaces", null);
        setField(term73116, term73116.getClass(), "_bindings", null);
        setField(term73116, term73116.getClass(), "_canonicalName", null);
        setField(term73116, term73116.getClass(), "_class", null);
        setIntField(term73116, term73116.getClass(), "_hash", 0);
        setField(term73116, term73116.getClass(), "_valueHandler", null);
        setField(term73116, term73116.getClass(), "_typeHandler", null);
        setBooleanField(term73116, term73116.getClass(), "_asStatic", false);
        setElement(term73114, 1, term73116);
        setField(term73117, term73117.getClass(), "_keyType", null);
        setField(term73117, term73117.getClass(), "_valueType", null);
        setField(term73117, term73117.getClass(), "_superClass", null);
        setField(term73117, term73117.getClass(), "_superInterfaces", null);
        setField(term73117, term73117.getClass(), "_bindings", null);
        setField(term73117, term73117.getClass(), "_canonicalName", null);
        setField(term73117, term73117.getClass(), "_class", null);
        setIntField(term73117, term73117.getClass(), "_hash", 0);
        setField(term73117, term73117.getClass(), "_valueHandler", null);
        setField(term73117, term73117.getClass(), "_typeHandler", null);
        setBooleanField(term73117, term73117.getClass(), "_asStatic", false);
        setElement(term73114, 2, term73117);
        setField(term73118, term73118.getClass(), "_referencedType", null);
        setField(term73118, term73118.getClass(), "_superClass", null);
        setField(term73118, term73118.getClass(), "_superInterfaces", null);
        setField(term73118, term73118.getClass(), "_bindings", null);
        setField(term73118, term73118.getClass(), "_canonicalName", null);
        setField(term73118, term73118.getClass(), "_class", null);
        setIntField(term73118, term73118.getClass(), "_hash", 0);
        setField(term73118, term73118.getClass(), "_valueHandler", null);
        setField(term73118, term73118.getClass(), "_typeHandler", null);
        setBooleanField(term73118, term73118.getClass(), "_asStatic", false);
        setElement(term73114, 3, term73118);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.fasterxml.jackson.databind.type.TypeBindings");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Array.newInstance(Class.forName("java.lang.String"), 0).getClass();
        argTypes[1] = Array.newInstance(Class.forName("com.fasterxml.jackson.databind.JavaType"), 0).getClass();
        argTypes[2] = Array.newInstance(Class.forName("java.lang.String"), 0).getClass();
        Object[] args = new Object[3];
        args[0] = term72429;
        args[1] = term72430;
        args[2] = null;
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term73106));
        assertTrue(recursiveEquals(term72429, term73113));
        assertTrue(recursiveEquals(term72430, term73114));
    }

};


