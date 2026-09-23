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

public class JsonTreeReader_getPath_1170023302256 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term78406;
     Object term79634;

    public JsonTreeReader_getPath_1170023302256() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term78406 = newInstance(Class.forName("com.google.gson.internal.bind.JsonTreeReader"));
        Object[] term77643 = (Object[]) newArray("java.lang.Object", 43);
        Object term78464 = newInstance(Class.forName("com.google.gson.JsonObject"));
        char[] term77149 = (char[]) newCharArray(492);
        Object term78520 = newInstance(Class.forName("com.google.gson.JsonArray"));
        Object term78558 = newInstance(Class.forName("java.lang.Object"));
        setIntField(term78406, term78406.getClass(), "stackSize", 5);
        setElement(term77643, 0, term78464);
        setElement(term77643, 1, term77149);
        setElement(term77643, 3, term78520);
        setElement(term77643, 8, term78558);
        setField(term78406, term78406.getClass(), "stack", term77643);
        term79634 = newInstance(Class.forName("com.google.gson.internal.bind.JsonTreeReader"));
        Object[] term79635 = (Object[]) newArray("java.lang.Object", 43);
        Object term79636 = newInstance(Class.forName("com.google.gson.JsonObject"));
        char[] term79637 = (char[]) newCharArray(492);
        Object term79638 = newInstance(Class.forName("com.google.gson.JsonArray"));
        Object term79639 = newInstance(Class.forName("java.lang.Object"));
        setField(term79636, term79636.getClass(), "members", null);
        setElement(term79635, 0, term79636);
        setElement(term79635, 1, term79637);
        setField(term79638, term79638.getClass(), "elements", null);
        setElement(term79635, 3, term79638);
        setElement(term79635, 8, term79639);
        setField(term79634, term79634.getClass(), "stack", term79635);
        setIntField(term79634, term79634.getClass(), "stackSize", 0);
        setField(term79634, term79634.getClass(), "pathNames", null);
        setField(term79634, term79634.getClass(), "pathIndices", null);
        setField(term79634, term79634.getClass(), "in", null);
        setBooleanField(term79634, term79634.getClass(), "lenient", false);
        setField(term79634, term79634.getClass(), "buffer", null);
        setIntField(term79634, term79634.getClass(), "pos", 0);
        setIntField(term79634, term79634.getClass(), "limit", 0);
        setIntField(term79634, term79634.getClass(), "lineNumber", 0);
        setIntField(term79634, term79634.getClass(), "lineStart", 0);
        setIntField(term79634, term79634.getClass(), "peeked", 0);
        setLongField(term79634, term79634.getClass(), "peekedLong", 0L);
        setIntField(term79634, term79634.getClass(), "peekedNumberLength", 0);
        setField(term79634, term79634.getClass(), "peekedString", null);
        setField(term79634, term79634.getClass(), "stack", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.gson.internal.bind.JsonTreeReader");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "getPath", argTypes, term78406, args);
        assertTrue(recursiveEquals(term78406, term79634));
        assertTrue(recursiveEquals(retValue, "$"));
    }

};


