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

public class TypeBindings_init_352540534341 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term116915;
     Object term116917;

    public TypeBindings_init_352540534341() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term117078 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.TypeBindings"));
        Object[] term116921 = (Object[]) newArray("java.lang.String", 0);
        Object[] term116922 = (Object[]) newArray("com.fasterxml.jackson.databind.JavaType", 0);
        setField(term117078, term117078.getClass(), "_names", term116921);
        setField(term117078, term117078.getClass(), "_types", term116922);
        term116915 = (Object[]) newArray("java.lang.String", 4);
        setElement(term116915, 0, "");
        setElement(term116915, 1, "");
        setElement(term116915, 2, "");
        setElement(term116915, 3, "");
        term116917 = (Object[]) newArray("com.fasterxml.jackson.databind.JavaType", 4);
        Object term117236 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ResolvedRecursiveType"));
        Object term117340 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ReferenceType"));
        Object term117460 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ResolvedRecursiveType"));
        setIntField(term117236, term117236.getClass(), "_hash", 0);
        setElement(term116917, 0, term117236);
        setIntField(term117340, term117340.getClass(), "_hash", 0);
        setElement(term116917, 1, term117340);
        setIntField(term117460, term117460.getClass(), "_hash", 0);
        setElement(term116917, 2, term117460);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.fasterxml.jackson.databind.type.TypeBindings");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Array.newInstance(Class.forName("java.lang.String"), 0).getClass();
        argTypes[1] = Array.newInstance(Class.forName("com.fasterxml.jackson.databind.JavaType"), 0).getClass();
        argTypes[2] = Array.newInstance(Class.forName("java.lang.String"), 0).getClass();
        Object[] args = new Object[3];
        args[0] = term116915;
        args[1] = term116917;
        args[2] = null;
        try {
            Object instance = callConstructor(klass, argTypes, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


