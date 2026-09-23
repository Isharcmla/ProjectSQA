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

public class TypeBindings_init_352540534335 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term113409;
     Object term113415;

    public TypeBindings_init_352540534335() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term113600 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.TypeBindings"));
        Object[] term113421 = (Object[]) newArray("java.lang.String", 0);
        setField(term113600, term113600.getClass(), "_names", term113421);
        setField(term113600, term113600.getClass(), "_types", null);
        term113409 = (Object[]) newArray("java.lang.String", 6);
        setElement(term113409, 0, "");
        setElement(term113409, 1, "");
        setElement(term113409, 2, "");
        setElement(term113409, 3, "");
        setElement(term113409, 4, "");
        setElement(term113409, 5, "");
        term113415 = (Object[]) newArray("com.fasterxml.jackson.databind.JavaType", 6);
        Object term113910 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ResolvedRecursiveType"));
        Object term114014 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ReferenceType"));
        Object term114118 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ReferenceType"));
        Object term114238 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ResolvedRecursiveType"));
        Object term114344 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.CollectionType"));
        setIntField(term113910, term113910.getClass(), "_hash", 0);
        setElement(term113415, 0, term113910);
        setIntField(term114014, term114014.getClass(), "_hash", 0);
        setElement(term113415, 1, term114014);
        setIntField(term114118, term114118.getClass(), "_hash", 0);
        setElement(term113415, 2, term114118);
        setIntField(term114238, term114238.getClass(), "_hash", 0);
        setElement(term113415, 3, term114238);
        setIntField(term114344, term114344.getClass(), "_hash", 0);
        setElement(term113415, 4, term114344);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.fasterxml.jackson.databind.type.TypeBindings");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Array.newInstance(Class.forName("java.lang.String"), 0).getClass();
        argTypes[1] = Array.newInstance(Class.forName("com.fasterxml.jackson.databind.JavaType"), 0).getClass();
        argTypes[2] = Array.newInstance(Class.forName("java.lang.String"), 0).getClass();
        Object[] args = new Object[3];
        args[0] = term113409;
        args[1] = term113415;
        args[2] = null;
        try {
            Object instance = callConstructor(klass, argTypes, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


