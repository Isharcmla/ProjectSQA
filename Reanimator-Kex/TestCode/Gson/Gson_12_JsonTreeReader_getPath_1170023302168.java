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

public class JsonTreeReader_getPath_1170023302168 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term40115;
     Object term40230;

    public JsonTreeReader_getPath_1170023302168() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term40115 = newInstance(Class.forName("com.google.gson.internal.bind.JsonTreeReader"));
        Object[] term39990 = (Object[]) newArray("java.lang.Object", 492);
        Object term40171 = newInstance(Class.forName("com.google.gson.JsonArray"));
        Object term40209 = newInstance(Class.forName("java.lang.Object"));
        setIntField(term40115, term40115.getClass(), "stackSize", 1);
        setElement(term39990, 0, term40171);
        setElement(term39990, 64, term40209);
        setField(term40115, term40115.getClass(), "stack", term39990);
        term40230 = newInstance(Class.forName("com.google.gson.internal.bind.JsonTreeReader"));
        Object[] term40231 = (Object[]) newArray("java.lang.Object", 492);
        Object term40232 = newInstance(Class.forName("com.google.gson.JsonArray"));
        Object term40233 = newInstance(Class.forName("java.lang.Object"));
        setField(term40232, term40232.getClass(), "elements", null);
        setElement(term40231, 0, term40232);
        setElement(term40231, 64, term40233);
        setField(term40230, term40230.getClass(), "stack", term40231);
        setIntField(term40230, term40230.getClass(), "stackSize", 0);
        setField(term40230, term40230.getClass(), "pathNames", null);
        setField(term40230, term40230.getClass(), "pathIndices", null);
        setField(term40230, term40230.getClass(), "in", null);
        setBooleanField(term40230, term40230.getClass(), "lenient", false);
        setField(term40230, term40230.getClass(), "buffer", null);
        setIntField(term40230, term40230.getClass(), "pos", 0);
        setIntField(term40230, term40230.getClass(), "limit", 0);
        setIntField(term40230, term40230.getClass(), "lineNumber", 0);
        setIntField(term40230, term40230.getClass(), "lineStart", 0);
        setIntField(term40230, term40230.getClass(), "peeked", 0);
        setLongField(term40230, term40230.getClass(), "peekedLong", 0L);
        setIntField(term40230, term40230.getClass(), "peekedNumberLength", 0);
        setField(term40230, term40230.getClass(), "peekedString", null);
        setField(term40230, term40230.getClass(), "stack", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.gson.internal.bind.JsonTreeReader");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "getPath", argTypes, term40115, args);
        assertTrue(recursiveEquals(term40115, term40230));
        assertTrue(recursiveEquals(retValue, "$"));
    }

};


