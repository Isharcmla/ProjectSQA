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

public class JsonTreeReader_getPath_1170023302221 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term62233;
     Object term63236;

    public JsonTreeReader_getPath_1170023302221() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term62233 = newInstance(Class.forName("com.google.gson.internal.bind.JsonTreeReader"));
        Object[] term61974 = (Object[]) newArray("java.lang.Object", 499);
        Object term62291 = newInstance(Class.forName("com.google.gson.JsonObject"));
        Object term62347 = newInstance(Class.forName("com.google.gson.JsonArray"));
        Object term62385 = newInstance(Class.forName("java.lang.Object"));
        setIntField(term62233, term62233.getClass(), "stackSize", 3);
        setElement(term61974, 0, term62291);
        setElement(term61974, 2, term62347);
        setElement(term61974, 32, term62385);
        setField(term62233, term62233.getClass(), "stack", term61974);
        term63236 = newInstance(Class.forName("com.google.gson.internal.bind.JsonTreeReader"));
        Object[] term63237 = (Object[]) newArray("java.lang.Object", 499);
        Object term63238 = newInstance(Class.forName("com.google.gson.JsonObject"));
        Object term63239 = newInstance(Class.forName("com.google.gson.JsonArray"));
        Object term63240 = newInstance(Class.forName("java.lang.Object"));
        setField(term63238, term63238.getClass(), "members", null);
        setElement(term63237, 0, term63238);
        setField(term63239, term63239.getClass(), "elements", null);
        setElement(term63237, 2, term63239);
        setElement(term63237, 32, term63240);
        setField(term63236, term63236.getClass(), "stack", term63237);
        setIntField(term63236, term63236.getClass(), "stackSize", 0);
        setField(term63236, term63236.getClass(), "pathNames", null);
        setField(term63236, term63236.getClass(), "pathIndices", null);
        setField(term63236, term63236.getClass(), "in", null);
        setBooleanField(term63236, term63236.getClass(), "lenient", false);
        setField(term63236, term63236.getClass(), "buffer", null);
        setIntField(term63236, term63236.getClass(), "pos", 0);
        setIntField(term63236, term63236.getClass(), "limit", 0);
        setIntField(term63236, term63236.getClass(), "lineNumber", 0);
        setIntField(term63236, term63236.getClass(), "lineStart", 0);
        setIntField(term63236, term63236.getClass(), "peeked", 0);
        setLongField(term63236, term63236.getClass(), "peekedLong", 0L);
        setIntField(term63236, term63236.getClass(), "peekedNumberLength", 0);
        setField(term63236, term63236.getClass(), "peekedString", null);
        setField(term63236, term63236.getClass(), "stack", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.gson.internal.bind.JsonTreeReader");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "getPath", argTypes, term62233, args);
        assertTrue(recursiveEquals(term62233, term63236));
        assertTrue(recursiveEquals(retValue, "$"));
    }

};


