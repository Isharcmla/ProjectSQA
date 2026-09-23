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

public class TypeBindings_init_352540534405 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term147386;
     Object term147393;

    public TypeBindings_init_352540534405() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term147598 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.TypeBindings"));
        setField(term147598, term147598.getClass(), "_names", null);
        setField(term147598, term147598.getClass(), "_types", null);
        term147386 = (Object[]) newArray("java.lang.String", 9);
        setElement(term147386, 0, "");
        setElement(term147386, 1, "");
        setElement(term147386, 2, "");
        setElement(term147386, 3, "");
        setElement(term147386, 4, "");
        setElement(term147386, 5, "");
        setElement(term147386, 6, "");
        setElement(term147386, 7, "");
        setElement(term147386, 8, "");
        term147393 = (Object[]) newArray("com.fasterxml.jackson.databind.JavaType", 9);
        Object term147946 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ResolvedRecursiveType"));
        Object term148050 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ReferenceType"));
        Object term148154 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ReferenceType"));
        Object term148260 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.CollectionType"));
        Object term148366 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.CollectionType"));
        Object term148470 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ReferenceType"));
        setIntField(term147946, term147946.getClass(), "_hash", 0);
        setElement(term147393, 0, term147946);
        setIntField(term148050, term148050.getClass(), "_hash", 0);
        setElement(term147393, 1, term148050);
        setIntField(term148154, term148154.getClass(), "_hash", 0);
        setElement(term147393, 2, term148154);
        setElement(term147393, 3, term147946);
        setIntField(term148260, term148260.getClass(), "_hash", 0);
        setElement(term147393, 4, term148260);
        setIntField(term148366, term148366.getClass(), "_hash", 0);
        setElement(term147393, 5, term148366);
        setIntField(term148470, term148470.getClass(), "_hash", 0);
        setElement(term147393, 6, term148470);
        setElement(term147393, 7, term148154);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.fasterxml.jackson.databind.type.TypeBindings");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Array.newInstance(Class.forName("java.lang.String"), 0).getClass();
        argTypes[1] = Array.newInstance(Class.forName("com.fasterxml.jackson.databind.JavaType"), 0).getClass();
        argTypes[2] = Array.newInstance(Class.forName("java.lang.String"), 0).getClass();
        Object[] args = new Object[3];
        args[0] = term147386;
        args[1] = term147393;
        args[2] = null;
        try {
            Object instance = callConstructor(klass, argTypes, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


