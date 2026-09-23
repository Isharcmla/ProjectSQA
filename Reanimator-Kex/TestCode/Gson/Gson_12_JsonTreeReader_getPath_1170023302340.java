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

public class JsonTreeReader_getPath_1170023302340 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term130282;
     Object term130761;

    public JsonTreeReader_getPath_1170023302340() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term130282 = newInstance(Class.forName("com.google.gson.internal.bind.JsonTreeReader"));
        Object[] term129985 = (Object[]) newArray("java.lang.Object", 236);
        Object term130340 = newInstance(Class.forName("com.google.gson.JsonObject"));
        Object term130434 = newInstance(Class.forName("com.google.gson.internal.bind.JsonTreeReader"));
        Object term130504 = newInstance(Class.forName("com.google.gson.JsonStreamParser"));
        Object term130562 = newInstance(Class.forName("com.google.gson.JsonObject"));
        Object term130618 = newInstance(Class.forName("com.google.gson.JsonArray"));
        Object term130676 = newInstance(Class.forName("com.google.gson.JsonObject"));
        Object term130714 = newInstance(Class.forName("java.lang.Object"));
        setIntField(term130282, term130282.getClass(), "stackSize", 6);
        setElement(term129985, 0, term130340);
        setElement(term129985, 1, term130434);
        setElement(term129985, 2, term130504);
        setElement(term129985, 3, term130562);
        setElement(term129985, 4, term130618);
        setElement(term129985, 5, term130676);
        setElement(term129985, 16, term130714);
        setField(term130282, term130282.getClass(), "stack", term129985);
        term130761 = newInstance(Class.forName("com.google.gson.internal.bind.JsonTreeReader"));
        Object[] term130762 = (Object[]) newArray("java.lang.Object", 236);
        Object term130763 = newInstance(Class.forName("com.google.gson.JsonObject"));
        Object term130764 = newInstance(Class.forName("com.google.gson.internal.bind.JsonTreeReader"));
        Object term130765 = newInstance(Class.forName("com.google.gson.JsonStreamParser"));
        Object term130766 = newInstance(Class.forName("com.google.gson.JsonObject"));
        Object term130767 = newInstance(Class.forName("com.google.gson.JsonArray"));
        Object term130768 = newInstance(Class.forName("com.google.gson.JsonObject"));
        Object term130769 = newInstance(Class.forName("java.lang.Object"));
        setField(term130763, term130763.getClass(), "members", null);
        setElement(term130762, 0, term130763);
        setField(term130764, term130764.getClass(), "stack", null);
        setIntField(term130764, term130764.getClass(), "stackSize", 0);
        setField(term130764, term130764.getClass(), "pathNames", null);
        setField(term130764, term130764.getClass(), "pathIndices", null);
        setField(term130764, term130764.getClass(), "in", null);
        setBooleanField(term130764, term130764.getClass(), "lenient", false);
        setField(term130764, term130764.getClass(), "buffer", null);
        setIntField(term130764, term130764.getClass(), "pos", 0);
        setIntField(term130764, term130764.getClass(), "limit", 0);
        setIntField(term130764, term130764.getClass(), "lineNumber", 0);
        setIntField(term130764, term130764.getClass(), "lineStart", 0);
        setIntField(term130764, term130764.getClass(), "peeked", 0);
        setLongField(term130764, term130764.getClass(), "peekedLong", 0L);
        setIntField(term130764, term130764.getClass(), "peekedNumberLength", 0);
        setField(term130764, term130764.getClass(), "peekedString", null);
        setField(term130764, term130764.getClass(), "stack", null);
        setElement(term130762, 1, term130764);
        setField(term130765, term130765.getClass(), "parser", null);
        setField(term130765, term130765.getClass(), "lock", null);
        setElement(term130762, 2, term130765);
        setField(term130766, term130766.getClass(), "members", null);
        setElement(term130762, 3, term130766);
        setField(term130767, term130767.getClass(), "elements", null);
        setElement(term130762, 4, term130767);
        setField(term130768, term130768.getClass(), "members", null);
        setElement(term130762, 5, term130768);
        setElement(term130762, 16, term130769);
        setField(term130761, term130761.getClass(), "stack", term130762);
        setIntField(term130761, term130761.getClass(), "stackSize", 0);
        setField(term130761, term130761.getClass(), "pathNames", null);
        setField(term130761, term130761.getClass(), "pathIndices", null);
        setField(term130761, term130761.getClass(), "in", null);
        setBooleanField(term130761, term130761.getClass(), "lenient", false);
        setField(term130761, term130761.getClass(), "buffer", null);
        setIntField(term130761, term130761.getClass(), "pos", 0);
        setIntField(term130761, term130761.getClass(), "limit", 0);
        setIntField(term130761, term130761.getClass(), "lineNumber", 0);
        setIntField(term130761, term130761.getClass(), "lineStart", 0);
        setIntField(term130761, term130761.getClass(), "peeked", 0);
        setLongField(term130761, term130761.getClass(), "peekedLong", 0L);
        setIntField(term130761, term130761.getClass(), "peekedNumberLength", 0);
        setField(term130761, term130761.getClass(), "peekedString", null);
        setField(term130761, term130761.getClass(), "stack", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.gson.internal.bind.JsonTreeReader");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "getPath", argTypes, term130282, args);
        assertTrue(recursiveEquals(term130282, term130761));
        assertTrue(recursiveEquals(retValue, "$"));
    }

};


