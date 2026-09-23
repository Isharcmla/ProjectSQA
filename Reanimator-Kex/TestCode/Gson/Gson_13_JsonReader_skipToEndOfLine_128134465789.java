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

public class JsonReader_skipToEndOfLine_128134465789 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1274554;
     Object term1274585;

    public JsonReader_skipToEndOfLine_128134465789() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1274554 = newInstance(Class.forName("com.google.gson.stream.JsonReader"));
        char[] term1274451 = (char[]) newCharArray(8);
        setIntField(term1274554, term1274554.getClass(), "pos", 6);
        setIntField(term1274554, term1274554.getClass(), "limit", 7);
        setCharElement(term1274451, 0, (char) 13);
        setCharElement(term1274451, 1, (char) 13);
        setCharElement(term1274451, 2, (char) 13);
        setCharElement(term1274451, 3, (char) 13);
        setCharElement(term1274451, 4, (char) 13);
        setCharElement(term1274451, 5, (char) 13);
        setCharElement(term1274451, 6, (char) 13);
        setCharElement(term1274451, 7, (char) 13);
        setField(term1274554, term1274554.getClass(), "buffer", term1274451);
        term1274585 = newInstance(Class.forName("com.google.gson.stream.JsonReader"));
        char[] term1274586 = (char[]) newCharArray(8);
        setField(term1274585, term1274585.getClass(), "in", null);
        setBooleanField(term1274585, term1274585.getClass(), "lenient", false);
        setCharElement(term1274586, 0, (char) 13);
        setCharElement(term1274586, 1, (char) 13);
        setCharElement(term1274586, 2, (char) 13);
        setCharElement(term1274586, 3, (char) 13);
        setCharElement(term1274586, 4, (char) 13);
        setCharElement(term1274586, 5, (char) 13);
        setCharElement(term1274586, 6, (char) 13);
        setCharElement(term1274586, 7, (char) 13);
        setField(term1274585, term1274585.getClass(), "buffer", term1274586);
        setIntField(term1274585, term1274585.getClass(), "pos", 7);
        setIntField(term1274585, term1274585.getClass(), "limit", 7);
        setIntField(term1274585, term1274585.getClass(), "lineNumber", 0);
        setIntField(term1274585, term1274585.getClass(), "lineStart", 0);
        setIntField(term1274585, term1274585.getClass(), "peeked", 0);
        setLongField(term1274585, term1274585.getClass(), "peekedLong", 0L);
        setIntField(term1274585, term1274585.getClass(), "peekedNumberLength", 0);
        setField(term1274585, term1274585.getClass(), "peekedString", null);
        setField(term1274585, term1274585.getClass(), "stack", null);
        setIntField(term1274585, term1274585.getClass(), "stackSize", 0);
        setField(term1274585, term1274585.getClass(), "pathNames", null);
        setField(term1274585, term1274585.getClass(), "pathIndices", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.gson.stream.JsonReader");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "skipToEndOfLine", argTypes, term1274554, args);
        assertTrue(recursiveEquals(term1274554, term1274585));
    }

};


