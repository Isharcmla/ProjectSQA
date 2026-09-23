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

public class JsonTreeReader_getPath_1170023302434 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term183395;
     Object term183769;

    public JsonTreeReader_getPath_1170023302434() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term183395 = newInstance(Class.forName("com.google.gson.internal.bind.JsonTreeReader"));
        Object[] term183089 = (Object[]) newArray("java.lang.Object", 495);
        Object term183453 = newInstance(Class.forName("com.google.gson.JsonObject"));
        Object term183547 = newInstance(Class.forName("com.google.gson.internal.bind.JsonTreeReader"));
        Object term183605 = newInstance(Class.forName("com.google.gson.JsonObject"));
        Object term183643 = newInstance(Class.forName("java.lang.Object"));
        setIntField(term183395, term183395.getClass(), "stackSize", 7);
        setElement(term183089, 0, term183453);
        setElement(term183089, 2, term183547);
        setElement(term183089, 3, term183605);
        setElement(term183089, 32, term183643);
        setField(term183395, term183395.getClass(), "stack", term183089);
        term183769 = newInstance(Class.forName("com.google.gson.internal.bind.JsonTreeReader"));
        Object[] term183770 = (Object[]) newArray("java.lang.Object", 495);
        Object term183771 = newInstance(Class.forName("com.google.gson.JsonObject"));
        Object term183772 = newInstance(Class.forName("com.google.gson.internal.bind.JsonTreeReader"));
        Object term183773 = newInstance(Class.forName("com.google.gson.JsonObject"));
        Object term183774 = newInstance(Class.forName("java.lang.Object"));
        setField(term183771, term183771.getClass(), "members", null);
        setElement(term183770, 0, term183771);
        setField(term183772, term183772.getClass(), "stack", null);
        setIntField(term183772, term183772.getClass(), "stackSize", 0);
        setField(term183772, term183772.getClass(), "pathNames", null);
        setField(term183772, term183772.getClass(), "pathIndices", null);
        setField(term183772, term183772.getClass(), "in", null);
        setBooleanField(term183772, term183772.getClass(), "lenient", false);
        setField(term183772, term183772.getClass(), "buffer", null);
        setIntField(term183772, term183772.getClass(), "pos", 0);
        setIntField(term183772, term183772.getClass(), "limit", 0);
        setIntField(term183772, term183772.getClass(), "lineNumber", 0);
        setIntField(term183772, term183772.getClass(), "lineStart", 0);
        setIntField(term183772, term183772.getClass(), "peeked", 0);
        setLongField(term183772, term183772.getClass(), "peekedLong", 0L);
        setIntField(term183772, term183772.getClass(), "peekedNumberLength", 0);
        setField(term183772, term183772.getClass(), "peekedString", null);
        setField(term183772, term183772.getClass(), "stack", null);
        setElement(term183770, 2, term183772);
        setField(term183773, term183773.getClass(), "members", null);
        setElement(term183770, 3, term183773);
        setElement(term183770, 32, term183774);
        setField(term183769, term183769.getClass(), "stack", term183770);
        setIntField(term183769, term183769.getClass(), "stackSize", 0);
        setField(term183769, term183769.getClass(), "pathNames", null);
        setField(term183769, term183769.getClass(), "pathIndices", null);
        setField(term183769, term183769.getClass(), "in", null);
        setBooleanField(term183769, term183769.getClass(), "lenient", false);
        setField(term183769, term183769.getClass(), "buffer", null);
        setIntField(term183769, term183769.getClass(), "pos", 0);
        setIntField(term183769, term183769.getClass(), "limit", 0);
        setIntField(term183769, term183769.getClass(), "lineNumber", 0);
        setIntField(term183769, term183769.getClass(), "lineStart", 0);
        setIntField(term183769, term183769.getClass(), "peeked", 0);
        setLongField(term183769, term183769.getClass(), "peekedLong", 0L);
        setIntField(term183769, term183769.getClass(), "peekedNumberLength", 0);
        setField(term183769, term183769.getClass(), "peekedString", null);
        setField(term183769, term183769.getClass(), "stack", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.gson.internal.bind.JsonTreeReader");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "getPath", argTypes, term183395, args);
        assertTrue(recursiveEquals(term183395, term183769));
        assertTrue(recursiveEquals(retValue, "$"));
    }

};


