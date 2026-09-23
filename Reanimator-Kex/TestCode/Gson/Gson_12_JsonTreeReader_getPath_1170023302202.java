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

public class JsonTreeReader_getPath_1170023302202 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term51428;
     Object term51510;

    public JsonTreeReader_getPath_1170023302202() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term51428 = newInstance(Class.forName("com.google.gson.internal.bind.JsonTreeReader"));
        Object[] term51289 = (Object[]) newArray("java.lang.Object", 489);
        Object term51486 = newInstance(Class.forName("com.google.gson.JsonObject"));
        setIntField(term51428, term51428.getClass(), "stackSize", 2);
        setElement(term51289, 1, term51486);
        setField(term51428, term51428.getClass(), "stack", term51289);
        term51510 = newInstance(Class.forName("com.google.gson.internal.bind.JsonTreeReader"));
        Object[] term51511 = (Object[]) newArray("java.lang.Object", 489);
        Object term51512 = newInstance(Class.forName("com.google.gson.JsonObject"));
        setField(term51512, term51512.getClass(), "members", null);
        setElement(term51511, 1, term51512);
        setField(term51510, term51510.getClass(), "stack", term51511);
        setIntField(term51510, term51510.getClass(), "stackSize", 0);
        setField(term51510, term51510.getClass(), "pathNames", null);
        setField(term51510, term51510.getClass(), "pathIndices", null);
        setField(term51510, term51510.getClass(), "in", null);
        setBooleanField(term51510, term51510.getClass(), "lenient", false);
        setField(term51510, term51510.getClass(), "buffer", null);
        setIntField(term51510, term51510.getClass(), "pos", 0);
        setIntField(term51510, term51510.getClass(), "limit", 0);
        setIntField(term51510, term51510.getClass(), "lineNumber", 0);
        setIntField(term51510, term51510.getClass(), "lineStart", 0);
        setIntField(term51510, term51510.getClass(), "peeked", 0);
        setLongField(term51510, term51510.getClass(), "peekedLong", 0L);
        setIntField(term51510, term51510.getClass(), "peekedNumberLength", 0);
        setField(term51510, term51510.getClass(), "peekedString", null);
        setField(term51510, term51510.getClass(), "stack", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.gson.internal.bind.JsonTreeReader");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "getPath", argTypes, term51428, args);
        assertTrue(recursiveEquals(term51428, term51510));
        assertTrue(recursiveEquals(retValue, "$"));
    }

};


