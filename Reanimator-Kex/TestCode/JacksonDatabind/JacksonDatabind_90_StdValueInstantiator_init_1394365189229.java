package com.fasterxml.jackson.databind.deser.std;

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
import static com.fasterxml.jackson.databind.deser.std.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.lang.String;

public class StdValueInstantiator_init_1394365189229 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term218103;

    public StdValueInstantiator_init_1394365189229() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term217999 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.std.StdValueInstantiator"));
        Class<? extends Object> term218139 = Class.forName((String) "com.fasterxml.jackson.databind.type.ReferenceType");
        Class<? extends Object> term219769 = Class.forName((String) "java.lang.ProcessBuilder$NullOutputStream");
        Class term219760 = Array.newInstance(term219769, 0).getClass();
        Class term219745 = Array.newInstance(term219760, 0).getClass();
        Class term218305 = Array.newInstance(term219745, 0).getClass();
        Class<? extends Object> term218475 = Class.forName((String) "java.util.concurrent.CopyOnWriteArraySet");
        term218103 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ReferenceType"));
        Object term218269 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.MapType"));
        Object term218439 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ArrayType"));
        setField(term218103, term218103.getClass(), "_class", term218139);
        setField(term218269, term218269.getClass(), "_canonicalName", null);
        setField(term218269, term218269.getClass(), "_class", term218305);
        setField(term218439, term218439.getClass(), "_canonicalName", null);
        setField(term218439, term218439.getClass(), "_class", term218475);
        setField(term218269, term218269.getClass(), "_keyType", term218439);
        setField(term218103, term218103.getClass(), "_referencedType", term218269);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.fasterxml.jackson.databind.deser.std.StdValueInstantiator");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.fasterxml.jackson.databind.DeserializationConfig");
        argTypes[1] = Class.forName("com.fasterxml.jackson.databind.JavaType");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = term218103;
        try {
            Object instance = callConstructor(klass, argTypes, args);
            assertTrue(false);
        }
        catch (InaccessibleObjectException e) {
        }

    }

};


