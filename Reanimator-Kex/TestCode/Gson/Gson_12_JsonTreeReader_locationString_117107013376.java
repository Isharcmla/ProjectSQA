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

public class JsonTreeReader_locationString_117107013376 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term155786;
     Object term156345;

    public JsonTreeReader_locationString_117107013376() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term156229 = new HashMap();
        Set<Map.Entry<Object, Object>> term156170_OuterSet = ((HashMap) term156229).entrySet();
        Iterator<Object> term156170 = ((Set) term156170_OuterSet).iterator();
        term155786 = newInstance(Class.forName("com.google.gson.internal.bind.JsonTreeReader"));
        Object[] term155456 = (Object[]) newArray("java.lang.Object", 23);
        Object term155868 = newInstance(Class.forName("java.util.JumboEnumSet$EnumSetIterator"));
        Object term155924 = newInstance(Class.forName("com.google.gson.JsonArray"));
        Object term156018 = newInstance(Class.forName("com.google.gson.internal.bind.JsonTreeReader"));
        Object term156094 = newInstance(Class.forName("java.util.Collections$EmptyIterator"));
        Object term156228 = newInstance(Class.forName("com.google.gson.JsonObject"));
        setIntField(term155786, term155786.getClass(), "stackSize", 22);
        setElement(term155456, 0, term155868);
        setElement(term155456, 1, term155924);
        setElement(term155456, 2, term156018);
        setElement(term155456, 3, term156094);
        setElement(term155456, 4, term156170);
        setElement(term155456, 7, term156228);
        setField(term155786, term155786.getClass(), "stack", term155456);
        HashMap term156352 = new HashMap();
        term156345 = newInstance(Class.forName("com.google.gson.internal.bind.JsonTreeReader"));
        Object[] term156346 = (Object[]) newArray("java.lang.Object", 23);
        Object term156347 = newInstance(Class.forName("java.util.JumboEnumSet$EnumSetIterator"));
        Object term156348 = newInstance(Class.forName("com.google.gson.JsonArray"));
        Object term156349 = newInstance(Class.forName("com.google.gson.internal.bind.JsonTreeReader"));
        Object term156350 = newInstance(Class.forName("java.util.Collections$EmptyIterator"));
        Object term156351 = newInstance(Class.forName("java.util.HashMap$EntryIterator"));
        Object term156354 = newInstance(Class.forName("com.google.gson.JsonObject"));
        setLongField(term156347, term156347.getClass(), "unseen", 0L);
        setIntField(term156347, term156347.getClass(), "unseenIndex", 0);
        setLongField(term156347, term156347.getClass(), "lastReturned", 0L);
        setIntField(term156347, term156347.getClass(), "lastReturnedIndex", 0);
        setField(term156347, term156347.getClass(), "this$0", null);
        setElement(term156346, 0, term156347);
        setField(term156348, term156348.getClass(), "elements", null);
        setElement(term156346, 1, term156348);
        setField(term156349, term156349.getClass(), "stack", null);
        setIntField(term156349, term156349.getClass(), "stackSize", 0);
        setField(term156349, term156349.getClass(), "pathNames", null);
        setField(term156349, term156349.getClass(), "pathIndices", null);
        setField(term156349, term156349.getClass(), "in", null);
        setBooleanField(term156349, term156349.getClass(), "lenient", false);
        setField(term156349, term156349.getClass(), "buffer", null);
        setIntField(term156349, term156349.getClass(), "pos", 0);
        setIntField(term156349, term156349.getClass(), "limit", 0);
        setIntField(term156349, term156349.getClass(), "lineNumber", 0);
        setIntField(term156349, term156349.getClass(), "lineStart", 0);
        setIntField(term156349, term156349.getClass(), "peeked", 0);
        setLongField(term156349, term156349.getClass(), "peekedLong", 0L);
        setIntField(term156349, term156349.getClass(), "peekedNumberLength", 0);
        setField(term156349, term156349.getClass(), "peekedString", null);
        setField(term156349, term156349.getClass(), "stack", null);
        setElement(term156346, 2, term156349);
        setElement(term156346, 3, term156350);
        setField(term156351, term156351.getClass(), "this$0", term156352);
        setField(term156351, term156351.getClass(), "next", null);
        setField(term156351, term156351.getClass(), "current", null);
        setIntField(term156351, term156351.getClass(), "expectedModCount", 0);
        setIntField(term156351, term156351.getClass(), "index", 0);
        setElement(term156346, 4, term156351);
        setField(term156354, term156354.getClass(), "members", null);
        setElement(term156346, 7, term156354);
        setField(term156345, term156345.getClass(), "stack", term156346);
        setIntField(term156345, term156345.getClass(), "stackSize", 0);
        setField(term156345, term156345.getClass(), "pathNames", null);
        setField(term156345, term156345.getClass(), "pathIndices", null);
        setField(term156345, term156345.getClass(), "in", null);
        setBooleanField(term156345, term156345.getClass(), "lenient", false);
        setField(term156345, term156345.getClass(), "buffer", null);
        setIntField(term156345, term156345.getClass(), "pos", 0);
        setIntField(term156345, term156345.getClass(), "limit", 0);
        setIntField(term156345, term156345.getClass(), "lineNumber", 0);
        setIntField(term156345, term156345.getClass(), "lineStart", 0);
        setIntField(term156345, term156345.getClass(), "peeked", 0);
        setLongField(term156345, term156345.getClass(), "peekedLong", 0L);
        setIntField(term156345, term156345.getClass(), "peekedNumberLength", 0);
        setField(term156345, term156345.getClass(), "peekedString", null);
        setField(term156345, term156345.getClass(), "stack", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.gson.internal.bind.JsonTreeReader");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "locationString", argTypes, term155786, args);
        assertTrue(recursiveEquals(term155786, term156345));
        assertTrue(recursiveEquals(retValue, " at path $"));
    }

};


