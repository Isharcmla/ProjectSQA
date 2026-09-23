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

public class JsonTreeReader_locationString_117107013394 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term164332;
     Object term164669;

    public JsonTreeReader_locationString_117107013394() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term164332 = newInstance(Class.forName("com.google.gson.internal.bind.JsonTreeReader"));
        Object[] term164027 = (Object[]) newArray("java.lang.Object", 23);
        Object term164390 = newInstance(Class.forName("com.google.gson.JsonObject"));
        Object term164446 = newInstance(Class.forName("com.google.gson.JsonArray"));
        Object term164556 = newInstance(Class.forName("org.vorpal.research.kex.intrinsics.UnknownIntrinsics"));
        Object term164612 = newInstance(Class.forName("com.google.gson.JsonArray"));
        setIntField(term164332, term164332.getClass(), "stackSize", 11);
        setElement(term164027, 0, term164390);
        setElement(term164027, 2, term164446);
        setElement(term164027, 5, term164556);
        setElement(term164027, 6, term164612);
        setField(term164332, term164332.getClass(), "stack", term164027);
        term164669 = newInstance(Class.forName("com.google.gson.internal.bind.JsonTreeReader"));
        Object[] term164670 = (Object[]) newArray("java.lang.Object", 23);
        Object term164671 = newInstance(Class.forName("com.google.gson.JsonObject"));
        Object term164672 = newInstance(Class.forName("com.google.gson.JsonArray"));
        Object term164673 = newInstance(Class.forName("org.vorpal.research.kex.intrinsics.UnknownIntrinsics"));
        Object term164674 = newInstance(Class.forName("com.google.gson.JsonArray"));
        setField(term164671, term164671.getClass(), "members", null);
        setElement(term164670, 0, term164671);
        setField(term164672, term164672.getClass(), "elements", null);
        setElement(term164670, 2, term164672);
        setElement(term164670, 5, term164673);
        setField(term164674, term164674.getClass(), "elements", null);
        setElement(term164670, 6, term164674);
        setField(term164669, term164669.getClass(), "stack", term164670);
        setIntField(term164669, term164669.getClass(), "stackSize", 0);
        setField(term164669, term164669.getClass(), "pathNames", null);
        setField(term164669, term164669.getClass(), "pathIndices", null);
        setField(term164669, term164669.getClass(), "in", null);
        setBooleanField(term164669, term164669.getClass(), "lenient", false);
        setField(term164669, term164669.getClass(), "buffer", null);
        setIntField(term164669, term164669.getClass(), "pos", 0);
        setIntField(term164669, term164669.getClass(), "limit", 0);
        setIntField(term164669, term164669.getClass(), "lineNumber", 0);
        setIntField(term164669, term164669.getClass(), "lineStart", 0);
        setIntField(term164669, term164669.getClass(), "peeked", 0);
        setLongField(term164669, term164669.getClass(), "peekedLong", 0L);
        setIntField(term164669, term164669.getClass(), "peekedNumberLength", 0);
        setField(term164669, term164669.getClass(), "peekedString", null);
        setField(term164669, term164669.getClass(), "stack", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.gson.internal.bind.JsonTreeReader");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "locationString", argTypes, term164332, args);
        assertTrue(recursiveEquals(term164332, term164669));
        assertTrue(recursiveEquals(retValue, " at path $"));
    }

};


