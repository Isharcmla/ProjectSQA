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

public class TypeBindings_init_352540534515 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term205252;
     Object term205260;

    public TypeBindings_init_352540534515() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term205455 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.TypeBindings"));
        Object[] term205267 = (Object[]) newArray("java.lang.String", 0);
        Object[] term205268 = (Object[]) newArray("com.fasterxml.jackson.databind.JavaType", 0);
        setField(term205455, term205455.getClass(), "_names", term205267);
        setField(term205455, term205455.getClass(), "_types", term205268);
        term205252 = (Object[]) newArray("java.lang.String", 7);
        setElement(term205252, 0, "");
        setElement(term205252, 1, "");
        setElement(term205252, 2, "");
        setElement(term205252, 3, "");
        setElement(term205252, 4, "");
        setElement(term205252, 5, "");
        setElement(term205252, 6, "");
        term205260 = (Object[]) newArray("com.fasterxml.jackson.databind.JavaType", 7);
        Object term205827 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.CollectionType"));
        Object term205931 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ReferenceType"));
        Object term206035 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ReferenceType"));
        Object term206155 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ResolvedRecursiveType"));
        Object term206261 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.CollectionType"));
        Object term206381 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ResolvedRecursiveType"));
        setIntField(term205827, term205827.getClass(), "_hash", 0);
        setElement(term205260, 0, term205827);
        setIntField(term205931, term205931.getClass(), "_hash", 0);
        setElement(term205260, 1, term205931);
        setIntField(term206035, term206035.getClass(), "_hash", 0);
        setElement(term205260, 2, term206035);
        setIntField(term206155, term206155.getClass(), "_hash", 0);
        setElement(term205260, 3, term206155);
        setIntField(term206261, term206261.getClass(), "_hash", 0);
        setElement(term205260, 4, term206261);
        setIntField(term206381, term206381.getClass(), "_hash", 0);
        setElement(term205260, 5, term206381);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.fasterxml.jackson.databind.type.TypeBindings");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Array.newInstance(Class.forName("java.lang.String"), 0).getClass();
        argTypes[1] = Array.newInstance(Class.forName("com.fasterxml.jackson.databind.JavaType"), 0).getClass();
        argTypes[2] = Array.newInstance(Class.forName("java.lang.String"), 0).getClass();
        Object[] args = new Object[3];
        args[0] = term205252;
        args[1] = term205260;
        args[2] = null;
        try {
            Object instance = callConstructor(klass, argTypes, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


