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

public class JsonTreeReader_getPath_1170023302193 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term48049;
     Object term48504;

    public JsonTreeReader_getPath_1170023302193() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term48049 = newInstance(Class.forName("com.google.gson.internal.bind.JsonTreeReader"));
        Object[] term47796 = (Object[]) newArray("java.lang.Object", 234);
        Object term48107 = newInstance(Class.forName("com.google.gson.JsonObject"));
        Object term48145 = newInstance(Class.forName("java.lang.Object"));
        setIntField(term48049, term48049.getClass(), "stackSize", 4);
        setElement(term47796, 0, term48107);
        setElement(term47796, 128, term48145);
        setField(term48049, term48049.getClass(), "stack", term47796);
        term48504 = newInstance(Class.forName("com.google.gson.internal.bind.JsonTreeReader"));
        Object[] term48505 = (Object[]) newArray("java.lang.Object", 234);
        Object term48506 = newInstance(Class.forName("com.google.gson.JsonObject"));
        Object term48507 = newInstance(Class.forName("java.lang.Object"));
        setField(term48506, term48506.getClass(), "members", null);
        setElement(term48505, 0, term48506);
        setElement(term48505, 128, term48507);
        setField(term48504, term48504.getClass(), "stack", term48505);
        setIntField(term48504, term48504.getClass(), "stackSize", 0);
        setField(term48504, term48504.getClass(), "pathNames", null);
        setField(term48504, term48504.getClass(), "pathIndices", null);
        setField(term48504, term48504.getClass(), "in", null);
        setBooleanField(term48504, term48504.getClass(), "lenient", false);
        setField(term48504, term48504.getClass(), "buffer", null);
        setIntField(term48504, term48504.getClass(), "pos", 0);
        setIntField(term48504, term48504.getClass(), "limit", 0);
        setIntField(term48504, term48504.getClass(), "lineNumber", 0);
        setIntField(term48504, term48504.getClass(), "lineStart", 0);
        setIntField(term48504, term48504.getClass(), "peeked", 0);
        setLongField(term48504, term48504.getClass(), "peekedLong", 0L);
        setIntField(term48504, term48504.getClass(), "peekedNumberLength", 0);
        setField(term48504, term48504.getClass(), "peekedString", null);
        setField(term48504, term48504.getClass(), "stack", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.gson.internal.bind.JsonTreeReader");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "getPath", argTypes, term48049, args);
        assertTrue(recursiveEquals(term48049, term48504));
        assertTrue(recursiveEquals(retValue, "$"));
    }

};


