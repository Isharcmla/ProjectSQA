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

public class JsonTreeReader_getPath_1170023302290 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term102428;
     Object term102752;

    public JsonTreeReader_getPath_1170023302290() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term102428 = newInstance(Class.forName("com.google.gson.internal.bind.JsonTreeReader"));
        Object[] term102152 = (Object[]) newArray("java.lang.Object", 496);
        Object term102486 = newInstance(Class.forName("com.google.gson.JsonObject"));
        Object term102580 = newInstance(Class.forName("com.google.gson.internal.bind.JsonTreeReader"));
        Object term102638 = newInstance(Class.forName("com.google.gson.JsonObject"));
        Object term102694 = newInstance(Class.forName("com.google.gson.JsonArray"));
        setIntField(term102428, term102428.getClass(), "stackSize", 12);
        setElement(term102152, 0, term102486);
        setElement(term102152, 1, term102580);
        setElement(term102152, 2, term102638);
        setElement(term102152, 4, term102694);
        setField(term102428, term102428.getClass(), "stack", term102152);
        term102752 = newInstance(Class.forName("com.google.gson.internal.bind.JsonTreeReader"));
        Object[] term102753 = (Object[]) newArray("java.lang.Object", 496);
        Object term102754 = newInstance(Class.forName("com.google.gson.JsonObject"));
        Object term102755 = newInstance(Class.forName("com.google.gson.internal.bind.JsonTreeReader"));
        Object term102756 = newInstance(Class.forName("com.google.gson.JsonObject"));
        Object term102757 = newInstance(Class.forName("com.google.gson.JsonArray"));
        setField(term102754, term102754.getClass(), "members", null);
        setElement(term102753, 0, term102754);
        setField(term102755, term102755.getClass(), "stack", null);
        setIntField(term102755, term102755.getClass(), "stackSize", 0);
        setField(term102755, term102755.getClass(), "pathNames", null);
        setField(term102755, term102755.getClass(), "pathIndices", null);
        setField(term102755, term102755.getClass(), "in", null);
        setBooleanField(term102755, term102755.getClass(), "lenient", false);
        setField(term102755, term102755.getClass(), "buffer", null);
        setIntField(term102755, term102755.getClass(), "pos", 0);
        setIntField(term102755, term102755.getClass(), "limit", 0);
        setIntField(term102755, term102755.getClass(), "lineNumber", 0);
        setIntField(term102755, term102755.getClass(), "lineStart", 0);
        setIntField(term102755, term102755.getClass(), "peeked", 0);
        setLongField(term102755, term102755.getClass(), "peekedLong", 0L);
        setIntField(term102755, term102755.getClass(), "peekedNumberLength", 0);
        setField(term102755, term102755.getClass(), "peekedString", null);
        setField(term102755, term102755.getClass(), "stack", null);
        setElement(term102753, 1, term102755);
        setField(term102756, term102756.getClass(), "members", null);
        setElement(term102753, 2, term102756);
        setField(term102757, term102757.getClass(), "elements", null);
        setElement(term102753, 4, term102757);
        setField(term102752, term102752.getClass(), "stack", term102753);
        setIntField(term102752, term102752.getClass(), "stackSize", 0);
        setField(term102752, term102752.getClass(), "pathNames", null);
        setField(term102752, term102752.getClass(), "pathIndices", null);
        setField(term102752, term102752.getClass(), "in", null);
        setBooleanField(term102752, term102752.getClass(), "lenient", false);
        setField(term102752, term102752.getClass(), "buffer", null);
        setIntField(term102752, term102752.getClass(), "pos", 0);
        setIntField(term102752, term102752.getClass(), "limit", 0);
        setIntField(term102752, term102752.getClass(), "lineNumber", 0);
        setIntField(term102752, term102752.getClass(), "lineStart", 0);
        setIntField(term102752, term102752.getClass(), "peeked", 0);
        setLongField(term102752, term102752.getClass(), "peekedLong", 0L);
        setIntField(term102752, term102752.getClass(), "peekedNumberLength", 0);
        setField(term102752, term102752.getClass(), "peekedString", null);
        setField(term102752, term102752.getClass(), "stack", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.gson.internal.bind.JsonTreeReader");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "getPath", argTypes, term102428, args);
        assertTrue(recursiveEquals(term102428, term102752));
        assertTrue(recursiveEquals(retValue, "$"));
    }

};


