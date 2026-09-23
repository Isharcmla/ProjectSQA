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

public class JsonTreeReader_getPath_1170023302152 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term36392;
     Object term36470;

    public JsonTreeReader_getPath_1170023302152() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term36392 = newInstance(Class.forName("com.google.gson.internal.bind.JsonTreeReader"));
        Object[] term36274 = (Object[]) newArray("java.lang.Object", 490);
        Object term36430 = newInstance(Class.forName("java.lang.Object"));
        setIntField(term36392, term36392.getClass(), "stackSize", 1);
        setElement(term36274, 32, term36430);
        setField(term36392, term36392.getClass(), "stack", term36274);
        term36470 = newInstance(Class.forName("com.google.gson.internal.bind.JsonTreeReader"));
        Object[] term36471 = (Object[]) newArray("java.lang.Object", 490);
        Object term36472 = newInstance(Class.forName("java.lang.Object"));
        setElement(term36471, 32, term36472);
        setField(term36470, term36470.getClass(), "stack", term36471);
        setIntField(term36470, term36470.getClass(), "stackSize", 0);
        setField(term36470, term36470.getClass(), "pathNames", null);
        setField(term36470, term36470.getClass(), "pathIndices", null);
        setField(term36470, term36470.getClass(), "in", null);
        setBooleanField(term36470, term36470.getClass(), "lenient", false);
        setField(term36470, term36470.getClass(), "buffer", null);
        setIntField(term36470, term36470.getClass(), "pos", 0);
        setIntField(term36470, term36470.getClass(), "limit", 0);
        setIntField(term36470, term36470.getClass(), "lineNumber", 0);
        setIntField(term36470, term36470.getClass(), "lineStart", 0);
        setIntField(term36470, term36470.getClass(), "peeked", 0);
        setLongField(term36470, term36470.getClass(), "peekedLong", 0L);
        setIntField(term36470, term36470.getClass(), "peekedNumberLength", 0);
        setField(term36470, term36470.getClass(), "peekedString", null);
        setField(term36470, term36470.getClass(), "stack", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.gson.internal.bind.JsonTreeReader");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "getPath", argTypes, term36392, args);
        assertTrue(recursiveEquals(term36392, term36470));
        assertTrue(recursiveEquals(retValue, "$"));
    }

};


