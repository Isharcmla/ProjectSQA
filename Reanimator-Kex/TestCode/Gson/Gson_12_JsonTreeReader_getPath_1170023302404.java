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

public class JsonTreeReader_getPath_1170023302404 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term169925;
     Object term170285;

    public JsonTreeReader_getPath_1170023302404() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term169925 = newInstance(Class.forName("com.google.gson.internal.bind.JsonTreeReader"));
        Object[] term169601 = (Object[]) newArray("java.lang.Object", 495);
        Object term169983 = newInstance(Class.forName("com.google.gson.JsonObject"));
        Object term170077 = newInstance(Class.forName("com.google.gson.internal.bind.JsonTreeReader"));
        Object term170135 = newInstance(Class.forName("com.google.gson.JsonObject"));
        Object term170191 = newInstance(Class.forName("com.google.gson.JsonArray"));
        Object term170229 = newInstance(Class.forName("java.lang.Object"));
        setIntField(term169925, term169925.getClass(), "stackSize", 11);
        setElement(term169601, 0, term169983);
        setElement(term169601, 1, term170077);
        setElement(term169601, 2, term170135);
        setElement(term169601, 8, term170191);
        setElement(term169601, 32, term170229);
        setField(term169925, term169925.getClass(), "stack", term169601);
        term170285 = newInstance(Class.forName("com.google.gson.internal.bind.JsonTreeReader"));
        Object[] term170286 = (Object[]) newArray("java.lang.Object", 495);
        Object term170287 = newInstance(Class.forName("com.google.gson.JsonObject"));
        Object term170288 = newInstance(Class.forName("com.google.gson.internal.bind.JsonTreeReader"));
        Object term170289 = newInstance(Class.forName("com.google.gson.JsonObject"));
        Object term170290 = newInstance(Class.forName("com.google.gson.JsonArray"));
        Object term170291 = newInstance(Class.forName("java.lang.Object"));
        setField(term170287, term170287.getClass(), "members", null);
        setElement(term170286, 0, term170287);
        setField(term170288, term170288.getClass(), "stack", null);
        setIntField(term170288, term170288.getClass(), "stackSize", 0);
        setField(term170288, term170288.getClass(), "pathNames", null);
        setField(term170288, term170288.getClass(), "pathIndices", null);
        setField(term170288, term170288.getClass(), "in", null);
        setBooleanField(term170288, term170288.getClass(), "lenient", false);
        setField(term170288, term170288.getClass(), "buffer", null);
        setIntField(term170288, term170288.getClass(), "pos", 0);
        setIntField(term170288, term170288.getClass(), "limit", 0);
        setIntField(term170288, term170288.getClass(), "lineNumber", 0);
        setIntField(term170288, term170288.getClass(), "lineStart", 0);
        setIntField(term170288, term170288.getClass(), "peeked", 0);
        setLongField(term170288, term170288.getClass(), "peekedLong", 0L);
        setIntField(term170288, term170288.getClass(), "peekedNumberLength", 0);
        setField(term170288, term170288.getClass(), "peekedString", null);
        setField(term170288, term170288.getClass(), "stack", null);
        setElement(term170286, 1, term170288);
        setField(term170289, term170289.getClass(), "members", null);
        setElement(term170286, 2, term170289);
        setField(term170290, term170290.getClass(), "elements", null);
        setElement(term170286, 8, term170290);
        setElement(term170286, 32, term170291);
        setField(term170285, term170285.getClass(), "stack", term170286);
        setIntField(term170285, term170285.getClass(), "stackSize", 0);
        setField(term170285, term170285.getClass(), "pathNames", null);
        setField(term170285, term170285.getClass(), "pathIndices", null);
        setField(term170285, term170285.getClass(), "in", null);
        setBooleanField(term170285, term170285.getClass(), "lenient", false);
        setField(term170285, term170285.getClass(), "buffer", null);
        setIntField(term170285, term170285.getClass(), "pos", 0);
        setIntField(term170285, term170285.getClass(), "limit", 0);
        setIntField(term170285, term170285.getClass(), "lineNumber", 0);
        setIntField(term170285, term170285.getClass(), "lineStart", 0);
        setIntField(term170285, term170285.getClass(), "peeked", 0);
        setLongField(term170285, term170285.getClass(), "peekedLong", 0L);
        setIntField(term170285, term170285.getClass(), "peekedNumberLength", 0);
        setField(term170285, term170285.getClass(), "peekedString", null);
        setField(term170285, term170285.getClass(), "stack", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.gson.internal.bind.JsonTreeReader");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "getPath", argTypes, term169925, args);
        assertTrue(recursiveEquals(term169925, term170285));
        assertTrue(recursiveEquals(retValue, "$"));
    }

};


