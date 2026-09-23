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

public class MapLikeType_init_1153958894164 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term56294;
     Object term56434;
     Object term56526;
     Object term56632;
     Object term56670;

    public MapLikeType_init_1153958894164() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term56258 = Class.forName((String) "java.io.File$TempDirectory");
        Object term56222 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.MapType"));
        setField(term56222, term56222.getClass(), "_class", term56258);
        setIntField(term56222, term56222.getClass(), "_hash", 0);
        setField(term56222, term56222.getClass(), "_valueHandler", null);
        setField(term56222, term56222.getClass(), "_typeHandler", null);
        setBooleanField(term56222, term56222.getClass(), "_asStatic", false);
        term56294 = Class.forName((String) "java.lang.Class");
        term56434 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.TypeBindings"));
        term56526 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.MapType"));
        setIntField(term56526, term56526.getClass(), "_hash", 0);
        term56632 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.CollectionType"));
        setIntField(term56632, term56632.getClass(), "_hash", 0);
        term56670 = newInstance(Class.forName("java.lang.Object"));
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
        args[0] = term56294;
        args[1] = term56434;
        args[2] = null;
        args[3] = null;
        args[4] = term56526;
        args[5] = term56632;
        args[6] = term56670;
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


