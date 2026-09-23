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

public class JsonTreeReader_getPath_1170023302240 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term71502;
     Object term71732;

    public JsonTreeReader_getPath_1170023302240() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term71502 = newInstance(Class.forName("com.google.gson.internal.bind.JsonTreeReader"));
        Object[] term71241 = (Object[]) newArray("java.lang.Object", 10);
        Object term71560 = newInstance(Class.forName("com.google.gson.JsonObject"));
        Object term71618 = newInstance(Class.forName("com.google.gson.JsonObject"));
        Object term71656 = newInstance(Class.forName("java.lang.Object"));
        setIntField(term71502, term71502.getClass(), "stackSize", 10);
        setElement(term71241, 0, term71560);
        setElement(term71241, 2, term71618);
        setElement(term71241, 4, term71656);
        setField(term71502, term71502.getClass(), "stack", term71241);
        term71732 = newInstance(Class.forName("com.google.gson.internal.bind.JsonTreeReader"));
        Object[] term71733 = (Object[]) newArray("java.lang.Object", 10);
        Object term71734 = newInstance(Class.forName("com.google.gson.JsonObject"));
        Object term71735 = newInstance(Class.forName("com.google.gson.JsonObject"));
        Object term71736 = newInstance(Class.forName("java.lang.Object"));
        setField(term71734, term71734.getClass(), "members", null);
        setElement(term71733, 0, term71734);
        setField(term71735, term71735.getClass(), "members", null);
        setElement(term71733, 2, term71735);
        setElement(term71733, 4, term71736);
        setField(term71732, term71732.getClass(), "stack", term71733);
        setIntField(term71732, term71732.getClass(), "stackSize", 0);
        setField(term71732, term71732.getClass(), "pathNames", null);
        setField(term71732, term71732.getClass(), "pathIndices", null);
        setField(term71732, term71732.getClass(), "in", null);
        setBooleanField(term71732, term71732.getClass(), "lenient", false);
        setField(term71732, term71732.getClass(), "buffer", null);
        setIntField(term71732, term71732.getClass(), "pos", 0);
        setIntField(term71732, term71732.getClass(), "limit", 0);
        setIntField(term71732, term71732.getClass(), "lineNumber", 0);
        setIntField(term71732, term71732.getClass(), "lineStart", 0);
        setIntField(term71732, term71732.getClass(), "peeked", 0);
        setLongField(term71732, term71732.getClass(), "peekedLong", 0L);
        setIntField(term71732, term71732.getClass(), "peekedNumberLength", 0);
        setField(term71732, term71732.getClass(), "peekedString", null);
        setField(term71732, term71732.getClass(), "stack", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.gson.internal.bind.JsonTreeReader");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "getPath", argTypes, term71502, args);
        assertTrue(recursiveEquals(term71502, term71732));
        assertTrue(recursiveEquals(retValue, "$"));
    }

};


