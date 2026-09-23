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

public class TypeBindings_init_352540534478 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term187523;
     Object term187527;
     Object term188716;
     Object term188730;
     Object term188739;

    public TypeBindings_init_352540534478() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term187689 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.TypeBindings"));
        Object[] term187531 = (Object[]) newArray("com.fasterxml.jackson.databind.JavaType", 0);
        setField(term187689, term187689.getClass(), "_names", null);
        setField(term187689, term187689.getClass(), "_types", term187531);
        term187523 = (Object[]) newArray("java.lang.String", 4);
        setElement(term187523, 0, "");
        setElement(term187523, 1, "");
        setElement(term187523, 2, "");
        setElement(term187523, 3, "");
        term187527 = (Object[]) newArray("com.fasterxml.jackson.databind.JavaType", 4);
        Object term187909 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.CollectionType"));
        Object term188005 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ArrayType"));
        Object term188125 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ResolvedRecursiveType"));
        setIntField(term187909, term187909.getClass(), "_hash", 0);
        setElement(term187527, 0, term187909);
        setIntField(term188005, term188005.getClass(), "_hash", 0);
        setElement(term187527, 1, term188005);
        setIntField(term188125, term188125.getClass(), "_hash", 0);
        setElement(term187527, 2, term188125);
        setElement(term187527, 3, term187909);
        term188716 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.TypeBindings"));
        Object[] term188717 = (Object[]) newArray("java.lang.String", 4);
        Object[] term188726 = (Object[]) newArray("com.fasterxml.jackson.databind.JavaType", 4);
        Object term188727 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.CollectionType"));
        Object term188728 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ArrayType"));
        Object term188729 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ResolvedRecursiveType"));
        setElement(term188717, 0, "");
        setElement(term188717, 1, "");
        setElement(term188717, 2, "");
        setElement(term188717, 3, "");
        setField(term188716, term188716.getClass(), "_names", term188717);
        setField(term188727, term188727.getClass(), "_elementType", null);
        setField(term188727, term188727.getClass(), "_superClass", null);
        setField(term188727, term188727.getClass(), "_superInterfaces", null);
        setField(term188727, term188727.getClass(), "_bindings", null);
        setField(term188727, term188727.getClass(), "_canonicalName", null);
        setField(term188727, term188727.getClass(), "_class", null);
        setIntField(term188727, term188727.getClass(), "_hash", 0);
        setField(term188727, term188727.getClass(), "_valueHandler", null);
        setField(term188727, term188727.getClass(), "_typeHandler", null);
        setBooleanField(term188727, term188727.getClass(), "_asStatic", false);
        setElement(term188726, 0, term188727);
        setField(term188728, term188728.getClass(), "_componentType", null);
        setField(term188728, term188728.getClass(), "_emptyArray", null);
        setField(term188728, term188728.getClass(), "_superClass", null);
        setField(term188728, term188728.getClass(), "_superInterfaces", null);
        setField(term188728, term188728.getClass(), "_bindings", null);
        setField(term188728, term188728.getClass(), "_canonicalName", null);
        setField(term188728, term188728.getClass(), "_class", null);
        setIntField(term188728, term188728.getClass(), "_hash", 0);
        setField(term188728, term188728.getClass(), "_valueHandler", null);
        setField(term188728, term188728.getClass(), "_typeHandler", null);
        setBooleanField(term188728, term188728.getClass(), "_asStatic", false);
        setElement(term188726, 1, term188728);
        setField(term188729, term188729.getClass(), "_referencedType", null);
        setField(term188729, term188729.getClass(), "_superClass", null);
        setField(term188729, term188729.getClass(), "_superInterfaces", null);
        setField(term188729, term188729.getClass(), "_bindings", null);
        setField(term188729, term188729.getClass(), "_canonicalName", null);
        setField(term188729, term188729.getClass(), "_class", null);
        setIntField(term188729, term188729.getClass(), "_hash", 0);
        setField(term188729, term188729.getClass(), "_valueHandler", null);
        setField(term188729, term188729.getClass(), "_typeHandler", null);
        setBooleanField(term188729, term188729.getClass(), "_asStatic", false);
        setElement(term188726, 2, term188729);
        setElement(term188726, 3, term188727);
        setField(term188716, term188716.getClass(), "_types", term188726);
        setField(term188716, term188716.getClass(), "_unboundVariables", null);
        setIntField(term188716, term188716.getClass(), "_hashCode", 1);
        term188730 = (Object[]) newArray("java.lang.String", 4);
        setElement(term188730, 0, "");
        setElement(term188730, 1, "");
        setElement(term188730, 2, "");
        setElement(term188730, 3, "");
        term188739 = (Object[]) newArray("com.fasterxml.jackson.databind.JavaType", 4);
        Object term188740 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.CollectionType"));
        Object term188741 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ArrayType"));
        Object term188742 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ResolvedRecursiveType"));
        setField(term188740, term188740.getClass(), "_elementType", null);
        setField(term188740, term188740.getClass(), "_superClass", null);
        setField(term188740, term188740.getClass(), "_superInterfaces", null);
        setField(term188740, term188740.getClass(), "_bindings", null);
        setField(term188740, term188740.getClass(), "_canonicalName", null);
        setField(term188740, term188740.getClass(), "_class", null);
        setIntField(term188740, term188740.getClass(), "_hash", 0);
        setField(term188740, term188740.getClass(), "_valueHandler", null);
        setField(term188740, term188740.getClass(), "_typeHandler", null);
        setBooleanField(term188740, term188740.getClass(), "_asStatic", false);
        setElement(term188739, 0, term188740);
        setField(term188741, term188741.getClass(), "_componentType", null);
        setField(term188741, term188741.getClass(), "_emptyArray", null);
        setField(term188741, term188741.getClass(), "_superClass", null);
        setField(term188741, term188741.getClass(), "_superInterfaces", null);
        setField(term188741, term188741.getClass(), "_bindings", null);
        setField(term188741, term188741.getClass(), "_canonicalName", null);
        setField(term188741, term188741.getClass(), "_class", null);
        setIntField(term188741, term188741.getClass(), "_hash", 0);
        setField(term188741, term188741.getClass(), "_valueHandler", null);
        setField(term188741, term188741.getClass(), "_typeHandler", null);
        setBooleanField(term188741, term188741.getClass(), "_asStatic", false);
        setElement(term188739, 1, term188741);
        setField(term188742, term188742.getClass(), "_referencedType", null);
        setField(term188742, term188742.getClass(), "_superClass", null);
        setField(term188742, term188742.getClass(), "_superInterfaces", null);
        setField(term188742, term188742.getClass(), "_bindings", null);
        setField(term188742, term188742.getClass(), "_canonicalName", null);
        setField(term188742, term188742.getClass(), "_class", null);
        setIntField(term188742, term188742.getClass(), "_hash", 0);
        setField(term188742, term188742.getClass(), "_valueHandler", null);
        setField(term188742, term188742.getClass(), "_typeHandler", null);
        setBooleanField(term188742, term188742.getClass(), "_asStatic", false);
        setElement(term188739, 2, term188742);
        setElement(term188739, 3, term188740);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.fasterxml.jackson.databind.type.TypeBindings");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Array.newInstance(Class.forName("java.lang.String"), 0).getClass();
        argTypes[1] = Array.newInstance(Class.forName("com.fasterxml.jackson.databind.JavaType"), 0).getClass();
        argTypes[2] = Array.newInstance(Class.forName("java.lang.String"), 0).getClass();
        Object[] args = new Object[3];
        args[0] = term187523;
        args[1] = term187527;
        args[2] = null;
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term188716));
        assertTrue(recursiveEquals(term187523, term188730));
        assertTrue(recursiveEquals(term187527, term188739));
    }

};


