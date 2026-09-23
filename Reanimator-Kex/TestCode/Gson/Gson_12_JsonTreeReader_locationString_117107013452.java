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
import java.util.Set;
import java.util.Iterator;

public class JsonTreeReader_locationString_117107013452 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term241793;
     Object term242830;

    public JsonTreeReader_locationString_117107013452() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term242208 = new HashMap();
        Set<Object> term242019_OuterSet = ((HashMap) term242208).keySet();
        Iterator<Object> term242019 = ((Set) term242019_OuterSet).iterator();
        term241793 = newInstance(Class.forName("com.google.gson.internal.bind.JsonTreeReader"));
        Object[] term240865 = (Object[]) newArray("java.lang.Object", 110);
        Object term241849 = newInstance(Class.forName("com.google.gson.JsonArray"));
        Object term241947 = newInstance(Class.forName("java.util.concurrent.ConcurrentLinkedQueue$Itr"));
        Object term242087 = newInstance(Class.forName("java.util.EnumMap$EntryIterator"));
        Object term242151 = newInstance(Class.forName("java.util.EnumMap$KeyIterator"));
        char[] term240552 = (char[]) newCharArray(268);
        Object term242207 = newInstance(Class.forName("com.google.gson.JsonArray"));
        setIntField(term241793, term241793.getClass(), "stackSize", 14);
        setElement(term240865, 1, term241849);
        setElement(term240865, 3, term241947);
        setElement(term240865, 4, term242019);
        setElement(term240865, 5, term242087);
        setElement(term240865, 6, term242151);
        setElement(term240865, 7, term240552);
        setElement(term240865, 13, term242207);
        setField(term241793, term241793.getClass(), "stack", term240865);
        HashMap term242835 = new HashMap();
        term242830 = newInstance(Class.forName("com.google.gson.internal.bind.JsonTreeReader"));
        Object[] term242831 = (Object[]) newArray("java.lang.Object", 110);
        Object term242832 = newInstance(Class.forName("com.google.gson.JsonArray"));
        Object term242833 = newInstance(Class.forName("java.util.concurrent.ConcurrentLinkedQueue$Itr"));
        Object term242834 = newInstance(Class.forName("java.util.HashMap$KeyIterator"));
        Object term242837 = newInstance(Class.forName("java.util.EnumMap$EntryIterator"));
        Object term242838 = newInstance(Class.forName("java.util.EnumMap$KeyIterator"));
        char[] term242839 = (char[]) newCharArray(268);
        Object term242840 = newInstance(Class.forName("com.google.gson.JsonArray"));
        setField(term242832, term242832.getClass(), "elements", null);
        setElement(term242831, 1, term242832);
        setField(term242833, term242833.getClass(), "nextNode", null);
        setField(term242833, term242833.getClass(), "nextItem", null);
        setField(term242833, term242833.getClass(), "lastRet", null);
        setField(term242833, term242833.getClass(), "this$0", null);
        setElement(term242831, 3, term242833);
        setField(term242834, term242834.getClass(), "this$0", term242835);
        setField(term242834, term242834.getClass(), "next", null);
        setField(term242834, term242834.getClass(), "current", null);
        setIntField(term242834, term242834.getClass(), "expectedModCount", 0);
        setIntField(term242834, term242834.getClass(), "index", 0);
        setElement(term242831, 4, term242834);
        setField(term242837, term242837.getClass(), "lastReturnedEntry", null);
        setField(term242837, term242837.getClass(), "this$0", null);
        setIntField(term242837, term242837.getClass(), "index", 0);
        setIntField(term242837, term242837.getClass(), "lastReturnedIndex", 0);
        setElement(term242831, 5, term242837);
        setField(term242838, term242838.getClass(), "this$0", null);
        setIntField(term242838, term242838.getClass(), "index", 0);
        setIntField(term242838, term242838.getClass(), "lastReturnedIndex", 0);
        setElement(term242831, 6, term242838);
        setElement(term242831, 7, term242839);
        setField(term242840, term242840.getClass(), "elements", null);
        setElement(term242831, 13, term242840);
        setField(term242830, term242830.getClass(), "stack", term242831);
        setIntField(term242830, term242830.getClass(), "stackSize", 0);
        setField(term242830, term242830.getClass(), "pathNames", null);
        setField(term242830, term242830.getClass(), "pathIndices", null);
        setField(term242830, term242830.getClass(), "in", null);
        setBooleanField(term242830, term242830.getClass(), "lenient", false);
        setField(term242830, term242830.getClass(), "buffer", null);
        setIntField(term242830, term242830.getClass(), "pos", 0);
        setIntField(term242830, term242830.getClass(), "limit", 0);
        setIntField(term242830, term242830.getClass(), "lineNumber", 0);
        setIntField(term242830, term242830.getClass(), "lineStart", 0);
        setIntField(term242830, term242830.getClass(), "peeked", 0);
        setLongField(term242830, term242830.getClass(), "peekedLong", 0L);
        setIntField(term242830, term242830.getClass(), "peekedNumberLength", 0);
        setField(term242830, term242830.getClass(), "peekedString", null);
        setField(term242830, term242830.getClass(), "stack", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.gson.internal.bind.JsonTreeReader");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "locationString", argTypes, term241793, args);
        assertTrue(recursiveEquals(term241793, term242830));
        assertTrue(recursiveEquals(retValue, " at path $"));
    }

};


