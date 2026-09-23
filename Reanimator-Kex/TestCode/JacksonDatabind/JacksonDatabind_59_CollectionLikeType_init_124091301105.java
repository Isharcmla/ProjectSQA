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
import static com.fasterxml.jackson.databind.type.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import static com.fasterxml.jackson.databind.type.EqualityUtils.*;
import java.lang.Object;
import java.lang.String;

public class CollectionLikeType_init_124091301105 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term27437;
     Object term27543;
     Object term29423;
     Object term29447;
     Object term29448;

    public CollectionLikeType_init_124091301105() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term27401 = Class.forName((String) "com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver");
        Object term27365 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.CollectionLikeType"));
        setField(term27365, term27365.getClass(), "_class", term27401);
        term27437 = Class.forName((String) "java.io.FileDescriptor");
        term27543 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.CollectionType"));
        setIntField(term27543, term27543.getClass(), "_hash", 0);
        Class<? extends Object> term29428 = Class.forName((String) "kex.java.util.HashMap$Node");
        term29423 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.CollectionLikeType"));
        Object term29424 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.CollectionType"));
        Object term29425 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.TypeBindings"));
        Object[] term29426 = (Object[]) newArray("java.lang.String", 0);
        Object[] term29427 = (Object[]) newArray("com.fasterxml.jackson.databind.JavaType", 0);
        setField(term29424, term29424.getClass(), "_elementType", null);
        setField(term29424, term29424.getClass(), "_superClass", null);
        setField(term29424, term29424.getClass(), "_superInterfaces", null);
        setField(term29424, term29424.getClass(), "_bindings", null);
        setField(term29424, term29424.getClass(), "_canonicalName", null);
        setField(term29424, term29424.getClass(), "_class", null);
        setIntField(term29424, term29424.getClass(), "_hash", 0);
        setField(term29424, term29424.getClass(), "_valueHandler", null);
        setField(term29424, term29424.getClass(), "_typeHandler", null);
        setBooleanField(term29424, term29424.getClass(), "_asStatic", false);
        setField(term29423, term29423.getClass(), "_elementType", term29424);
        setField(term29423, term29423.getClass(), "_superClass", null);
        setField(term29423, term29423.getClass(), "_superInterfaces", null);
        setField(term29425, term29425.getClass(), "_names", term29426);
        setField(term29425, term29425.getClass(), "_types", term29427);
        setField(term29425, term29425.getClass(), "_unboundVariables", null);
        setIntField(term29425, term29425.getClass(), "_hashCode", 1);
        setField(term29423, term29423.getClass(), "_bindings", term29425);
        setField(term29423, term29423.getClass(), "_canonicalName", null);
        setField(term29423, term29423.getClass(), "_class", term29428);
        setIntField(term29423, term29423.getClass(), "_hash", -1934588184);
        setField(term29423, term29423.getClass(), "_valueHandler", null);
        setField(term29423, term29423.getClass(), "_typeHandler", null);
        setBooleanField(term29423, term29423.getClass(), "_asStatic", false);
        term29447 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.CollectionType"));
        setField(term29447, term29447.getClass(), "_elementType", null);
        setField(term29447, term29447.getClass(), "_superClass", null);
        setField(term29447, term29447.getClass(), "_superInterfaces", null);
        setField(term29447, term29447.getClass(), "_bindings", null);
        setField(term29447, term29447.getClass(), "_canonicalName", null);
        setField(term29447, term29447.getClass(), "_class", null);
        setIntField(term29447, term29447.getClass(), "_hash", 0);
        setField(term29447, term29447.getClass(), "_valueHandler", null);
        setField(term29447, term29447.getClass(), "_typeHandler", null);
        setBooleanField(term29447, term29447.getClass(), "_asStatic", false);
        term29448 = Class.forName((String) "kex.java.util.HashMap$Node");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.fasterxml.jackson.databind.type.CollectionLikeType");
        Class<?>[] argTypes = new Class<?>[8];
        argTypes[0] = Class.forName("java.lang.Class");
        argTypes[1] = Class.forName("com.fasterxml.jackson.databind.type.TypeBindings");
        argTypes[2] = Class.forName("com.fasterxml.jackson.databind.JavaType");
        argTypes[3] = Array.newInstance(Class.forName("com.fasterxml.jackson.databind.JavaType"), 0).getClass();
        argTypes[4] = Class.forName("com.fasterxml.jackson.databind.JavaType");
        argTypes[5] = Class.forName("java.lang.Object");
        argTypes[6] = Class.forName("java.lang.Object");
        argTypes[7] = boolean.class;
        Object[] args = new Object[8];
        args[0] = term27437;
        args[1] = null;
        args[2] = null;
        args[3] = null;
        args[4] = term27543;
        args[5] = null;
        args[6] = null;
        args[7] = false;
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term29423));
        assertTrue(recursiveEquals(term27437, term29447));
        assertTrue(recursiveEquals(term27543, false));
    }

};


