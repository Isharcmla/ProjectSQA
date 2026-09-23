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
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.Iterator;

public class JsonTreeReader_getPath_1170023302419 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term175347;
     Object term176906;

    public JsonTreeReader_getPath_1170023302419() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term175708 = new HashMap();
        Set<Map.Entry<Object, Object>> term175575_OuterSet = ((HashMap) term175708).entrySet();
        Iterator<Object> term175575 = ((Set) term175575_OuterSet).iterator();
        term175347 = newInstance(Class.forName("com.google.gson.internal.bind.JsonTreeReader"));
        Object[] term175056 = (Object[]) newArray("java.lang.Object", 502);
        Object term175441 = newInstance(Class.forName("com.google.gson.internal.bind.JsonTreeReader"));
        Object term175499 = newInstance(Class.forName("com.google.gson.JsonObject"));
        Object term175669 = newInstance(Class.forName("com.google.gson.internal.bind.JsonTreeReader"));
        Object term175707 = newInstance(Class.forName("java.lang.Object"));
        setIntField(term175347, term175347.getClass(), "stackSize", 5);
        setElement(term175056, 0, term175441);
        setElement(term175056, 1, term175499);
        setElement(term175056, 3, term175575);
        setElement(term175056, 4, term175669);
        setElement(term175056, 128, term175707);
        setField(term175347, term175347.getClass(), "stack", term175056);
        HashMap term176911 = new HashMap();
        term176906 = newInstance(Class.forName("com.google.gson.internal.bind.JsonTreeReader"));
        Object[] term176907 = (Object[]) newArray("java.lang.Object", 502);
        Object term176908 = newInstance(Class.forName("com.google.gson.internal.bind.JsonTreeReader"));
        Object term176909 = newInstance(Class.forName("com.google.gson.JsonObject"));
        Object term176910 = newInstance(Class.forName("java.util.HashMap$EntryIterator"));
        Object term176913 = newInstance(Class.forName("com.google.gson.internal.bind.JsonTreeReader"));
        Object term176914 = newInstance(Class.forName("java.lang.Object"));
        setField(term176908, term176908.getClass(), "stack", null);
        setIntField(term176908, term176908.getClass(), "stackSize", 0);
        setField(term176908, term176908.getClass(), "pathNames", null);
        setField(term176908, term176908.getClass(), "pathIndices", null);
        setField(term176908, term176908.getClass(), "in", null);
        setBooleanField(term176908, term176908.getClass(), "lenient", false);
        setField(term176908, term176908.getClass(), "buffer", null);
        setIntField(term176908, term176908.getClass(), "pos", 0);
        setIntField(term176908, term176908.getClass(), "limit", 0);
        setIntField(term176908, term176908.getClass(), "lineNumber", 0);
        setIntField(term176908, term176908.getClass(), "lineStart", 0);
        setIntField(term176908, term176908.getClass(), "peeked", 0);
        setLongField(term176908, term176908.getClass(), "peekedLong", 0L);
        setIntField(term176908, term176908.getClass(), "peekedNumberLength", 0);
        setField(term176908, term176908.getClass(), "peekedString", null);
        setField(term176908, term176908.getClass(), "stack", null);
        setElement(term176907, 0, term176908);
        setField(term176909, term176909.getClass(), "members", null);
        setElement(term176907, 1, term176909);
        setField(term176910, term176910.getClass(), "this$0", term176911);
        setField(term176910, term176910.getClass(), "next", null);
        setField(term176910, term176910.getClass(), "current", null);
        setIntField(term176910, term176910.getClass(), "expectedModCount", 0);
        setIntField(term176910, term176910.getClass(), "index", 0);
        setElement(term176907, 3, term176910);
        setField(term176913, term176913.getClass(), "stack", null);
        setIntField(term176913, term176913.getClass(), "stackSize", 0);
        setField(term176913, term176913.getClass(), "pathNames", null);
        setField(term176913, term176913.getClass(), "pathIndices", null);
        setField(term176913, term176913.getClass(), "in", null);
        setBooleanField(term176913, term176913.getClass(), "lenient", false);
        setField(term176913, term176913.getClass(), "buffer", null);
        setIntField(term176913, term176913.getClass(), "pos", 0);
        setIntField(term176913, term176913.getClass(), "limit", 0);
        setIntField(term176913, term176913.getClass(), "lineNumber", 0);
        setIntField(term176913, term176913.getClass(), "lineStart", 0);
        setIntField(term176913, term176913.getClass(), "peeked", 0);
        setLongField(term176913, term176913.getClass(), "peekedLong", 0L);
        setIntField(term176913, term176913.getClass(), "peekedNumberLength", 0);
        setField(term176913, term176913.getClass(), "peekedString", null);
        setField(term176913, term176913.getClass(), "stack", null);
        setElement(term176907, 4, term176913);
        setElement(term176907, 128, term176914);
        setField(term176906, term176906.getClass(), "stack", term176907);
        setIntField(term176906, term176906.getClass(), "stackSize", 0);
        setField(term176906, term176906.getClass(), "pathNames", null);
        setField(term176906, term176906.getClass(), "pathIndices", null);
        setField(term176906, term176906.getClass(), "in", null);
        setBooleanField(term176906, term176906.getClass(), "lenient", false);
        setField(term176906, term176906.getClass(), "buffer", null);
        setIntField(term176906, term176906.getClass(), "pos", 0);
        setIntField(term176906, term176906.getClass(), "limit", 0);
        setIntField(term176906, term176906.getClass(), "lineNumber", 0);
        setIntField(term176906, term176906.getClass(), "lineStart", 0);
        setIntField(term176906, term176906.getClass(), "peeked", 0);
        setLongField(term176906, term176906.getClass(), "peekedLong", 0L);
        setIntField(term176906, term176906.getClass(), "peekedNumberLength", 0);
        setField(term176906, term176906.getClass(), "peekedString", null);
        setField(term176906, term176906.getClass(), "stack", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.gson.internal.bind.JsonTreeReader");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "getPath", argTypes, term175347, args);
        assertTrue(recursiveEquals(term175347, term176906));
        assertTrue(recursiveEquals(retValue, "$"));
    }

};


