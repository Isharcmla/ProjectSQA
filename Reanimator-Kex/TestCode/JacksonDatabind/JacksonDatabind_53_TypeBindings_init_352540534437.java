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

public class TypeBindings_init_352540534437 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term167570;
     Object term167571;
     Object term168196;
     Object term168203;
     Object term168204;

    public TypeBindings_init_352540534437() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term167733 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.TypeBindings"));
        Object[] term167576 = (Object[]) newArray("java.lang.String", 0);
        Object[] term167577 = (Object[]) newArray("com.fasterxml.jackson.databind.JavaType", 0);
        setField(term167733, term167733.getClass(), "_names", term167576);
        setField(term167733, term167733.getClass(), "_types", term167577);
        term167570 = (Object[]) newArray("java.lang.String", 4);
        term167571 = (Object[]) newArray("com.fasterxml.jackson.databind.JavaType", 4);
        Object term167839 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.CollectionType"));
        Object term167935 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ArrayType"));
        Object term168055 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ResolvedRecursiveType"));
        Object term168153 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.SimpleType"));
        setIntField(term167839, term167839.getClass(), "_hash", 0);
        setElement(term167571, 0, term167839);
        setIntField(term167935, term167935.getClass(), "_hash", 0);
        setElement(term167571, 1, term167935);
        setIntField(term168055, term168055.getClass(), "_hash", 0);
        setElement(term167571, 2, term168055);
        setElement(term167571, 3, term168153);
        term168196 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.TypeBindings"));
        Object[] term168197 = (Object[]) newArray("java.lang.String", 4);
        Object[] term168198 = (Object[]) newArray("com.fasterxml.jackson.databind.JavaType", 4);
        Object term168199 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.CollectionType"));
        Object term168200 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ArrayType"));
        Object term168201 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ResolvedRecursiveType"));
        Object term168202 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.SimpleType"));
        setField(term168196, term168196.getClass(), "_names", term168197);
        setField(term168199, term168199.getClass(), "_elementType", null);
        setField(term168199, term168199.getClass(), "_superClass", null);
        setField(term168199, term168199.getClass(), "_superInterfaces", null);
        setField(term168199, term168199.getClass(), "_bindings", null);
        setField(term168199, term168199.getClass(), "_canonicalName", null);
        setField(term168199, term168199.getClass(), "_class", null);
        setIntField(term168199, term168199.getClass(), "_hash", 0);
        setField(term168199, term168199.getClass(), "_valueHandler", null);
        setField(term168199, term168199.getClass(), "_typeHandler", null);
        setBooleanField(term168199, term168199.getClass(), "_asStatic", false);
        setElement(term168198, 0, term168199);
        setField(term168200, term168200.getClass(), "_componentType", null);
        setField(term168200, term168200.getClass(), "_emptyArray", null);
        setField(term168200, term168200.getClass(), "_superClass", null);
        setField(term168200, term168200.getClass(), "_superInterfaces", null);
        setField(term168200, term168200.getClass(), "_bindings", null);
        setField(term168200, term168200.getClass(), "_canonicalName", null);
        setField(term168200, term168200.getClass(), "_class", null);
        setIntField(term168200, term168200.getClass(), "_hash", 0);
        setField(term168200, term168200.getClass(), "_valueHandler", null);
        setField(term168200, term168200.getClass(), "_typeHandler", null);
        setBooleanField(term168200, term168200.getClass(), "_asStatic", false);
        setElement(term168198, 1, term168200);
        setField(term168201, term168201.getClass(), "_referencedType", null);
        setField(term168201, term168201.getClass(), "_superClass", null);
        setField(term168201, term168201.getClass(), "_superInterfaces", null);
        setField(term168201, term168201.getClass(), "_bindings", null);
        setField(term168201, term168201.getClass(), "_canonicalName", null);
        setField(term168201, term168201.getClass(), "_class", null);
        setIntField(term168201, term168201.getClass(), "_hash", 0);
        setField(term168201, term168201.getClass(), "_valueHandler", null);
        setField(term168201, term168201.getClass(), "_typeHandler", null);
        setBooleanField(term168201, term168201.getClass(), "_asStatic", false);
        setElement(term168198, 2, term168201);
        setField(term168202, term168202.getClass(), "_superClass", null);
        setField(term168202, term168202.getClass(), "_superInterfaces", null);
        setField(term168202, term168202.getClass(), "_bindings", null);
        setField(term168202, term168202.getClass(), "_canonicalName", null);
        setField(term168202, term168202.getClass(), "_class", null);
        setIntField(term168202, term168202.getClass(), "_hash", 0);
        setField(term168202, term168202.getClass(), "_valueHandler", null);
        setField(term168202, term168202.getClass(), "_typeHandler", null);
        setBooleanField(term168202, term168202.getClass(), "_asStatic", false);
        setElement(term168198, 3, term168202);
        setField(term168196, term168196.getClass(), "_types", term168198);
        setField(term168196, term168196.getClass(), "_unboundVariables", null);
        setIntField(term168196, term168196.getClass(), "_hashCode", 1);
        term168203 = (Object[]) newArray("java.lang.String", 4);
        term168204 = (Object[]) newArray("com.fasterxml.jackson.databind.JavaType", 4);
        Object term168205 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.CollectionType"));
        Object term168206 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ArrayType"));
        Object term168207 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ResolvedRecursiveType"));
        Object term168208 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.SimpleType"));
        setField(term168205, term168205.getClass(), "_elementType", null);
        setField(term168205, term168205.getClass(), "_superClass", null);
        setField(term168205, term168205.getClass(), "_superInterfaces", null);
        setField(term168205, term168205.getClass(), "_bindings", null);
        setField(term168205, term168205.getClass(), "_canonicalName", null);
        setField(term168205, term168205.getClass(), "_class", null);
        setIntField(term168205, term168205.getClass(), "_hash", 0);
        setField(term168205, term168205.getClass(), "_valueHandler", null);
        setField(term168205, term168205.getClass(), "_typeHandler", null);
        setBooleanField(term168205, term168205.getClass(), "_asStatic", false);
        setElement(term168204, 0, term168205);
        setField(term168206, term168206.getClass(), "_componentType", null);
        setField(term168206, term168206.getClass(), "_emptyArray", null);
        setField(term168206, term168206.getClass(), "_superClass", null);
        setField(term168206, term168206.getClass(), "_superInterfaces", null);
        setField(term168206, term168206.getClass(), "_bindings", null);
        setField(term168206, term168206.getClass(), "_canonicalName", null);
        setField(term168206, term168206.getClass(), "_class", null);
        setIntField(term168206, term168206.getClass(), "_hash", 0);
        setField(term168206, term168206.getClass(), "_valueHandler", null);
        setField(term168206, term168206.getClass(), "_typeHandler", null);
        setBooleanField(term168206, term168206.getClass(), "_asStatic", false);
        setElement(term168204, 1, term168206);
        setField(term168207, term168207.getClass(), "_referencedType", null);
        setField(term168207, term168207.getClass(), "_superClass", null);
        setField(term168207, term168207.getClass(), "_superInterfaces", null);
        setField(term168207, term168207.getClass(), "_bindings", null);
        setField(term168207, term168207.getClass(), "_canonicalName", null);
        setField(term168207, term168207.getClass(), "_class", null);
        setIntField(term168207, term168207.getClass(), "_hash", 0);
        setField(term168207, term168207.getClass(), "_valueHandler", null);
        setField(term168207, term168207.getClass(), "_typeHandler", null);
        setBooleanField(term168207, term168207.getClass(), "_asStatic", false);
        setElement(term168204, 2, term168207);
        setField(term168208, term168208.getClass(), "_superClass", null);
        setField(term168208, term168208.getClass(), "_superInterfaces", null);
        setField(term168208, term168208.getClass(), "_bindings", null);
        setField(term168208, term168208.getClass(), "_canonicalName", null);
        setField(term168208, term168208.getClass(), "_class", null);
        setIntField(term168208, term168208.getClass(), "_hash", 0);
        setField(term168208, term168208.getClass(), "_valueHandler", null);
        setField(term168208, term168208.getClass(), "_typeHandler", null);
        setBooleanField(term168208, term168208.getClass(), "_asStatic", false);
        setElement(term168204, 3, term168208);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.fasterxml.jackson.databind.type.TypeBindings");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Array.newInstance(Class.forName("java.lang.String"), 0).getClass();
        argTypes[1] = Array.newInstance(Class.forName("com.fasterxml.jackson.databind.JavaType"), 0).getClass();
        argTypes[2] = Array.newInstance(Class.forName("java.lang.String"), 0).getClass();
        Object[] args = new Object[3];
        args[0] = term167570;
        args[1] = term167571;
        args[2] = null;
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term168196));
        assertTrue(recursiveEquals(term167570, term168203));
        assertTrue(recursiveEquals(term167571, term168204));
    }

};


