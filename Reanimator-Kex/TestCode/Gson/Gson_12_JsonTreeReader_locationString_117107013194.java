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

public class JsonTreeReader_locationString_117107013194 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term48382;
     Object term48541;

    public JsonTreeReader_locationString_117107013194() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term48382 = newInstance(Class.forName("com.google.gson.internal.bind.JsonTreeReader"));
        Object[] term48247 = (Object[]) newArray("java.lang.Object", 498);
        Object term48438 = newInstance(Class.forName("com.google.gson.JsonArray"));
        Object term48476 = newInstance(Class.forName("java.lang.Object"));
        setIntField(term48382, term48382.getClass(), "stackSize", 1);
        setElement(term48247, 0, term48438);
        setElement(term48247, 16, term48476);
        setField(term48382, term48382.getClass(), "stack", term48247);
        term48541 = newInstance(Class.forName("com.google.gson.internal.bind.JsonTreeReader"));
        Object[] term48542 = (Object[]) newArray("java.lang.Object", 498);
        Object term48543 = newInstance(Class.forName("com.google.gson.JsonArray"));
        Object term48544 = newInstance(Class.forName("java.lang.Object"));
        setField(term48543, term48543.getClass(), "elements", null);
        setElement(term48542, 0, term48543);
        setElement(term48542, 16, term48544);
        setField(term48541, term48541.getClass(), "stack", term48542);
        setIntField(term48541, term48541.getClass(), "stackSize", 0);
        setField(term48541, term48541.getClass(), "pathNames", null);
        setField(term48541, term48541.getClass(), "pathIndices", null);
        setField(term48541, term48541.getClass(), "in", null);
        setBooleanField(term48541, term48541.getClass(), "lenient", false);
        setField(term48541, term48541.getClass(), "buffer", null);
        setIntField(term48541, term48541.getClass(), "pos", 0);
        setIntField(term48541, term48541.getClass(), "limit", 0);
        setIntField(term48541, term48541.getClass(), "lineNumber", 0);
        setIntField(term48541, term48541.getClass(), "lineStart", 0);
        setIntField(term48541, term48541.getClass(), "peeked", 0);
        setLongField(term48541, term48541.getClass(), "peekedLong", 0L);
        setIntField(term48541, term48541.getClass(), "peekedNumberLength", 0);
        setField(term48541, term48541.getClass(), "peekedString", null);
        setField(term48541, term48541.getClass(), "stack", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.gson.internal.bind.JsonTreeReader");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "locationString", argTypes, term48382, args);
        assertTrue(recursiveEquals(term48382, term48541));
        assertTrue(recursiveEquals(retValue, " at path $"));
    }

};


