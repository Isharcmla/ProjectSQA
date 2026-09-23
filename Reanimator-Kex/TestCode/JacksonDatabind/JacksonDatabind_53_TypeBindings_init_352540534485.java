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

public class TypeBindings_init_352540534485 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term190567;
     Object term190568;
     Object term191172;
     Object term191179;
     Object term191180;

    public TypeBindings_init_352540534485() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term190733 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.TypeBindings"));
        setField(term190733, term190733.getClass(), "_names", null);
        setField(term190733, term190733.getClass(), "_types", null);
        term190567 = (Object[]) newArray("java.lang.String", 4);
        term190568 = (Object[]) newArray("com.fasterxml.jackson.databind.JavaType", 4);
        Object term190839 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.CollectionType"));
        Object term190935 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ArrayType"));
        Object term191031 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ArrayType"));
        Object term191129 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.SimpleType"));
        setIntField(term190839, term190839.getClass(), "_hash", 0);
        setElement(term190568, 0, term190839);
        setIntField(term190935, term190935.getClass(), "_hash", 0);
        setElement(term190568, 1, term190935);
        setIntField(term191031, term191031.getClass(), "_hash", 0);
        setElement(term190568, 2, term191031);
        setElement(term190568, 3, term191129);
        term191172 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.TypeBindings"));
        Object[] term191173 = (Object[]) newArray("java.lang.String", 4);
        Object[] term191174 = (Object[]) newArray("com.fasterxml.jackson.databind.JavaType", 4);
        Object term191175 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.CollectionType"));
        Object term191176 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ArrayType"));
        Object term191177 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ArrayType"));
        Object term191178 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.SimpleType"));
        setField(term191172, term191172.getClass(), "_names", term191173);
        setField(term191175, term191175.getClass(), "_elementType", null);
        setField(term191175, term191175.getClass(), "_superClass", null);
        setField(term191175, term191175.getClass(), "_superInterfaces", null);
        setField(term191175, term191175.getClass(), "_bindings", null);
        setField(term191175, term191175.getClass(), "_canonicalName", null);
        setField(term191175, term191175.getClass(), "_class", null);
        setIntField(term191175, term191175.getClass(), "_hash", 0);
        setField(term191175, term191175.getClass(), "_valueHandler", null);
        setField(term191175, term191175.getClass(), "_typeHandler", null);
        setBooleanField(term191175, term191175.getClass(), "_asStatic", false);
        setElement(term191174, 0, term191175);
        setField(term191176, term191176.getClass(), "_componentType", null);
        setField(term191176, term191176.getClass(), "_emptyArray", null);
        setField(term191176, term191176.getClass(), "_superClass", null);
        setField(term191176, term191176.getClass(), "_superInterfaces", null);
        setField(term191176, term191176.getClass(), "_bindings", null);
        setField(term191176, term191176.getClass(), "_canonicalName", null);
        setField(term191176, term191176.getClass(), "_class", null);
        setIntField(term191176, term191176.getClass(), "_hash", 0);
        setField(term191176, term191176.getClass(), "_valueHandler", null);
        setField(term191176, term191176.getClass(), "_typeHandler", null);
        setBooleanField(term191176, term191176.getClass(), "_asStatic", false);
        setElement(term191174, 1, term191176);
        setField(term191177, term191177.getClass(), "_componentType", null);
        setField(term191177, term191177.getClass(), "_emptyArray", null);
        setField(term191177, term191177.getClass(), "_superClass", null);
        setField(term191177, term191177.getClass(), "_superInterfaces", null);
        setField(term191177, term191177.getClass(), "_bindings", null);
        setField(term191177, term191177.getClass(), "_canonicalName", null);
        setField(term191177, term191177.getClass(), "_class", null);
        setIntField(term191177, term191177.getClass(), "_hash", 0);
        setField(term191177, term191177.getClass(), "_valueHandler", null);
        setField(term191177, term191177.getClass(), "_typeHandler", null);
        setBooleanField(term191177, term191177.getClass(), "_asStatic", false);
        setElement(term191174, 2, term191177);
        setField(term191178, term191178.getClass(), "_superClass", null);
        setField(term191178, term191178.getClass(), "_superInterfaces", null);
        setField(term191178, term191178.getClass(), "_bindings", null);
        setField(term191178, term191178.getClass(), "_canonicalName", null);
        setField(term191178, term191178.getClass(), "_class", null);
        setIntField(term191178, term191178.getClass(), "_hash", 0);
        setField(term191178, term191178.getClass(), "_valueHandler", null);
        setField(term191178, term191178.getClass(), "_typeHandler", null);
        setBooleanField(term191178, term191178.getClass(), "_asStatic", false);
        setElement(term191174, 3, term191178);
        setField(term191172, term191172.getClass(), "_types", term191174);
        setField(term191172, term191172.getClass(), "_unboundVariables", null);
        setIntField(term191172, term191172.getClass(), "_hashCode", 1);
        term191179 = (Object[]) newArray("java.lang.String", 4);
        term191180 = (Object[]) newArray("com.fasterxml.jackson.databind.JavaType", 4);
        Object term191181 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.CollectionType"));
        Object term191182 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ArrayType"));
        Object term191183 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ArrayType"));
        Object term191184 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.SimpleType"));
        setField(term191181, term191181.getClass(), "_elementType", null);
        setField(term191181, term191181.getClass(), "_superClass", null);
        setField(term191181, term191181.getClass(), "_superInterfaces", null);
        setField(term191181, term191181.getClass(), "_bindings", null);
        setField(term191181, term191181.getClass(), "_canonicalName", null);
        setField(term191181, term191181.getClass(), "_class", null);
        setIntField(term191181, term191181.getClass(), "_hash", 0);
        setField(term191181, term191181.getClass(), "_valueHandler", null);
        setField(term191181, term191181.getClass(), "_typeHandler", null);
        setBooleanField(term191181, term191181.getClass(), "_asStatic", false);
        setElement(term191180, 0, term191181);
        setField(term191182, term191182.getClass(), "_componentType", null);
        setField(term191182, term191182.getClass(), "_emptyArray", null);
        setField(term191182, term191182.getClass(), "_superClass", null);
        setField(term191182, term191182.getClass(), "_superInterfaces", null);
        setField(term191182, term191182.getClass(), "_bindings", null);
        setField(term191182, term191182.getClass(), "_canonicalName", null);
        setField(term191182, term191182.getClass(), "_class", null);
        setIntField(term191182, term191182.getClass(), "_hash", 0);
        setField(term191182, term191182.getClass(), "_valueHandler", null);
        setField(term191182, term191182.getClass(), "_typeHandler", null);
        setBooleanField(term191182, term191182.getClass(), "_asStatic", false);
        setElement(term191180, 1, term191182);
        setField(term191183, term191183.getClass(), "_componentType", null);
        setField(term191183, term191183.getClass(), "_emptyArray", null);
        setField(term191183, term191183.getClass(), "_superClass", null);
        setField(term191183, term191183.getClass(), "_superInterfaces", null);
        setField(term191183, term191183.getClass(), "_bindings", null);
        setField(term191183, term191183.getClass(), "_canonicalName", null);
        setField(term191183, term191183.getClass(), "_class", null);
        setIntField(term191183, term191183.getClass(), "_hash", 0);
        setField(term191183, term191183.getClass(), "_valueHandler", null);
        setField(term191183, term191183.getClass(), "_typeHandler", null);
        setBooleanField(term191183, term191183.getClass(), "_asStatic", false);
        setElement(term191180, 2, term191183);
        setField(term191184, term191184.getClass(), "_superClass", null);
        setField(term191184, term191184.getClass(), "_superInterfaces", null);
        setField(term191184, term191184.getClass(), "_bindings", null);
        setField(term191184, term191184.getClass(), "_canonicalName", null);
        setField(term191184, term191184.getClass(), "_class", null);
        setIntField(term191184, term191184.getClass(), "_hash", 0);
        setField(term191184, term191184.getClass(), "_valueHandler", null);
        setField(term191184, term191184.getClass(), "_typeHandler", null);
        setBooleanField(term191184, term191184.getClass(), "_asStatic", false);
        setElement(term191180, 3, term191184);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.fasterxml.jackson.databind.type.TypeBindings");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Array.newInstance(Class.forName("java.lang.String"), 0).getClass();
        argTypes[1] = Array.newInstance(Class.forName("com.fasterxml.jackson.databind.JavaType"), 0).getClass();
        argTypes[2] = Array.newInstance(Class.forName("java.lang.String"), 0).getClass();
        Object[] args = new Object[3];
        args[0] = term190567;
        args[1] = term190568;
        args[2] = null;
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term191172));
        assertTrue(recursiveEquals(term190567, term191179));
        assertTrue(recursiveEquals(term190568, term191180));
    }

};


