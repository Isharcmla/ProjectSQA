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

public class JsonTreeReader_getPath_1170023302408 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term171732;
     Object term172014;

    public JsonTreeReader_getPath_1170023302408() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term171732 = newInstance(Class.forName("com.google.gson.internal.bind.JsonTreeReader"));
        Object[] term171457 = (Object[]) newArray("java.lang.Object", 44);
        Object term171788 = newInstance(Class.forName("com.google.gson.JsonArray"));
        Object term171836 = newInstance(Class.forName("java.nio.file.Files$2"));
        Object term171892 = newInstance(Class.forName("com.google.gson.JsonArray"));
        setIntField(term171732, term171732.getClass(), "stackSize", 4);
        setElement(term171457, 0, term171788);
        setElement(term171457, 2, term171836);
        setElement(term171457, 3, term171892);
        setField(term171732, term171732.getClass(), "stack", term171457);
        term172014 = newInstance(Class.forName("com.google.gson.internal.bind.JsonTreeReader"));
        Object[] term172015 = (Object[]) newArray("java.lang.Object", 44);
        Object term172016 = newInstance(Class.forName("com.google.gson.JsonArray"));
        Object term172017 = newInstance(Class.forName("java.nio.file.Files$2"));
        Object term172018 = newInstance(Class.forName("com.google.gson.JsonArray"));
        setField(term172016, term172016.getClass(), "elements", null);
        setElement(term172015, 0, term172016);
        setField(term172017, term172017.getClass(), "val$delegate", null);
        setElement(term172015, 2, term172017);
        setField(term172018, term172018.getClass(), "elements", null);
        setElement(term172015, 3, term172018);
        setField(term172014, term172014.getClass(), "stack", term172015);
        setIntField(term172014, term172014.getClass(), "stackSize", 0);
        setField(term172014, term172014.getClass(), "pathNames", null);
        setField(term172014, term172014.getClass(), "pathIndices", null);
        setField(term172014, term172014.getClass(), "in", null);
        setBooleanField(term172014, term172014.getClass(), "lenient", false);
        setField(term172014, term172014.getClass(), "buffer", null);
        setIntField(term172014, term172014.getClass(), "pos", 0);
        setIntField(term172014, term172014.getClass(), "limit", 0);
        setIntField(term172014, term172014.getClass(), "lineNumber", 0);
        setIntField(term172014, term172014.getClass(), "lineStart", 0);
        setIntField(term172014, term172014.getClass(), "peeked", 0);
        setLongField(term172014, term172014.getClass(), "peekedLong", 0L);
        setIntField(term172014, term172014.getClass(), "peekedNumberLength", 0);
        setField(term172014, term172014.getClass(), "peekedString", null);
        setField(term172014, term172014.getClass(), "stack", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.gson.internal.bind.JsonTreeReader");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "getPath", argTypes, term171732, args);
        assertTrue(recursiveEquals(term171732, term172014));
        assertTrue(recursiveEquals(retValue, "$"));
    }

};


