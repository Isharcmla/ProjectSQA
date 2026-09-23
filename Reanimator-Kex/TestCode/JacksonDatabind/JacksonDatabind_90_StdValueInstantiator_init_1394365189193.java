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

public class StdValueInstantiator_init_1394365189193 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term155688;

    public StdValueInstantiator_init_1394365189193() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term155584 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.std.StdValueInstantiator"));
        Class<? extends Object> term155724 = Class.forName((String) "org.vorpal.research.kex.intrinsics.UnknownIntrinsics");
        Class<? extends Object> term155890 = Class.forName((String) "com.fasterxml.jackson.databind.type.MapType");
        term155688 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ReferenceType"));
        Object term155854 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.MapType"));
        Object term156020 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.MapType"));
        Object term156162 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ReferenceType"));
        setField(term155688, term155688.getClass(), "_class", term155724);
        setField(term155854, term155854.getClass(), "_canonicalName", null);
        setField(term155854, term155854.getClass(), "_class", term155890);
        setField(term156020, term156020.getClass(), "_canonicalName", "");
        setField(term155854, term155854.getClass(), "_keyType", term156020);
        setField(term155854, term155854.getClass(), "_valueType", term156162);
        setField(term155688, term155688.getClass(), "_referencedType", term155854);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.fasterxml.jackson.databind.deser.std.StdValueInstantiator");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.fasterxml.jackson.databind.DeserializationConfig");
        argTypes[1] = Class.forName("com.fasterxml.jackson.databind.JavaType");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = term155688;
        try {
            Object instance = callConstructor(klass, argTypes, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


