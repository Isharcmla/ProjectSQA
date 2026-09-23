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

public class JsonTreeReader_getPath_1170023302390 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term162573;
     Object term162853;

    public JsonTreeReader_getPath_1170023302390() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term162573 = newInstance(Class.forName("com.google.gson.internal.bind.JsonTreeReader"));
        Object[] term162289 = (Object[]) newArray("java.lang.Object", 519);
        Object term162667 = newInstance(Class.forName("java.util.concurrent.LinkedTransferQueue$Itr"));
        Object term162725 = newInstance(Class.forName("com.google.gson.JsonObject"));
        Object[] term162292 = (Object[]) newArray("java.lang.Object", 0);
        Object term162781 = newInstance(Class.forName("com.google.gson.JsonArray"));
        Object term162819 = newInstance(Class.forName("java.lang.Object"));
        setIntField(term162573, term162573.getClass(), "stackSize", 5);
        setElement(term162289, 0, term162667);
        setElement(term162289, 1, term162725);
        setElement(term162289, 3, term162292);
        setElement(term162289, 4, term162781);
        setElement(term162289, 256, term162819);
        setField(term162573, term162573.getClass(), "stack", term162289);
        term162853 = newInstance(Class.forName("com.google.gson.internal.bind.JsonTreeReader"));
        Object[] term162854 = (Object[]) newArray("java.lang.Object", 519);
        Object term162855 = newInstance(Class.forName("java.util.concurrent.LinkedTransferQueue$Itr"));
        Object term162856 = newInstance(Class.forName("com.google.gson.JsonObject"));
        Object[] term162857 = (Object[]) newArray("java.lang.Object", 0);
        Object term162858 = newInstance(Class.forName("com.google.gson.JsonArray"));
        Object term162859 = newInstance(Class.forName("java.lang.Object"));
        setField(term162855, term162855.getClass(), "nextNode", null);
        setField(term162855, term162855.getClass(), "nextItem", null);
        setField(term162855, term162855.getClass(), "lastRet", null);
        setField(term162855, term162855.getClass(), "ancestor", null);
        setField(term162855, term162855.getClass(), "this$0", null);
        setElement(term162854, 0, term162855);
        setField(term162856, term162856.getClass(), "members", null);
        setElement(term162854, 1, term162856);
        setElement(term162854, 3, term162857);
        setField(term162858, term162858.getClass(), "elements", null);
        setElement(term162854, 4, term162858);
        setElement(term162854, 256, term162859);
        setField(term162853, term162853.getClass(), "stack", term162854);
        setIntField(term162853, term162853.getClass(), "stackSize", 0);
        setField(term162853, term162853.getClass(), "pathNames", null);
        setField(term162853, term162853.getClass(), "pathIndices", null);
        setField(term162853, term162853.getClass(), "in", null);
        setBooleanField(term162853, term162853.getClass(), "lenient", false);
        setField(term162853, term162853.getClass(), "buffer", null);
        setIntField(term162853, term162853.getClass(), "pos", 0);
        setIntField(term162853, term162853.getClass(), "limit", 0);
        setIntField(term162853, term162853.getClass(), "lineNumber", 0);
        setIntField(term162853, term162853.getClass(), "lineStart", 0);
        setIntField(term162853, term162853.getClass(), "peeked", 0);
        setLongField(term162853, term162853.getClass(), "peekedLong", 0L);
        setIntField(term162853, term162853.getClass(), "peekedNumberLength", 0);
        setField(term162853, term162853.getClass(), "peekedString", null);
        setField(term162853, term162853.getClass(), "stack", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.gson.internal.bind.JsonTreeReader");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "getPath", argTypes, term162573, args);
        assertTrue(recursiveEquals(term162573, term162853));
        assertTrue(recursiveEquals(retValue, "$"));
    }

};


