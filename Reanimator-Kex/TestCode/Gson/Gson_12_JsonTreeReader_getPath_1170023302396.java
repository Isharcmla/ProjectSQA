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

public class JsonTreeReader_getPath_1170023302396 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term165483;
     Object term166043;

    public JsonTreeReader_getPath_1170023302396() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term165483 = newInstance(Class.forName("com.google.gson.internal.bind.JsonTreeReader"));
        Object[] term165179 = (Object[]) newArray("java.lang.Object", 495);
        Object term165541 = newInstance(Class.forName("com.google.gson.JsonObject"));
        Object term165635 = newInstance(Class.forName("com.google.gson.internal.bind.JsonTreeReader"));
        Object term165737 = newInstance(Class.forName("java.util.ImmutableCollections$SetN$SetNIterator"));
        Object term165795 = newInstance(Class.forName("com.google.gson.JsonObject"));
        Object term165889 = newInstance(Class.forName("com.google.gson.internal.bind.JsonTreeReader"));
        Object term165945 = newInstance(Class.forName("com.google.gson.JsonArray"));
        Object term165983 = newInstance(Class.forName("java.lang.Object"));
        setIntField(term165483, term165483.getClass(), "stackSize", 7);
        setElement(term165179, 0, term165541);
        setElement(term165179, 1, term165635);
        setElement(term165179, 2, term165737);
        setElement(term165179, 3, term165795);
        setElement(term165179, 4, term165889);
        setElement(term165179, 6, term165945);
        setElement(term165179, 256, term165983);
        setField(term165483, term165483.getClass(), "stack", term165179);
        term166043 = newInstance(Class.forName("com.google.gson.internal.bind.JsonTreeReader"));
        Object[] term166044 = (Object[]) newArray("java.lang.Object", 495);
        Object term166045 = newInstance(Class.forName("com.google.gson.JsonObject"));
        Object term166046 = newInstance(Class.forName("com.google.gson.internal.bind.JsonTreeReader"));
        Object term166047 = newInstance(Class.forName("java.util.ImmutableCollections$SetN$SetNIterator"));
        Object term166048 = newInstance(Class.forName("com.google.gson.JsonObject"));
        Object term166049 = newInstance(Class.forName("com.google.gson.internal.bind.JsonTreeReader"));
        Object term166050 = newInstance(Class.forName("com.google.gson.JsonArray"));
        Object term166051 = newInstance(Class.forName("java.lang.Object"));
        setField(term166045, term166045.getClass(), "members", null);
        setElement(term166044, 0, term166045);
        setField(term166046, term166046.getClass(), "stack", null);
        setIntField(term166046, term166046.getClass(), "stackSize", 0);
        setField(term166046, term166046.getClass(), "pathNames", null);
        setField(term166046, term166046.getClass(), "pathIndices", null);
        setField(term166046, term166046.getClass(), "in", null);
        setBooleanField(term166046, term166046.getClass(), "lenient", false);
        setField(term166046, term166046.getClass(), "buffer", null);
        setIntField(term166046, term166046.getClass(), "pos", 0);
        setIntField(term166046, term166046.getClass(), "limit", 0);
        setIntField(term166046, term166046.getClass(), "lineNumber", 0);
        setIntField(term166046, term166046.getClass(), "lineStart", 0);
        setIntField(term166046, term166046.getClass(), "peeked", 0);
        setLongField(term166046, term166046.getClass(), "peekedLong", 0L);
        setIntField(term166046, term166046.getClass(), "peekedNumberLength", 0);
        setField(term166046, term166046.getClass(), "peekedString", null);
        setField(term166046, term166046.getClass(), "stack", null);
        setElement(term166044, 1, term166046);
        setIntField(term166047, term166047.getClass(), "remaining", 0);
        setIntField(term166047, term166047.getClass(), "idx", 0);
        setField(term166047, term166047.getClass(), "this$0", null);
        setElement(term166044, 2, term166047);
        setField(term166048, term166048.getClass(), "members", null);
        setElement(term166044, 3, term166048);
        setField(term166049, term166049.getClass(), "stack", null);
        setIntField(term166049, term166049.getClass(), "stackSize", 0);
        setField(term166049, term166049.getClass(), "pathNames", null);
        setField(term166049, term166049.getClass(), "pathIndices", null);
        setField(term166049, term166049.getClass(), "in", null);
        setBooleanField(term166049, term166049.getClass(), "lenient", false);
        setField(term166049, term166049.getClass(), "buffer", null);
        setIntField(term166049, term166049.getClass(), "pos", 0);
        setIntField(term166049, term166049.getClass(), "limit", 0);
        setIntField(term166049, term166049.getClass(), "lineNumber", 0);
        setIntField(term166049, term166049.getClass(), "lineStart", 0);
        setIntField(term166049, term166049.getClass(), "peeked", 0);
        setLongField(term166049, term166049.getClass(), "peekedLong", 0L);
        setIntField(term166049, term166049.getClass(), "peekedNumberLength", 0);
        setField(term166049, term166049.getClass(), "peekedString", null);
        setField(term166049, term166049.getClass(), "stack", null);
        setElement(term166044, 4, term166049);
        setField(term166050, term166050.getClass(), "elements", null);
        setElement(term166044, 6, term166050);
        setElement(term166044, 256, term166051);
        setField(term166043, term166043.getClass(), "stack", term166044);
        setIntField(term166043, term166043.getClass(), "stackSize", 0);
        setField(term166043, term166043.getClass(), "pathNames", null);
        setField(term166043, term166043.getClass(), "pathIndices", null);
        setField(term166043, term166043.getClass(), "in", null);
        setBooleanField(term166043, term166043.getClass(), "lenient", false);
        setField(term166043, term166043.getClass(), "buffer", null);
        setIntField(term166043, term166043.getClass(), "pos", 0);
        setIntField(term166043, term166043.getClass(), "limit", 0);
        setIntField(term166043, term166043.getClass(), "lineNumber", 0);
        setIntField(term166043, term166043.getClass(), "lineStart", 0);
        setIntField(term166043, term166043.getClass(), "peeked", 0);
        setLongField(term166043, term166043.getClass(), "peekedLong", 0L);
        setIntField(term166043, term166043.getClass(), "peekedNumberLength", 0);
        setField(term166043, term166043.getClass(), "peekedString", null);
        setField(term166043, term166043.getClass(), "stack", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.gson.internal.bind.JsonTreeReader");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "getPath", argTypes, term165483, args);
        assertTrue(recursiveEquals(term165483, term166043));
        assertTrue(recursiveEquals(retValue, "$"));
    }

};


