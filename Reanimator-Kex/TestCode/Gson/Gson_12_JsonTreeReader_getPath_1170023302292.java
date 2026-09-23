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

public class JsonTreeReader_getPath_1170023302292 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term103189;
     Object term103786;

    public JsonTreeReader_getPath_1170023302292() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term103189 = newInstance(Class.forName("com.google.gson.internal.bind.JsonTreeReader"));
        Object[] term102869 = (Object[]) newArray("java.lang.Object", 495);
        Object term103247 = newInstance(Class.forName("com.google.gson.JsonObject"));
        char[] term102871 = (char[]) newCharArray(0);
        Object term103305 = newInstance(Class.forName("com.google.gson.JsonObject"));
        Object term103399 = newInstance(Class.forName("com.google.gson.internal.bind.JsonTreeReader"));
        Object term103493 = newInstance(Class.forName("com.google.gson.internal.bind.JsonTreeReader"));
        Object term103591 = newInstance(Class.forName("java.util.concurrent.ConcurrentLinkedDeque$Itr"));
        Object term103661 = newInstance(Class.forName("java.util.AbstractList$SubList$1"));
        Object term103719 = newInstance(Class.forName("com.google.gson.JsonObject"));
        setIntField(term103189, term103189.getClass(), "stackSize", 10);
        setElement(term102869, 0, term103247);
        setElement(term102869, 1, term102871);
        setElement(term102869, 2, term103305);
        setElement(term102869, 3, term103399);
        setElement(term102869, 4, term103493);
        setElement(term102869, 5, term103591);
        setElement(term102869, 6, term103661);
        setElement(term102869, 7, term103719);
        setField(term103189, term103189.getClass(), "stack", term102869);
        term103786 = newInstance(Class.forName("com.google.gson.internal.bind.JsonTreeReader"));
        Object[] term103787 = (Object[]) newArray("java.lang.Object", 495);
        Object term103788 = newInstance(Class.forName("com.google.gson.JsonObject"));
        char[] term103789 = (char[]) newCharArray(0);
        Object term103790 = newInstance(Class.forName("com.google.gson.JsonObject"));
        Object term103791 = newInstance(Class.forName("com.google.gson.internal.bind.JsonTreeReader"));
        Object term103792 = newInstance(Class.forName("com.google.gson.internal.bind.JsonTreeReader"));
        Object term103793 = newInstance(Class.forName("java.util.concurrent.ConcurrentLinkedDeque$Itr"));
        Object term103794 = newInstance(Class.forName("java.util.AbstractList$SubList$1"));
        Object term103795 = newInstance(Class.forName("com.google.gson.JsonObject"));
        setField(term103788, term103788.getClass(), "members", null);
        setElement(term103787, 0, term103788);
        setElement(term103787, 1, term103789);
        setField(term103790, term103790.getClass(), "members", null);
        setElement(term103787, 2, term103790);
        setField(term103791, term103791.getClass(), "stack", null);
        setIntField(term103791, term103791.getClass(), "stackSize", 0);
        setField(term103791, term103791.getClass(), "pathNames", null);
        setField(term103791, term103791.getClass(), "pathIndices", null);
        setField(term103791, term103791.getClass(), "in", null);
        setBooleanField(term103791, term103791.getClass(), "lenient", false);
        setField(term103791, term103791.getClass(), "buffer", null);
        setIntField(term103791, term103791.getClass(), "pos", 0);
        setIntField(term103791, term103791.getClass(), "limit", 0);
        setIntField(term103791, term103791.getClass(), "lineNumber", 0);
        setIntField(term103791, term103791.getClass(), "lineStart", 0);
        setIntField(term103791, term103791.getClass(), "peeked", 0);
        setLongField(term103791, term103791.getClass(), "peekedLong", 0L);
        setIntField(term103791, term103791.getClass(), "peekedNumberLength", 0);
        setField(term103791, term103791.getClass(), "peekedString", null);
        setField(term103791, term103791.getClass(), "stack", null);
        setElement(term103787, 3, term103791);
        setField(term103792, term103792.getClass(), "stack", null);
        setIntField(term103792, term103792.getClass(), "stackSize", 0);
        setField(term103792, term103792.getClass(), "pathNames", null);
        setField(term103792, term103792.getClass(), "pathIndices", null);
        setField(term103792, term103792.getClass(), "in", null);
        setBooleanField(term103792, term103792.getClass(), "lenient", false);
        setField(term103792, term103792.getClass(), "buffer", null);
        setIntField(term103792, term103792.getClass(), "pos", 0);
        setIntField(term103792, term103792.getClass(), "limit", 0);
        setIntField(term103792, term103792.getClass(), "lineNumber", 0);
        setIntField(term103792, term103792.getClass(), "lineStart", 0);
        setIntField(term103792, term103792.getClass(), "peeked", 0);
        setLongField(term103792, term103792.getClass(), "peekedLong", 0L);
        setIntField(term103792, term103792.getClass(), "peekedNumberLength", 0);
        setField(term103792, term103792.getClass(), "peekedString", null);
        setField(term103792, term103792.getClass(), "stack", null);
        setElement(term103787, 4, term103792);
        setField(term103793, term103793.getClass(), "this$0", null);
        setField(term103793, term103793.getClass(), "nextNode", null);
        setField(term103793, term103793.getClass(), "nextItem", null);
        setField(term103793, term103793.getClass(), "lastRet", null);
        setElement(term103787, 5, term103793);
        setField(term103794, term103794.getClass(), "i", null);
        setIntField(term103794, term103794.getClass(), "val$index", 0);
        setField(term103794, term103794.getClass(), "this$0", null);
        setElement(term103787, 6, term103794);
        setField(term103795, term103795.getClass(), "members", null);
        setElement(term103787, 7, term103795);
        setField(term103786, term103786.getClass(), "stack", term103787);
        setIntField(term103786, term103786.getClass(), "stackSize", 0);
        setField(term103786, term103786.getClass(), "pathNames", null);
        setField(term103786, term103786.getClass(), "pathIndices", null);
        setField(term103786, term103786.getClass(), "in", null);
        setBooleanField(term103786, term103786.getClass(), "lenient", false);
        setField(term103786, term103786.getClass(), "buffer", null);
        setIntField(term103786, term103786.getClass(), "pos", 0);
        setIntField(term103786, term103786.getClass(), "limit", 0);
        setIntField(term103786, term103786.getClass(), "lineNumber", 0);
        setIntField(term103786, term103786.getClass(), "lineStart", 0);
        setIntField(term103786, term103786.getClass(), "peeked", 0);
        setLongField(term103786, term103786.getClass(), "peekedLong", 0L);
        setIntField(term103786, term103786.getClass(), "peekedNumberLength", 0);
        setField(term103786, term103786.getClass(), "peekedString", null);
        setField(term103786, term103786.getClass(), "stack", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.gson.internal.bind.JsonTreeReader");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "getPath", argTypes, term103189, args);
        assertTrue(recursiveEquals(term103189, term103786));
        assertTrue(recursiveEquals(retValue, "$"));
    }

};


