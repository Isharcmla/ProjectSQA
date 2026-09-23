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

public class JsonTreeReader_getPath_1170023302366 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term147518;
     Object term151616;

    public JsonTreeReader_getPath_1170023302366() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term147518 = newInstance(Class.forName("com.google.gson.internal.bind.JsonTreeReader"));
        Object[] term147204 = (Object[]) newArray("java.lang.Object", 495);
        Object term147576 = newInstance(Class.forName("com.google.gson.JsonObject"));
        Object term147670 = newInstance(Class.forName("com.google.gson.internal.bind.JsonTreeReader"));
        Object term147728 = newInstance(Class.forName("com.google.gson.JsonObject"));
        Object term147766 = newInstance(Class.forName("java.lang.Object"));
        setIntField(term147518, term147518.getClass(), "stackSize", 15);
        setElement(term147204, 0, term147576);
        setElement(term147204, 2, term147670);
        setElement(term147204, 3, term147728);
        setElement(term147204, 32, term147766);
        setField(term147518, term147518.getClass(), "stack", term147204);
        term151616 = newInstance(Class.forName("com.google.gson.internal.bind.JsonTreeReader"));
        Object[] term151617 = (Object[]) newArray("java.lang.Object", 495);
        Object term151618 = newInstance(Class.forName("com.google.gson.JsonObject"));
        Object term151619 = newInstance(Class.forName("com.google.gson.internal.bind.JsonTreeReader"));
        Object term151620 = newInstance(Class.forName("com.google.gson.JsonObject"));
        Object term151621 = newInstance(Class.forName("java.lang.Object"));
        setField(term151618, term151618.getClass(), "members", null);
        setElement(term151617, 0, term151618);
        setField(term151619, term151619.getClass(), "stack", null);
        setIntField(term151619, term151619.getClass(), "stackSize", 0);
        setField(term151619, term151619.getClass(), "pathNames", null);
        setField(term151619, term151619.getClass(), "pathIndices", null);
        setField(term151619, term151619.getClass(), "in", null);
        setBooleanField(term151619, term151619.getClass(), "lenient", false);
        setField(term151619, term151619.getClass(), "buffer", null);
        setIntField(term151619, term151619.getClass(), "pos", 0);
        setIntField(term151619, term151619.getClass(), "limit", 0);
        setIntField(term151619, term151619.getClass(), "lineNumber", 0);
        setIntField(term151619, term151619.getClass(), "lineStart", 0);
        setIntField(term151619, term151619.getClass(), "peeked", 0);
        setLongField(term151619, term151619.getClass(), "peekedLong", 0L);
        setIntField(term151619, term151619.getClass(), "peekedNumberLength", 0);
        setField(term151619, term151619.getClass(), "peekedString", null);
        setField(term151619, term151619.getClass(), "stack", null);
        setElement(term151617, 2, term151619);
        setField(term151620, term151620.getClass(), "members", null);
        setElement(term151617, 3, term151620);
        setElement(term151617, 32, term151621);
        setField(term151616, term151616.getClass(), "stack", term151617);
        setIntField(term151616, term151616.getClass(), "stackSize", 0);
        setField(term151616, term151616.getClass(), "pathNames", null);
        setField(term151616, term151616.getClass(), "pathIndices", null);
        setField(term151616, term151616.getClass(), "in", null);
        setBooleanField(term151616, term151616.getClass(), "lenient", false);
        setField(term151616, term151616.getClass(), "buffer", null);
        setIntField(term151616, term151616.getClass(), "pos", 0);
        setIntField(term151616, term151616.getClass(), "limit", 0);
        setIntField(term151616, term151616.getClass(), "lineNumber", 0);
        setIntField(term151616, term151616.getClass(), "lineStart", 0);
        setIntField(term151616, term151616.getClass(), "peeked", 0);
        setLongField(term151616, term151616.getClass(), "peekedLong", 0L);
        setIntField(term151616, term151616.getClass(), "peekedNumberLength", 0);
        setField(term151616, term151616.getClass(), "peekedString", null);
        setField(term151616, term151616.getClass(), "stack", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.gson.internal.bind.JsonTreeReader");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "getPath", argTypes, term147518, args);
        assertTrue(recursiveEquals(term147518, term151616));
        assertTrue(recursiveEquals(retValue, "$"));
    }

};


