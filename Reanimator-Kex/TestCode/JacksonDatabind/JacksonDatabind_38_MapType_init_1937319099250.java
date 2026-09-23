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

public class MapType_init_1937319099250 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term107467;
     Object term107607;
     Object term107703;
     Object term107807;
     Object term107899;

    public MapType_init_1937319099250() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term107393 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.MapType"));
        setField(term107393, term107393.getClass(), "_class", null);
        setIntField(term107393, term107393.getClass(), "_hash", 0);
        setField(term107393, term107393.getClass(), "_valueHandler", null);
        setField(term107393, term107393.getClass(), "_typeHandler", "byte");
        setBooleanField(term107393, term107393.getClass(), "_asStatic", false);
        term107467 = Class.forName((String) "java.lang.Object");
        term107607 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.TypeBindings"));
        term107703 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ArrayType"));
        setIntField(term107703, term107703.getClass(), "_hash", 0);
        term107807 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ReferenceType"));
        setIntField(term107807, term107807.getClass(), "_hash", 0);
        term107899 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.MapType"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.fasterxml.jackson.databind.type.MapType");
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
        args[0] = term107467;
        args[1] = term107607;
        args[2] = null;
        args[3] = null;
        args[4] = term107703;
        args[5] = term107807;
        args[6] = term107899;
        args[7] = "byte";
        args[8] = true;
        try {
            Object instance = callConstructor(klass, argTypes, args);
            assertTrue(false);
        }
        catch (InaccessibleObjectException e) {
        }

    }

};


