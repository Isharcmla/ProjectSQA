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

public class JsonTreeReader_getPath_1170023302370 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term152327;
     Object term152514;

    public JsonTreeReader_getPath_1170023302370() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term152327 = newInstance(Class.forName("com.google.gson.internal.bind.JsonTreeReader"));
        Object[] term152061 = (Object[]) newArray("java.lang.Object", 503);
        Object term152383 = newInstance(Class.forName("com.google.gson.JsonArray"));
        Object term152441 = newInstance(Class.forName("com.google.gson.JsonObject"));
        Object term152479 = newInstance(Class.forName("java.lang.Object"));
        setIntField(term152327, term152327.getClass(), "stackSize", 7);
        setElement(term152061, 0, term152383);
        setElement(term152061, 2, term152441);
        setElement(term152061, 32, term152479);
        setField(term152327, term152327.getClass(), "stack", term152061);
        term152514 = newInstance(Class.forName("com.google.gson.internal.bind.JsonTreeReader"));
        Object[] term152515 = (Object[]) newArray("java.lang.Object", 503);
        Object term152516 = newInstance(Class.forName("com.google.gson.JsonArray"));
        Object term152517 = newInstance(Class.forName("com.google.gson.JsonObject"));
        Object term152518 = newInstance(Class.forName("java.lang.Object"));
        setField(term152516, term152516.getClass(), "elements", null);
        setElement(term152515, 0, term152516);
        setField(term152517, term152517.getClass(), "members", null);
        setElement(term152515, 2, term152517);
        setElement(term152515, 32, term152518);
        setField(term152514, term152514.getClass(), "stack", term152515);
        setIntField(term152514, term152514.getClass(), "stackSize", 0);
        setField(term152514, term152514.getClass(), "pathNames", null);
        setField(term152514, term152514.getClass(), "pathIndices", null);
        setField(term152514, term152514.getClass(), "in", null);
        setBooleanField(term152514, term152514.getClass(), "lenient", false);
        setField(term152514, term152514.getClass(), "buffer", null);
        setIntField(term152514, term152514.getClass(), "pos", 0);
        setIntField(term152514, term152514.getClass(), "limit", 0);
        setIntField(term152514, term152514.getClass(), "lineNumber", 0);
        setIntField(term152514, term152514.getClass(), "lineStart", 0);
        setIntField(term152514, term152514.getClass(), "peeked", 0);
        setLongField(term152514, term152514.getClass(), "peekedLong", 0L);
        setIntField(term152514, term152514.getClass(), "peekedNumberLength", 0);
        setField(term152514, term152514.getClass(), "peekedString", null);
        setField(term152514, term152514.getClass(), "stack", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.gson.internal.bind.JsonTreeReader");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "getPath", argTypes, term152327, args);
        assertTrue(recursiveEquals(term152327, term152514));
        assertTrue(recursiveEquals(retValue, "$"));
    }

};


