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

public class JsonTreeReader_getPath_1170023302414 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term174319;
     Object term174484;

    public JsonTreeReader_getPath_1170023302414() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term174319 = newInstance(Class.forName("com.google.gson.internal.bind.JsonTreeReader"));
        Object[] term174038 = (Object[]) newArray("java.lang.Object", 111);
        Object term174377 = newInstance(Class.forName("com.google.gson.JsonObject"));
        Object term174453 = newInstance(Class.forName("java.util.concurrent.DelayQueue$Itr"));
        setIntField(term174319, term174319.getClass(), "stackSize", 5);
        setElement(term174038, 0, term174377);
        setElement(term174038, 2, term174453);
        setElement(term174038, 3, term174377);
        setField(term174319, term174319.getClass(), "stack", term174038);
        term174484 = newInstance(Class.forName("com.google.gson.internal.bind.JsonTreeReader"));
        Object[] term174485 = (Object[]) newArray("java.lang.Object", 111);
        Object term174486 = newInstance(Class.forName("com.google.gson.JsonObject"));
        Object term174487 = newInstance(Class.forName("java.util.concurrent.DelayQueue$Itr"));
        setField(term174486, term174486.getClass(), "members", null);
        setElement(term174485, 0, term174486);
        setField(term174487, term174487.getClass(), "array", null);
        setIntField(term174487, term174487.getClass(), "cursor", 0);
        setIntField(term174487, term174487.getClass(), "lastRet", 0);
        setField(term174487, term174487.getClass(), "this$0", null);
        setElement(term174485, 2, term174487);
        setElement(term174485, 3, term174486);
        setField(term174484, term174484.getClass(), "stack", term174485);
        setIntField(term174484, term174484.getClass(), "stackSize", 0);
        setField(term174484, term174484.getClass(), "pathNames", null);
        setField(term174484, term174484.getClass(), "pathIndices", null);
        setField(term174484, term174484.getClass(), "in", null);
        setBooleanField(term174484, term174484.getClass(), "lenient", false);
        setField(term174484, term174484.getClass(), "buffer", null);
        setIntField(term174484, term174484.getClass(), "pos", 0);
        setIntField(term174484, term174484.getClass(), "limit", 0);
        setIntField(term174484, term174484.getClass(), "lineNumber", 0);
        setIntField(term174484, term174484.getClass(), "lineStart", 0);
        setIntField(term174484, term174484.getClass(), "peeked", 0);
        setLongField(term174484, term174484.getClass(), "peekedLong", 0L);
        setIntField(term174484, term174484.getClass(), "peekedNumberLength", 0);
        setField(term174484, term174484.getClass(), "peekedString", null);
        setField(term174484, term174484.getClass(), "stack", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.gson.internal.bind.JsonTreeReader");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "getPath", argTypes, term174319, args);
        assertTrue(recursiveEquals(term174319, term174484));
        assertTrue(recursiveEquals(retValue, "$"));
    }

};


