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

public class TypeBindings_init_352540534399 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term144207;
     Object term144215;

    public TypeBindings_init_352540534399() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term144405 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.TypeBindings"));
        setField(term144405, term144405.getClass(), "_names", null);
        setField(term144405, term144405.getClass(), "_types", null);
        term144207 = (Object[]) newArray("java.lang.String", 7);
        setElement(term144207, 0, "");
        setElement(term144207, 1, "");
        setElement(term144207, 2, "");
        setElement(term144207, 3, "");
        setElement(term144207, 4, "");
        setElement(term144207, 5, "");
        setElement(term144207, 6, "");
        term144215 = (Object[]) newArray("com.fasterxml.jackson.databind.JavaType", 7);
        Object term144791 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ResolvedRecursiveType"));
        Object term144895 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ReferenceType"));
        Object term144987 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.MapType"));
        Object term145091 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ReferenceType"));
        Object term145197 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.CollectionType"));
        Object term145289 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.MapType"));
        setIntField(term144791, term144791.getClass(), "_hash", 0);
        setElement(term144215, 0, term144791);
        setIntField(term144895, term144895.getClass(), "_hash", 0);
        setElement(term144215, 1, term144895);
        setIntField(term144987, term144987.getClass(), "_hash", 0);
        setElement(term144215, 2, term144987);
        setIntField(term145091, term145091.getClass(), "_hash", 0);
        setElement(term144215, 3, term145091);
        setIntField(term145197, term145197.getClass(), "_hash", 0);
        setElement(term144215, 4, term145197);
        setIntField(term145289, term145289.getClass(), "_hash", 0);
        setElement(term144215, 5, term145289);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.fasterxml.jackson.databind.type.TypeBindings");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Array.newInstance(Class.forName("java.lang.String"), 0).getClass();
        argTypes[1] = Array.newInstance(Class.forName("com.fasterxml.jackson.databind.JavaType"), 0).getClass();
        argTypes[2] = Array.newInstance(Class.forName("java.lang.String"), 0).getClass();
        Object[] args = new Object[3];
        args[0] = term144207;
        args[1] = term144215;
        args[2] = null;
        try {
            Object instance = callConstructor(klass, argTypes, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


