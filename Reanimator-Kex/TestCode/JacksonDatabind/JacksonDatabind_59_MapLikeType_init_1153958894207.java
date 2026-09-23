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

public class MapLikeType_init_1153958894207 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term85651;
     Object term85791;
     Object term85895;
     Object term86001;

    public MapLikeType_init_1153958894207() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term85539 = Class.forName((String) "com.fasterxml.jackson.databind.exc.InvalidTypeIdException");
        Object term85503 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.MapLikeType"));
        Object term85577 = newInstance(Class.forName("java.lang.Object"));
        setField(term85503, term85503.getClass(), "_class", term85539);
        setIntField(term85503, term85503.getClass(), "_hash", 0);
        setField(term85503, term85503.getClass(), "_valueHandler", term85577);
        setField(term85503, term85503.getClass(), "_typeHandler", "byte");
        setBooleanField(term85503, term85503.getClass(), "_asStatic", false);
        term85651 = Class.forName((String) "java.lang.Object");
        term85791 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.TypeBindings"));
        term85895 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ReferenceType"));
        setIntField(term85895, term85895.getClass(), "_hash", 0);
        term86001 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.CollectionType"));
        setIntField(term86001, term86001.getClass(), "_hash", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.fasterxml.jackson.databind.type.MapLikeType");
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
        args[0] = term85651;
        args[1] = term85791;
        args[2] = null;
        args[3] = null;
        args[4] = term85895;
        args[5] = term86001;
        args[6] = null;
        args[7] = "java.lang.String";
        args[8] = true;
        try {
            Object instance = callConstructor(klass, argTypes, args);
            assertTrue(false);
        }
        catch (InaccessibleObjectException e) {
        }

    }

};


