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
import java.lang.StringBuffer;

public class JsonTreeReader_getPath_1170023302446 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term205731;
     Object term207716;

    public JsonTreeReader_getPath_1170023302446() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        StringBuffer term206227 = new StringBuffer();
        term205731 = newInstance(Class.forName("com.google.gson.internal.bind.JsonTreeReader"));
        Object[] term204240 = (Object[]) newArray("java.lang.Object", 511);
        Object term205829 = newInstance(Class.forName("java.util.concurrent.ConcurrentLinkedDeque$Itr"));
        Object term205887 = newInstance(Class.forName("com.google.gson.JsonObject"));
        Object term205981 = newInstance(Class.forName("com.google.gson.internal.bind.JsonTreeReader"));
        Object term206113 = newInstance(Class.forName("java.util.TreeMap$NavigableSubMap$DescendingSubMapEntryIterator"));
        Object term206169 = newInstance(Class.forName("com.google.gson.JsonArray"));
        Object term206321 = newInstance(Class.forName("com.google.gson.internal.bind.JsonTreeReader"));
        Object term206415 = newInstance(Class.forName("com.google.gson.internal.bind.JsonTreeReader"));
        char[] term203747 = (char[]) newCharArray(490);
        Object term206471 = newInstance(Class.forName("com.google.gson.JsonArray"));
        setIntField(term205731, term205731.getClass(), "stackSize", 31);
        setElement(term204240, 0, term205829);
        setElement(term204240, 1, term205887);
        setElement(term204240, 2, term205981);
        setElement(term204240, 3, term206113);
        setElement(term204240, 5, term206169);
        setElement(term204240, 6, term206227);
        setElement(term204240, 9, term206321);
        setElement(term204240, 10, term206415);
        setElement(term204240, 13, term203747);
        setElement(term204240, 25, term206471);
        setField(term205731, term205731.getClass(), "stack", term204240);
        term207716 = newInstance(Class.forName("com.google.gson.internal.bind.JsonTreeReader"));
        Object[] term207717 = (Object[]) newArray("java.lang.Object", 511);
        Object term207718 = newInstance(Class.forName("java.util.concurrent.ConcurrentLinkedDeque$Itr"));
        Object term207719 = newInstance(Class.forName("com.google.gson.JsonObject"));
        Object term207720 = newInstance(Class.forName("com.google.gson.internal.bind.JsonTreeReader"));
        Object term207721 = newInstance(Class.forName("java.util.TreeMap$NavigableSubMap$DescendingSubMapEntryIterator"));
        Object term207722 = newInstance(Class.forName("com.google.gson.JsonArray"));
        Object term207723 = newInstance(Class.forName("java.lang.StringBuffer"));
        byte[] term207724 = (byte[]) newByteArray(16);
        Object term207725 = newInstance(Class.forName("com.google.gson.internal.bind.JsonTreeReader"));
        Object term207726 = newInstance(Class.forName("com.google.gson.internal.bind.JsonTreeReader"));
        char[] term207727 = (char[]) newCharArray(490);
        Object term207728 = newInstance(Class.forName("com.google.gson.JsonArray"));
        setField(term207718, term207718.getClass(), "this$0", null);
        setField(term207718, term207718.getClass(), "nextNode", null);
        setField(term207718, term207718.getClass(), "nextItem", null);
        setField(term207718, term207718.getClass(), "lastRet", null);
        setElement(term207717, 0, term207718);
        setField(term207719, term207719.getClass(), "members", null);
        setElement(term207717, 1, term207719);
        setField(term207720, term207720.getClass(), "stack", null);
        setIntField(term207720, term207720.getClass(), "stackSize", 0);
        setField(term207720, term207720.getClass(), "pathNames", null);
        setField(term207720, term207720.getClass(), "pathIndices", null);
        setField(term207720, term207720.getClass(), "in", null);
        setBooleanField(term207720, term207720.getClass(), "lenient", false);
        setField(term207720, term207720.getClass(), "buffer", null);
        setIntField(term207720, term207720.getClass(), "pos", 0);
        setIntField(term207720, term207720.getClass(), "limit", 0);
        setIntField(term207720, term207720.getClass(), "lineNumber", 0);
        setIntField(term207720, term207720.getClass(), "lineStart", 0);
        setIntField(term207720, term207720.getClass(), "peeked", 0);
        setLongField(term207720, term207720.getClass(), "peekedLong", 0L);
        setIntField(term207720, term207720.getClass(), "peekedNumberLength", 0);
        setField(term207720, term207720.getClass(), "peekedString", null);
        setField(term207720, term207720.getClass(), "stack", null);
        setElement(term207717, 2, term207720);
        setField(term207721, term207721.getClass(), "this$0", null);
        setField(term207721, term207721.getClass(), "lastReturned", null);
        setField(term207721, term207721.getClass(), "next", null);
        setField(term207721, term207721.getClass(), "fenceKey", null);
        setIntField(term207721, term207721.getClass(), "expectedModCount", 0);
        setElement(term207717, 3, term207721);
        setField(term207722, term207722.getClass(), "elements", null);
        setElement(term207717, 5, term207722);
        setField(term207723, term207723.getClass(), "toStringCache", null);
        setField(term207723, term207723.getClass(), "value", term207724);
        setByteField(term207723, term207723.getClass(), "coder", (byte) 0);
        setIntField(term207723, term207723.getClass(), "count", 0);
        setElement(term207717, 6, term207723);
        setField(term207725, term207725.getClass(), "stack", null);
        setIntField(term207725, term207725.getClass(), "stackSize", 0);
        setField(term207725, term207725.getClass(), "pathNames", null);
        setField(term207725, term207725.getClass(), "pathIndices", null);
        setField(term207725, term207725.getClass(), "in", null);
        setBooleanField(term207725, term207725.getClass(), "lenient", false);
        setField(term207725, term207725.getClass(), "buffer", null);
        setIntField(term207725, term207725.getClass(), "pos", 0);
        setIntField(term207725, term207725.getClass(), "limit", 0);
        setIntField(term207725, term207725.getClass(), "lineNumber", 0);
        setIntField(term207725, term207725.getClass(), "lineStart", 0);
        setIntField(term207725, term207725.getClass(), "peeked", 0);
        setLongField(term207725, term207725.getClass(), "peekedLong", 0L);
        setIntField(term207725, term207725.getClass(), "peekedNumberLength", 0);
        setField(term207725, term207725.getClass(), "peekedString", null);
        setField(term207725, term207725.getClass(), "stack", null);
        setElement(term207717, 9, term207725);
        setField(term207726, term207726.getClass(), "stack", null);
        setIntField(term207726, term207726.getClass(), "stackSize", 0);
        setField(term207726, term207726.getClass(), "pathNames", null);
        setField(term207726, term207726.getClass(), "pathIndices", null);
        setField(term207726, term207726.getClass(), "in", null);
        setBooleanField(term207726, term207726.getClass(), "lenient", false);
        setField(term207726, term207726.getClass(), "buffer", null);
        setIntField(term207726, term207726.getClass(), "pos", 0);
        setIntField(term207726, term207726.getClass(), "limit", 0);
        setIntField(term207726, term207726.getClass(), "lineNumber", 0);
        setIntField(term207726, term207726.getClass(), "lineStart", 0);
        setIntField(term207726, term207726.getClass(), "peeked", 0);
        setLongField(term207726, term207726.getClass(), "peekedLong", 0L);
        setIntField(term207726, term207726.getClass(), "peekedNumberLength", 0);
        setField(term207726, term207726.getClass(), "peekedString", null);
        setField(term207726, term207726.getClass(), "stack", null);
        setElement(term207717, 10, term207726);
        setElement(term207717, 13, term207727);
        setField(term207728, term207728.getClass(), "elements", null);
        setElement(term207717, 25, term207728);
        setField(term207716, term207716.getClass(), "stack", term207717);
        setIntField(term207716, term207716.getClass(), "stackSize", 0);
        setField(term207716, term207716.getClass(), "pathNames", null);
        setField(term207716, term207716.getClass(), "pathIndices", null);
        setField(term207716, term207716.getClass(), "in", null);
        setBooleanField(term207716, term207716.getClass(), "lenient", false);
        setField(term207716, term207716.getClass(), "buffer", null);
        setIntField(term207716, term207716.getClass(), "pos", 0);
        setIntField(term207716, term207716.getClass(), "limit", 0);
        setIntField(term207716, term207716.getClass(), "lineNumber", 0);
        setIntField(term207716, term207716.getClass(), "lineStart", 0);
        setIntField(term207716, term207716.getClass(), "peeked", 0);
        setLongField(term207716, term207716.getClass(), "peekedLong", 0L);
        setIntField(term207716, term207716.getClass(), "peekedNumberLength", 0);
        setField(term207716, term207716.getClass(), "peekedString", null);
        setField(term207716, term207716.getClass(), "stack", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.gson.internal.bind.JsonTreeReader");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "getPath", argTypes, term205731, args);
        assertTrue(recursiveEquals(term205731, term207716));
        assertTrue(recursiveEquals(retValue, "$"));
    }

};


