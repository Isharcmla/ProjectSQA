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

public class JsonTreeReader_getPath_1170023302235 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term68658;
     Object term69524;

    public JsonTreeReader_getPath_1170023302235() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term68658 = newInstance(Class.forName("com.google.gson.internal.bind.JsonTreeReader"));
        Object[] term68382 = (Object[]) newArray("java.lang.Object", 491);
        Object term68716 = newInstance(Class.forName("com.google.gson.JsonObject"));
        Object term68810 = newInstance(Class.forName("com.google.gson.internal.bind.JsonTreeReader"));
        Object term68868 = newInstance(Class.forName("com.google.gson.JsonObject"));
        Object term68906 = newInstance(Class.forName("java.lang.Object"));
        setIntField(term68658, term68658.getClass(), "stackSize", 8);
        setElement(term68382, 0, term68716);
        setElement(term68382, 1, term68810);
        setElement(term68382, 3, term68868);
        setElement(term68382, 32, term68906);
        setField(term68658, term68658.getClass(), "stack", term68382);
        term69524 = newInstance(Class.forName("com.google.gson.internal.bind.JsonTreeReader"));
        Object[] term69525 = (Object[]) newArray("java.lang.Object", 491);
        Object term69526 = newInstance(Class.forName("com.google.gson.JsonObject"));
        Object term69527 = newInstance(Class.forName("com.google.gson.internal.bind.JsonTreeReader"));
        Object term69528 = newInstance(Class.forName("com.google.gson.JsonObject"));
        Object term69529 = newInstance(Class.forName("java.lang.Object"));
        setField(term69526, term69526.getClass(), "members", null);
        setElement(term69525, 0, term69526);
        setField(term69527, term69527.getClass(), "stack", null);
        setIntField(term69527, term69527.getClass(), "stackSize", 0);
        setField(term69527, term69527.getClass(), "pathNames", null);
        setField(term69527, term69527.getClass(), "pathIndices", null);
        setField(term69527, term69527.getClass(), "in", null);
        setBooleanField(term69527, term69527.getClass(), "lenient", false);
        setField(term69527, term69527.getClass(), "buffer", null);
        setIntField(term69527, term69527.getClass(), "pos", 0);
        setIntField(term69527, term69527.getClass(), "limit", 0);
        setIntField(term69527, term69527.getClass(), "lineNumber", 0);
        setIntField(term69527, term69527.getClass(), "lineStart", 0);
        setIntField(term69527, term69527.getClass(), "peeked", 0);
        setLongField(term69527, term69527.getClass(), "peekedLong", 0L);
        setIntField(term69527, term69527.getClass(), "peekedNumberLength", 0);
        setField(term69527, term69527.getClass(), "peekedString", null);
        setField(term69527, term69527.getClass(), "stack", null);
        setElement(term69525, 1, term69527);
        setField(term69528, term69528.getClass(), "members", null);
        setElement(term69525, 3, term69528);
        setElement(term69525, 32, term69529);
        setField(term69524, term69524.getClass(), "stack", term69525);
        setIntField(term69524, term69524.getClass(), "stackSize", 0);
        setField(term69524, term69524.getClass(), "pathNames", null);
        setField(term69524, term69524.getClass(), "pathIndices", null);
        setField(term69524, term69524.getClass(), "in", null);
        setBooleanField(term69524, term69524.getClass(), "lenient", false);
        setField(term69524, term69524.getClass(), "buffer", null);
        setIntField(term69524, term69524.getClass(), "pos", 0);
        setIntField(term69524, term69524.getClass(), "limit", 0);
        setIntField(term69524, term69524.getClass(), "lineNumber", 0);
        setIntField(term69524, term69524.getClass(), "lineStart", 0);
        setIntField(term69524, term69524.getClass(), "peeked", 0);
        setLongField(term69524, term69524.getClass(), "peekedLong", 0L);
        setIntField(term69524, term69524.getClass(), "peekedNumberLength", 0);
        setField(term69524, term69524.getClass(), "peekedString", null);
        setField(term69524, term69524.getClass(), "stack", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.gson.internal.bind.JsonTreeReader");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "getPath", argTypes, term68658, args);
        assertTrue(recursiveEquals(term68658, term69524));
        assertTrue(recursiveEquals(retValue, "$"));
    }

};


