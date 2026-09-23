package com.google.gson.stream;

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
import static com.google.gson.stream.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import static com.google.gson.stream.EqualityUtils.*;

public class JsonWriter_beforeName_1433433393219 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term78831;
     Object term78860;

    public JsonWriter_beforeName_1433433393219() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term78831 = newInstance(Class.forName("com.google.gson.stream.JsonWriter"));
        int[] term78732 = (int[]) newIntArray(8);
        setIntField(term78831, term78831.getClass(), "stackSize", 8);
        setIntElement(term78732, 0, 3);
        setIntElement(term78732, 1, 3);
        setIntElement(term78732, 2, 3);
        setIntElement(term78732, 3, 3);
        setIntElement(term78732, 4, 3);
        setIntElement(term78732, 5, 3);
        setIntElement(term78732, 6, 3);
        setIntElement(term78732, 7, 3);
        setField(term78831, term78831.getClass(), "stack", term78732);
        term78860 = newInstance(Class.forName("com.google.gson.stream.JsonWriter"));
        int[] term78861 = (int[]) newIntArray(8);
        setField(term78860, term78860.getClass(), "out", null);
        setIntElement(term78861, 0, 3);
        setIntElement(term78861, 1, 3);
        setIntElement(term78861, 2, 3);
        setIntElement(term78861, 3, 3);
        setIntElement(term78861, 4, 3);
        setIntElement(term78861, 5, 3);
        setIntElement(term78861, 6, 3);
        setIntElement(term78861, 7, 4);
        setField(term78860, term78860.getClass(), "stack", term78861);
        setIntField(term78860, term78860.getClass(), "stackSize", 8);
        setField(term78860, term78860.getClass(), "indent", null);
        setField(term78860, term78860.getClass(), "separator", null);
        setBooleanField(term78860, term78860.getClass(), "lenient", false);
        setBooleanField(term78860, term78860.getClass(), "htmlSafe", false);
        setField(term78860, term78860.getClass(), "deferredName", null);
        setBooleanField(term78860, term78860.getClass(), "serializeNulls", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.gson.stream.JsonWriter");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "beforeName", argTypes, term78831, args);
        assertTrue(recursiveEquals(term78831, term78860));
    }

};


