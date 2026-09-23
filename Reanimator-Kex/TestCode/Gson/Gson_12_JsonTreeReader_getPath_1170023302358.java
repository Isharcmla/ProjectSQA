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

public class JsonTreeReader_getPath_1170023302358 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term143602;
     Object term143806;

    public JsonTreeReader_getPath_1170023302358() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term143602 = newInstance(Class.forName("com.google.gson.internal.bind.JsonTreeReader"));
        Object[] term143334 = (Object[]) newArray("java.lang.Object", 11);
        Object term143658 = newInstance(Class.forName("java.util.ServiceLoader$3"));
        Object term143716 = newInstance(Class.forName("com.google.gson.JsonObject"));
        Object term143772 = newInstance(Class.forName("com.google.gson.JsonArray"));
        setIntField(term143602, term143602.getClass(), "stackSize", 6);
        setElement(term143334, 0, term143658);
        setElement(term143334, 1, term143716);
        setElement(term143334, 3, term143772);
        setField(term143602, term143602.getClass(), "stack", term143334);
        term143806 = newInstance(Class.forName("com.google.gson.internal.bind.JsonTreeReader"));
        Object[] term143807 = (Object[]) newArray("java.lang.Object", 11);
        Object term143808 = newInstance(Class.forName("java.util.ServiceLoader$3"));
        Object term143809 = newInstance(Class.forName("com.google.gson.JsonObject"));
        Object term143810 = newInstance(Class.forName("com.google.gson.JsonArray"));
        setIntField(term143808, term143808.getClass(), "expectedReloadCount", 0);
        setIntField(term143808, term143808.getClass(), "index", 0);
        setField(term143808, term143808.getClass(), "this$0", null);
        setElement(term143807, 0, term143808);
        setField(term143809, term143809.getClass(), "members", null);
        setElement(term143807, 1, term143809);
        setField(term143810, term143810.getClass(), "elements", null);
        setElement(term143807, 3, term143810);
        setField(term143806, term143806.getClass(), "stack", term143807);
        setIntField(term143806, term143806.getClass(), "stackSize", 0);
        setField(term143806, term143806.getClass(), "pathNames", null);
        setField(term143806, term143806.getClass(), "pathIndices", null);
        setField(term143806, term143806.getClass(), "in", null);
        setBooleanField(term143806, term143806.getClass(), "lenient", false);
        setField(term143806, term143806.getClass(), "buffer", null);
        setIntField(term143806, term143806.getClass(), "pos", 0);
        setIntField(term143806, term143806.getClass(), "limit", 0);
        setIntField(term143806, term143806.getClass(), "lineNumber", 0);
        setIntField(term143806, term143806.getClass(), "lineStart", 0);
        setIntField(term143806, term143806.getClass(), "peeked", 0);
        setLongField(term143806, term143806.getClass(), "peekedLong", 0L);
        setIntField(term143806, term143806.getClass(), "peekedNumberLength", 0);
        setField(term143806, term143806.getClass(), "peekedString", null);
        setField(term143806, term143806.getClass(), "stack", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.gson.internal.bind.JsonTreeReader");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "getPath", argTypes, term143602, args);
        assertTrue(recursiveEquals(term143602, term143806));
        assertTrue(recursiveEquals(retValue, "$"));
    }

};


