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

public class JsonTreeReader_getPath_1170023302360 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term144336;
     Object term144541;

    public JsonTreeReader_getPath_1170023302360() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term144336 = newInstance(Class.forName("com.google.gson.internal.bind.JsonTreeReader"));
        Object[] term144050 = (Object[]) newArray("java.lang.Object", 236);
        Object term144394 = newInstance(Class.forName("com.google.gson.JsonObject"));
        Object term144452 = newInstance(Class.forName("com.google.gson.JsonObject"));
        Object term144508 = newInstance(Class.forName("com.google.gson.JsonArray"));
        setIntField(term144336, term144336.getClass(), "stackSize", 7);
        setElement(term144050, 0, term144394);
        setElement(term144050, 2, term144452);
        setElement(term144050, 5, term144508);
        setField(term144336, term144336.getClass(), "stack", term144050);
        term144541 = newInstance(Class.forName("com.google.gson.internal.bind.JsonTreeReader"));
        Object[] term144542 = (Object[]) newArray("java.lang.Object", 236);
        Object term144543 = newInstance(Class.forName("com.google.gson.JsonObject"));
        Object term144544 = newInstance(Class.forName("com.google.gson.JsonObject"));
        Object term144545 = newInstance(Class.forName("com.google.gson.JsonArray"));
        setField(term144543, term144543.getClass(), "members", null);
        setElement(term144542, 0, term144543);
        setField(term144544, term144544.getClass(), "members", null);
        setElement(term144542, 2, term144544);
        setField(term144545, term144545.getClass(), "elements", null);
        setElement(term144542, 5, term144545);
        setField(term144541, term144541.getClass(), "stack", term144542);
        setIntField(term144541, term144541.getClass(), "stackSize", 0);
        setField(term144541, term144541.getClass(), "pathNames", null);
        setField(term144541, term144541.getClass(), "pathIndices", null);
        setField(term144541, term144541.getClass(), "in", null);
        setBooleanField(term144541, term144541.getClass(), "lenient", false);
        setField(term144541, term144541.getClass(), "buffer", null);
        setIntField(term144541, term144541.getClass(), "pos", 0);
        setIntField(term144541, term144541.getClass(), "limit", 0);
        setIntField(term144541, term144541.getClass(), "lineNumber", 0);
        setIntField(term144541, term144541.getClass(), "lineStart", 0);
        setIntField(term144541, term144541.getClass(), "peeked", 0);
        setLongField(term144541, term144541.getClass(), "peekedLong", 0L);
        setIntField(term144541, term144541.getClass(), "peekedNumberLength", 0);
        setField(term144541, term144541.getClass(), "peekedString", null);
        setField(term144541, term144541.getClass(), "stack", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.gson.internal.bind.JsonTreeReader");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "getPath", argTypes, term144336, args);
        assertTrue(recursiveEquals(term144336, term144541));
        assertTrue(recursiveEquals(retValue, "$"));
    }

};


