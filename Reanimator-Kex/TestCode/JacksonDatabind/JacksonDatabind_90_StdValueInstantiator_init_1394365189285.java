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

public class StdValueInstantiator_init_1394365189285 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term322976;

    public StdValueInstantiator_init_1394365189285() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term322872 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.std.StdValueInstantiator"));
        Class<? extends Object> term323012 = Class.forName((String) "kex.java.lang.AbstractStringBuilder");
        Class<? extends Object> term324451 = Class.forName((String) "java.util.Scanner$FindSpliterator");
        Class term324442 = Array.newInstance(term324451, 0).getClass();
        Class term324427 = Array.newInstance(term324442, 0).getClass();
        Class term323178 = Array.newInstance(term324427, 0).getClass();
        Class<? extends Object> term323372 = Class.forName((String) "java.lang.Module$1DummyModuleInfo");
        term322976 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ReferenceType"));
        Object term323142 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.MapType"));
        Object term323336 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ResolvedRecursiveType"));
        setField(term322976, term322976.getClass(), "_class", term323012);
        setField(term323142, term323142.getClass(), "_canonicalName", null);
        setField(term323142, term323142.getClass(), "_class", term323178);
        setField(term323336, term323336.getClass(), "_canonicalName", null);
        setField(term323336, term323336.getClass(), "_class", term323372);
        setField(term323142, term323142.getClass(), "_keyType", term323336);
        setField(term322976, term322976.getClass(), "_referencedType", term323142);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.fasterxml.jackson.databind.deser.std.StdValueInstantiator");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.fasterxml.jackson.databind.DeserializationConfig");
        argTypes[1] = Class.forName("com.fasterxml.jackson.databind.JavaType");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = term322976;
        try {
            Object instance = callConstructor(klass, argTypes, args);
            assertTrue(false);
        }
        catch (InaccessibleObjectException e) {
        }

    }

};


