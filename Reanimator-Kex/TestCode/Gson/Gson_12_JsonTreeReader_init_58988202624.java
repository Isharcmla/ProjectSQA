package com.google.gson.internal.bind;

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
import static com.google.gson.internal.bind.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import static com.google.gson.internal.bind.EqualityUtils.*;
import java.lang.Object;

public class JsonTreeReader_init_58988202624 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term6648;

    public JsonTreeReader_init_58988202624() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term6648 = newInstance(Class.forName("com.google.gson.internal.bind.JsonTreeReader"));
        Object[] term6649 = (Object[]) newArray("java.lang.Object", 32);
        Object[] term6650 = (Object[]) newArray("java.lang.String", 32);
        int[] term6651 = (int[]) newIntArray(32);
        Object term6652 = newInstance(Class.forName("com.google.gson.internal.bind.JsonTreeReader$1"));
        char[] term6653 = (char[]) newCharArray(1024);
        int[] term6654 = (int[]) newIntArray(32);
        setField(term6648, term6648.getClass(), "stack", term6649);
        setIntField(term6648, term6648.getClass(), "stackSize", 1);
        setField(term6648, term6648.getClass(), "pathNames", term6650);
        setField(term6648, term6648.getClass(), "pathIndices", term6651);
        setField(term6652, term6652.getClass(), "lock", term6652);
        setField(term6652, term6652.getClass(), "skipBuffer", null);
        setField(term6648, term6648.getClass(), "in", term6652);
        setBooleanField(term6648, term6648.getClass(), "lenient", false);
        setField(term6648, term6648.getClass(), "buffer", term6653);
        setIntField(term6648, term6648.getClass(), "pos", 0);
        setIntField(term6648, term6648.getClass(), "limit", 0);
        setIntField(term6648, term6648.getClass(), "lineNumber", 0);
        setIntField(term6648, term6648.getClass(), "lineStart", 0);
        setIntField(term6648, term6648.getClass(), "peeked", 0);
        setLongField(term6648, term6648.getClass(), "peekedLong", 0L);
        setIntField(term6648, term6648.getClass(), "peekedNumberLength", 0);
        setField(term6648, term6648.getClass(), "peekedString", null);
        setIntElement(term6654, 0, 6);
        setField(term6648, term6648.getClass(), "stack", term6654);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.gson.internal.bind.JsonTreeReader");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.gson.JsonElement");
        Object[] args = new Object[1];
        args[0] = null;
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term6648));
    }

};


