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

public class TypeBindings_init_352540534159 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term53470;
     Object term53471;
     Object term53845;
     Object term53850;
     Object term53851;

    public TypeBindings_init_352540534159() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term53614 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.TypeBindings"));
        setField(term53614, term53614.getClass(), "_names", null);
        setField(term53614, term53614.getClass(), "_types", null);
        term53470 = (Object[]) newArray("java.lang.String", 2);
        term53471 = (Object[]) newArray("com.fasterxml.jackson.databind.JavaType", 2);
        Object term53720 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.CollectionType"));
        Object term53818 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.SimpleType"));
        setIntField(term53720, term53720.getClass(), "_hash", 0);
        setElement(term53471, 0, term53720);
        setElement(term53471, 1, term53818);
        term53845 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.TypeBindings"));
        Object[] term53846 = (Object[]) newArray("java.lang.String", 2);
        Object[] term53847 = (Object[]) newArray("com.fasterxml.jackson.databind.JavaType", 2);
        Object term53848 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.CollectionType"));
        Object term53849 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.SimpleType"));
        setField(term53845, term53845.getClass(), "_names", term53846);
        setField(term53848, term53848.getClass(), "_elementType", null);
        setField(term53848, term53848.getClass(), "_superClass", null);
        setField(term53848, term53848.getClass(), "_superInterfaces", null);
        setField(term53848, term53848.getClass(), "_bindings", null);
        setField(term53848, term53848.getClass(), "_canonicalName", null);
        setField(term53848, term53848.getClass(), "_class", null);
        setIntField(term53848, term53848.getClass(), "_hash", 0);
        setField(term53848, term53848.getClass(), "_valueHandler", null);
        setField(term53848, term53848.getClass(), "_typeHandler", null);
        setBooleanField(term53848, term53848.getClass(), "_asStatic", false);
        setElement(term53847, 0, term53848);
        setField(term53849, term53849.getClass(), "_superClass", null);
        setField(term53849, term53849.getClass(), "_superInterfaces", null);
        setField(term53849, term53849.getClass(), "_bindings", null);
        setField(term53849, term53849.getClass(), "_canonicalName", null);
        setField(term53849, term53849.getClass(), "_class", null);
        setIntField(term53849, term53849.getClass(), "_hash", 0);
        setField(term53849, term53849.getClass(), "_valueHandler", null);
        setField(term53849, term53849.getClass(), "_typeHandler", null);
        setBooleanField(term53849, term53849.getClass(), "_asStatic", false);
        setElement(term53847, 1, term53849);
        setField(term53845, term53845.getClass(), "_types", term53847);
        setField(term53845, term53845.getClass(), "_unboundVariables", null);
        setIntField(term53845, term53845.getClass(), "_hashCode", 1);
        term53850 = (Object[]) newArray("java.lang.String", 2);
        term53851 = (Object[]) newArray("com.fasterxml.jackson.databind.JavaType", 2);
        Object term53852 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.CollectionType"));
        Object term53853 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.SimpleType"));
        setField(term53852, term53852.getClass(), "_elementType", null);
        setField(term53852, term53852.getClass(), "_superClass", null);
        setField(term53852, term53852.getClass(), "_superInterfaces", null);
        setField(term53852, term53852.getClass(), "_bindings", null);
        setField(term53852, term53852.getClass(), "_canonicalName", null);
        setField(term53852, term53852.getClass(), "_class", null);
        setIntField(term53852, term53852.getClass(), "_hash", 0);
        setField(term53852, term53852.getClass(), "_valueHandler", null);
        setField(term53852, term53852.getClass(), "_typeHandler", null);
        setBooleanField(term53852, term53852.getClass(), "_asStatic", false);
        setElement(term53851, 0, term53852);
        setField(term53853, term53853.getClass(), "_superClass", null);
        setField(term53853, term53853.getClass(), "_superInterfaces", null);
        setField(term53853, term53853.getClass(), "_bindings", null);
        setField(term53853, term53853.getClass(), "_canonicalName", null);
        setField(term53853, term53853.getClass(), "_class", null);
        setIntField(term53853, term53853.getClass(), "_hash", 0);
        setField(term53853, term53853.getClass(), "_valueHandler", null);
        setField(term53853, term53853.getClass(), "_typeHandler", null);
        setBooleanField(term53853, term53853.getClass(), "_asStatic", false);
        setElement(term53851, 1, term53853);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.fasterxml.jackson.databind.type.TypeBindings");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Array.newInstance(Class.forName("java.lang.String"), 0).getClass();
        argTypes[1] = Array.newInstance(Class.forName("com.fasterxml.jackson.databind.JavaType"), 0).getClass();
        argTypes[2] = Array.newInstance(Class.forName("java.lang.String"), 0).getClass();
        Object[] args = new Object[3];
        args[0] = term53470;
        args[1] = term53471;
        args[2] = null;
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term53845));
        assertTrue(recursiveEquals(term53470, term53850));
        assertTrue(recursiveEquals(term53471, term53851));
    }

};


