package com.google.gson.stream;

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
import static com.google.gson.stream.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import static com.google.gson.stream.EqualityUtils.*;
import java.lang.Object;

public class JsonWriter_init_938963926126 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term33274;
     Object term33445;
     Object term33450;

    public JsonWriter_init_938963926126() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term33230 = newInstance(Class.forName("com.google.gson.stream.JsonWriter"));
        setField(term33230, term33230.getClass(), "stack", null);
        setIntField(term33230, term33230.getClass(), "stackSize", 0);
        setField(term33230, term33230.getClass(), "separator", null);
        setBooleanField(term33230, term33230.getClass(), "serializeNulls", false);
        term33274 = newInstance(Class.forName("java.io.PrintWriter"));
        term33445 = newInstance(Class.forName("com.google.gson.stream.JsonWriter"));
        Object term33446 = newInstance(Class.forName("java.io.PrintWriter"));
        int[] term33447 = (int[]) newIntArray(32);
        setField(term33446, term33446.getClass(), "out", null);
        setBooleanField(term33446, term33446.getClass(), "autoFlush", false);
        setBooleanField(term33446, term33446.getClass(), "trouble", false);
        setField(term33446, term33446.getClass(), "formatter", null);
        setField(term33446, term33446.getClass(), "psOut", null);
        setField(term33446, term33446.getClass(), "writeBuffer", null);
        setField(term33446, term33446.getClass(), "lock", null);
        setField(term33445, term33445.getClass(), "out", term33446);
        setIntElement(term33447, 0, 6);
        setField(term33445, term33445.getClass(), "stack", term33447);
        setIntField(term33445, term33445.getClass(), "stackSize", 1);
        setField(term33445, term33445.getClass(), "indent", null);
        setField(term33445, term33445.getClass(), "separator", ":");
        setBooleanField(term33445, term33445.getClass(), "lenient", false);
        setBooleanField(term33445, term33445.getClass(), "htmlSafe", false);
        setField(term33445, term33445.getClass(), "deferredName", null);
        setBooleanField(term33445, term33445.getClass(), "serializeNulls", true);
        term33450 = newInstance(Class.forName("java.io.PrintWriter"));
        setField(term33450, term33450.getClass(), "out", null);
        setBooleanField(term33450, term33450.getClass(), "autoFlush", false);
        setBooleanField(term33450, term33450.getClass(), "trouble", false);
        setField(term33450, term33450.getClass(), "formatter", null);
        setField(term33450, term33450.getClass(), "psOut", null);
        setField(term33450, term33450.getClass(), "writeBuffer", null);
        setField(term33450, term33450.getClass(), "lock", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.gson.stream.JsonWriter");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.io.Writer");
        Object[] args = new Object[1];
        args[0] = term33274;
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term33445));
        assertTrue(recursiveEquals(term33274, term33450));
    }

};


