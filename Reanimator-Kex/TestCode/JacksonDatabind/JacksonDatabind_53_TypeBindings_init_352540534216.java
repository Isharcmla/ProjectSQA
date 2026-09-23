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

public class TypeBindings_init_352540534216 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term70782;
     Object term70783;
     Object term71900;
     Object term71907;
     Object term71908;

    public TypeBindings_init_352540534216() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term70950 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.TypeBindings"));
        term70782 = (Object[]) newArray("java.lang.String", 4);
        Object[] term70788 = (Object[]) newArray("com.fasterxml.jackson.databind.JavaType", 0);
        setField(term70950, term70950.getClass(), "_names", term70782);
        setField(term70950, term70950.getClass(), "_types", term70788);
        term70783 = (Object[]) newArray("com.fasterxml.jackson.databind.JavaType", 4);
        Object term71070 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ResolvedRecursiveType"));
        Object term71174 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ReferenceType"));
        Object term71266 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.MapType"));
        Object term71364 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.SimpleType"));
        setIntField(term71070, term71070.getClass(), "_hash", 0);
        setElement(term70783, 0, term71070);
        setIntField(term71174, term71174.getClass(), "_hash", 0);
        setElement(term70783, 1, term71174);
        setIntField(term71266, term71266.getClass(), "_hash", 0);
        setElement(term70783, 2, term71266);
        setElement(term70783, 3, term71364);
        term71900 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.TypeBindings"));
        Object[] term71901 = (Object[]) newArray("java.lang.String", 4);
        Object[] term71902 = (Object[]) newArray("com.fasterxml.jackson.databind.JavaType", 4);
        Object term71903 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ResolvedRecursiveType"));
        Object term71904 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ReferenceType"));
        Object term71905 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.MapType"));
        Object term71906 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.SimpleType"));
        setField(term71900, term71900.getClass(), "_names", term71901);
        setField(term71903, term71903.getClass(), "_referencedType", null);
        setField(term71903, term71903.getClass(), "_superClass", null);
        setField(term71903, term71903.getClass(), "_superInterfaces", null);
        setField(term71903, term71903.getClass(), "_bindings", null);
        setField(term71903, term71903.getClass(), "_canonicalName", null);
        setField(term71903, term71903.getClass(), "_class", null);
        setIntField(term71903, term71903.getClass(), "_hash", 0);
        setField(term71903, term71903.getClass(), "_valueHandler", null);
        setField(term71903, term71903.getClass(), "_typeHandler", null);
        setBooleanField(term71903, term71903.getClass(), "_asStatic", false);
        setElement(term71902, 0, term71903);
        setField(term71904, term71904.getClass(), "_referencedType", null);
        setField(term71904, term71904.getClass(), "_superClass", null);
        setField(term71904, term71904.getClass(), "_superInterfaces", null);
        setField(term71904, term71904.getClass(), "_bindings", null);
        setField(term71904, term71904.getClass(), "_canonicalName", null);
        setField(term71904, term71904.getClass(), "_class", null);
        setIntField(term71904, term71904.getClass(), "_hash", 0);
        setField(term71904, term71904.getClass(), "_valueHandler", null);
        setField(term71904, term71904.getClass(), "_typeHandler", null);
        setBooleanField(term71904, term71904.getClass(), "_asStatic", false);
        setElement(term71902, 1, term71904);
        setField(term71905, term71905.getClass(), "_keyType", null);
        setField(term71905, term71905.getClass(), "_valueType", null);
        setField(term71905, term71905.getClass(), "_superClass", null);
        setField(term71905, term71905.getClass(), "_superInterfaces", null);
        setField(term71905, term71905.getClass(), "_bindings", null);
        setField(term71905, term71905.getClass(), "_canonicalName", null);
        setField(term71905, term71905.getClass(), "_class", null);
        setIntField(term71905, term71905.getClass(), "_hash", 0);
        setField(term71905, term71905.getClass(), "_valueHandler", null);
        setField(term71905, term71905.getClass(), "_typeHandler", null);
        setBooleanField(term71905, term71905.getClass(), "_asStatic", false);
        setElement(term71902, 2, term71905);
        setField(term71906, term71906.getClass(), "_superClass", null);
        setField(term71906, term71906.getClass(), "_superInterfaces", null);
        setField(term71906, term71906.getClass(), "_bindings", null);
        setField(term71906, term71906.getClass(), "_canonicalName", null);
        setField(term71906, term71906.getClass(), "_class", null);
        setIntField(term71906, term71906.getClass(), "_hash", 0);
        setField(term71906, term71906.getClass(), "_valueHandler", null);
        setField(term71906, term71906.getClass(), "_typeHandler", null);
        setBooleanField(term71906, term71906.getClass(), "_asStatic", false);
        setElement(term71902, 3, term71906);
        setField(term71900, term71900.getClass(), "_types", term71902);
        setField(term71900, term71900.getClass(), "_unboundVariables", null);
        setIntField(term71900, term71900.getClass(), "_hashCode", 1);
        term71907 = (Object[]) newArray("java.lang.String", 4);
        term71908 = (Object[]) newArray("com.fasterxml.jackson.databind.JavaType", 4);
        Object term71909 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ResolvedRecursiveType"));
        Object term71910 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ReferenceType"));
        Object term71911 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.MapType"));
        Object term71912 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.SimpleType"));
        setField(term71909, term71909.getClass(), "_referencedType", null);
        setField(term71909, term71909.getClass(), "_superClass", null);
        setField(term71909, term71909.getClass(), "_superInterfaces", null);
        setField(term71909, term71909.getClass(), "_bindings", null);
        setField(term71909, term71909.getClass(), "_canonicalName", null);
        setField(term71909, term71909.getClass(), "_class", null);
        setIntField(term71909, term71909.getClass(), "_hash", 0);
        setField(term71909, term71909.getClass(), "_valueHandler", null);
        setField(term71909, term71909.getClass(), "_typeHandler", null);
        setBooleanField(term71909, term71909.getClass(), "_asStatic", false);
        setElement(term71908, 0, term71909);
        setField(term71910, term71910.getClass(), "_referencedType", null);
        setField(term71910, term71910.getClass(), "_superClass", null);
        setField(term71910, term71910.getClass(), "_superInterfaces", null);
        setField(term71910, term71910.getClass(), "_bindings", null);
        setField(term71910, term71910.getClass(), "_canonicalName", null);
        setField(term71910, term71910.getClass(), "_class", null);
        setIntField(term71910, term71910.getClass(), "_hash", 0);
        setField(term71910, term71910.getClass(), "_valueHandler", null);
        setField(term71910, term71910.getClass(), "_typeHandler", null);
        setBooleanField(term71910, term71910.getClass(), "_asStatic", false);
        setElement(term71908, 1, term71910);
        setField(term71911, term71911.getClass(), "_keyType", null);
        setField(term71911, term71911.getClass(), "_valueType", null);
        setField(term71911, term71911.getClass(), "_superClass", null);
        setField(term71911, term71911.getClass(), "_superInterfaces", null);
        setField(term71911, term71911.getClass(), "_bindings", null);
        setField(term71911, term71911.getClass(), "_canonicalName", null);
        setField(term71911, term71911.getClass(), "_class", null);
        setIntField(term71911, term71911.getClass(), "_hash", 0);
        setField(term71911, term71911.getClass(), "_valueHandler", null);
        setField(term71911, term71911.getClass(), "_typeHandler", null);
        setBooleanField(term71911, term71911.getClass(), "_asStatic", false);
        setElement(term71908, 2, term71911);
        setField(term71912, term71912.getClass(), "_superClass", null);
        setField(term71912, term71912.getClass(), "_superInterfaces", null);
        setField(term71912, term71912.getClass(), "_bindings", null);
        setField(term71912, term71912.getClass(), "_canonicalName", null);
        setField(term71912, term71912.getClass(), "_class", null);
        setIntField(term71912, term71912.getClass(), "_hash", 0);
        setField(term71912, term71912.getClass(), "_valueHandler", null);
        setField(term71912, term71912.getClass(), "_typeHandler", null);
        setBooleanField(term71912, term71912.getClass(), "_asStatic", false);
        setElement(term71908, 3, term71912);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.fasterxml.jackson.databind.type.TypeBindings");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Array.newInstance(Class.forName("java.lang.String"), 0).getClass();
        argTypes[1] = Array.newInstance(Class.forName("com.fasterxml.jackson.databind.JavaType"), 0).getClass();
        argTypes[2] = Array.newInstance(Class.forName("java.lang.String"), 0).getClass();
        Object[] args = new Object[3];
        args[0] = term70782;
        args[1] = term70783;
        args[2] = null;
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term71900));
        assertTrue(recursiveEquals(term70782, term71907));
        assertTrue(recursiveEquals(term70783, term71908));
    }

};


