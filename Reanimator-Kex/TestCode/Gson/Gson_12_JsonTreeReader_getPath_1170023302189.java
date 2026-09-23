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

public class JsonTreeReader_getPath_1170023302189 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term46344;
     Object term47013;

    public JsonTreeReader_getPath_1170023302189() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term46344 = newInstance(Class.forName("com.google.gson.internal.bind.JsonTreeReader"));
        Object[] term46097 = (Object[]) newArray("java.lang.Object", 490);
        Object term46400 = newInstance(Class.forName("com.google.gson.JsonArray"));
        Object term46438 = newInstance(Class.forName("java.lang.Object"));
        setIntField(term46344, term46344.getClass(), "stackSize", 4);
        setElement(term46097, 0, term46400);
        setElement(term46097, 32, term46438);
        setField(term46344, term46344.getClass(), "stack", term46097);
        term47013 = newInstance(Class.forName("com.google.gson.internal.bind.JsonTreeReader"));
        Object[] term47014 = (Object[]) newArray("java.lang.Object", 490);
        Object term47015 = newInstance(Class.forName("com.google.gson.JsonArray"));
        Object term47016 = newInstance(Class.forName("java.lang.Object"));
        setField(term47015, term47015.getClass(), "elements", null);
        setElement(term47014, 0, term47015);
        setElement(term47014, 32, term47016);
        setField(term47013, term47013.getClass(), "stack", term47014);
        setIntField(term47013, term47013.getClass(), "stackSize", 0);
        setField(term47013, term47013.getClass(), "pathNames", null);
        setField(term47013, term47013.getClass(), "pathIndices", null);
        setField(term47013, term47013.getClass(), "in", null);
        setBooleanField(term47013, term47013.getClass(), "lenient", false);
        setField(term47013, term47013.getClass(), "buffer", null);
        setIntField(term47013, term47013.getClass(), "pos", 0);
        setIntField(term47013, term47013.getClass(), "limit", 0);
        setIntField(term47013, term47013.getClass(), "lineNumber", 0);
        setIntField(term47013, term47013.getClass(), "lineStart", 0);
        setIntField(term47013, term47013.getClass(), "peeked", 0);
        setLongField(term47013, term47013.getClass(), "peekedLong", 0L);
        setIntField(term47013, term47013.getClass(), "peekedNumberLength", 0);
        setField(term47013, term47013.getClass(), "peekedString", null);
        setField(term47013, term47013.getClass(), "stack", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.gson.internal.bind.JsonTreeReader");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "getPath", argTypes, term46344, args);
        assertTrue(recursiveEquals(term46344, term47013));
        assertTrue(recursiveEquals(retValue, "$"));
    }

};


