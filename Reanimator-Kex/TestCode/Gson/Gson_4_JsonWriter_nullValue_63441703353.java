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

public class JsonWriter_nullValue_63441703353 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1743;
     Object term8284;
     Object term8252;

    public JsonWriter_nullValue_63441703353() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1743 = newInstance(Class.forName("com.google.gson.stream.JsonWriter"));
        int[] term1744 = (int[]) newIntArray(2);
        setField(term1743, term1743.getClass(), "out", null);
        setIntElement(term1744, 0, 683666002);
        setIntElement(term1744, 1, 1596213415);
        setField(term1743, term1743.getClass(), "stack", term1744);
        setIntField(term1743, term1743.getClass(), "stackSize", -268815336);
        setField(term1743, term1743.getClass(), "indent", "kBdSllIBVz");
        setField(term1743, term1743.getClass(), "separator", "TJmVBGfTML");
        setBooleanField(term1743, term1743.getClass(), "lenient", true);
        setBooleanField(term1743, term1743.getClass(), "htmlSafe", false);
        setField(term1743, term1743.getClass(), "deferredName", "tPlsykYBqO");
        setBooleanField(term1743, term1743.getClass(), "serializeNulls", false);
        term8284 = newInstance(Class.forName("com.google.gson.stream.JsonWriter"));
        int[] term8285 = (int[]) newIntArray(2);
        setField(term8284, term8284.getClass(), "out", null);
        setIntElement(term8285, 0, 683666002);
        setIntElement(term8285, 1, 1596213415);
        setField(term8284, term8284.getClass(), "stack", term8285);
        setIntField(term8284, term8284.getClass(), "stackSize", -268815336);
        setField(term8284, term8284.getClass(), "indent", "kBdSllIBVz");
        setField(term8284, term8284.getClass(), "separator", "TJmVBGfTML");
        setBooleanField(term8284, term8284.getClass(), "lenient", true);
        setBooleanField(term8284, term8284.getClass(), "htmlSafe", false);
        setField(term8284, term8284.getClass(), "deferredName", null);
        setBooleanField(term8284, term8284.getClass(), "serializeNulls", false);
        term8252 = newInstance(Class.forName("com.google.gson.stream.JsonWriter"));
        int[] term8253 = (int[]) newIntArray(2);
        setField(term8252, term8252.getClass(), "out", null);
        setIntElement(term8253, 0, 683666002);
        setIntElement(term8253, 1, 1596213415);
        setField(term8252, term8252.getClass(), "stack", term8253);
        setIntField(term8252, term8252.getClass(), "stackSize", -268815336);
        setField(term8252, term8252.getClass(), "indent", "kBdSllIBVz");
        setField(term8252, term8252.getClass(), "separator", "TJmVBGfTML");
        setBooleanField(term8252, term8252.getClass(), "lenient", true);
        setBooleanField(term8252, term8252.getClass(), "htmlSafe", false);
        setField(term8252, term8252.getClass(), "deferredName", null);
        setBooleanField(term8252, term8252.getClass(), "serializeNulls", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.gson.stream.JsonWriter");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "nullValue", argTypes, term1743, args);
        assertTrue(recursiveEquals(term1743, term8284));
        assertTrue(recursiveEquals(retValue, term8252));
    }

};


