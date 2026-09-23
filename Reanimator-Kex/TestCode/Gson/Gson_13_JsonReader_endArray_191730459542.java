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
import java.lang.AssertionError;
import static com.google.gson.stream.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class JsonReader_endArray_191730459542 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term431;

    public JsonReader_endArray_191730459542() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term431 = newInstance(Class.forName("com.google.gson.stream.JsonReader"));
        char[] term433 = (char[]) newCharArray(5);
        int[] term458 = (int[]) newIntArray(2);
        Object[] term462 = (Object[]) newArray("java.lang.String", 3);
        int[] term499 = (int[]) newIntArray(1);
        setField(term431, term431.getClass(), "in", null);
        setBooleanField(term431, term431.getClass(), "lenient", true);
        setCharElement(term433, 0, 'J');
        setCharElement(term433, 1, 'A');
        setCharElement(term433, 2, 'E');
        setCharElement(term433, 3, 't');
        setCharElement(term433, 4, 'R');
        setField(term431, term431.getClass(), "buffer", term433);
        setIntField(term431, term431.getClass(), "pos", 292681826);
        setIntField(term431, term431.getClass(), "limit", 458147407);
        setIntField(term431, term431.getClass(), "lineNumber", -184153539);
        setIntField(term431, term431.getClass(), "lineStart", 493620644);
        setIntField(term431, term431.getClass(), "peeked", 1328271830);
        setLongField(term431, term431.getClass(), "peekedLong", -8400487765614892086L);
        setIntField(term431, term431.getClass(), "peekedNumberLength", 1596070772);
        setField(term431, term431.getClass(), "peekedString", "oVcInYnLWB");
        setIntElement(term458, 0, 97029295);
        setIntElement(term458, 1, -1371869594);
        setField(term431, term431.getClass(), "stack", term458);
        setIntField(term431, term431.getClass(), "stackSize", -2095575670);
        setElement(term462, 0, "aJlieCFVtF");
        setElement(term462, 1, "ZiaGIbnzTs");
        setElement(term462, 2, "tbcdzjIfER");
        setField(term431, term431.getClass(), "pathNames", term462);
        setIntElement(term499, 0, 1225272962);
        setField(term431, term431.getClass(), "pathIndices", term499);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.gson.stream.JsonReader");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "endArray", argTypes, term431, args);
            assertTrue(false);
        }
        catch (AssertionError e) {
        }

    }

};


