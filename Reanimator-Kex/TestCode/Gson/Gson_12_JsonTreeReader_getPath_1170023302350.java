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

public class JsonTreeReader_getPath_1170023302350 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term138363;
     Object term138668;

    public JsonTreeReader_getPath_1170023302350() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term138363 = newInstance(Class.forName("com.google.gson.internal.bind.JsonTreeReader"));
        Object[] term138042 = (Object[]) newArray("java.lang.Object", 491);
        Object term138419 = newInstance(Class.forName("com.google.gson.JsonArray"));
        char[] term137998 = (char[]) newCharArray(42);
        Object term138475 = newInstance(Class.forName("com.google.gson.JsonArray"));
        Object term138533 = newInstance(Class.forName("com.google.gson.JsonObject"));
        setIntField(term138363, term138363.getClass(), "stackSize", 13);
        setElement(term138042, 0, term138419);
        setElement(term138042, 1, term137998);
        setElement(term138042, 3, term138475);
        setElement(term138042, 5, term138533);
        setField(term138363, term138363.getClass(), "stack", term138042);
        term138668 = newInstance(Class.forName("com.google.gson.internal.bind.JsonTreeReader"));
        Object[] term138669 = (Object[]) newArray("java.lang.Object", 491);
        Object term138670 = newInstance(Class.forName("com.google.gson.JsonArray"));
        char[] term138671 = (char[]) newCharArray(42);
        Object term138672 = newInstance(Class.forName("com.google.gson.JsonArray"));
        Object term138673 = newInstance(Class.forName("com.google.gson.JsonObject"));
        setField(term138670, term138670.getClass(), "elements", null);
        setElement(term138669, 0, term138670);
        setElement(term138669, 1, term138671);
        setField(term138672, term138672.getClass(), "elements", null);
        setElement(term138669, 3, term138672);
        setField(term138673, term138673.getClass(), "members", null);
        setElement(term138669, 5, term138673);
        setField(term138668, term138668.getClass(), "stack", term138669);
        setIntField(term138668, term138668.getClass(), "stackSize", 0);
        setField(term138668, term138668.getClass(), "pathNames", null);
        setField(term138668, term138668.getClass(), "pathIndices", null);
        setField(term138668, term138668.getClass(), "in", null);
        setBooleanField(term138668, term138668.getClass(), "lenient", false);
        setField(term138668, term138668.getClass(), "buffer", null);
        setIntField(term138668, term138668.getClass(), "pos", 0);
        setIntField(term138668, term138668.getClass(), "limit", 0);
        setIntField(term138668, term138668.getClass(), "lineNumber", 0);
        setIntField(term138668, term138668.getClass(), "lineStart", 0);
        setIntField(term138668, term138668.getClass(), "peeked", 0);
        setLongField(term138668, term138668.getClass(), "peekedLong", 0L);
        setIntField(term138668, term138668.getClass(), "peekedNumberLength", 0);
        setField(term138668, term138668.getClass(), "peekedString", null);
        setField(term138668, term138668.getClass(), "stack", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.gson.internal.bind.JsonTreeReader");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "getPath", argTypes, term138363, args);
        assertTrue(recursiveEquals(term138363, term138668));
        assertTrue(recursiveEquals(retValue, "$"));
    }

};


