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

public class JsonTreeReader_getPath_1170023302326 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term123060;
     Object term123189;

    public JsonTreeReader_getPath_1170023302326() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term123060 = newInstance(Class.forName("com.google.gson.internal.bind.JsonTreeReader"));
        Object[] term122771 = (Object[]) newArray("java.lang.Object", 495);
        Object term123118 = newInstance(Class.forName("com.google.gson.JsonObject"));
        Object term123156 = newInstance(Class.forName("java.lang.Object"));
        setIntField(term123060, term123060.getClass(), "stackSize", 7);
        setElement(term122771, 0, term123118);
        setElement(term122771, 2, term123118);
        setElement(term122771, 5, term123118);
        setElement(term122771, 8, term123156);
        setField(term123060, term123060.getClass(), "stack", term122771);
        term123189 = newInstance(Class.forName("com.google.gson.internal.bind.JsonTreeReader"));
        Object[] term123190 = (Object[]) newArray("java.lang.Object", 495);
        Object term123191 = newInstance(Class.forName("com.google.gson.JsonObject"));
        Object term123192 = newInstance(Class.forName("java.lang.Object"));
        setField(term123191, term123191.getClass(), "members", null);
        setElement(term123190, 0, term123191);
        setElement(term123190, 2, term123191);
        setElement(term123190, 5, term123191);
        setElement(term123190, 8, term123192);
        setField(term123189, term123189.getClass(), "stack", term123190);
        setIntField(term123189, term123189.getClass(), "stackSize", 0);
        setField(term123189, term123189.getClass(), "pathNames", null);
        setField(term123189, term123189.getClass(), "pathIndices", null);
        setField(term123189, term123189.getClass(), "in", null);
        setBooleanField(term123189, term123189.getClass(), "lenient", false);
        setField(term123189, term123189.getClass(), "buffer", null);
        setIntField(term123189, term123189.getClass(), "pos", 0);
        setIntField(term123189, term123189.getClass(), "limit", 0);
        setIntField(term123189, term123189.getClass(), "lineNumber", 0);
        setIntField(term123189, term123189.getClass(), "lineStart", 0);
        setIntField(term123189, term123189.getClass(), "peeked", 0);
        setLongField(term123189, term123189.getClass(), "peekedLong", 0L);
        setIntField(term123189, term123189.getClass(), "peekedNumberLength", 0);
        setField(term123189, term123189.getClass(), "peekedString", null);
        setField(term123189, term123189.getClass(), "stack", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.gson.internal.bind.JsonTreeReader");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "getPath", argTypes, term123060, args);
        assertTrue(recursiveEquals(term123060, term123189));
        assertTrue(recursiveEquals(retValue, "$"));
    }

};


