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

public class TypeBindings_init_352540534375 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term132194;
     Object term132198;

    public TypeBindings_init_352540534375() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term132368 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.TypeBindings"));
        setField(term132368, term132368.getClass(), "_names", null);
        setField(term132368, term132368.getClass(), "_types", null);
        term132194 = (Object[]) newArray("java.lang.String", 5);
        setElement(term132194, 0, "");
        setElement(term132194, 1, "");
        setElement(term132194, 2, "");
        setElement(term132194, 3, "");
        setElement(term132194, 4, "");
        term132198 = (Object[]) newArray("com.fasterxml.jackson.databind.JavaType", 5);
        Object term132602 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ResolvedRecursiveType"));
        Object term132706 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ReferenceType"));
        Object term132826 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ResolvedRecursiveType"));
        Object term132930 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ReferenceType"));
        setIntField(term132602, term132602.getClass(), "_hash", 0);
        setElement(term132198, 0, term132602);
        setIntField(term132706, term132706.getClass(), "_hash", 0);
        setElement(term132198, 1, term132706);
        setIntField(term132826, term132826.getClass(), "_hash", 0);
        setElement(term132198, 2, term132826);
        setIntField(term132930, term132930.getClass(), "_hash", 0);
        setElement(term132198, 3, term132930);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.fasterxml.jackson.databind.type.TypeBindings");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Array.newInstance(Class.forName("java.lang.String"), 0).getClass();
        argTypes[1] = Array.newInstance(Class.forName("com.fasterxml.jackson.databind.JavaType"), 0).getClass();
        argTypes[2] = Array.newInstance(Class.forName("java.lang.String"), 0).getClass();
        Object[] args = new Object[3];
        args[0] = term132194;
        args[1] = term132198;
        args[2] = null;
        try {
            Object instance = callConstructor(klass, argTypes, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


