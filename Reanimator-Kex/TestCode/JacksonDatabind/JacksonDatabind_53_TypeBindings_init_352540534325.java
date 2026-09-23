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

public class TypeBindings_init_352540534325 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term109255;
     Object term109258;
     Object term109838;
     Object term109850;
     Object term109857;

    public TypeBindings_init_352540534325() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term109417 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.TypeBindings"));
        Object[] term109262 = (Object[]) newArray("com.fasterxml.jackson.databind.JavaType", 0);
        setField(term109417, term109417.getClass(), "_names", null);
        setField(term109417, term109417.getClass(), "_types", term109262);
        term109255 = (Object[]) newArray("java.lang.String", 3);
        setElement(term109255, 0, "");
        setElement(term109255, 1, "");
        setElement(term109255, 2, "");
        term109258 = (Object[]) newArray("com.fasterxml.jackson.databind.JavaType", 3);
        Object term109599 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.CollectionType"));
        Object term109695 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ArrayType"));
        Object term109791 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ArrayType"));
        setIntField(term109599, term109599.getClass(), "_hash", 0);
        setElement(term109258, 0, term109599);
        setIntField(term109695, term109695.getClass(), "_hash", 0);
        setElement(term109258, 1, term109695);
        setIntField(term109791, term109791.getClass(), "_hash", 0);
        setElement(term109258, 2, term109791);
        term109838 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.TypeBindings"));
        Object[] term109839 = (Object[]) newArray("java.lang.String", 3);
        Object[] term109846 = (Object[]) newArray("com.fasterxml.jackson.databind.JavaType", 3);
        Object term109847 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.CollectionType"));
        Object term109848 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ArrayType"));
        Object term109849 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ArrayType"));
        setElement(term109839, 0, "");
        setElement(term109839, 1, "");
        setElement(term109839, 2, "");
        setField(term109838, term109838.getClass(), "_names", term109839);
        setField(term109847, term109847.getClass(), "_elementType", null);
        setField(term109847, term109847.getClass(), "_superClass", null);
        setField(term109847, term109847.getClass(), "_superInterfaces", null);
        setField(term109847, term109847.getClass(), "_bindings", null);
        setField(term109847, term109847.getClass(), "_canonicalName", null);
        setField(term109847, term109847.getClass(), "_class", null);
        setIntField(term109847, term109847.getClass(), "_hash", 0);
        setField(term109847, term109847.getClass(), "_valueHandler", null);
        setField(term109847, term109847.getClass(), "_typeHandler", null);
        setBooleanField(term109847, term109847.getClass(), "_asStatic", false);
        setElement(term109846, 0, term109847);
        setField(term109848, term109848.getClass(), "_componentType", null);
        setField(term109848, term109848.getClass(), "_emptyArray", null);
        setField(term109848, term109848.getClass(), "_superClass", null);
        setField(term109848, term109848.getClass(), "_superInterfaces", null);
        setField(term109848, term109848.getClass(), "_bindings", null);
        setField(term109848, term109848.getClass(), "_canonicalName", null);
        setField(term109848, term109848.getClass(), "_class", null);
        setIntField(term109848, term109848.getClass(), "_hash", 0);
        setField(term109848, term109848.getClass(), "_valueHandler", null);
        setField(term109848, term109848.getClass(), "_typeHandler", null);
        setBooleanField(term109848, term109848.getClass(), "_asStatic", false);
        setElement(term109846, 1, term109848);
        setField(term109849, term109849.getClass(), "_componentType", null);
        setField(term109849, term109849.getClass(), "_emptyArray", null);
        setField(term109849, term109849.getClass(), "_superClass", null);
        setField(term109849, term109849.getClass(), "_superInterfaces", null);
        setField(term109849, term109849.getClass(), "_bindings", null);
        setField(term109849, term109849.getClass(), "_canonicalName", null);
        setField(term109849, term109849.getClass(), "_class", null);
        setIntField(term109849, term109849.getClass(), "_hash", 0);
        setField(term109849, term109849.getClass(), "_valueHandler", null);
        setField(term109849, term109849.getClass(), "_typeHandler", null);
        setBooleanField(term109849, term109849.getClass(), "_asStatic", false);
        setElement(term109846, 2, term109849);
        setField(term109838, term109838.getClass(), "_types", term109846);
        setField(term109838, term109838.getClass(), "_unboundVariables", null);
        setIntField(term109838, term109838.getClass(), "_hashCode", 1);
        term109850 = (Object[]) newArray("java.lang.String", 3);
        setElement(term109850, 0, "");
        setElement(term109850, 1, "");
        setElement(term109850, 2, "");
        term109857 = (Object[]) newArray("com.fasterxml.jackson.databind.JavaType", 3);
        Object term109858 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.CollectionType"));
        Object term109859 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ArrayType"));
        Object term109860 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ArrayType"));
        setField(term109858, term109858.getClass(), "_elementType", null);
        setField(term109858, term109858.getClass(), "_superClass", null);
        setField(term109858, term109858.getClass(), "_superInterfaces", null);
        setField(term109858, term109858.getClass(), "_bindings", null);
        setField(term109858, term109858.getClass(), "_canonicalName", null);
        setField(term109858, term109858.getClass(), "_class", null);
        setIntField(term109858, term109858.getClass(), "_hash", 0);
        setField(term109858, term109858.getClass(), "_valueHandler", null);
        setField(term109858, term109858.getClass(), "_typeHandler", null);
        setBooleanField(term109858, term109858.getClass(), "_asStatic", false);
        setElement(term109857, 0, term109858);
        setField(term109859, term109859.getClass(), "_componentType", null);
        setField(term109859, term109859.getClass(), "_emptyArray", null);
        setField(term109859, term109859.getClass(), "_superClass", null);
        setField(term109859, term109859.getClass(), "_superInterfaces", null);
        setField(term109859, term109859.getClass(), "_bindings", null);
        setField(term109859, term109859.getClass(), "_canonicalName", null);
        setField(term109859, term109859.getClass(), "_class", null);
        setIntField(term109859, term109859.getClass(), "_hash", 0);
        setField(term109859, term109859.getClass(), "_valueHandler", null);
        setField(term109859, term109859.getClass(), "_typeHandler", null);
        setBooleanField(term109859, term109859.getClass(), "_asStatic", false);
        setElement(term109857, 1, term109859);
        setField(term109860, term109860.getClass(), "_componentType", null);
        setField(term109860, term109860.getClass(), "_emptyArray", null);
        setField(term109860, term109860.getClass(), "_superClass", null);
        setField(term109860, term109860.getClass(), "_superInterfaces", null);
        setField(term109860, term109860.getClass(), "_bindings", null);
        setField(term109860, term109860.getClass(), "_canonicalName", null);
        setField(term109860, term109860.getClass(), "_class", null);
        setIntField(term109860, term109860.getClass(), "_hash", 0);
        setField(term109860, term109860.getClass(), "_valueHandler", null);
        setField(term109860, term109860.getClass(), "_typeHandler", null);
        setBooleanField(term109860, term109860.getClass(), "_asStatic", false);
        setElement(term109857, 2, term109860);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.fasterxml.jackson.databind.type.TypeBindings");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Array.newInstance(Class.forName("java.lang.String"), 0).getClass();
        argTypes[1] = Array.newInstance(Class.forName("com.fasterxml.jackson.databind.JavaType"), 0).getClass();
        argTypes[2] = Array.newInstance(Class.forName("java.lang.String"), 0).getClass();
        Object[] args = new Object[3];
        args[0] = term109255;
        args[1] = term109258;
        args[2] = null;
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term109838));
        assertTrue(recursiveEquals(term109255, term109850));
        assertTrue(recursiveEquals(term109258, term109857));
    }

};


