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
import java.lang.reflect.InaccessibleObjectException;
import static com.fasterxml.jackson.databind.type.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.lang.String;

public class ReferenceType_init_6352197475 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term15797;
     Object term15939;
     Object term16045;
     Object term16083;

    public ReferenceType_init_6352197475() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term15761 = Class.forName((String) "com.fasterxml.jackson.databind.module.SimpleSerializers");
        Object term15725 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ReferenceType"));
        setField(term15725, term15725.getClass(), "_class", term15761);
        setIntField(term15725, term15725.getClass(), "_hash", 0);
        setField(term15725, term15725.getClass(), "_valueHandler", null);
        setField(term15725, term15725.getClass(), "_typeHandler", null);
        setBooleanField(term15725, term15725.getClass(), "_asStatic", false);
        setField(term15725, term15725.getClass(), "_bindings", null);
        setField(term15725, term15725.getClass(), "_superClass", null);
        setField(term15725, term15725.getClass(), "_superInterfaces", null);
        setField(term15725, term15725.getClass(), "_referencedType", null);
        term15797 = Class.forName((String) "java.lang.Class");
        term15939 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ReferenceType"));
        setIntField(term15939, term15939.getClass(), "_hash", 0);
        term16045 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.CollectionType"));
        term16083 = newInstance(Class.forName("java.lang.Object"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.fasterxml.jackson.databind.type.ReferenceType");
        Class<?>[] argTypes = new Class<?>[9];
        argTypes[0] = Class.forName("java.lang.Class");
        argTypes[1] = Class.forName("com.fasterxml.jackson.databind.type.TypeBindings");
        argTypes[2] = Class.forName("com.fasterxml.jackson.databind.JavaType");
        argTypes[3] = Array.newInstance(Class.forName("com.fasterxml.jackson.databind.JavaType"), 0).getClass();
        argTypes[4] = Class.forName("com.fasterxml.jackson.databind.JavaType");
        argTypes[5] = Class.forName("com.fasterxml.jackson.databind.JavaType");
        argTypes[6] = Class.forName("java.lang.Object");
        argTypes[7] = Class.forName("java.lang.Object");
        argTypes[8] = boolean.class;
        Object[] args = new Object[9];
        args[0] = term15797;
        args[1] = null;
        args[2] = null;
        args[3] = null;
        args[4] = term15939;
        args[5] = term16045;
        args[6] = term16083;
        args[7] = null;
        args[8] = true;
        try {
            Object instance = callConstructor(klass, argTypes, args);
            assertTrue(false);
        }
        catch (InaccessibleObjectException e) {
        }

    }

};


