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

public class StdValueInstantiator_init_1394365189253 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term263220;

    public StdValueInstantiator_init_1394365189253() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term263116 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.std.StdValueInstantiator"));
        Class<? extends Object> term263256 = Class.forName((String) "com.fasterxml.jackson.databind.type.ReferenceType");
        Class<? extends Object> term264867 = Class.forName((String) "java.lang.invoke.VarHandleByteArrayAsDoubles");
        Class term264858 = Array.newInstance(term264867, 0).getClass();
        Class term264843 = Array.newInstance(term264858, 0).getClass();
        Class term263422 = Array.newInstance(term264843, 0).getClass();
        Class<? extends Object> term263588 = Class.forName((String) "org.vorpal.research.kex.intrinsics.UnknownIntrinsics");
        term263220 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ReferenceType"));
        Object term263386 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.MapType"));
        Object term263552 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.MapType"));
        Object term263718 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.MapType"));
        Object term263862 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.CollectionType"));
        setField(term263220, term263220.getClass(), "_class", term263256);
        setField(term263386, term263386.getClass(), "_canonicalName", null);
        setField(term263386, term263386.getClass(), "_class", term263422);
        setField(term263552, term263552.getClass(), "_canonicalName", null);
        setField(term263552, term263552.getClass(), "_class", term263588);
        setField(term263718, term263718.getClass(), "_canonicalName", "");
        setField(term263552, term263552.getClass(), "_keyType", term263718);
        setField(term263552, term263552.getClass(), "_valueType", term263862);
        setField(term263386, term263386.getClass(), "_keyType", term263552);
        setField(term263220, term263220.getClass(), "_referencedType", term263386);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.fasterxml.jackson.databind.deser.std.StdValueInstantiator");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.fasterxml.jackson.databind.DeserializationConfig");
        argTypes[1] = Class.forName("com.fasterxml.jackson.databind.JavaType");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = term263220;
        try {
            Object instance = callConstructor(klass, argTypes, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


