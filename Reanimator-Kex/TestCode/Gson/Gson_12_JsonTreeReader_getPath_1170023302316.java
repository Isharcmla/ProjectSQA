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

public class JsonTreeReader_getPath_1170023302316 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term116924;
     Object term117368;

    public JsonTreeReader_getPath_1170023302316() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term116924 = newInstance(Class.forName("com.google.gson.internal.bind.JsonTreeReader"));
        Object[] term116608 = (Object[]) newArray("java.lang.Object", 495);
        Object term116982 = newInstance(Class.forName("com.google.gson.JsonObject"));
        Object term117040 = newInstance(Class.forName("com.google.gson.JsonObject"));
        Object term117134 = newInstance(Class.forName("com.google.gson.internal.bind.JsonTreeReader"));
        Object term117228 = newInstance(Class.forName("com.google.gson.internal.bind.JsonTreeReader"));
        Object term117266 = newInstance(Class.forName("java.lang.Object"));
        setIntField(term116924, term116924.getClass(), "stackSize", 23);
        setElement(term116608, 0, term116982);
        setElement(term116608, 3, term117040);
        setElement(term116608, 4, term117134);
        setElement(term116608, 5, term117228);
        setElement(term116608, 7, term117040);
        setElement(term116608, 8, term117266);
        setField(term116924, term116924.getClass(), "stack", term116608);
        term117368 = newInstance(Class.forName("com.google.gson.internal.bind.JsonTreeReader"));
        Object[] term117369 = (Object[]) newArray("java.lang.Object", 495);
        Object term117370 = newInstance(Class.forName("com.google.gson.JsonObject"));
        Object term117371 = newInstance(Class.forName("com.google.gson.JsonObject"));
        Object term117372 = newInstance(Class.forName("com.google.gson.internal.bind.JsonTreeReader"));
        Object term117373 = newInstance(Class.forName("com.google.gson.internal.bind.JsonTreeReader"));
        Object term117374 = newInstance(Class.forName("java.lang.Object"));
        setField(term117370, term117370.getClass(), "members", null);
        setElement(term117369, 0, term117370);
        setField(term117371, term117371.getClass(), "members", null);
        setElement(term117369, 3, term117371);
        setField(term117372, term117372.getClass(), "stack", null);
        setIntField(term117372, term117372.getClass(), "stackSize", 0);
        setField(term117372, term117372.getClass(), "pathNames", null);
        setField(term117372, term117372.getClass(), "pathIndices", null);
        setField(term117372, term117372.getClass(), "in", null);
        setBooleanField(term117372, term117372.getClass(), "lenient", false);
        setField(term117372, term117372.getClass(), "buffer", null);
        setIntField(term117372, term117372.getClass(), "pos", 0);
        setIntField(term117372, term117372.getClass(), "limit", 0);
        setIntField(term117372, term117372.getClass(), "lineNumber", 0);
        setIntField(term117372, term117372.getClass(), "lineStart", 0);
        setIntField(term117372, term117372.getClass(), "peeked", 0);
        setLongField(term117372, term117372.getClass(), "peekedLong", 0L);
        setIntField(term117372, term117372.getClass(), "peekedNumberLength", 0);
        setField(term117372, term117372.getClass(), "peekedString", null);
        setField(term117372, term117372.getClass(), "stack", null);
        setElement(term117369, 4, term117372);
        setField(term117373, term117373.getClass(), "stack", null);
        setIntField(term117373, term117373.getClass(), "stackSize", 0);
        setField(term117373, term117373.getClass(), "pathNames", null);
        setField(term117373, term117373.getClass(), "pathIndices", null);
        setField(term117373, term117373.getClass(), "in", null);
        setBooleanField(term117373, term117373.getClass(), "lenient", false);
        setField(term117373, term117373.getClass(), "buffer", null);
        setIntField(term117373, term117373.getClass(), "pos", 0);
        setIntField(term117373, term117373.getClass(), "limit", 0);
        setIntField(term117373, term117373.getClass(), "lineNumber", 0);
        setIntField(term117373, term117373.getClass(), "lineStart", 0);
        setIntField(term117373, term117373.getClass(), "peeked", 0);
        setLongField(term117373, term117373.getClass(), "peekedLong", 0L);
        setIntField(term117373, term117373.getClass(), "peekedNumberLength", 0);
        setField(term117373, term117373.getClass(), "peekedString", null);
        setField(term117373, term117373.getClass(), "stack", null);
        setElement(term117369, 5, term117373);
        setElement(term117369, 7, term117371);
        setElement(term117369, 8, term117374);
        setField(term117368, term117368.getClass(), "stack", term117369);
        setIntField(term117368, term117368.getClass(), "stackSize", 0);
        setField(term117368, term117368.getClass(), "pathNames", null);
        setField(term117368, term117368.getClass(), "pathIndices", null);
        setField(term117368, term117368.getClass(), "in", null);
        setBooleanField(term117368, term117368.getClass(), "lenient", false);
        setField(term117368, term117368.getClass(), "buffer", null);
        setIntField(term117368, term117368.getClass(), "pos", 0);
        setIntField(term117368, term117368.getClass(), "limit", 0);
        setIntField(term117368, term117368.getClass(), "lineNumber", 0);
        setIntField(term117368, term117368.getClass(), "lineStart", 0);
        setIntField(term117368, term117368.getClass(), "peeked", 0);
        setLongField(term117368, term117368.getClass(), "peekedLong", 0L);
        setIntField(term117368, term117368.getClass(), "peekedNumberLength", 0);
        setField(term117368, term117368.getClass(), "peekedString", null);
        setField(term117368, term117368.getClass(), "stack", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.gson.internal.bind.JsonTreeReader");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "getPath", argTypes, term116924, args);
        assertTrue(recursiveEquals(term116924, term117368));
        assertTrue(recursiveEquals(retValue, "$"));
    }

};


