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

public class TypeBindings_init_352540534493 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term194462;
     Object term194463;
     Object term195113;
     Object term195120;
     Object term195121;

    public TypeBindings_init_352540534493() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term194639 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.TypeBindings"));
        Object[] term194468 = (Object[]) newArray("java.lang.String", 0);
        Object[] term194469 = (Object[]) newArray("com.fasterxml.jackson.databind.JavaType", 0);
        setField(term194639, term194639.getClass(), "_names", term194468);
        setField(term194639, term194639.getClass(), "_types", term194469);
        term194462 = (Object[]) newArray("java.lang.String", 5);
        term194463 = (Object[]) newArray("com.fasterxml.jackson.databind.JavaType", 5);
        Object term194745 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.CollectionType"));
        Object term194841 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ArrayType"));
        Object term194961 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ResolvedRecursiveType"));
        Object term195065 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ReferenceType"));
        setIntField(term194745, term194745.getClass(), "_hash", 0);
        setElement(term194463, 0, term194745);
        setIntField(term194841, term194841.getClass(), "_hash", 0);
        setElement(term194463, 1, term194841);
        setIntField(term194961, term194961.getClass(), "_hash", 0);
        setElement(term194463, 2, term194961);
        setIntField(term195065, term195065.getClass(), "_hash", 0);
        setElement(term194463, 3, term195065);
        setElement(term194463, 4, term195065);
        term195113 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.TypeBindings"));
        Object[] term195114 = (Object[]) newArray("java.lang.String", 5);
        Object[] term195115 = (Object[]) newArray("com.fasterxml.jackson.databind.JavaType", 5);
        Object term195116 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.CollectionType"));
        Object term195117 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ArrayType"));
        Object term195118 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ResolvedRecursiveType"));
        Object term195119 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ReferenceType"));
        setField(term195113, term195113.getClass(), "_names", term195114);
        setField(term195116, term195116.getClass(), "_elementType", null);
        setField(term195116, term195116.getClass(), "_superClass", null);
        setField(term195116, term195116.getClass(), "_superInterfaces", null);
        setField(term195116, term195116.getClass(), "_bindings", null);
        setField(term195116, term195116.getClass(), "_canonicalName", null);
        setField(term195116, term195116.getClass(), "_class", null);
        setIntField(term195116, term195116.getClass(), "_hash", 0);
        setField(term195116, term195116.getClass(), "_valueHandler", null);
        setField(term195116, term195116.getClass(), "_typeHandler", null);
        setBooleanField(term195116, term195116.getClass(), "_asStatic", false);
        setElement(term195115, 0, term195116);
        setField(term195117, term195117.getClass(), "_componentType", null);
        setField(term195117, term195117.getClass(), "_emptyArray", null);
        setField(term195117, term195117.getClass(), "_superClass", null);
        setField(term195117, term195117.getClass(), "_superInterfaces", null);
        setField(term195117, term195117.getClass(), "_bindings", null);
        setField(term195117, term195117.getClass(), "_canonicalName", null);
        setField(term195117, term195117.getClass(), "_class", null);
        setIntField(term195117, term195117.getClass(), "_hash", 0);
        setField(term195117, term195117.getClass(), "_valueHandler", null);
        setField(term195117, term195117.getClass(), "_typeHandler", null);
        setBooleanField(term195117, term195117.getClass(), "_asStatic", false);
        setElement(term195115, 1, term195117);
        setField(term195118, term195118.getClass(), "_referencedType", null);
        setField(term195118, term195118.getClass(), "_superClass", null);
        setField(term195118, term195118.getClass(), "_superInterfaces", null);
        setField(term195118, term195118.getClass(), "_bindings", null);
        setField(term195118, term195118.getClass(), "_canonicalName", null);
        setField(term195118, term195118.getClass(), "_class", null);
        setIntField(term195118, term195118.getClass(), "_hash", 0);
        setField(term195118, term195118.getClass(), "_valueHandler", null);
        setField(term195118, term195118.getClass(), "_typeHandler", null);
        setBooleanField(term195118, term195118.getClass(), "_asStatic", false);
        setElement(term195115, 2, term195118);
        setField(term195119, term195119.getClass(), "_referencedType", null);
        setField(term195119, term195119.getClass(), "_superClass", null);
        setField(term195119, term195119.getClass(), "_superInterfaces", null);
        setField(term195119, term195119.getClass(), "_bindings", null);
        setField(term195119, term195119.getClass(), "_canonicalName", null);
        setField(term195119, term195119.getClass(), "_class", null);
        setIntField(term195119, term195119.getClass(), "_hash", 0);
        setField(term195119, term195119.getClass(), "_valueHandler", null);
        setField(term195119, term195119.getClass(), "_typeHandler", null);
        setBooleanField(term195119, term195119.getClass(), "_asStatic", false);
        setElement(term195115, 3, term195119);
        setElement(term195115, 4, term195119);
        setField(term195113, term195113.getClass(), "_types", term195115);
        setField(term195113, term195113.getClass(), "_unboundVariables", null);
        setIntField(term195113, term195113.getClass(), "_hashCode", 1);
        term195120 = (Object[]) newArray("java.lang.String", 5);
        term195121 = (Object[]) newArray("com.fasterxml.jackson.databind.JavaType", 5);
        Object term195122 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.CollectionType"));
        Object term195123 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ArrayType"));
        Object term195124 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ResolvedRecursiveType"));
        Object term195125 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ReferenceType"));
        setField(term195122, term195122.getClass(), "_elementType", null);
        setField(term195122, term195122.getClass(), "_superClass", null);
        setField(term195122, term195122.getClass(), "_superInterfaces", null);
        setField(term195122, term195122.getClass(), "_bindings", null);
        setField(term195122, term195122.getClass(), "_canonicalName", null);
        setField(term195122, term195122.getClass(), "_class", null);
        setIntField(term195122, term195122.getClass(), "_hash", 0);
        setField(term195122, term195122.getClass(), "_valueHandler", null);
        setField(term195122, term195122.getClass(), "_typeHandler", null);
        setBooleanField(term195122, term195122.getClass(), "_asStatic", false);
        setElement(term195121, 0, term195122);
        setField(term195123, term195123.getClass(), "_componentType", null);
        setField(term195123, term195123.getClass(), "_emptyArray", null);
        setField(term195123, term195123.getClass(), "_superClass", null);
        setField(term195123, term195123.getClass(), "_superInterfaces", null);
        setField(term195123, term195123.getClass(), "_bindings", null);
        setField(term195123, term195123.getClass(), "_canonicalName", null);
        setField(term195123, term195123.getClass(), "_class", null);
        setIntField(term195123, term195123.getClass(), "_hash", 0);
        setField(term195123, term195123.getClass(), "_valueHandler", null);
        setField(term195123, term195123.getClass(), "_typeHandler", null);
        setBooleanField(term195123, term195123.getClass(), "_asStatic", false);
        setElement(term195121, 1, term195123);
        setField(term195124, term195124.getClass(), "_referencedType", null);
        setField(term195124, term195124.getClass(), "_superClass", null);
        setField(term195124, term195124.getClass(), "_superInterfaces", null);
        setField(term195124, term195124.getClass(), "_bindings", null);
        setField(term195124, term195124.getClass(), "_canonicalName", null);
        setField(term195124, term195124.getClass(), "_class", null);
        setIntField(term195124, term195124.getClass(), "_hash", 0);
        setField(term195124, term195124.getClass(), "_valueHandler", null);
        setField(term195124, term195124.getClass(), "_typeHandler", null);
        setBooleanField(term195124, term195124.getClass(), "_asStatic", false);
        setElement(term195121, 2, term195124);
        setField(term195125, term195125.getClass(), "_referencedType", null);
        setField(term195125, term195125.getClass(), "_superClass", null);
        setField(term195125, term195125.getClass(), "_superInterfaces", null);
        setField(term195125, term195125.getClass(), "_bindings", null);
        setField(term195125, term195125.getClass(), "_canonicalName", null);
        setField(term195125, term195125.getClass(), "_class", null);
        setIntField(term195125, term195125.getClass(), "_hash", 0);
        setField(term195125, term195125.getClass(), "_valueHandler", null);
        setField(term195125, term195125.getClass(), "_typeHandler", null);
        setBooleanField(term195125, term195125.getClass(), "_asStatic", false);
        setElement(term195121, 3, term195125);
        setElement(term195121, 4, term195125);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.fasterxml.jackson.databind.type.TypeBindings");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Array.newInstance(Class.forName("java.lang.String"), 0).getClass();
        argTypes[1] = Array.newInstance(Class.forName("com.fasterxml.jackson.databind.JavaType"), 0).getClass();
        argTypes[2] = Array.newInstance(Class.forName("java.lang.String"), 0).getClass();
        Object[] args = new Object[3];
        args[0] = term194462;
        args[1] = term194463;
        args[2] = null;
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term195113));
        assertTrue(recursiveEquals(term194462, term195120));
        assertTrue(recursiveEquals(term194463, term195121));
    }

};


