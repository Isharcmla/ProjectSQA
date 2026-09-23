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

public class TypeBindings_init_352540534401 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term145681;
     Object term145682;
     Object term146194;
     Object term146200;
     Object term146201;

    public TypeBindings_init_352540534401() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term145837 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.TypeBindings"));
        Object[] term145686 = (Object[]) newArray("java.lang.String", 0);
        setField(term145837, term145837.getClass(), "_names", term145686);
        setField(term145837, term145837.getClass(), "_types", null);
        term145681 = (Object[]) newArray("java.lang.String", 3);
        term145682 = (Object[]) newArray("com.fasterxml.jackson.databind.JavaType", 3);
        Object term145943 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.CollectionType"));
        Object term146039 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ArrayType"));
        Object term146159 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ResolvedRecursiveType"));
        setIntField(term145943, term145943.getClass(), "_hash", 0);
        setElement(term145682, 0, term145943);
        setIntField(term146039, term146039.getClass(), "_hash", 0);
        setElement(term145682, 1, term146039);
        setElement(term145682, 2, term146159);
        term146194 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.TypeBindings"));
        Object[] term146195 = (Object[]) newArray("java.lang.String", 3);
        Object[] term146196 = (Object[]) newArray("com.fasterxml.jackson.databind.JavaType", 3);
        Object term146197 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.CollectionType"));
        Object term146198 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ArrayType"));
        Object term146199 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ResolvedRecursiveType"));
        setField(term146194, term146194.getClass(), "_names", term146195);
        setField(term146197, term146197.getClass(), "_elementType", null);
        setField(term146197, term146197.getClass(), "_superClass", null);
        setField(term146197, term146197.getClass(), "_superInterfaces", null);
        setField(term146197, term146197.getClass(), "_bindings", null);
        setField(term146197, term146197.getClass(), "_canonicalName", null);
        setField(term146197, term146197.getClass(), "_class", null);
        setIntField(term146197, term146197.getClass(), "_hash", 0);
        setField(term146197, term146197.getClass(), "_valueHandler", null);
        setField(term146197, term146197.getClass(), "_typeHandler", null);
        setBooleanField(term146197, term146197.getClass(), "_asStatic", false);
        setElement(term146196, 0, term146197);
        setField(term146198, term146198.getClass(), "_componentType", null);
        setField(term146198, term146198.getClass(), "_emptyArray", null);
        setField(term146198, term146198.getClass(), "_superClass", null);
        setField(term146198, term146198.getClass(), "_superInterfaces", null);
        setField(term146198, term146198.getClass(), "_bindings", null);
        setField(term146198, term146198.getClass(), "_canonicalName", null);
        setField(term146198, term146198.getClass(), "_class", null);
        setIntField(term146198, term146198.getClass(), "_hash", 0);
        setField(term146198, term146198.getClass(), "_valueHandler", null);
        setField(term146198, term146198.getClass(), "_typeHandler", null);
        setBooleanField(term146198, term146198.getClass(), "_asStatic", false);
        setElement(term146196, 1, term146198);
        setField(term146199, term146199.getClass(), "_referencedType", null);
        setField(term146199, term146199.getClass(), "_superClass", null);
        setField(term146199, term146199.getClass(), "_superInterfaces", null);
        setField(term146199, term146199.getClass(), "_bindings", null);
        setField(term146199, term146199.getClass(), "_canonicalName", null);
        setField(term146199, term146199.getClass(), "_class", null);
        setIntField(term146199, term146199.getClass(), "_hash", 0);
        setField(term146199, term146199.getClass(), "_valueHandler", null);
        setField(term146199, term146199.getClass(), "_typeHandler", null);
        setBooleanField(term146199, term146199.getClass(), "_asStatic", false);
        setElement(term146196, 2, term146199);
        setField(term146194, term146194.getClass(), "_types", term146196);
        setField(term146194, term146194.getClass(), "_unboundVariables", null);
        setIntField(term146194, term146194.getClass(), "_hashCode", 1);
        term146200 = (Object[]) newArray("java.lang.String", 3);
        term146201 = (Object[]) newArray("com.fasterxml.jackson.databind.JavaType", 3);
        Object term146202 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.CollectionType"));
        Object term146203 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ArrayType"));
        Object term146204 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ResolvedRecursiveType"));
        setField(term146202, term146202.getClass(), "_elementType", null);
        setField(term146202, term146202.getClass(), "_superClass", null);
        setField(term146202, term146202.getClass(), "_superInterfaces", null);
        setField(term146202, term146202.getClass(), "_bindings", null);
        setField(term146202, term146202.getClass(), "_canonicalName", null);
        setField(term146202, term146202.getClass(), "_class", null);
        setIntField(term146202, term146202.getClass(), "_hash", 0);
        setField(term146202, term146202.getClass(), "_valueHandler", null);
        setField(term146202, term146202.getClass(), "_typeHandler", null);
        setBooleanField(term146202, term146202.getClass(), "_asStatic", false);
        setElement(term146201, 0, term146202);
        setField(term146203, term146203.getClass(), "_componentType", null);
        setField(term146203, term146203.getClass(), "_emptyArray", null);
        setField(term146203, term146203.getClass(), "_superClass", null);
        setField(term146203, term146203.getClass(), "_superInterfaces", null);
        setField(term146203, term146203.getClass(), "_bindings", null);
        setField(term146203, term146203.getClass(), "_canonicalName", null);
        setField(term146203, term146203.getClass(), "_class", null);
        setIntField(term146203, term146203.getClass(), "_hash", 0);
        setField(term146203, term146203.getClass(), "_valueHandler", null);
        setField(term146203, term146203.getClass(), "_typeHandler", null);
        setBooleanField(term146203, term146203.getClass(), "_asStatic", false);
        setElement(term146201, 1, term146203);
        setField(term146204, term146204.getClass(), "_referencedType", null);
        setField(term146204, term146204.getClass(), "_superClass", null);
        setField(term146204, term146204.getClass(), "_superInterfaces", null);
        setField(term146204, term146204.getClass(), "_bindings", null);
        setField(term146204, term146204.getClass(), "_canonicalName", null);
        setField(term146204, term146204.getClass(), "_class", null);
        setIntField(term146204, term146204.getClass(), "_hash", 0);
        setField(term146204, term146204.getClass(), "_valueHandler", null);
        setField(term146204, term146204.getClass(), "_typeHandler", null);
        setBooleanField(term146204, term146204.getClass(), "_asStatic", false);
        setElement(term146201, 2, term146204);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.fasterxml.jackson.databind.type.TypeBindings");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Array.newInstance(Class.forName("java.lang.String"), 0).getClass();
        argTypes[1] = Array.newInstance(Class.forName("com.fasterxml.jackson.databind.JavaType"), 0).getClass();
        argTypes[2] = Array.newInstance(Class.forName("java.lang.String"), 0).getClass();
        Object[] args = new Object[3];
        args[0] = term145681;
        args[1] = term145682;
        args[2] = null;
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term146194));
        assertTrue(recursiveEquals(term145681, term146200));
        assertTrue(recursiveEquals(term145682, term146201));
    }

};


