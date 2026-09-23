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

public class TypeBindings_init_352540534213 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term70230;
     Object term70231;
     Object term70770;
     Object term70776;
     Object term70777;

    public TypeBindings_init_352540534213() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term70386 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.TypeBindings"));
        Object[] term70235 = (Object[]) newArray("java.lang.String", 0);
        setField(term70386, term70386.getClass(), "_names", term70235);
        setField(term70386, term70386.getClass(), "_types", null);
        term70230 = (Object[]) newArray("java.lang.String", 3);
        term70231 = (Object[]) newArray("com.fasterxml.jackson.databind.JavaType", 3);
        Object term70492 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.CollectionType"));
        Object term70588 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ArrayType"));
        Object term70680 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.MapType"));
        setIntField(term70492, term70492.getClass(), "_hash", 0);
        setElement(term70231, 0, term70492);
        setIntField(term70588, term70588.getClass(), "_hash", 0);
        setElement(term70231, 1, term70588);
        setElement(term70231, 2, term70680);
        term70770 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.TypeBindings"));
        Object[] term70771 = (Object[]) newArray("java.lang.String", 3);
        Object[] term70772 = (Object[]) newArray("com.fasterxml.jackson.databind.JavaType", 3);
        Object term70773 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.CollectionType"));
        Object term70774 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ArrayType"));
        Object term70775 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.MapType"));
        setField(term70770, term70770.getClass(), "_names", term70771);
        setField(term70773, term70773.getClass(), "_elementType", null);
        setField(term70773, term70773.getClass(), "_superClass", null);
        setField(term70773, term70773.getClass(), "_superInterfaces", null);
        setField(term70773, term70773.getClass(), "_bindings", null);
        setField(term70773, term70773.getClass(), "_canonicalName", null);
        setField(term70773, term70773.getClass(), "_class", null);
        setIntField(term70773, term70773.getClass(), "_hash", 0);
        setField(term70773, term70773.getClass(), "_valueHandler", null);
        setField(term70773, term70773.getClass(), "_typeHandler", null);
        setBooleanField(term70773, term70773.getClass(), "_asStatic", false);
        setElement(term70772, 0, term70773);
        setField(term70774, term70774.getClass(), "_componentType", null);
        setField(term70774, term70774.getClass(), "_emptyArray", null);
        setField(term70774, term70774.getClass(), "_superClass", null);
        setField(term70774, term70774.getClass(), "_superInterfaces", null);
        setField(term70774, term70774.getClass(), "_bindings", null);
        setField(term70774, term70774.getClass(), "_canonicalName", null);
        setField(term70774, term70774.getClass(), "_class", null);
        setIntField(term70774, term70774.getClass(), "_hash", 0);
        setField(term70774, term70774.getClass(), "_valueHandler", null);
        setField(term70774, term70774.getClass(), "_typeHandler", null);
        setBooleanField(term70774, term70774.getClass(), "_asStatic", false);
        setElement(term70772, 1, term70774);
        setField(term70775, term70775.getClass(), "_keyType", null);
        setField(term70775, term70775.getClass(), "_valueType", null);
        setField(term70775, term70775.getClass(), "_superClass", null);
        setField(term70775, term70775.getClass(), "_superInterfaces", null);
        setField(term70775, term70775.getClass(), "_bindings", null);
        setField(term70775, term70775.getClass(), "_canonicalName", null);
        setField(term70775, term70775.getClass(), "_class", null);
        setIntField(term70775, term70775.getClass(), "_hash", 0);
        setField(term70775, term70775.getClass(), "_valueHandler", null);
        setField(term70775, term70775.getClass(), "_typeHandler", null);
        setBooleanField(term70775, term70775.getClass(), "_asStatic", false);
        setElement(term70772, 2, term70775);
        setField(term70770, term70770.getClass(), "_types", term70772);
        setField(term70770, term70770.getClass(), "_unboundVariables", null);
        setIntField(term70770, term70770.getClass(), "_hashCode", 1);
        term70776 = (Object[]) newArray("java.lang.String", 3);
        term70777 = (Object[]) newArray("com.fasterxml.jackson.databind.JavaType", 3);
        Object term70778 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.CollectionType"));
        Object term70779 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ArrayType"));
        Object term70780 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.MapType"));
        setField(term70778, term70778.getClass(), "_elementType", null);
        setField(term70778, term70778.getClass(), "_superClass", null);
        setField(term70778, term70778.getClass(), "_superInterfaces", null);
        setField(term70778, term70778.getClass(), "_bindings", null);
        setField(term70778, term70778.getClass(), "_canonicalName", null);
        setField(term70778, term70778.getClass(), "_class", null);
        setIntField(term70778, term70778.getClass(), "_hash", 0);
        setField(term70778, term70778.getClass(), "_valueHandler", null);
        setField(term70778, term70778.getClass(), "_typeHandler", null);
        setBooleanField(term70778, term70778.getClass(), "_asStatic", false);
        setElement(term70777, 0, term70778);
        setField(term70779, term70779.getClass(), "_componentType", null);
        setField(term70779, term70779.getClass(), "_emptyArray", null);
        setField(term70779, term70779.getClass(), "_superClass", null);
        setField(term70779, term70779.getClass(), "_superInterfaces", null);
        setField(term70779, term70779.getClass(), "_bindings", null);
        setField(term70779, term70779.getClass(), "_canonicalName", null);
        setField(term70779, term70779.getClass(), "_class", null);
        setIntField(term70779, term70779.getClass(), "_hash", 0);
        setField(term70779, term70779.getClass(), "_valueHandler", null);
        setField(term70779, term70779.getClass(), "_typeHandler", null);
        setBooleanField(term70779, term70779.getClass(), "_asStatic", false);
        setElement(term70777, 1, term70779);
        setField(term70780, term70780.getClass(), "_keyType", null);
        setField(term70780, term70780.getClass(), "_valueType", null);
        setField(term70780, term70780.getClass(), "_superClass", null);
        setField(term70780, term70780.getClass(), "_superInterfaces", null);
        setField(term70780, term70780.getClass(), "_bindings", null);
        setField(term70780, term70780.getClass(), "_canonicalName", null);
        setField(term70780, term70780.getClass(), "_class", null);
        setIntField(term70780, term70780.getClass(), "_hash", 0);
        setField(term70780, term70780.getClass(), "_valueHandler", null);
        setField(term70780, term70780.getClass(), "_typeHandler", null);
        setBooleanField(term70780, term70780.getClass(), "_asStatic", false);
        setElement(term70777, 2, term70780);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.fasterxml.jackson.databind.type.TypeBindings");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Array.newInstance(Class.forName("java.lang.String"), 0).getClass();
        argTypes[1] = Array.newInstance(Class.forName("com.fasterxml.jackson.databind.JavaType"), 0).getClass();
        argTypes[2] = Array.newInstance(Class.forName("java.lang.String"), 0).getClass();
        Object[] args = new Object[3];
        args[0] = term70230;
        args[1] = term70231;
        args[2] = null;
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term70770));
        assertTrue(recursiveEquals(term70230, term70776));
        assertTrue(recursiveEquals(term70231, term70777));
    }

};


