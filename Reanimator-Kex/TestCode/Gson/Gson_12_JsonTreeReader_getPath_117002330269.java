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

public class JsonTreeReader_getPath_117002330269 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term7974;
     Object term13951;

    public JsonTreeReader_getPath_117002330269() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term7974 = newInstance(Class.forName("com.google.gson.internal.bind.JsonTreeReader"));
        setField(term7974, term7974.getClass(), "stack", null);
        setIntField(term7974, term7974.getClass(), "stackSize", 0);
        setField(term7974, term7974.getClass(), "pathNames", null);
        setField(term7974, term7974.getClass(), "pathIndices", null);
        setField(term7974, term7974.getClass(), "in", null);
        setBooleanField(term7974, term7974.getClass(), "lenient", false);
        setField(term7974, term7974.getClass(), "buffer", null);
        setIntField(term7974, term7974.getClass(), "pos", 0);
        setIntField(term7974, term7974.getClass(), "limit", 0);
        setIntField(term7974, term7974.getClass(), "lineNumber", 0);
        setIntField(term7974, term7974.getClass(), "lineStart", 0);
        setIntField(term7974, term7974.getClass(), "peeked", 0);
        setLongField(term7974, term7974.getClass(), "peekedLong", 0L);
        setIntField(term7974, term7974.getClass(), "peekedNumberLength", 0);
        setField(term7974, term7974.getClass(), "peekedString", null);
        setField(term7974, term7974.getClass(), "stack", null);
        term13951 = newInstance(Class.forName("com.google.gson.internal.bind.JsonTreeReader"));
        setField(term13951, term13951.getClass(), "stack", null);
        setIntField(term13951, term13951.getClass(), "stackSize", 0);
        setField(term13951, term13951.getClass(), "pathNames", null);
        setField(term13951, term13951.getClass(), "pathIndices", null);
        setField(term13951, term13951.getClass(), "in", null);
        setBooleanField(term13951, term13951.getClass(), "lenient", false);
        setField(term13951, term13951.getClass(), "buffer", null);
        setIntField(term13951, term13951.getClass(), "pos", 0);
        setIntField(term13951, term13951.getClass(), "limit", 0);
        setIntField(term13951, term13951.getClass(), "lineNumber", 0);
        setIntField(term13951, term13951.getClass(), "lineStart", 0);
        setIntField(term13951, term13951.getClass(), "peeked", 0);
        setLongField(term13951, term13951.getClass(), "peekedLong", 0L);
        setIntField(term13951, term13951.getClass(), "peekedNumberLength", 0);
        setField(term13951, term13951.getClass(), "peekedString", null);
        setField(term13951, term13951.getClass(), "stack", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.gson.internal.bind.JsonTreeReader");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "getPath", argTypes, term7974, args);
        assertTrue(recursiveEquals(term7974, term13951));
        assertTrue(recursiveEquals(retValue, "$"));
    }

};


