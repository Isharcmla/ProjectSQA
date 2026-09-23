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

public class JsonTreeReader_getPath_1170023302346 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term136683;
     Object term137109;

    public JsonTreeReader_getPath_1170023302346() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term136683 = newInstance(Class.forName("com.google.gson.internal.bind.JsonTreeReader"));
        Object[] term136370 = (Object[]) newArray("java.lang.Object", 495);
        Object term136741 = newInstance(Class.forName("com.google.gson.JsonObject"));
        Object term136835 = newInstance(Class.forName("com.google.gson.internal.bind.JsonTreeReader"));
        Object term136891 = newInstance(Class.forName("java.util.AbstractMap$1$1"));
        Object term136949 = newInstance(Class.forName("com.google.gson.JsonObject"));
        Object term137005 = newInstance(Class.forName("com.google.gson.JsonArray"));
        Object term137043 = newInstance(Class.forName("java.lang.Object"));
        setIntField(term136683, term136683.getClass(), "stackSize", 14);
        setElement(term136370, 0, term136741);
        setElement(term136370, 1, term136835);
        setElement(term136370, 2, term136891);
        setElement(term136370, 3, term136949);
        setElement(term136370, 4, term136741);
        setElement(term136370, 7, term137005);
        setElement(term136370, 8, term137043);
        setField(term136683, term136683.getClass(), "stack", term136370);
        term137109 = newInstance(Class.forName("com.google.gson.internal.bind.JsonTreeReader"));
        Object[] term137110 = (Object[]) newArray("java.lang.Object", 495);
        Object term137111 = newInstance(Class.forName("com.google.gson.JsonObject"));
        Object term137112 = newInstance(Class.forName("com.google.gson.internal.bind.JsonTreeReader"));
        Object term137113 = newInstance(Class.forName("java.util.AbstractMap$1$1"));
        Object term137114 = newInstance(Class.forName("com.google.gson.JsonObject"));
        Object term137115 = newInstance(Class.forName("com.google.gson.JsonArray"));
        Object term137116 = newInstance(Class.forName("java.lang.Object"));
        setField(term137111, term137111.getClass(), "members", null);
        setElement(term137110, 0, term137111);
        setField(term137112, term137112.getClass(), "stack", null);
        setIntField(term137112, term137112.getClass(), "stackSize", 0);
        setField(term137112, term137112.getClass(), "pathNames", null);
        setField(term137112, term137112.getClass(), "pathIndices", null);
        setField(term137112, term137112.getClass(), "in", null);
        setBooleanField(term137112, term137112.getClass(), "lenient", false);
        setField(term137112, term137112.getClass(), "buffer", null);
        setIntField(term137112, term137112.getClass(), "pos", 0);
        setIntField(term137112, term137112.getClass(), "limit", 0);
        setIntField(term137112, term137112.getClass(), "lineNumber", 0);
        setIntField(term137112, term137112.getClass(), "lineStart", 0);
        setIntField(term137112, term137112.getClass(), "peeked", 0);
        setLongField(term137112, term137112.getClass(), "peekedLong", 0L);
        setIntField(term137112, term137112.getClass(), "peekedNumberLength", 0);
        setField(term137112, term137112.getClass(), "peekedString", null);
        setField(term137112, term137112.getClass(), "stack", null);
        setElement(term137110, 1, term137112);
        setField(term137113, term137113.getClass(), "i", null);
        setField(term137113, term137113.getClass(), "this$1", null);
        setElement(term137110, 2, term137113);
        setField(term137114, term137114.getClass(), "members", null);
        setElement(term137110, 3, term137114);
        setElement(term137110, 4, term137111);
        setField(term137115, term137115.getClass(), "elements", null);
        setElement(term137110, 7, term137115);
        setElement(term137110, 8, term137116);
        setField(term137109, term137109.getClass(), "stack", term137110);
        setIntField(term137109, term137109.getClass(), "stackSize", 0);
        setField(term137109, term137109.getClass(), "pathNames", null);
        setField(term137109, term137109.getClass(), "pathIndices", null);
        setField(term137109, term137109.getClass(), "in", null);
        setBooleanField(term137109, term137109.getClass(), "lenient", false);
        setField(term137109, term137109.getClass(), "buffer", null);
        setIntField(term137109, term137109.getClass(), "pos", 0);
        setIntField(term137109, term137109.getClass(), "limit", 0);
        setIntField(term137109, term137109.getClass(), "lineNumber", 0);
        setIntField(term137109, term137109.getClass(), "lineStart", 0);
        setIntField(term137109, term137109.getClass(), "peeked", 0);
        setLongField(term137109, term137109.getClass(), "peekedLong", 0L);
        setIntField(term137109, term137109.getClass(), "peekedNumberLength", 0);
        setField(term137109, term137109.getClass(), "peekedString", null);
        setField(term137109, term137109.getClass(), "stack", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.gson.internal.bind.JsonTreeReader");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "getPath", argTypes, term136683, args);
        assertTrue(recursiveEquals(term136683, term137109));
        assertTrue(recursiveEquals(retValue, "$"));
    }

};


