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

public class JsonTreeReader_getPath_1170023302239 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term70587;
     Object term71682;

    public JsonTreeReader_getPath_1170023302239() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term70587 = newInstance(Class.forName("com.google.gson.internal.bind.JsonTreeReader"));
        Object[] term70328 = (Object[]) newArray("java.lang.Object", 499);
        Object term70643 = newInstance(Class.forName("com.google.gson.JsonArray"));
        Object term70701 = newInstance(Class.forName("com.google.gson.JsonObject"));
        Object term70739 = newInstance(Class.forName("java.lang.Object"));
        setIntField(term70587, term70587.getClass(), "stackSize", 3);
        setElement(term70328, 0, term70643);
        setElement(term70328, 2, term70701);
        setElement(term70328, 128, term70739);
        setField(term70587, term70587.getClass(), "stack", term70328);
        term71682 = newInstance(Class.forName("com.google.gson.internal.bind.JsonTreeReader"));
        Object[] term71683 = (Object[]) newArray("java.lang.Object", 499);
        Object term71684 = newInstance(Class.forName("com.google.gson.JsonArray"));
        Object term71685 = newInstance(Class.forName("com.google.gson.JsonObject"));
        Object term71686 = newInstance(Class.forName("java.lang.Object"));
        setField(term71684, term71684.getClass(), "elements", null);
        setElement(term71683, 0, term71684);
        setField(term71685, term71685.getClass(), "members", null);
        setElement(term71683, 2, term71685);
        setElement(term71683, 128, term71686);
        setField(term71682, term71682.getClass(), "stack", term71683);
        setIntField(term71682, term71682.getClass(), "stackSize", 0);
        setField(term71682, term71682.getClass(), "pathNames", null);
        setField(term71682, term71682.getClass(), "pathIndices", null);
        setField(term71682, term71682.getClass(), "in", null);
        setBooleanField(term71682, term71682.getClass(), "lenient", false);
        setField(term71682, term71682.getClass(), "buffer", null);
        setIntField(term71682, term71682.getClass(), "pos", 0);
        setIntField(term71682, term71682.getClass(), "limit", 0);
        setIntField(term71682, term71682.getClass(), "lineNumber", 0);
        setIntField(term71682, term71682.getClass(), "lineStart", 0);
        setIntField(term71682, term71682.getClass(), "peeked", 0);
        setLongField(term71682, term71682.getClass(), "peekedLong", 0L);
        setIntField(term71682, term71682.getClass(), "peekedNumberLength", 0);
        setField(term71682, term71682.getClass(), "peekedString", null);
        setField(term71682, term71682.getClass(), "stack", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.gson.internal.bind.JsonTreeReader");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "getPath", argTypes, term70587, args);
        assertTrue(recursiveEquals(term70587, term71682));
        assertTrue(recursiveEquals(retValue, "$"));
    }

};


