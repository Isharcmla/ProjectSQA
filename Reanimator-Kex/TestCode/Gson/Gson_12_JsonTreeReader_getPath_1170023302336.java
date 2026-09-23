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

public class JsonTreeReader_getPath_1170023302336 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term127989;
     Object term128432;

    public JsonTreeReader_getPath_1170023302336() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term127989 = newInstance(Class.forName("com.google.gson.internal.bind.JsonTreeReader"));
        Object[] term127697 = (Object[]) newArray("java.lang.Object", 45);
        Object term128047 = newInstance(Class.forName("com.google.gson.JsonObject"));
        Object term128141 = newInstance(Class.forName("com.google.gson.internal.bind.JsonTreeReader"));
        Object term128235 = newInstance(Class.forName("com.google.gson.internal.bind.JsonTreeReader"));
        Object term128291 = newInstance(Class.forName("com.google.gson.JsonArray"));
        setIntField(term127989, term127989.getClass(), "stackSize", 36);
        setElement(term127697, 1, term128047);
        setElement(term127697, 3, term128141);
        setElement(term127697, 4, term128235);
        setElement(term127697, 5, term128291);
        setField(term127989, term127989.getClass(), "stack", term127697);
        term128432 = newInstance(Class.forName("com.google.gson.internal.bind.JsonTreeReader"));
        Object[] term128433 = (Object[]) newArray("java.lang.Object", 45);
        Object term128434 = newInstance(Class.forName("com.google.gson.JsonObject"));
        Object term128435 = newInstance(Class.forName("com.google.gson.internal.bind.JsonTreeReader"));
        Object term128436 = newInstance(Class.forName("com.google.gson.internal.bind.JsonTreeReader"));
        Object term128437 = newInstance(Class.forName("com.google.gson.JsonArray"));
        setField(term128434, term128434.getClass(), "members", null);
        setElement(term128433, 1, term128434);
        setField(term128435, term128435.getClass(), "stack", null);
        setIntField(term128435, term128435.getClass(), "stackSize", 0);
        setField(term128435, term128435.getClass(), "pathNames", null);
        setField(term128435, term128435.getClass(), "pathIndices", null);
        setField(term128435, term128435.getClass(), "in", null);
        setBooleanField(term128435, term128435.getClass(), "lenient", false);
        setField(term128435, term128435.getClass(), "buffer", null);
        setIntField(term128435, term128435.getClass(), "pos", 0);
        setIntField(term128435, term128435.getClass(), "limit", 0);
        setIntField(term128435, term128435.getClass(), "lineNumber", 0);
        setIntField(term128435, term128435.getClass(), "lineStart", 0);
        setIntField(term128435, term128435.getClass(), "peeked", 0);
        setLongField(term128435, term128435.getClass(), "peekedLong", 0L);
        setIntField(term128435, term128435.getClass(), "peekedNumberLength", 0);
        setField(term128435, term128435.getClass(), "peekedString", null);
        setField(term128435, term128435.getClass(), "stack", null);
        setElement(term128433, 3, term128435);
        setField(term128436, term128436.getClass(), "stack", null);
        setIntField(term128436, term128436.getClass(), "stackSize", 0);
        setField(term128436, term128436.getClass(), "pathNames", null);
        setField(term128436, term128436.getClass(), "pathIndices", null);
        setField(term128436, term128436.getClass(), "in", null);
        setBooleanField(term128436, term128436.getClass(), "lenient", false);
        setField(term128436, term128436.getClass(), "buffer", null);
        setIntField(term128436, term128436.getClass(), "pos", 0);
        setIntField(term128436, term128436.getClass(), "limit", 0);
        setIntField(term128436, term128436.getClass(), "lineNumber", 0);
        setIntField(term128436, term128436.getClass(), "lineStart", 0);
        setIntField(term128436, term128436.getClass(), "peeked", 0);
        setLongField(term128436, term128436.getClass(), "peekedLong", 0L);
        setIntField(term128436, term128436.getClass(), "peekedNumberLength", 0);
        setField(term128436, term128436.getClass(), "peekedString", null);
        setField(term128436, term128436.getClass(), "stack", null);
        setElement(term128433, 4, term128436);
        setField(term128437, term128437.getClass(), "elements", null);
        setElement(term128433, 5, term128437);
        setField(term128432, term128432.getClass(), "stack", term128433);
        setIntField(term128432, term128432.getClass(), "stackSize", 0);
        setField(term128432, term128432.getClass(), "pathNames", null);
        setField(term128432, term128432.getClass(), "pathIndices", null);
        setField(term128432, term128432.getClass(), "in", null);
        setBooleanField(term128432, term128432.getClass(), "lenient", false);
        setField(term128432, term128432.getClass(), "buffer", null);
        setIntField(term128432, term128432.getClass(), "pos", 0);
        setIntField(term128432, term128432.getClass(), "limit", 0);
        setIntField(term128432, term128432.getClass(), "lineNumber", 0);
        setIntField(term128432, term128432.getClass(), "lineStart", 0);
        setIntField(term128432, term128432.getClass(), "peeked", 0);
        setLongField(term128432, term128432.getClass(), "peekedLong", 0L);
        setIntField(term128432, term128432.getClass(), "peekedNumberLength", 0);
        setField(term128432, term128432.getClass(), "peekedString", null);
        setField(term128432, term128432.getClass(), "stack", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.gson.internal.bind.JsonTreeReader");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "getPath", argTypes, term127989, args);
        assertTrue(recursiveEquals(term127989, term128432));
        assertTrue(recursiveEquals(retValue, "$"));
    }

};


