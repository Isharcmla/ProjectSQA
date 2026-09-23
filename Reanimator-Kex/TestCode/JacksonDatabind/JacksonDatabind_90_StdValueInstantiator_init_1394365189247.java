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
import java.lang.NullPointerException;
import static com.fasterxml.jackson.databind.deser.std.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.lang.String;

public class StdValueInstantiator_init_1394365189247 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term251142;

    public StdValueInstantiator_init_1394365189247() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term251038 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.std.StdValueInstantiator"));
        Class<? extends Object> term251178 = Class.forName((String) "com.fasterxml.jackson.databind.type.ReferenceType");
        Class<? extends Object> term251344 = Class.forName((String) "com.fasterxml.jackson.databind.type.CollectionType");
        Class<? extends Object> term251510 = Class.forName((String) "com.fasterxml.jackson.databind.type.CollectionType");
        term251142 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ReferenceType"));
        Object term251308 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.MapType"));
        Object term251474 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.MapType"));
        Object term251616 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.CollectionType"));
        setField(term251142, term251142.getClass(), "_class", term251178);
        setField(term251308, term251308.getClass(), "_canonicalName", null);
        setField(term251308, term251308.getClass(), "_class", term251344);
        setField(term251474, term251474.getClass(), "_canonicalName", null);
        setField(term251474, term251474.getClass(), "_class", term251510);
        setField(term251616, term251616.getClass(), "_canonicalName", "");
        setField(term251474, term251474.getClass(), "_keyType", term251616);
        setField(term251308, term251308.getClass(), "_keyType", term251474);
        setField(term251142, term251142.getClass(), "_referencedType", term251308);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.fasterxml.jackson.databind.deser.std.StdValueInstantiator");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.fasterxml.jackson.databind.DeserializationConfig");
        argTypes[1] = Class.forName("com.fasterxml.jackson.databind.JavaType");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = term251142;
        try {
            Object instance = callConstructor(klass, argTypes, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


