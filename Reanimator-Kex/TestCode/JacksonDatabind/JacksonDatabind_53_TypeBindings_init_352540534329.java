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

public class TypeBindings_init_352540534329 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term110425;
     Object term110428;

    public TypeBindings_init_352540534329() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term110593 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.TypeBindings"));
        Object[] term110432 = (Object[]) newArray("java.lang.String", 0);
        Object[] term110433 = (Object[]) newArray("com.fasterxml.jackson.databind.JavaType", 0);
        setField(term110593, term110593.getClass(), "_names", term110432);
        setField(term110593, term110593.getClass(), "_types", term110433);
        term110425 = (Object[]) newArray("java.lang.String", 4);
        setElement(term110425, 0, "");
        setElement(term110425, 1, "");
        setElement(term110425, 2, "");
        setElement(term110425, 3, "");
        term110428 = (Object[]) newArray("com.fasterxml.jackson.databind.JavaType", 4);
        Object term110773 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ReferenceType"));
        Object term110869 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ArrayType"));
        Object term110989 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ResolvedRecursiveType"));
        setIntField(term110773, term110773.getClass(), "_hash", 0);
        setElement(term110428, 0, term110773);
        setIntField(term110869, term110869.getClass(), "_hash", 0);
        setElement(term110428, 1, term110869);
        setIntField(term110989, term110989.getClass(), "_hash", 0);
        setElement(term110428, 2, term110989);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.fasterxml.jackson.databind.type.TypeBindings");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Array.newInstance(Class.forName("java.lang.String"), 0).getClass();
        argTypes[1] = Array.newInstance(Class.forName("com.fasterxml.jackson.databind.JavaType"), 0).getClass();
        argTypes[2] = Array.newInstance(Class.forName("java.lang.String"), 0).getClass();
        Object[] args = new Object[3];
        args[0] = term110425;
        args[1] = term110428;
        args[2] = null;
        try {
            Object instance = callConstructor(klass, argTypes, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


