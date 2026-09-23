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
import java.lang.Boolean;

public class JsonWriter_setSerializeNulls_145312445939 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term421;
     Object term469;
     Object term3864;

    public JsonWriter_setSerializeNulls_145312445939() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term421 = newInstance(Class.forName("com.google.gson.stream.JsonWriter"));
        int[] term422 = (int[]) newIntArray(6);
        setField(term421, term421.getClass(), "out", null);
        setIntElement(term422, 0, -2068769794);
        setIntElement(term422, 1, -117576464);
        setIntElement(term422, 2, -1007160944);
        setIntElement(term422, 3, 1135664017);
        setIntElement(term422, 4, 590364439);
        setIntElement(term422, 5, 865208305);
        setField(term421, term421.getClass(), "stack", term422);
        setIntField(term421, term421.getClass(), "stackSize", -1275173084);
        setField(term421, term421.getClass(), "indent", "ZiaGIbnzTs");
        setField(term421, term421.getClass(), "separator", "tbcdzjIfER");
        setBooleanField(term421, term421.getClass(), "lenient", true);
        setBooleanField(term421, term421.getClass(), "htmlSafe", false);
        setField(term421, term421.getClass(), "deferredName", "HyxfbSQYBe");
        setBooleanField(term421, term421.getClass(), "serializeNulls", false);
        term469 = new Boolean(true);
        term3864 = newInstance(Class.forName("com.google.gson.stream.JsonWriter"));
        int[] term3865 = (int[]) newIntArray(6);
        setField(term3864, term3864.getClass(), "out", null);
        setIntElement(term3865, 0, -2068769794);
        setIntElement(term3865, 1, -117576464);
        setIntElement(term3865, 2, -1007160944);
        setIntElement(term3865, 3, 1135664017);
        setIntElement(term3865, 4, 590364439);
        setIntElement(term3865, 5, 865208305);
        setField(term3864, term3864.getClass(), "stack", term3865);
        setIntField(term3864, term3864.getClass(), "stackSize", -1275173084);
        setField(term3864, term3864.getClass(), "indent", "ZiaGIbnzTs");
        setField(term3864, term3864.getClass(), "separator", "tbcdzjIfER");
        setBooleanField(term3864, term3864.getClass(), "lenient", true);
        setBooleanField(term3864, term3864.getClass(), "htmlSafe", false);
        setField(term3864, term3864.getClass(), "deferredName", "HyxfbSQYBe");
        setBooleanField(term3864, term3864.getClass(), "serializeNulls", true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.gson.stream.JsonWriter");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = boolean.class;
        Object[] args = new Object[1];
        args[0] = term469;
        callMethod(klass, "setSerializeNulls", argTypes, term421, args);
        assertTrue(recursiveEquals(term421, term3864));
        assertTrue(recursiveEquals(term469, true));
    }

};


