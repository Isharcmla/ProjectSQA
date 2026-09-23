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

public class TypeBindings_init_352540534135 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term44615;
     Object term44616;
     Object term44874;
     Object term44878;
     Object term44879;

    public TypeBindings_init_352540534135() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term44751 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.TypeBindings"));
        Object[] term44618 = (Object[]) newArray("java.lang.String", 0);
        Object[] term44619 = (Object[]) newArray("com.fasterxml.jackson.databind.JavaType", 0);
        setField(term44751, term44751.getClass(), "_names", term44618);
        setField(term44751, term44751.getClass(), "_types", term44619);
        term44615 = (Object[]) newArray("java.lang.String", 1);
        term44616 = (Object[]) newArray("com.fasterxml.jackson.databind.JavaType", 1);
        Object term44855 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ReferenceType"));
        setElement(term44616, 0, term44855);
        term44874 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.TypeBindings"));
        Object[] term44875 = (Object[]) newArray("java.lang.String", 1);
        Object[] term44876 = (Object[]) newArray("com.fasterxml.jackson.databind.JavaType", 1);
        Object term44877 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ReferenceType"));
        setField(term44874, term44874.getClass(), "_names", term44875);
        setField(term44877, term44877.getClass(), "_referencedType", null);
        setField(term44877, term44877.getClass(), "_superClass", null);
        setField(term44877, term44877.getClass(), "_superInterfaces", null);
        setField(term44877, term44877.getClass(), "_bindings", null);
        setField(term44877, term44877.getClass(), "_canonicalName", null);
        setField(term44877, term44877.getClass(), "_class", null);
        setIntField(term44877, term44877.getClass(), "_hash", 0);
        setField(term44877, term44877.getClass(), "_valueHandler", null);
        setField(term44877, term44877.getClass(), "_typeHandler", null);
        setBooleanField(term44877, term44877.getClass(), "_asStatic", false);
        setElement(term44876, 0, term44877);
        setField(term44874, term44874.getClass(), "_types", term44876);
        setField(term44874, term44874.getClass(), "_unboundVariables", null);
        setIntField(term44874, term44874.getClass(), "_hashCode", 1);
        term44878 = (Object[]) newArray("java.lang.String", 1);
        term44879 = (Object[]) newArray("com.fasterxml.jackson.databind.JavaType", 1);
        Object term44880 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ReferenceType"));
        setField(term44880, term44880.getClass(), "_referencedType", null);
        setField(term44880, term44880.getClass(), "_superClass", null);
        setField(term44880, term44880.getClass(), "_superInterfaces", null);
        setField(term44880, term44880.getClass(), "_bindings", null);
        setField(term44880, term44880.getClass(), "_canonicalName", null);
        setField(term44880, term44880.getClass(), "_class", null);
        setIntField(term44880, term44880.getClass(), "_hash", 0);
        setField(term44880, term44880.getClass(), "_valueHandler", null);
        setField(term44880, term44880.getClass(), "_typeHandler", null);
        setBooleanField(term44880, term44880.getClass(), "_asStatic", false);
        setElement(term44879, 0, term44880);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.fasterxml.jackson.databind.type.TypeBindings");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Array.newInstance(Class.forName("java.lang.String"), 0).getClass();
        argTypes[1] = Array.newInstance(Class.forName("com.fasterxml.jackson.databind.JavaType"), 0).getClass();
        argTypes[2] = Array.newInstance(Class.forName("java.lang.String"), 0).getClass();
        Object[] args = new Object[3];
        args[0] = term44615;
        args[1] = term44616;
        args[2] = null;
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term44874));
        assertTrue(recursiveEquals(term44615, term44878));
        assertTrue(recursiveEquals(term44616, term44879));
    }

};


