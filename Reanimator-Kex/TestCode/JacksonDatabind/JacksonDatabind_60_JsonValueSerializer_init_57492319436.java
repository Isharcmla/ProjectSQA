package com.fasterxml.jackson.databind.ser.std;

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
import static com.fasterxml.jackson.databind.ser.std.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import static com.fasterxml.jackson.databind.ser.std.EqualityUtils.*;
import java.lang.Object;
import java.lang.String;

public class JsonValueSerializer_init_57492319436 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term9060;
     Object term11747;
     Object term11767;

    public JsonValueSerializer_init_57492319436() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term8938 = newInstance(Class.forName("com.fasterxml.jackson.databind.ser.std.JsonValueSerializer"));
        Class<? extends Object> term9096 = Class.forName((String) "kex.java.util.HashMap$ValueIterator");
        term9060 = newInstance(Class.forName("com.fasterxml.jackson.databind.ser.std.JsonValueSerializer"));
        setField(term9060, term9060.getClass(), "_handledType", term9096);
        Class<? extends Object> term11748 = Class.forName((String) "org.vorpal.research.kex.intrinsics.internal.IntBoolean2BooleanFunction");
        term11747 = newInstance(Class.forName("com.fasterxml.jackson.databind.ser.std.JsonValueSerializer"));
        setField(term11747, term11747.getClass(), "_accessorMethod", null);
        setField(term11747, term11747.getClass(), "_valueSerializer", null);
        setField(term11747, term11747.getClass(), "_property", null);
        setBooleanField(term11747, term11747.getClass(), "_forceTypeInformation", false);
        setField(term11747, term11747.getClass(), "_handledType", term11748);
        Class<? extends Object> term11768 = Class.forName((String) "org.vorpal.research.kex.intrinsics.internal.IntBoolean2BooleanFunction");
        term11767 = newInstance(Class.forName("com.fasterxml.jackson.databind.ser.std.JsonValueSerializer"));
        setField(term11767, term11767.getClass(), "_accessorMethod", null);
        setField(term11767, term11767.getClass(), "_valueSerializer", null);
        setField(term11767, term11767.getClass(), "_property", null);
        setBooleanField(term11767, term11767.getClass(), "_forceTypeInformation", false);
        setField(term11767, term11767.getClass(), "_handledType", term11768);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.fasterxml.jackson.databind.ser.std.JsonValueSerializer");
        Class<?>[] argTypes = new Class<?>[4];
        argTypes[0] = Class.forName("com.fasterxml.jackson.databind.ser.std.JsonValueSerializer");
        argTypes[1] = Class.forName("com.fasterxml.jackson.databind.BeanProperty");
        argTypes[2] = Class.forName("com.fasterxml.jackson.databind.JsonSerializer");
        argTypes[3] = boolean.class;
        Object[] args = new Object[4];
        args[0] = term9060;
        args[1] = null;
        args[2] = null;
        args[3] = false;
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term11747));
        assertTrue(recursiveEquals(term9060, term11767));
    }

};


