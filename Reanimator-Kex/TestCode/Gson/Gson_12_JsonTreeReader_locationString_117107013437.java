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

public class JsonTreeReader_locationString_117107013437 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term184252;
     Object term185578;

    public JsonTreeReader_locationString_117107013437() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term184252 = newInstance(Class.forName("com.google.gson.internal.bind.JsonTreeReader"));
        Object[] term183949 = (Object[]) newArray("java.lang.Object", 107);
        Object term184308 = newInstance(Class.forName("com.google.gson.JsonArray"));
        Object term184392 = newInstance(Class.forName("java.util.LinkedList$DescendingIterator"));
        Object term184460 = newInstance(Class.forName("java.util.TreeMap$ValueIterator"));
        setIntField(term184252, term184252.getClass(), "stackSize", 6);
        setElement(term183949, 1, term184308);
        setElement(term183949, 3, term184392);
        setElement(term183949, 4, term184460);
        setField(term184252, term184252.getClass(), "stack", term183949);
        term185578 = newInstance(Class.forName("com.google.gson.internal.bind.JsonTreeReader"));
        Object[] term185579 = (Object[]) newArray("java.lang.Object", 107);
        Object term185580 = newInstance(Class.forName("com.google.gson.JsonArray"));
        Object term185581 = newInstance(Class.forName("java.util.LinkedList$DescendingIterator"));
        Object term185582 = newInstance(Class.forName("java.util.TreeMap$ValueIterator"));
        setField(term185580, term185580.getClass(), "elements", null);
        setElement(term185579, 1, term185580);
        setField(term185581, term185581.getClass(), "itr", null);
        setField(term185581, term185581.getClass(), "this$0", null);
        setElement(term185579, 3, term185581);
        setField(term185582, term185582.getClass(), "this$0", null);
        setField(term185582, term185582.getClass(), "next", null);
        setField(term185582, term185582.getClass(), "lastReturned", null);
        setIntField(term185582, term185582.getClass(), "expectedModCount", 0);
        setElement(term185579, 4, term185582);
        setField(term185578, term185578.getClass(), "stack", term185579);
        setIntField(term185578, term185578.getClass(), "stackSize", 0);
        setField(term185578, term185578.getClass(), "pathNames", null);
        setField(term185578, term185578.getClass(), "pathIndices", null);
        setField(term185578, term185578.getClass(), "in", null);
        setBooleanField(term185578, term185578.getClass(), "lenient", false);
        setField(term185578, term185578.getClass(), "buffer", null);
        setIntField(term185578, term185578.getClass(), "pos", 0);
        setIntField(term185578, term185578.getClass(), "limit", 0);
        setIntField(term185578, term185578.getClass(), "lineNumber", 0);
        setIntField(term185578, term185578.getClass(), "lineStart", 0);
        setIntField(term185578, term185578.getClass(), "peeked", 0);
        setLongField(term185578, term185578.getClass(), "peekedLong", 0L);
        setIntField(term185578, term185578.getClass(), "peekedNumberLength", 0);
        setField(term185578, term185578.getClass(), "peekedString", null);
        setField(term185578, term185578.getClass(), "stack", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.gson.internal.bind.JsonTreeReader");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "locationString", argTypes, term184252, args);
        assertTrue(recursiveEquals(term184252, term185578));
        assertTrue(recursiveEquals(retValue, " at path $"));
    }

};


