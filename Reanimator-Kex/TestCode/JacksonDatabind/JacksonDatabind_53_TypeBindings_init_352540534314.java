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

public class TypeBindings_init_352540534314 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term105014;
     Object term105018;
     Object term106409;
     Object term106421;
     Object term106428;

    public TypeBindings_init_352540534314() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term105175 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.TypeBindings"));
        Object[] term105022 = (Object[]) newArray("com.fasterxml.jackson.databind.JavaType", 0);
        setField(term105175, term105175.getClass(), "_names", null);
        setField(term105175, term105175.getClass(), "_types", term105022);
        term105014 = (Object[]) newArray("java.lang.String", 3);
        setElement(term105014, 0, "");
        setElement(term105014, 1, "");
        setElement(term105014, 2, "");
        term105018 = (Object[]) newArray("com.fasterxml.jackson.databind.JavaType", 3);
        Object term105393 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ReferenceType"));
        Object term105499 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.CollectionType"));
        Object term105603 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ReferenceType"));
        setIntField(term105393, term105393.getClass(), "_hash", 0);
        setElement(term105018, 0, term105393);
        setIntField(term105499, term105499.getClass(), "_hash", 0);
        setElement(term105018, 1, term105499);
        setIntField(term105603, term105603.getClass(), "_hash", 0);
        setElement(term105018, 2, term105603);
        term106409 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.TypeBindings"));
        Object[] term106410 = (Object[]) newArray("java.lang.String", 3);
        Object[] term106417 = (Object[]) newArray("com.fasterxml.jackson.databind.JavaType", 3);
        Object term106418 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ReferenceType"));
        Object term106419 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.CollectionType"));
        Object term106420 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ReferenceType"));
        setElement(term106410, 0, "");
        setElement(term106410, 1, "");
        setElement(term106410, 2, "");
        setField(term106409, term106409.getClass(), "_names", term106410);
        setField(term106418, term106418.getClass(), "_referencedType", null);
        setField(term106418, term106418.getClass(), "_superClass", null);
        setField(term106418, term106418.getClass(), "_superInterfaces", null);
        setField(term106418, term106418.getClass(), "_bindings", null);
        setField(term106418, term106418.getClass(), "_canonicalName", null);
        setField(term106418, term106418.getClass(), "_class", null);
        setIntField(term106418, term106418.getClass(), "_hash", 0);
        setField(term106418, term106418.getClass(), "_valueHandler", null);
        setField(term106418, term106418.getClass(), "_typeHandler", null);
        setBooleanField(term106418, term106418.getClass(), "_asStatic", false);
        setElement(term106417, 0, term106418);
        setField(term106419, term106419.getClass(), "_elementType", null);
        setField(term106419, term106419.getClass(), "_superClass", null);
        setField(term106419, term106419.getClass(), "_superInterfaces", null);
        setField(term106419, term106419.getClass(), "_bindings", null);
        setField(term106419, term106419.getClass(), "_canonicalName", null);
        setField(term106419, term106419.getClass(), "_class", null);
        setIntField(term106419, term106419.getClass(), "_hash", 0);
        setField(term106419, term106419.getClass(), "_valueHandler", null);
        setField(term106419, term106419.getClass(), "_typeHandler", null);
        setBooleanField(term106419, term106419.getClass(), "_asStatic", false);
        setElement(term106417, 1, term106419);
        setField(term106420, term106420.getClass(), "_referencedType", null);
        setField(term106420, term106420.getClass(), "_superClass", null);
        setField(term106420, term106420.getClass(), "_superInterfaces", null);
        setField(term106420, term106420.getClass(), "_bindings", null);
        setField(term106420, term106420.getClass(), "_canonicalName", null);
        setField(term106420, term106420.getClass(), "_class", null);
        setIntField(term106420, term106420.getClass(), "_hash", 0);
        setField(term106420, term106420.getClass(), "_valueHandler", null);
        setField(term106420, term106420.getClass(), "_typeHandler", null);
        setBooleanField(term106420, term106420.getClass(), "_asStatic", false);
        setElement(term106417, 2, term106420);
        setField(term106409, term106409.getClass(), "_types", term106417);
        setField(term106409, term106409.getClass(), "_unboundVariables", null);
        setIntField(term106409, term106409.getClass(), "_hashCode", 1);
        term106421 = (Object[]) newArray("java.lang.String", 3);
        setElement(term106421, 0, "");
        setElement(term106421, 1, "");
        setElement(term106421, 2, "");
        term106428 = (Object[]) newArray("com.fasterxml.jackson.databind.JavaType", 3);
        Object term106429 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ReferenceType"));
        Object term106430 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.CollectionType"));
        Object term106431 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ReferenceType"));
        setField(term106429, term106429.getClass(), "_referencedType", null);
        setField(term106429, term106429.getClass(), "_superClass", null);
        setField(term106429, term106429.getClass(), "_superInterfaces", null);
        setField(term106429, term106429.getClass(), "_bindings", null);
        setField(term106429, term106429.getClass(), "_canonicalName", null);
        setField(term106429, term106429.getClass(), "_class", null);
        setIntField(term106429, term106429.getClass(), "_hash", 0);
        setField(term106429, term106429.getClass(), "_valueHandler", null);
        setField(term106429, term106429.getClass(), "_typeHandler", null);
        setBooleanField(term106429, term106429.getClass(), "_asStatic", false);
        setElement(term106428, 0, term106429);
        setField(term106430, term106430.getClass(), "_elementType", null);
        setField(term106430, term106430.getClass(), "_superClass", null);
        setField(term106430, term106430.getClass(), "_superInterfaces", null);
        setField(term106430, term106430.getClass(), "_bindings", null);
        setField(term106430, term106430.getClass(), "_canonicalName", null);
        setField(term106430, term106430.getClass(), "_class", null);
        setIntField(term106430, term106430.getClass(), "_hash", 0);
        setField(term106430, term106430.getClass(), "_valueHandler", null);
        setField(term106430, term106430.getClass(), "_typeHandler", null);
        setBooleanField(term106430, term106430.getClass(), "_asStatic", false);
        setElement(term106428, 1, term106430);
        setField(term106431, term106431.getClass(), "_referencedType", null);
        setField(term106431, term106431.getClass(), "_superClass", null);
        setField(term106431, term106431.getClass(), "_superInterfaces", null);
        setField(term106431, term106431.getClass(), "_bindings", null);
        setField(term106431, term106431.getClass(), "_canonicalName", null);
        setField(term106431, term106431.getClass(), "_class", null);
        setIntField(term106431, term106431.getClass(), "_hash", 0);
        setField(term106431, term106431.getClass(), "_valueHandler", null);
        setField(term106431, term106431.getClass(), "_typeHandler", null);
        setBooleanField(term106431, term106431.getClass(), "_asStatic", false);
        setElement(term106428, 2, term106431);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.fasterxml.jackson.databind.type.TypeBindings");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Array.newInstance(Class.forName("java.lang.String"), 0).getClass();
        argTypes[1] = Array.newInstance(Class.forName("com.fasterxml.jackson.databind.JavaType"), 0).getClass();
        argTypes[2] = Array.newInstance(Class.forName("java.lang.String"), 0).getClass();
        Object[] args = new Object[3];
        args[0] = term105014;
        args[1] = term105018;
        args[2] = null;
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term106409));
        assertTrue(recursiveEquals(term105014, term106421));
        assertTrue(recursiveEquals(term105018, term106428));
    }

};


