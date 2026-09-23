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
import java.lang.StringBuilder;

public class JsonTreeReader_locationString_117107013425 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term178429;
     Object term179548;

    public JsonTreeReader_locationString_117107013425() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        StringBuilder term178613 = new StringBuilder();
        term178429 = newInstance(Class.forName("com.google.gson.internal.bind.JsonTreeReader"));
        Object[] term178113 = (Object[]) newArray("java.lang.Object", 23);
        Object term178497 = newInstance(Class.forName("java.util.EnumMap$EntryIterator"));
        Object term178553 = newInstance(Class.forName("com.google.gson.JsonArray"));
        Object term178697 = newInstance(Class.forName("java.util.IdentityHashMap$ValueIterator"));
        Object term178759 = newInstance(Class.forName("java.util.LinkedList$ListItr"));
        setIntField(term178429, term178429.getClass(), "stackSize", 7);
        setElement(term178113, 0, term178497);
        setElement(term178113, 1, term178553);
        setElement(term178113, 4, term178613);
        setElement(term178113, 5, term178697);
        setElement(term178113, 6, term178759);
        setField(term178429, term178429.getClass(), "stack", term178113);
        term179548 = newInstance(Class.forName("com.google.gson.internal.bind.JsonTreeReader"));
        Object[] term179549 = (Object[]) newArray("java.lang.Object", 23);
        Object term179550 = newInstance(Class.forName("java.util.EnumMap$EntryIterator"));
        Object term179551 = newInstance(Class.forName("com.google.gson.JsonArray"));
        Object term179552 = newInstance(Class.forName("java.lang.StringBuilder"));
        byte[] term179553 = (byte[]) newByteArray(16);
        Object term179554 = newInstance(Class.forName("java.util.IdentityHashMap$ValueIterator"));
        Object term179555 = newInstance(Class.forName("java.util.LinkedList$ListItr"));
        setField(term179550, term179550.getClass(), "lastReturnedEntry", null);
        setField(term179550, term179550.getClass(), "this$0", null);
        setIntField(term179550, term179550.getClass(), "index", 0);
        setIntField(term179550, term179550.getClass(), "lastReturnedIndex", 0);
        setElement(term179549, 0, term179550);
        setField(term179551, term179551.getClass(), "elements", null);
        setElement(term179549, 1, term179551);
        setField(term179552, term179552.getClass(), "value", term179553);
        setByteField(term179552, term179552.getClass(), "coder", (byte) 0);
        setIntField(term179552, term179552.getClass(), "count", 0);
        setElement(term179549, 4, term179552);
        setField(term179554, term179554.getClass(), "this$0", null);
        setIntField(term179554, term179554.getClass(), "index", 0);
        setIntField(term179554, term179554.getClass(), "expectedModCount", 0);
        setIntField(term179554, term179554.getClass(), "lastReturnedIndex", 0);
        setBooleanField(term179554, term179554.getClass(), "indexValid", false);
        setField(term179554, term179554.getClass(), "traversalTable", null);
        setElement(term179549, 5, term179554);
        setField(term179555, term179555.getClass(), "lastReturned", null);
        setField(term179555, term179555.getClass(), "next", null);
        setIntField(term179555, term179555.getClass(), "nextIndex", 0);
        setIntField(term179555, term179555.getClass(), "expectedModCount", 0);
        setField(term179555, term179555.getClass(), "this$0", null);
        setElement(term179549, 6, term179555);
        setField(term179548, term179548.getClass(), "stack", term179549);
        setIntField(term179548, term179548.getClass(), "stackSize", 0);
        setField(term179548, term179548.getClass(), "pathNames", null);
        setField(term179548, term179548.getClass(), "pathIndices", null);
        setField(term179548, term179548.getClass(), "in", null);
        setBooleanField(term179548, term179548.getClass(), "lenient", false);
        setField(term179548, term179548.getClass(), "buffer", null);
        setIntField(term179548, term179548.getClass(), "pos", 0);
        setIntField(term179548, term179548.getClass(), "limit", 0);
        setIntField(term179548, term179548.getClass(), "lineNumber", 0);
        setIntField(term179548, term179548.getClass(), "lineStart", 0);
        setIntField(term179548, term179548.getClass(), "peeked", 0);
        setLongField(term179548, term179548.getClass(), "peekedLong", 0L);
        setIntField(term179548, term179548.getClass(), "peekedNumberLength", 0);
        setField(term179548, term179548.getClass(), "peekedString", null);
        setField(term179548, term179548.getClass(), "stack", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.gson.internal.bind.JsonTreeReader");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "locationString", argTypes, term178429, args);
        assertTrue(recursiveEquals(term178429, term179548));
        assertTrue(recursiveEquals(retValue, " at path $"));
    }

};


