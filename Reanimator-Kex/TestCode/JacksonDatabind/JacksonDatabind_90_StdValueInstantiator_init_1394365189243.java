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

public class StdValueInstantiator_init_1394365189243 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term242782;

    public StdValueInstantiator_init_1394365189243() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term242678 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.std.StdValueInstantiator"));
        Class<? extends Object> term242818 = Class.forName((String) "com.fasterxml.jackson.databind.type.CollectionLikeType");
        Class<? extends Object> term242984 = Class.forName((String) "com.fasterxml.jackson.databind.type.MapType");
        Class<? extends Object> term243302 = Class.forName((String) "java.util.concurrent.ThreadPoolExecutor$DiscardPolicy");
        term242782 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ReferenceType"));
        Object term242948 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.MapType"));
        Object term243114 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.MapType"));
        Object term243266 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.CollectionLikeType"));
        setField(term242782, term242782.getClass(), "_class", term242818);
        setField(term242948, term242948.getClass(), "_canonicalName", null);
        setField(term242948, term242948.getClass(), "_class", term242984);
        setField(term243114, term243114.getClass(), "_canonicalName", "char[]");
        setField(term242948, term242948.getClass(), "_keyType", term243114);
        setField(term243266, term243266.getClass(), "_canonicalName", null);
        setField(term243266, term243266.getClass(), "_class", term243302);
        setField(term242948, term242948.getClass(), "_valueType", term243266);
        setField(term242782, term242782.getClass(), "_referencedType", term242948);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.fasterxml.jackson.databind.deser.std.StdValueInstantiator");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.fasterxml.jackson.databind.DeserializationConfig");
        argTypes[1] = Class.forName("com.fasterxml.jackson.databind.JavaType");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = term242782;
        try {
            Object instance = callConstructor(klass, argTypes, args);
            assertTrue(false);
        }
        catch (InaccessibleObjectException e) {
        }

    }

};


