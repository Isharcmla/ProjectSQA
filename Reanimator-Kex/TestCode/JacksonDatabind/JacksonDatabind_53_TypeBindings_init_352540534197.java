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

public class TypeBindings_init_352540534197 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term65038;
     Object term65039;
     Object term65444;
     Object term65449;
     Object term65450;

    public TypeBindings_init_352540534197() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term65183 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.TypeBindings"));
        Object[] term65042 = (Object[]) newArray("java.lang.String", 0);
        setField(term65183, term65183.getClass(), "_names", term65042);
        setField(term65183, term65183.getClass(), "_types", null);
        term65038 = (Object[]) newArray("java.lang.String", 4);
        term65039 = (Object[]) newArray("com.fasterxml.jackson.databind.JavaType", 4);
        Object term65303 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ResolvedRecursiveType"));
        Object term65407 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ReferenceType"));
        setIntField(term65303, term65303.getClass(), "_hash", 0);
        setElement(term65039, 0, term65303);
        setElement(term65039, 1, term65407);
        setElement(term65039, 2, term65407);
        setElement(term65039, 3, term65407);
        term65444 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.TypeBindings"));
        Object[] term65445 = (Object[]) newArray("java.lang.String", 4);
        Object[] term65446 = (Object[]) newArray("com.fasterxml.jackson.databind.JavaType", 4);
        Object term65447 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ResolvedRecursiveType"));
        Object term65448 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ReferenceType"));
        setField(term65444, term65444.getClass(), "_names", term65445);
        setField(term65447, term65447.getClass(), "_referencedType", null);
        setField(term65447, term65447.getClass(), "_superClass", null);
        setField(term65447, term65447.getClass(), "_superInterfaces", null);
        setField(term65447, term65447.getClass(), "_bindings", null);
        setField(term65447, term65447.getClass(), "_canonicalName", null);
        setField(term65447, term65447.getClass(), "_class", null);
        setIntField(term65447, term65447.getClass(), "_hash", 0);
        setField(term65447, term65447.getClass(), "_valueHandler", null);
        setField(term65447, term65447.getClass(), "_typeHandler", null);
        setBooleanField(term65447, term65447.getClass(), "_asStatic", false);
        setElement(term65446, 0, term65447);
        setField(term65448, term65448.getClass(), "_referencedType", null);
        setField(term65448, term65448.getClass(), "_superClass", null);
        setField(term65448, term65448.getClass(), "_superInterfaces", null);
        setField(term65448, term65448.getClass(), "_bindings", null);
        setField(term65448, term65448.getClass(), "_canonicalName", null);
        setField(term65448, term65448.getClass(), "_class", null);
        setIntField(term65448, term65448.getClass(), "_hash", 0);
        setField(term65448, term65448.getClass(), "_valueHandler", null);
        setField(term65448, term65448.getClass(), "_typeHandler", null);
        setBooleanField(term65448, term65448.getClass(), "_asStatic", false);
        setElement(term65446, 1, term65448);
        setElement(term65446, 2, term65448);
        setElement(term65446, 3, term65448);
        setField(term65444, term65444.getClass(), "_types", term65446);
        setField(term65444, term65444.getClass(), "_unboundVariables", null);
        setIntField(term65444, term65444.getClass(), "_hashCode", 1);
        term65449 = (Object[]) newArray("java.lang.String", 4);
        term65450 = (Object[]) newArray("com.fasterxml.jackson.databind.JavaType", 4);
        Object term65451 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ResolvedRecursiveType"));
        Object term65452 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ReferenceType"));
        setField(term65451, term65451.getClass(), "_referencedType", null);
        setField(term65451, term65451.getClass(), "_superClass", null);
        setField(term65451, term65451.getClass(), "_superInterfaces", null);
        setField(term65451, term65451.getClass(), "_bindings", null);
        setField(term65451, term65451.getClass(), "_canonicalName", null);
        setField(term65451, term65451.getClass(), "_class", null);
        setIntField(term65451, term65451.getClass(), "_hash", 0);
        setField(term65451, term65451.getClass(), "_valueHandler", null);
        setField(term65451, term65451.getClass(), "_typeHandler", null);
        setBooleanField(term65451, term65451.getClass(), "_asStatic", false);
        setElement(term65450, 0, term65451);
        setField(term65452, term65452.getClass(), "_referencedType", null);
        setField(term65452, term65452.getClass(), "_superClass", null);
        setField(term65452, term65452.getClass(), "_superInterfaces", null);
        setField(term65452, term65452.getClass(), "_bindings", null);
        setField(term65452, term65452.getClass(), "_canonicalName", null);
        setField(term65452, term65452.getClass(), "_class", null);
        setIntField(term65452, term65452.getClass(), "_hash", 0);
        setField(term65452, term65452.getClass(), "_valueHandler", null);
        setField(term65452, term65452.getClass(), "_typeHandler", null);
        setBooleanField(term65452, term65452.getClass(), "_asStatic", false);
        setElement(term65450, 1, term65452);
        setElement(term65450, 2, term65452);
        setElement(term65450, 3, term65452);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.fasterxml.jackson.databind.type.TypeBindings");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Array.newInstance(Class.forName("java.lang.String"), 0).getClass();
        argTypes[1] = Array.newInstance(Class.forName("com.fasterxml.jackson.databind.JavaType"), 0).getClass();
        argTypes[2] = Array.newInstance(Class.forName("java.lang.String"), 0).getClass();
        Object[] args = new Object[3];
        args[0] = term65038;
        args[1] = term65039;
        args[2] = null;
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term65444));
        assertTrue(recursiveEquals(term65038, term65449));
        assertTrue(recursiveEquals(term65039, term65450));
    }

};


