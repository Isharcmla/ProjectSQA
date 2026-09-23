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

public class JsonReader_nextString_1089781162499 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term194550;

    public JsonReader_nextString_1089781162499() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term194550 = newInstance(Class.forName("com.google.gson.stream.JsonReader"));
        int[] term194332 = (int[]) newIntArray(17);
        setIntField(term194550, term194550.getClass(), "peeked", 2);
        setIntField(term194550, term194550.getClass(), "lineNumber", 0);
        setIntField(term194550, term194550.getClass(), "pos", 0);
        setIntField(term194550, term194550.getClass(), "lineStart", 0);
        setIntField(term194550, term194550.getClass(), "stackSize", 1);
        setIntElement(term194332, 0, 66);
        setIntElement(term194332, 1, 69);
        setIntElement(term194332, 2, 71);
        setIntElement(term194332, 3, 73);
        setIntElement(term194332, 4, 78);
        setIntElement(term194332, 5, 95);
        setIntElement(term194332, 6, 79);
        setIntElement(term194332, 7, 66);
        setIntElement(term194332, 8, 74);
        setIntElement(term194332, 9, 69);
        setIntElement(term194332, 10, 67);
        setIntElement(term194332, 11, 84);
        setField(term194550, term194550.getClass(), "stack", term194332);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.gson.stream.JsonReader");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "nextString", argTypes, term194550, args);
            assertTrue(false);
        }
        catch (IllegalStateException e) {
        }

    }

};


