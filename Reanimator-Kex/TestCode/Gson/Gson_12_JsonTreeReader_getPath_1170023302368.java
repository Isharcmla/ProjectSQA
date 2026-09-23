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

public class JsonTreeReader_getPath_1170023302368 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term149077;
     Object term151815;

    public JsonTreeReader_getPath_1170023302368() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term149077 = newInstance(Class.forName("com.google.gson.internal.bind.JsonTreeReader"));
        Object[] term148797 = (Object[]) newArray("java.lang.Object", 495);
        Object term149133 = newInstance(Class.forName("com.google.gson.JsonArray"));
        Object term149189 = newInstance(Class.forName("com.google.gson.JsonArray"));
        Object term149245 = newInstance(Class.forName("com.google.gson.JsonArray"));
        Object term149283 = newInstance(Class.forName("java.lang.Object"));
        setIntField(term149077, term149077.getClass(), "stackSize", 7);
        setElement(term148797, 0, term149133);
        setElement(term148797, 3, term149189);
        setElement(term148797, 5, term149245);
        setElement(term148797, 256, term149283);
        setField(term149077, term149077.getClass(), "stack", term148797);
        term151815 = newInstance(Class.forName("com.google.gson.internal.bind.JsonTreeReader"));
        Object[] term151816 = (Object[]) newArray("java.lang.Object", 495);
        Object term151817 = newInstance(Class.forName("com.google.gson.JsonArray"));
        Object term151818 = newInstance(Class.forName("com.google.gson.JsonArray"));
        Object term151819 = newInstance(Class.forName("com.google.gson.JsonArray"));
        Object term151820 = newInstance(Class.forName("java.lang.Object"));
        setField(term151817, term151817.getClass(), "elements", null);
        setElement(term151816, 0, term151817);
        setField(term151818, term151818.getClass(), "elements", null);
        setElement(term151816, 3, term151818);
        setField(term151819, term151819.getClass(), "elements", null);
        setElement(term151816, 5, term151819);
        setElement(term151816, 256, term151820);
        setField(term151815, term151815.getClass(), "stack", term151816);
        setIntField(term151815, term151815.getClass(), "stackSize", 0);
        setField(term151815, term151815.getClass(), "pathNames", null);
        setField(term151815, term151815.getClass(), "pathIndices", null);
        setField(term151815, term151815.getClass(), "in", null);
        setBooleanField(term151815, term151815.getClass(), "lenient", false);
        setField(term151815, term151815.getClass(), "buffer", null);
        setIntField(term151815, term151815.getClass(), "pos", 0);
        setIntField(term151815, term151815.getClass(), "limit", 0);
        setIntField(term151815, term151815.getClass(), "lineNumber", 0);
        setIntField(term151815, term151815.getClass(), "lineStart", 0);
        setIntField(term151815, term151815.getClass(), "peeked", 0);
        setLongField(term151815, term151815.getClass(), "peekedLong", 0L);
        setIntField(term151815, term151815.getClass(), "peekedNumberLength", 0);
        setField(term151815, term151815.getClass(), "peekedString", null);
        setField(term151815, term151815.getClass(), "stack", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.gson.internal.bind.JsonTreeReader");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "getPath", argTypes, term149077, args);
        assertTrue(recursiveEquals(term149077, term151815));
        assertTrue(recursiveEquals(retValue, "$"));
    }

};


