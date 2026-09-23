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

public class TypeBindings_init_352540534532 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term213657;
     Object term213664;

    public TypeBindings_init_352540534532() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term213875 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.TypeBindings"));
        Object[] term213673 = (Object[]) newArray("com.fasterxml.jackson.databind.JavaType", 0);
        setField(term213875, term213875.getClass(), "_names", null);
        setField(term213875, term213875.getClass(), "_types", term213673);
        term213657 = (Object[]) newArray("java.lang.String", 10);
        setElement(term213657, 0, "");
        setElement(term213657, 1, "");
        setElement(term213657, 2, "");
        setElement(term213657, 3, "");
        setElement(term213657, 4, "");
        setElement(term213657, 5, "");
        setElement(term213657, 6, "");
        setElement(term213657, 7, "");
        setElement(term213657, 8, "");
        setElement(term213657, 9, "");
        term213664 = (Object[]) newArray("com.fasterxml.jackson.databind.JavaType", 10);
        Object term214223 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ResolvedRecursiveType"));
        Object term214327 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ReferenceType"));
        Object term214431 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ReferenceType"));
        Object term214537 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.CollectionType"));
        Object term214657 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ResolvedRecursiveType"));
        Object term214763 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.CollectionType"));
        Object term214883 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ResolvedRecursiveType"));
        Object term214979 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ArrayType"));
        setIntField(term214223, term214223.getClass(), "_hash", 0);
        setElement(term213664, 0, term214223);
        setIntField(term214327, term214327.getClass(), "_hash", 0);
        setElement(term213664, 1, term214327);
        setIntField(term214431, term214431.getClass(), "_hash", 0);
        setElement(term213664, 2, term214431);
        setElement(term213664, 3, term214223);
        setIntField(term214537, term214537.getClass(), "_hash", 0);
        setElement(term213664, 4, term214537);
        setIntField(term214657, term214657.getClass(), "_hash", 0);
        setElement(term213664, 5, term214657);
        setIntField(term214763, term214763.getClass(), "_hash", 0);
        setElement(term213664, 6, term214763);
        setIntField(term214883, term214883.getClass(), "_hash", 0);
        setElement(term213664, 7, term214883);
        setElement(term213664, 9, term214979);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.fasterxml.jackson.databind.type.TypeBindings");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Array.newInstance(Class.forName("java.lang.String"), 0).getClass();
        argTypes[1] = Array.newInstance(Class.forName("com.fasterxml.jackson.databind.JavaType"), 0).getClass();
        argTypes[2] = Array.newInstance(Class.forName("java.lang.String"), 0).getClass();
        Object[] args = new Object[3];
        args[0] = term213657;
        args[1] = term213664;
        args[2] = null;
        try {
            Object instance = callConstructor(klass, argTypes, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


