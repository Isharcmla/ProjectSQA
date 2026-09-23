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

public class TypeBindings_init_352540534441 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term168873;
     Object term168875;

    public TypeBindings_init_352540534441() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term169036 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.TypeBindings"));
        Object[] term168879 = (Object[]) newArray("java.lang.String", 0);
        Object[] term168880 = (Object[]) newArray("com.fasterxml.jackson.databind.JavaType", 0);
        setField(term169036, term169036.getClass(), "_names", term168879);
        setField(term169036, term169036.getClass(), "_types", term168880);
        term168873 = (Object[]) newArray("java.lang.String", 4);
        setElement(term168873, 0, "");
        setElement(term168873, 1, "");
        setElement(term168873, 2, "");
        setElement(term168873, 3, "");
        term168875 = (Object[]) newArray("com.fasterxml.jackson.databind.JavaType", 4);
        Object term169178 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ReferenceType"));
        Object term169284 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.CollectionType"));
        Object term169388 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ReferenceType"));
        setIntField(term169178, term169178.getClass(), "_hash", 0);
        setElement(term168875, 0, term169178);
        setIntField(term169284, term169284.getClass(), "_hash", 0);
        setElement(term168875, 1, term169284);
        setIntField(term169388, term169388.getClass(), "_hash", 0);
        setElement(term168875, 2, term169388);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.fasterxml.jackson.databind.type.TypeBindings");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Array.newInstance(Class.forName("java.lang.String"), 0).getClass();
        argTypes[1] = Array.newInstance(Class.forName("com.fasterxml.jackson.databind.JavaType"), 0).getClass();
        argTypes[2] = Array.newInstance(Class.forName("java.lang.String"), 0).getClass();
        Object[] args = new Object[3];
        args[0] = term168873;
        args[1] = term168875;
        args[2] = null;
        try {
            Object instance = callConstructor(klass, argTypes, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


