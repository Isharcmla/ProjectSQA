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

public class JsonReader_locationString_1969688468392 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term419412;
     Object term432102;

    public JsonReader_locationString_1969688468392() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term419412 = newInstance(Class.forName("com.google.gson.stream.JsonReader"));
        int[] term418807 = (int[]) newIntArray(489);
        setIntField(term419412, term419412.getClass(), "lineNumber", 0);
        setIntField(term419412, term419412.getClass(), "pos", 0);
        setIntField(term419412, term419412.getClass(), "lineStart", 0);
        setIntField(term419412, term419412.getClass(), "stackSize", 1);
        setField(term419412, term419412.getClass(), "stack", term418807);
        term432102 = newInstance(Class.forName("com.google.gson.stream.JsonReader"));
        int[] term432103 = (int[]) newIntArray(489);
        setField(term432102, term432102.getClass(), "in", null);
        setBooleanField(term432102, term432102.getClass(), "lenient", false);
        setField(term432102, term432102.getClass(), "buffer", null);
        setIntField(term432102, term432102.getClass(), "pos", 0);
        setIntField(term432102, term432102.getClass(), "limit", 0);
        setIntField(term432102, term432102.getClass(), "lineNumber", 0);
        setIntField(term432102, term432102.getClass(), "lineStart", 0);
        setIntField(term432102, term432102.getClass(), "peeked", 0);
        setLongField(term432102, term432102.getClass(), "peekedLong", 0L);
        setIntField(term432102, term432102.getClass(), "peekedNumberLength", 0);
        setField(term432102, term432102.getClass(), "peekedString", null);
        setField(term432102, term432102.getClass(), "stack", term432103);
        setIntField(term432102, term432102.getClass(), "stackSize", 1);
        setField(term432102, term432102.getClass(), "pathNames", null);
        setField(term432102, term432102.getClass(), "pathIndices", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.gson.stream.JsonReader");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "locationString", argTypes, term419412, args);
        assertTrue(recursiveEquals(term419412, term432102));
        assertTrue(recursiveEquals(retValue, " at line 1 column 1 path $"));
    }

};


