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

public class JsonTreeReader_getPath_1170023302270 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term89990;
     Object term91006;

    public JsonTreeReader_getPath_1170023302270() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term89990 = newInstance(Class.forName("com.google.gson.internal.bind.JsonTreeReader"));
        Object[] term88861 = (Object[]) newArray("java.lang.Object", 491);
        char[] term88370 = (char[]) newCharArray(489);
        setIntField(term89990, term89990.getClass(), "stackSize", 7);
        setElement(term88861, 1, term88370);
        setField(term89990, term89990.getClass(), "stack", term88861);
        term91006 = newInstance(Class.forName("com.google.gson.internal.bind.JsonTreeReader"));
        Object[] term91007 = (Object[]) newArray("java.lang.Object", 491);
        char[] term91008 = (char[]) newCharArray(489);
        setElement(term91007, 1, term91008);
        setField(term91006, term91006.getClass(), "stack", term91007);
        setIntField(term91006, term91006.getClass(), "stackSize", 0);
        setField(term91006, term91006.getClass(), "pathNames", null);
        setField(term91006, term91006.getClass(), "pathIndices", null);
        setField(term91006, term91006.getClass(), "in", null);
        setBooleanField(term91006, term91006.getClass(), "lenient", false);
        setField(term91006, term91006.getClass(), "buffer", null);
        setIntField(term91006, term91006.getClass(), "pos", 0);
        setIntField(term91006, term91006.getClass(), "limit", 0);
        setIntField(term91006, term91006.getClass(), "lineNumber", 0);
        setIntField(term91006, term91006.getClass(), "lineStart", 0);
        setIntField(term91006, term91006.getClass(), "peeked", 0);
        setLongField(term91006, term91006.getClass(), "peekedLong", 0L);
        setIntField(term91006, term91006.getClass(), "peekedNumberLength", 0);
        setField(term91006, term91006.getClass(), "peekedString", null);
        setField(term91006, term91006.getClass(), "stack", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.gson.internal.bind.JsonTreeReader");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "getPath", argTypes, term89990, args);
        assertTrue(recursiveEquals(term89990, term91006));
        assertTrue(recursiveEquals(retValue, "$"));
    }

};


