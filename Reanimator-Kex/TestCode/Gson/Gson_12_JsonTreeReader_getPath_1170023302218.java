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

public class JsonTreeReader_getPath_1170023302218 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term59330;
     Object term60492;

    public JsonTreeReader_getPath_1170023302218() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term59330 = newInstance(Class.forName("com.google.gson.internal.bind.JsonTreeReader"));
        Object[] term58576 = (Object[]) newArray("java.lang.Object", 493);
        Object term59386 = newInstance(Class.forName("com.google.gson.JsonArray"));
        char[] term58084 = (char[]) newCharArray(490);
        Object term59442 = newInstance(Class.forName("com.google.gson.JsonArray"));
        Object term59480 = newInstance(Class.forName("java.lang.Object"));
        setIntField(term59330, term59330.getClass(), "stackSize", 6);
        setElement(term58576, 0, term59386);
        setElement(term58576, 1, term58084);
        setElement(term58576, 3, term59442);
        setElement(term58576, 128, term59480);
        setField(term59330, term59330.getClass(), "stack", term58576);
        term60492 = newInstance(Class.forName("com.google.gson.internal.bind.JsonTreeReader"));
        Object[] term60493 = (Object[]) newArray("java.lang.Object", 493);
        Object term60494 = newInstance(Class.forName("com.google.gson.JsonArray"));
        char[] term60495 = (char[]) newCharArray(490);
        Object term60496 = newInstance(Class.forName("com.google.gson.JsonArray"));
        Object term60497 = newInstance(Class.forName("java.lang.Object"));
        setField(term60494, term60494.getClass(), "elements", null);
        setElement(term60493, 0, term60494);
        setElement(term60493, 1, term60495);
        setField(term60496, term60496.getClass(), "elements", null);
        setElement(term60493, 3, term60496);
        setElement(term60493, 128, term60497);
        setField(term60492, term60492.getClass(), "stack", term60493);
        setIntField(term60492, term60492.getClass(), "stackSize", 0);
        setField(term60492, term60492.getClass(), "pathNames", null);
        setField(term60492, term60492.getClass(), "pathIndices", null);
        setField(term60492, term60492.getClass(), "in", null);
        setBooleanField(term60492, term60492.getClass(), "lenient", false);
        setField(term60492, term60492.getClass(), "buffer", null);
        setIntField(term60492, term60492.getClass(), "pos", 0);
        setIntField(term60492, term60492.getClass(), "limit", 0);
        setIntField(term60492, term60492.getClass(), "lineNumber", 0);
        setIntField(term60492, term60492.getClass(), "lineStart", 0);
        setIntField(term60492, term60492.getClass(), "peeked", 0);
        setLongField(term60492, term60492.getClass(), "peekedLong", 0L);
        setIntField(term60492, term60492.getClass(), "peekedNumberLength", 0);
        setField(term60492, term60492.getClass(), "peekedString", null);
        setField(term60492, term60492.getClass(), "stack", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.gson.internal.bind.JsonTreeReader");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "getPath", argTypes, term59330, args);
        assertTrue(recursiveEquals(term59330, term60492));
        assertTrue(recursiveEquals(retValue, "$"));
    }

};


