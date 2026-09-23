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
import java.lang.NullPointerException;
import static com.fasterxml.jackson.databind.type.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class TypeBindings_init_352540534479 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term188127;
     Object term188129;

    public TypeBindings_init_352540534479() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term188290 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.TypeBindings"));
        Object[] term188133 = (Object[]) newArray("java.lang.String", 0);
        Object[] term188134 = (Object[]) newArray("com.fasterxml.jackson.databind.JavaType", 0);
        setField(term188290, term188290.getClass(), "_names", term188133);
        setField(term188290, term188290.getClass(), "_types", term188134);
        term188127 = (Object[]) newArray("java.lang.String", 4);
        setElement(term188127, 0, "");
        setElement(term188127, 1, "");
        setElement(term188127, 2, "");
        setElement(term188127, 3, "");
        term188129 = (Object[]) newArray("com.fasterxml.jackson.databind.JavaType", 4);
        Object term188448 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ResolvedRecursiveType"));
        Object term188540 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.MapType"));
        Object term188660 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ResolvedRecursiveType"));
        setIntField(term188448, term188448.getClass(), "_hash", 0);
        setElement(term188129, 0, term188448);
        setIntField(term188540, term188540.getClass(), "_hash", 0);
        setElement(term188129, 1, term188540);
        setIntField(term188660, term188660.getClass(), "_hash", 0);
        setElement(term188129, 2, term188660);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.fasterxml.jackson.databind.type.TypeBindings");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Array.newInstance(Class.forName("java.lang.String"), 0).getClass();
        argTypes[1] = Array.newInstance(Class.forName("com.fasterxml.jackson.databind.JavaType"), 0).getClass();
        argTypes[2] = Array.newInstance(Class.forName("java.lang.String"), 0).getClass();
        Object[] args = new Object[3];
        args[0] = term188127;
        args[1] = term188129;
        args[2] = null;
        try {
            Object instance = callConstructor(klass, argTypes, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


