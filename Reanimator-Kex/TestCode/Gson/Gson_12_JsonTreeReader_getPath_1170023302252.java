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

public class JsonTreeReader_getPath_1170023302252 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term76459;
     Object term76648;

    public JsonTreeReader_getPath_1170023302252() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term76459 = newInstance(Class.forName("com.google.gson.internal.bind.JsonTreeReader"));
        Object[] term76191 = (Object[]) newArray("java.lang.Object", 491);
        Object term76515 = newInstance(Class.forName("com.google.gson.JsonArray"));
        Object term76553 = newInstance(Class.forName("java.lang.Object"));
        setIntField(term76459, term76459.getClass(), "stackSize", 7);
        setElement(term76191, 0, term76515);
        setElement(term76191, 128, term76553);
        setField(term76459, term76459.getClass(), "stack", term76191);
        term76648 = newInstance(Class.forName("com.google.gson.internal.bind.JsonTreeReader"));
        Object[] term76649 = (Object[]) newArray("java.lang.Object", 491);
        Object term76650 = newInstance(Class.forName("com.google.gson.JsonArray"));
        Object term76651 = newInstance(Class.forName("java.lang.Object"));
        setField(term76650, term76650.getClass(), "elements", null);
        setElement(term76649, 0, term76650);
        setElement(term76649, 128, term76651);
        setField(term76648, term76648.getClass(), "stack", term76649);
        setIntField(term76648, term76648.getClass(), "stackSize", 0);
        setField(term76648, term76648.getClass(), "pathNames", null);
        setField(term76648, term76648.getClass(), "pathIndices", null);
        setField(term76648, term76648.getClass(), "in", null);
        setBooleanField(term76648, term76648.getClass(), "lenient", false);
        setField(term76648, term76648.getClass(), "buffer", null);
        setIntField(term76648, term76648.getClass(), "pos", 0);
        setIntField(term76648, term76648.getClass(), "limit", 0);
        setIntField(term76648, term76648.getClass(), "lineNumber", 0);
        setIntField(term76648, term76648.getClass(), "lineStart", 0);
        setIntField(term76648, term76648.getClass(), "peeked", 0);
        setLongField(term76648, term76648.getClass(), "peekedLong", 0L);
        setIntField(term76648, term76648.getClass(), "peekedNumberLength", 0);
        setField(term76648, term76648.getClass(), "peekedString", null);
        setField(term76648, term76648.getClass(), "stack", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.gson.internal.bind.JsonTreeReader");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "getPath", argTypes, term76459, args);
        assertTrue(recursiveEquals(term76459, term76648));
        assertTrue(recursiveEquals(retValue, "$"));
    }

};


