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

public class TypeBindings_init_352540534407 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term149013;
     Object term149016;

    public TypeBindings_init_352540534407() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term149208 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.TypeBindings"));
        Object[] term149023 = (Object[]) newArray("com.fasterxml.jackson.databind.JavaType", 0);
        setField(term149208, term149208.getClass(), "_names", null);
        setField(term149208, term149208.getClass(), "_types", term149023);
        term149013 = (Object[]) newArray("java.lang.String", 7);
        setElement(term149013, 0, "");
        setElement(term149013, 1, "");
        setElement(term149013, 2, "");
        setElement(term149013, 3, "");
        setElement(term149013, 4, "");
        setElement(term149013, 5, "");
        setElement(term149013, 6, "");
        term149016 = (Object[]) newArray("com.fasterxml.jackson.databind.JavaType", 7);
        Object term149404 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ResolvedRecursiveType"));
        Object term149508 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ReferenceType"));
        Object term149612 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ReferenceType"));
        Object term149732 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ResolvedRecursiveType"));
        Object term149838 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.CollectionType"));
        Object term149958 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ResolvedRecursiveType"));
        setIntField(term149404, term149404.getClass(), "_hash", 0);
        setElement(term149016, 0, term149404);
        setIntField(term149508, term149508.getClass(), "_hash", 0);
        setElement(term149016, 1, term149508);
        setIntField(term149612, term149612.getClass(), "_hash", 0);
        setElement(term149016, 2, term149612);
        setIntField(term149732, term149732.getClass(), "_hash", 0);
        setElement(term149016, 3, term149732);
        setIntField(term149838, term149838.getClass(), "_hash", 0);
        setElement(term149016, 4, term149838);
        setIntField(term149958, term149958.getClass(), "_hash", 0);
        setElement(term149016, 5, term149958);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.fasterxml.jackson.databind.type.TypeBindings");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Array.newInstance(Class.forName("java.lang.String"), 0).getClass();
        argTypes[1] = Array.newInstance(Class.forName("com.fasterxml.jackson.databind.JavaType"), 0).getClass();
        argTypes[2] = Array.newInstance(Class.forName("java.lang.String"), 0).getClass();
        Object[] args = new Object[3];
        args[0] = term149013;
        args[1] = term149016;
        args[2] = null;
        try {
            Object instance = callConstructor(klass, argTypes, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


